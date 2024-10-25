package cn.cherzing;

import cn.cherzing.dao.CRUDMapper;
import cn.cherzing.pojo.Student;
import cn.cherzing.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Cherzing
 * @date 2024/10/24 0024 16:25
 * @description TestCRUD
 */
public class TestCRUD {
    @Test
    /**
     * 查询id为2的学生的信息
     */
    public void testSelect() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        CRUDMapper mapper = sqlSession.getMapper(CRUDMapper.class);
        Student studentById = mapper.getStudentById(2);
        System.out.println(studentById.toString());
        sqlSession.close();
    }

    /**
     * 修改id为4的学生的姓名修改为李雷，年龄修改为21。
     */
    @Test
    public void testUpdate() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        CRUDMapper mapper = sqlSession.getMapper(CRUDMapper.class);
        Student student = new Student(4, "李雷", 21);
        mapper.updateStudent(student);
        Student studentById = mapper.getStudentById(4);
        System.out.println(studentById.toString());
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    /**
     * MyBatis注解实现一对多查询。查询出二班所有学生的信息。
     */
    public void testInsertAll() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        CRUDMapper mapper = sqlSession.getMapper(CRUDMapper.class);
        List<Student> studentInTwoClass = mapper.getStudentInTwoClass();
        for (Student student : studentInTwoClass) {
            System.out.println(student.toString());
        }
        sqlSession.close();
    }
}

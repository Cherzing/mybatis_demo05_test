package cn.cherzing.dao;

import cn.cherzing.pojo.Student;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Cherzing
 * @date 2024/10/24 0024 16:21
 * @description CRUD
 */
public interface CRUDMapper {
    @Select("select * from s_student where id = #{id}")
    Student getStudentById(int id);

    @Update("update s_student set name = #{name}, age = #{age} where id = #{id}")
    void updateStudent(Student student);

    @Select("select * from s_student where cid = 2")
    List<Student> getStudentInTwoClass();

}

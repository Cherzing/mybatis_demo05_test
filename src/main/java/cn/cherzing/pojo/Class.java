package cn.cherzing.pojo;

import java.util.List;

/**
 * @author Cherzing
 * @date 2024/10/24 0024 16:12
 * @description Class
 */
public class Class {
    private Integer id;
    private String classname;
    private List<Student> studentList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}

package com.qf.springbootstuday.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @Author: 吴
 * @Date: 2020/5/2 19:20
 */

public class Student implements Serializable {
    private int id;
    private String name;
    private Date date;
    private int age;

    public Student() {
    }

    public Student(int id, String name, Date date, int age) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(date, student.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", age=" + age +
                '}';
    }
}

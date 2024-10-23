package com.siprogramming.restapi.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollno;
    private String name;
    private float persentage;
    private String branch;

    public Student(){

    }

    public Student(String name, float persentage, String branch) {
        super();
        this.name = name;
        this.persentage = persentage;
        this.branch = branch;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPersentage() {
        return persentage;
    }

    public void setPersentage(float persentage) {
        this.persentage = persentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", persentage=" + persentage +
                ", branch='" + branch + '\'' +
                '}';
    }
}

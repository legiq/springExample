package com.example.sweater.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Page {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String age;
    private String about;
    private String education;
    private String department;
    private String position;
    private String filename;

    public Page() {
    }

    public Page(String age, String about, String education, String department, String position, String filename) {
        this.age = age;
        this.about = about;
        this.education = education;
        this.department = department;
        this.position = position;
        this.filename = filename;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}

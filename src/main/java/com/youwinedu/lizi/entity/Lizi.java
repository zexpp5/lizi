package com.youwinedu.lizi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Author : Lance lance7in_gmail_com
 * Date   : 21/09/15 22:19
 * Since  :
 */
@Entity
@Table(name="lizi")
public class Lizi {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;


    // 学生姓名
    @Column(name = "student_name")
    private String studentName;
    // 电话：本人母亲父亲姥姥姥爷奶奶爷爷座机其他
    @Column(name = "tel")
    private String tel;
    @Column(name = "mother_tel")
    private String motherTel;
    @Column(name = "father_tel")
    private String fatherTel;
    @Column(name = "ms_grandma_tel")
    private String msGrandmaTel;
    @Column(name = "ms_grandpa_tel")
    private String msGrandpaTel;
    @Column(name = "fs_grandma_tel")
    private String fsGrandmaTel;
    @Column(name = "fs_grandpa_tel")
    private String fsGrandpaTel;
    @Column(name = "home_tel")
    private String homeTel;
    @Column(name = "other_tel")
    private String otherTel;

    // 学生年级
    @Column(name = "grade")
    private String grade;

    // 学生性别
    @Column(name = "gender")
    private Integer gender;
    // 就读学校
    @Column(name = "school")
    private String school;
    // 家庭住址（小区名称）
    @Column(name = "community")
    private String community;
    // 备注：
    @Column(name = "comment")
    private String comment;

    /**
     * lizi collector
     */

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "collector_id")
    private User collector;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMotherTel() {
        return motherTel;
    }

    public void setMotherTel(String motherTel) {
        this.motherTel = motherTel;
    }

    public String getFatherTel() {
        return fatherTel;
    }

    public void setFatherTel(String fatherTel) {
        this.fatherTel = fatherTel;
    }

    public String getMsGrandmaTel() {
        return msGrandmaTel;
    }

    public void setMsGrandmaTel(String msGrandmaTel) {
        this.msGrandmaTel = msGrandmaTel;
    }

    public String getMsGrandpaTel() {
        return msGrandpaTel;
    }

    public void setMsGrandpaTel(String msGrandpaTel) {
        this.msGrandpaTel = msGrandpaTel;
    }

    public String getFsGrandmaTel() {
        return fsGrandmaTel;
    }

    public void setFsGrandmaTel(String fsGrandmaTel) {
        this.fsGrandmaTel = fsGrandmaTel;
    }

    public String getFsGrandpaTel() {
        return fsGrandpaTel;
    }

    public void setFsGrandpaTel(String fsGrandpaTel) {
        this.fsGrandpaTel = fsGrandpaTel;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getOtherTel() {
        return otherTel;
    }

    public void setOtherTel(String otherTel) {
        this.otherTel = otherTel;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getCollector() {
        return collector;
    }

    public void setCollector(User collector) {
        this.collector = collector;
    }
}

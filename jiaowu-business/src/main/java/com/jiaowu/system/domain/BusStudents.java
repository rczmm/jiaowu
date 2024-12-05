package com.jiaowu.system.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jiaowu.common.annotation.Excel;
import com.jiaowu.common.core.domain.BaseEntity;

/**
 * 存储学生信息的对象 bus_students
 *
 * @author ruoyi
 * @date 2024-12-05
 */
public class BusStudents extends BaseEntity {
    private static final long serialVersionUID = 1L;

    public BusStudents() {
    }

    public BusStudents(String studentName) {
        this.studentName = studentName;
    }

    /**
     * 学生ID，自增主键
     */
    private Long studentId;

    /**
     * 学生学号，唯一，不能为空
     */
    @Excel(name = "学生学号，唯一，不能为空")
    private String studentNumber;

    /**
     * 学生姓名，不能为空
     */
    @Excel(name = "学生姓名，不能为空")
    private String studentName;

    /**
     * 性别，只能是M或F
     */
    @Excel(name = "性别，只能是M或F")
    private String gender;

    /**
     * 出生日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthDate;

    /**
     * 电子邮件地址
     */
    @Excel(name = "电子邮件地址")
    private String email;

    /**
     * 电话号码
     */
    @Excel(name = "电话号码")
    private String phoneNumber;

    /**
     * 专业
     */
    @Excel(name = "专业")
    private String major;

    /**
     * 班级ID
     */
    @Excel(name = "班级ID")
    private Long classId;

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getClassId() {
        return classId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("studentId", getStudentId())
                .append("studentNumber", getStudentNumber())
                .append("studentName", getStudentName())
                .append("gender", getGender())
                .append("birthDate", getBirthDate())
                .append("email", getEmail())
                .append("phoneNumber", getPhoneNumber())
                .append("major", getMajor())
                .append("classId", getClassId())
                .toString();
    }
}

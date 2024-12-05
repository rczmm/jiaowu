package com.jiaowu.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jiaowu.common.annotation.Excel;
import com.jiaowu.common.core.domain.BaseEntity;

/**
 * 存储教师信息的对象 bus_teachers
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public class BusTeachers extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 老师ID，自增主键 */
    private Long teacherId;

    /** 老师工号，唯一，不能为空 */
    @Excel(name = "老师工号，唯一，不能为空")
    private String teacherNumber;

    /** 老师姓名，不能为空 */
    @Excel(name = "老师姓名，不能为空")
    private String teacherName;

    /** 性别，只能是M或F */
    @Excel(name = "性别，只能是M或F")
    private String gender;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthDate;

    /** 电子邮件地址 */
    @Excel(name = "电子邮件地址")
    private String email;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phoneNumber;

    /** 教授科目 */
    @Excel(name = "教授科目")
    private String subjectTaught;

    public void setTeacherId(Long teacherId) 
    {
        this.teacherId = teacherId;
    }

    public Long getTeacherId() 
    {
        return teacherId;
    }
    public void setTeacherNumber(String teacherNumber) 
    {
        this.teacherNumber = teacherNumber;
    }

    public String getTeacherNumber() 
    {
        return teacherNumber;
    }
    public void setTeacherName(String teacherName) 
    {
        this.teacherName = teacherName;
    }

    public String getTeacherName() 
    {
        return teacherName;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setBirthDate(Date birthDate) 
    {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() 
    {
        return birthDate;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setSubjectTaught(String subjectTaught) 
    {
        this.subjectTaught = subjectTaught;
    }

    public String getSubjectTaught() 
    {
        return subjectTaught;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("teacherId", getTeacherId())
            .append("teacherNumber", getTeacherNumber())
            .append("teacherName", getTeacherName())
            .append("gender", getGender())
            .append("birthDate", getBirthDate())
            .append("email", getEmail())
            .append("phoneNumber", getPhoneNumber())
            .append("subjectTaught", getSubjectTaught())
            .toString();
    }
}

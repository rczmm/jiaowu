package com.jiaowu.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jiaowu.common.annotation.Excel;
import com.jiaowu.common.core.domain.BaseEntity;

/**
 * 存储学生成绩信息的对象 bus_grades
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public class BusGrades extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学生ID */
    private Long studentId;

    private String studentName;

    /** 课程ID */
    private Long courseId;

    private String courseName;

    /** 成绩，假设为百分制 */
    @Excel(name = "成绩，假设为百分制")
    private BigDecimal grade;

    public void setStudentId(Long studentId) 
    {
        this.studentId = studentId;
    }

    public Long getStudentId() 
    {
        return studentId;
    }
    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public Long getCourseId() 
    {
        return courseId;
    }
    public void setGrade(BigDecimal grade) 
    {
        this.grade = grade;
    }

    public BigDecimal getGrade() 
    {
        return grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("studentId", getStudentId())
            .append("courseId", getCourseId())
            .append("grade", getGrade())
            .toString();
    }
}

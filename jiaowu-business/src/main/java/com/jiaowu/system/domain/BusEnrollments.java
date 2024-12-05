package com.jiaowu.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jiaowu.common.annotation.Excel;
import com.jiaowu.common.core.domain.BaseEntity;

/**
 * 存储学生选课信息的对象 bus_enrollments
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public class BusEnrollments extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学生ID */
    private Long studentId;

    /** 课程ID */
    private Long courseId;

    /** 选课状态，例如：Enrolled, Dropped, Auditing */
    @Excel(name = "选课状态，例如：Enrolled, Dropped, Auditing")
    private String enrollmentStatus;

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
    public void setEnrollmentStatus(String enrollmentStatus) 
    {
        this.enrollmentStatus = enrollmentStatus;
    }

    public String getEnrollmentStatus() 
    {
        return enrollmentStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("studentId", getStudentId())
            .append("courseId", getCourseId())
            .append("enrollmentStatus", getEnrollmentStatus())
            .toString();
    }
}

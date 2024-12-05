package com.jiaowu.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jiaowu.common.annotation.Excel;
import com.jiaowu.common.core.domain.BaseEntity;

/**
 * 存储课程信息的对象 bus_courses
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public class BusCourses extends BaseEntity
{
    private static final long serialVersionUID = 1L;


    public BusCourses() {
    }

    public BusCourses(String courseName) {
        this.courseName = courseName;
    }

    /** 课程ID，自增主键 */
    private Long courseId;

    /** 课程编号，唯一，不能为空 */
    @Excel(name = "课程编号，唯一，不能为空")
    private String courseNumber;

    /** 课程名称，不能为空 */
    @Excel(name = "课程名称，不能为空")
    private String courseName;

    /** 学分 */
    @Excel(name = "学分")
    private Long credits;

    /** 课程描述 */
    @Excel(name = "课程描述")
    private String description;

    /** 开课学期 */
    @Excel(name = "开课学期")
    private String semester;

    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public Long getCourseId() 
    {
        return courseId;
    }
    public void setCourseNumber(String courseNumber) 
    {
        this.courseNumber = courseNumber;
    }

    public String getCourseNumber() 
    {
        return courseNumber;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setCredits(Long credits) 
    {
        this.credits = credits;
    }

    public Long getCredits() 
    {
        return credits;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setSemester(String semester) 
    {
        this.semester = semester;
    }

    public String getSemester() 
    {
        return semester;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("courseId", getCourseId())
            .append("courseNumber", getCourseNumber())
            .append("courseName", getCourseName())
            .append("credits", getCredits())
            .append("description", getDescription())
            .append("semester", getSemester())
            .toString();
    }
}

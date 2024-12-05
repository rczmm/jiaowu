package com.jiaowu.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jiaowu.common.annotation.Excel;
import com.jiaowu.common.core.domain.BaseEntity;

/**
 * 存储班级信息的对象 bus_classes
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public class BusClasses extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 班级ID，自增主键 */
    private Long classId;

    /** 班级编号，唯一，不能为空 */
    @Excel(name = "班级编号，唯一，不能为空")
    private String classNumber;

    /** 班级名称，不能为空 */
    @Excel(name = "班级名称，不能为空")
    private String className;

    public void setClassId(Long classId) 
    {
        this.classId = classId;
    }

    public Long getClassId() 
    {
        return classId;
    }
    public void setClassNumber(String classNumber) 
    {
        this.classNumber = classNumber;
    }

    public String getClassNumber() 
    {
        return classNumber;
    }
    public void setClassName(String className) 
    {
        this.className = className;
    }

    public String getClassName() 
    {
        return className;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("classId", getClassId())
            .append("classNumber", getClassNumber())
            .append("className", getClassName())
            .toString();
    }
}

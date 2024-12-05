package com.jiaowu.system.service;

import java.util.List;
import com.jiaowu.system.domain.BusGrades;

/**
 * 存储学生成绩信息的Service接口
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public interface IBusGradesService 
{
    /**
     * 查询存储学生成绩信息的
     * 
     * @param studentId 存储学生成绩信息的主键
     * @return 存储学生成绩信息的
     */
    public BusGrades selectBusGradesByStudentId(Long studentId);

    /**
     * 查询存储学生成绩信息的列表
     * 
     * @param busGrades 存储学生成绩信息的
     * @return 存储学生成绩信息的集合
     */
    public List<BusGrades> selectBusGradesList(BusGrades busGrades);

    /**
     * 新增存储学生成绩信息的
     * 
     * @param busGrades 存储学生成绩信息的
     * @return 结果
     */
    public int insertBusGrades(BusGrades busGrades);

    /**
     * 修改存储学生成绩信息的
     * 
     * @param busGrades 存储学生成绩信息的
     * @return 结果
     */
    public int updateBusGrades(BusGrades busGrades);

    /**
     * 批量删除存储学生成绩信息的
     * 
     * @param studentIds 需要删除的存储学生成绩信息的主键集合
     * @return 结果
     */
    public int deleteBusGradesByStudentIds(Long[] studentIds);

    /**
     * 删除存储学生成绩信息的信息
     * 
     * @param studentId 存储学生成绩信息的主键
     * @return 结果
     */
    public int deleteBusGradesByStudentId(Long studentId);
}

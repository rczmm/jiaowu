package com.jiaowu.system.mapper;

import java.util.List;
import com.jiaowu.system.domain.BusStudents;

/**
 * 存储学生信息的Mapper接口
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public interface BusStudentsMapper 
{
    /**
     * 查询存储学生信息的
     * 
     * @param studentId 存储学生信息的主键
     * @return 存储学生信息的
     */
    public BusStudents selectBusStudentsByStudentId(Long studentId);

    /**
     * 查询存储学生信息的列表
     * 
     * @param busStudents 存储学生信息的
     * @return 存储学生信息的集合
     */
    public List<BusStudents> selectBusStudentsList(BusStudents busStudents);

    /**
     * 新增存储学生信息的
     * 
     * @param busStudents 存储学生信息的
     * @return 结果
     */
    public int insertBusStudents(BusStudents busStudents);

    /**
     * 修改存储学生信息的
     * 
     * @param busStudents 存储学生信息的
     * @return 结果
     */
    public int updateBusStudents(BusStudents busStudents);

    /**
     * 删除存储学生信息的
     * 
     * @param studentId 存储学生信息的主键
     * @return 结果
     */
    public int deleteBusStudentsByStudentId(Long studentId);

    /**
     * 批量删除存储学生信息的
     * 
     * @param studentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBusStudentsByStudentIds(Long[] studentIds);
}
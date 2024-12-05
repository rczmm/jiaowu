package com.jiaowu.system.service;

import java.util.List;
import com.jiaowu.system.domain.BusEnrollments;

/**
 * 存储学生选课信息的Service接口
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public interface IBusEnrollmentsService 
{
    /**
     * 查询存储学生选课信息的
     * 
     * @param studentId 存储学生选课信息的主键
     * @return 存储学生选课信息的
     */
    public BusEnrollments selectBusEnrollmentsByStudentId(Long studentId);

    /**
     * 查询存储学生选课信息的列表
     * 
     * @param busEnrollments 存储学生选课信息的
     * @return 存储学生选课信息的集合
     */
    public List<BusEnrollments> selectBusEnrollmentsList(BusEnrollments busEnrollments);

    /**
     * 新增存储学生选课信息的
     * 
     * @param busEnrollments 存储学生选课信息的
     * @return 结果
     */
    public int insertBusEnrollments(BusEnrollments busEnrollments);

    /**
     * 修改存储学生选课信息的
     * 
     * @param busEnrollments 存储学生选课信息的
     * @return 结果
     */
    public int updateBusEnrollments(BusEnrollments busEnrollments);

    /**
     * 批量删除存储学生选课信息的
     * 
     * @param studentIds 需要删除的存储学生选课信息的主键集合
     * @return 结果
     */
    public int deleteBusEnrollmentsByStudentIds(Long[] studentIds);

    /**
     * 删除存储学生选课信息的信息
     * 
     * @param studentId 存储学生选课信息的主键
     * @return 结果
     */
    public int deleteBusEnrollmentsByStudentId(Long studentId);
}

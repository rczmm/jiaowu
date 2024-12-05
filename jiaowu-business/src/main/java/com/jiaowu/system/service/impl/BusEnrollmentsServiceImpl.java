package com.jiaowu.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jiaowu.system.mapper.BusEnrollmentsMapper;
import com.jiaowu.system.domain.BusEnrollments;
import com.jiaowu.system.service.IBusEnrollmentsService;

/**
 * 存储学生选课信息的Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@Service
public class BusEnrollmentsServiceImpl implements IBusEnrollmentsService 
{
    @Autowired
    private BusEnrollmentsMapper busEnrollmentsMapper;

    /**
     * 查询存储学生选课信息的
     * 
     * @param studentId 存储学生选课信息的主键
     * @return 存储学生选课信息的
     */
    @Override
    public BusEnrollments selectBusEnrollmentsByStudentId(Long studentId)
    {
        return busEnrollmentsMapper.selectBusEnrollmentsByStudentId(studentId);
    }

    /**
     * 查询存储学生选课信息的列表
     * 
     * @param busEnrollments 存储学生选课信息的
     * @return 存储学生选课信息的
     */
    @Override
    public List<BusEnrollments> selectBusEnrollmentsList(BusEnrollments busEnrollments)
    {
        return busEnrollmentsMapper.selectBusEnrollmentsList(busEnrollments);
    }

    /**
     * 新增存储学生选课信息的
     * 
     * @param busEnrollments 存储学生选课信息的
     * @return 结果
     */
    @Override
    public int insertBusEnrollments(BusEnrollments busEnrollments)
    {
        return busEnrollmentsMapper.insertBusEnrollments(busEnrollments);
    }

    /**
     * 修改存储学生选课信息的
     * 
     * @param busEnrollments 存储学生选课信息的
     * @return 结果
     */
    @Override
    public int updateBusEnrollments(BusEnrollments busEnrollments)
    {
        return busEnrollmentsMapper.updateBusEnrollments(busEnrollments);
    }

    /**
     * 批量删除存储学生选课信息的
     * 
     * @param studentIds 需要删除的存储学生选课信息的主键
     * @return 结果
     */
    @Override
    public int deleteBusEnrollmentsByStudentIds(Long[] studentIds)
    {
        return busEnrollmentsMapper.deleteBusEnrollmentsByStudentIds(studentIds);
    }

    /**
     * 删除存储学生选课信息的信息
     * 
     * @param studentId 存储学生选课信息的主键
     * @return 结果
     */
    @Override
    public int deleteBusEnrollmentsByStudentId(Long studentId)
    {
        return busEnrollmentsMapper.deleteBusEnrollmentsByStudentId(studentId);
    }
}

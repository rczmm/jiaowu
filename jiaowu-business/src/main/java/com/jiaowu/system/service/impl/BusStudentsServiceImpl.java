package com.jiaowu.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jiaowu.system.mapper.BusStudentsMapper;
import com.jiaowu.system.domain.BusStudents;
import com.jiaowu.system.service.IBusStudentsService;

/**
 * 存储学生信息的Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@Service
public class BusStudentsServiceImpl implements IBusStudentsService 
{
    @Autowired
    private BusStudentsMapper busStudentsMapper;

    /**
     * 查询存储学生信息的
     * 
     * @param studentId 存储学生信息的主键
     * @return 存储学生信息的
     */
    @Override
    public BusStudents selectBusStudentsByStudentId(Long studentId)
    {
        return busStudentsMapper.selectBusStudentsByStudentId(studentId);
    }

    /**
     * 查询存储学生信息的列表
     * 
     * @param busStudents 存储学生信息的
     * @return 存储学生信息的
     */
    @Override
    public List<BusStudents> selectBusStudentsList(BusStudents busStudents)
    {
        return busStudentsMapper.selectBusStudentsList(busStudents);
    }

    /**
     * 新增存储学生信息的
     * 
     * @param busStudents 存储学生信息的
     * @return 结果
     */
    @Override
    public int insertBusStudents(BusStudents busStudents)
    {
        return busStudentsMapper.insertBusStudents(busStudents);
    }

    /**
     * 修改存储学生信息的
     * 
     * @param busStudents 存储学生信息的
     * @return 结果
     */
    @Override
    public int updateBusStudents(BusStudents busStudents)
    {
        return busStudentsMapper.updateBusStudents(busStudents);
    }

    /**
     * 批量删除存储学生信息的
     * 
     * @param studentIds 需要删除的存储学生信息的主键
     * @return 结果
     */
    @Override
    public int deleteBusStudentsByStudentIds(Long[] studentIds)
    {
        return busStudentsMapper.deleteBusStudentsByStudentIds(studentIds);
    }

    /**
     * 删除存储学生信息的信息
     * 
     * @param studentId 存储学生信息的主键
     * @return 结果
     */
    @Override
    public int deleteBusStudentsByStudentId(Long studentId)
    {
        return busStudentsMapper.deleteBusStudentsByStudentId(studentId);
    }
}

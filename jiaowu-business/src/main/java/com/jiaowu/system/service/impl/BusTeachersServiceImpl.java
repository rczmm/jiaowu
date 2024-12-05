package com.jiaowu.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jiaowu.system.mapper.BusTeachersMapper;
import com.jiaowu.system.domain.BusTeachers;
import com.jiaowu.system.service.IBusTeachersService;

/**
 * 存储教师信息的Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@Service
public class BusTeachersServiceImpl implements IBusTeachersService 
{
    @Autowired
    private BusTeachersMapper busTeachersMapper;

    /**
     * 查询存储教师信息的
     * 
     * @param teacherId 存储教师信息的主键
     * @return 存储教师信息的
     */
    @Override
    public BusTeachers selectBusTeachersByTeacherId(Long teacherId)
    {
        return busTeachersMapper.selectBusTeachersByTeacherId(teacherId);
    }

    /**
     * 查询存储教师信息的列表
     * 
     * @param busTeachers 存储教师信息的
     * @return 存储教师信息的
     */
    @Override
    public List<BusTeachers> selectBusTeachersList(BusTeachers busTeachers)
    {
        return busTeachersMapper.selectBusTeachersList(busTeachers);
    }

    /**
     * 新增存储教师信息的
     * 
     * @param busTeachers 存储教师信息的
     * @return 结果
     */
    @Override
    public int insertBusTeachers(BusTeachers busTeachers)
    {
        return busTeachersMapper.insertBusTeachers(busTeachers);
    }

    /**
     * 修改存储教师信息的
     * 
     * @param busTeachers 存储教师信息的
     * @return 结果
     */
    @Override
    public int updateBusTeachers(BusTeachers busTeachers)
    {
        return busTeachersMapper.updateBusTeachers(busTeachers);
    }

    /**
     * 批量删除存储教师信息的
     * 
     * @param teacherIds 需要删除的存储教师信息的主键
     * @return 结果
     */
    @Override
    public int deleteBusTeachersByTeacherIds(Long[] teacherIds)
    {
        return busTeachersMapper.deleteBusTeachersByTeacherIds(teacherIds);
    }

    /**
     * 删除存储教师信息的信息
     * 
     * @param teacherId 存储教师信息的主键
     * @return 结果
     */
    @Override
    public int deleteBusTeachersByTeacherId(Long teacherId)
    {
        return busTeachersMapper.deleteBusTeachersByTeacherId(teacherId);
    }
}

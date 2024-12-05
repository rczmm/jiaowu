package com.jiaowu.system.service;

import java.util.List;
import com.jiaowu.system.domain.BusTeachers;

/**
 * 存储教师信息的Service接口
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public interface IBusTeachersService 
{
    /**
     * 查询存储教师信息的
     * 
     * @param teacherId 存储教师信息的主键
     * @return 存储教师信息的
     */
    public BusTeachers selectBusTeachersByTeacherId(Long teacherId);

    /**
     * 查询存储教师信息的列表
     * 
     * @param busTeachers 存储教师信息的
     * @return 存储教师信息的集合
     */
    public List<BusTeachers> selectBusTeachersList(BusTeachers busTeachers);

    /**
     * 新增存储教师信息的
     * 
     * @param busTeachers 存储教师信息的
     * @return 结果
     */
    public int insertBusTeachers(BusTeachers busTeachers);

    /**
     * 修改存储教师信息的
     * 
     * @param busTeachers 存储教师信息的
     * @return 结果
     */
    public int updateBusTeachers(BusTeachers busTeachers);

    /**
     * 批量删除存储教师信息的
     * 
     * @param teacherIds 需要删除的存储教师信息的主键集合
     * @return 结果
     */
    public int deleteBusTeachersByTeacherIds(Long[] teacherIds);

    /**
     * 删除存储教师信息的信息
     * 
     * @param teacherId 存储教师信息的主键
     * @return 结果
     */
    public int deleteBusTeachersByTeacherId(Long teacherId);
}

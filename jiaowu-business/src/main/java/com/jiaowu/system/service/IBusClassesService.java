package com.jiaowu.system.service;

import java.util.List;
import com.jiaowu.system.domain.BusClasses;

/**
 * 存储班级信息的Service接口
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public interface IBusClassesService 
{
    /**
     * 查询存储班级信息的
     * 
     * @param classId 存储班级信息的主键
     * @return 存储班级信息的
     */
    public BusClasses selectBusClassesByClassId(Long classId);

    /**
     * 查询存储班级信息的列表
     * 
     * @param busClasses 存储班级信息的
     * @return 存储班级信息的集合
     */
    public List<BusClasses> selectBusClassesList(BusClasses busClasses);

    /**
     * 新增存储班级信息的
     * 
     * @param busClasses 存储班级信息的
     * @return 结果
     */
    public int insertBusClasses(BusClasses busClasses);

    /**
     * 修改存储班级信息的
     * 
     * @param busClasses 存储班级信息的
     * @return 结果
     */
    public int updateBusClasses(BusClasses busClasses);

    /**
     * 批量删除存储班级信息的
     * 
     * @param classIds 需要删除的存储班级信息的主键集合
     * @return 结果
     */
    public int deleteBusClassesByClassIds(Long[] classIds);

    /**
     * 删除存储班级信息的信息
     * 
     * @param classId 存储班级信息的主键
     * @return 结果
     */
    public int deleteBusClassesByClassId(Long classId);
}

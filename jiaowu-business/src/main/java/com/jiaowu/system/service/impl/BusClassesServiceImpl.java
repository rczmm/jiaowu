package com.jiaowu.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jiaowu.system.mapper.BusClassesMapper;
import com.jiaowu.system.domain.BusClasses;
import com.jiaowu.system.service.IBusClassesService;

/**
 * 存储班级信息的Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@Service
public class BusClassesServiceImpl implements IBusClassesService 
{
    @Autowired
    private BusClassesMapper busClassesMapper;

    /**
     * 查询存储班级信息的
     * 
     * @param classId 存储班级信息的主键
     * @return 存储班级信息的
     */
    @Override
    public BusClasses selectBusClassesByClassId(Long classId)
    {
        return busClassesMapper.selectBusClassesByClassId(classId);
    }

    /**
     * 查询存储班级信息的列表
     * 
     * @param busClasses 存储班级信息的
     * @return 存储班级信息的
     */
    @Override
    public List<BusClasses> selectBusClassesList(BusClasses busClasses)
    {
        return busClassesMapper.selectBusClassesList(busClasses);
    }

    /**
     * 新增存储班级信息的
     * 
     * @param busClasses 存储班级信息的
     * @return 结果
     */
    @Override
    public int insertBusClasses(BusClasses busClasses)
    {
        return busClassesMapper.insertBusClasses(busClasses);
    }

    /**
     * 修改存储班级信息的
     * 
     * @param busClasses 存储班级信息的
     * @return 结果
     */
    @Override
    public int updateBusClasses(BusClasses busClasses)
    {
        return busClassesMapper.updateBusClasses(busClasses);
    }

    /**
     * 批量删除存储班级信息的
     * 
     * @param classIds 需要删除的存储班级信息的主键
     * @return 结果
     */
    @Override
    public int deleteBusClassesByClassIds(Long[] classIds)
    {
        return busClassesMapper.deleteBusClassesByClassIds(classIds);
    }

    /**
     * 删除存储班级信息的信息
     * 
     * @param classId 存储班级信息的主键
     * @return 结果
     */
    @Override
    public int deleteBusClassesByClassId(Long classId)
    {
        return busClassesMapper.deleteBusClassesByClassId(classId);
    }
}

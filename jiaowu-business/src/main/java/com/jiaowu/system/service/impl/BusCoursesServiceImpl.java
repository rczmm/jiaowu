package com.jiaowu.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jiaowu.system.mapper.BusCoursesMapper;
import com.jiaowu.system.domain.BusCourses;
import com.jiaowu.system.service.IBusCoursesService;

/**
 * 存储课程信息的Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@Service
public class BusCoursesServiceImpl implements IBusCoursesService 
{
    @Autowired
    private BusCoursesMapper busCoursesMapper;

    /**
     * 查询存储课程信息的
     * 
     * @param courseId 存储课程信息的主键
     * @return 存储课程信息的
     */
    @Override
    public BusCourses selectBusCoursesByCourseId(Long courseId)
    {
        return busCoursesMapper.selectBusCoursesByCourseId(courseId);
    }

    /**
     * 查询存储课程信息的列表
     * 
     * @param busCourses 存储课程信息的
     * @return 存储课程信息的
     */
    @Override
    public List<BusCourses> selectBusCoursesList(BusCourses busCourses)
    {
        return busCoursesMapper.selectBusCoursesList(busCourses);
    }

    /**
     * 新增存储课程信息的
     * 
     * @param busCourses 存储课程信息的
     * @return 结果
     */
    @Override
    public int insertBusCourses(BusCourses busCourses)
    {
        return busCoursesMapper.insertBusCourses(busCourses);
    }

    /**
     * 修改存储课程信息的
     * 
     * @param busCourses 存储课程信息的
     * @return 结果
     */
    @Override
    public int updateBusCourses(BusCourses busCourses)
    {
        return busCoursesMapper.updateBusCourses(busCourses);
    }

    /**
     * 批量删除存储课程信息的
     * 
     * @param courseIds 需要删除的存储课程信息的主键
     * @return 结果
     */
    @Override
    public int deleteBusCoursesByCourseIds(Long[] courseIds)
    {
        return busCoursesMapper.deleteBusCoursesByCourseIds(courseIds);
    }

    /**
     * 删除存储课程信息的信息
     * 
     * @param courseId 存储课程信息的主键
     * @return 结果
     */
    @Override
    public int deleteBusCoursesByCourseId(Long courseId)
    {
        return busCoursesMapper.deleteBusCoursesByCourseId(courseId);
    }
}

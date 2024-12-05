package com.jiaowu.system.mapper;

import java.util.List;
import com.jiaowu.system.domain.BusCourses;

/**
 * 存储课程信息的Mapper接口
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
public interface BusCoursesMapper 
{
    /**
     * 查询存储课程信息的
     * 
     * @param courseId 存储课程信息的主键
     * @return 存储课程信息的
     */
    public BusCourses selectBusCoursesByCourseId(Long courseId);

    /**
     * 查询存储课程信息的列表
     * 
     * @param busCourses 存储课程信息的
     * @return 存储课程信息的集合
     */
    public List<BusCourses> selectBusCoursesList(BusCourses busCourses);

    /**
     * 新增存储课程信息的
     * 
     * @param busCourses 存储课程信息的
     * @return 结果
     */
    public int insertBusCourses(BusCourses busCourses);

    /**
     * 修改存储课程信息的
     * 
     * @param busCourses 存储课程信息的
     * @return 结果
     */
    public int updateBusCourses(BusCourses busCourses);

    /**
     * 删除存储课程信息的
     * 
     * @param courseId 存储课程信息的主键
     * @return 结果
     */
    public int deleteBusCoursesByCourseId(Long courseId);

    /**
     * 批量删除存储课程信息的
     * 
     * @param courseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBusCoursesByCourseIds(Long[] courseIds);
}

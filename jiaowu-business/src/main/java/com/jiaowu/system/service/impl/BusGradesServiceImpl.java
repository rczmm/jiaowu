package com.jiaowu.system.service.impl;

import java.util.List;

import com.jiaowu.common.core.domain.model.LoginUser;
import com.jiaowu.system.domain.BusCourses;
import com.jiaowu.system.domain.BusStudents;
import com.jiaowu.system.mapper.BusCoursesMapper;
import com.jiaowu.system.mapper.BusStudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jiaowu.system.mapper.BusGradesMapper;
import com.jiaowu.system.domain.BusGrades;
import com.jiaowu.system.service.IBusGradesService;

import javax.annotation.Resource;

/**
 * 存储学生成绩信息的Service业务层处理
 *
 * @author ruoyi
 * @date 2024-12-05
 */
@Service
public class BusGradesServiceImpl implements IBusGradesService {
    @Autowired
    private BusGradesMapper busGradesMapper;

    @Resource
    private BusStudentsMapper busStudentsMapper;

    @Resource
    private BusCoursesMapper busCoursesMapper;

    /**
     * 查询存储学生成绩信息的
     *
     * @param studentId 存储学生成绩信息的主键
     * @return 存储学生成绩信息的
     */
    @Override
    public BusGrades selectBusGradesByStudentId(Long studentId) {
        return busGradesMapper.selectBusGradesByStudentId(studentId);
    }

    /**
     * 查询存储学生成绩信息的列表
     *
     * @param busGrades 存储学生成绩信息的
     * @return 存储学生成绩信息的
     */
    @Override
    public List<BusGrades> selectBusGradesList(BusGrades busGrades) {
        List<BusGrades> grades = busGradesMapper.selectBusGradesList(busGrades);
        for (BusGrades grade : grades) {
            grade.setStudentName(busStudentsMapper.selectBusStudentsByStudentId(grade.getStudentId()).getStudentName());
            grade.setCourseName(busCoursesMapper.selectBusCoursesByCourseId(grade.getCourseId()).getCourseName());
        }
        return grades;
    }

    /**
     * 新增存储学生成绩信息的
     *
     * @param busGrades 存储学生成绩信息的
     * @return 结果
     */
    @Override
    public int insertBusGrades(BusGrades busGrades) {
        String studentName = busGrades.getStudentName();
        String courseName = busGrades.getCourseName();
        List<BusStudents> studentsList = busStudentsMapper.selectBusStudentsList(new BusStudents(studentName));
        List<BusCourses> busCourses = busCoursesMapper.selectBusCoursesList(new BusCourses(courseName));
        if (studentsList.isEmpty()) {
            throw new RuntimeException("学生不存在");
        }
        if (busCourses.isEmpty()) {
            throw new RuntimeException("课程不存在");
        }
        busGrades.setStudentId(studentsList.get(0).getStudentId());
        busGrades.setCourseId(busCourses.get(0).getCourseId());
        return busGradesMapper.insertBusGrades(busGrades);
    }

    /**
     * 修改存储学生成绩信息的
     *
     * @param busGrades 存储学生成绩信息的
     * @return 结果
     */
    @Override
    public int updateBusGrades(BusGrades busGrades) {
        return busGradesMapper.updateBusGrades(busGrades);
    }

    /**
     * 批量删除存储学生成绩信息的
     *
     * @param studentIds 需要删除的存储学生成绩信息的主键
     * @return 结果
     */
    @Override
    public int deleteBusGradesByStudentIds(Long[] studentIds) {
        return busGradesMapper.deleteBusGradesByStudentIds(studentIds);
    }

    /**
     * 删除存储学生成绩信息的信息
     *
     * @param studentId 存储学生成绩信息的主键
     * @return 结果
     */
    @Override
    public int deleteBusGradesByStudentId(Long studentId) {
        return busGradesMapper.deleteBusGradesByStudentId(studentId);
    }
}

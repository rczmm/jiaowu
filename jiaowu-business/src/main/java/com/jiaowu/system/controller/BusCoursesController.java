package com.jiaowu.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jiaowu.common.annotation.Log;
import com.jiaowu.common.core.controller.BaseController;
import com.jiaowu.common.core.domain.AjaxResult;
import com.jiaowu.common.enums.BusinessType;
import com.jiaowu.system.domain.BusCourses;
import com.jiaowu.system.service.IBusCoursesService;
import com.jiaowu.common.utils.poi.ExcelUtil;
import com.jiaowu.common.core.page.TableDataInfo;

/**
 * 存储课程信息的Controller
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@RestController
@RequestMapping("/system/courses")
public class BusCoursesController extends BaseController
{
    @Autowired
    private IBusCoursesService busCoursesService;

    /**
     * 查询存储课程信息的列表
     */
    @PreAuthorize("@ss.hasPermi('system:courses:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusCourses busCourses)
    {
        startPage();
        List<BusCourses> list = busCoursesService.selectBusCoursesList(busCourses);
        return getDataTable(list);
    }

    /**
     * 导出存储课程信息的列表
     */
    @PreAuthorize("@ss.hasPermi('system:courses:export')")
    @Log(title = "存储课程信息的", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BusCourses busCourses)
    {
        List<BusCourses> list = busCoursesService.selectBusCoursesList(busCourses);
        ExcelUtil<BusCourses> util = new ExcelUtil<BusCourses>(BusCourses.class);
        util.exportExcel(response, list, "存储课程信息的数据");
    }

    /**
     * 获取存储课程信息的详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:courses:query')")
    @GetMapping(value = "/{courseId}")
    public AjaxResult getInfo(@PathVariable("courseId") Long courseId)
    {
        return success(busCoursesService.selectBusCoursesByCourseId(courseId));
    }

    /**
     * 新增存储课程信息的
     */
    @PreAuthorize("@ss.hasPermi('system:courses:add')")
    @Log(title = "存储课程信息的", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusCourses busCourses)
    {
        return toAjax(busCoursesService.insertBusCourses(busCourses));
    }

    /**
     * 修改存储课程信息的
     */
    @PreAuthorize("@ss.hasPermi('system:courses:edit')")
    @Log(title = "存储课程信息的", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusCourses busCourses)
    {
        return toAjax(busCoursesService.updateBusCourses(busCourses));
    }

    /**
     * 删除存储课程信息的
     */
    @PreAuthorize("@ss.hasPermi('system:courses:remove')")
    @Log(title = "存储课程信息的", businessType = BusinessType.DELETE)
	@DeleteMapping("/{courseIds}")
    public AjaxResult remove(@PathVariable Long[] courseIds)
    {
        return toAjax(busCoursesService.deleteBusCoursesByCourseIds(courseIds));
    }
}

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
import com.jiaowu.system.domain.BusTeachers;
import com.jiaowu.system.service.IBusTeachersService;
import com.jiaowu.common.utils.poi.ExcelUtil;
import com.jiaowu.common.core.page.TableDataInfo;

/**
 * 存储教师信息的Controller
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@RestController
@RequestMapping("/system/teachers")
public class BusTeachersController extends BaseController
{
    @Autowired
    private IBusTeachersService busTeachersService;

    /**
     * 查询存储教师信息的列表
     */
    @PreAuthorize("@ss.hasPermi('system:teachers:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusTeachers busTeachers)
    {
        startPage();
        List<BusTeachers> list = busTeachersService.selectBusTeachersList(busTeachers);
        return getDataTable(list);
    }

    /**
     * 导出存储教师信息的列表
     */
    @PreAuthorize("@ss.hasPermi('system:teachers:export')")
    @Log(title = "存储教师信息的", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BusTeachers busTeachers)
    {
        List<BusTeachers> list = busTeachersService.selectBusTeachersList(busTeachers);
        ExcelUtil<BusTeachers> util = new ExcelUtil<BusTeachers>(BusTeachers.class);
        util.exportExcel(response, list, "存储教师信息的数据");
    }

    /**
     * 获取存储教师信息的详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:teachers:query')")
    @GetMapping(value = "/{teacherId}")
    public AjaxResult getInfo(@PathVariable("teacherId") Long teacherId)
    {
        return success(busTeachersService.selectBusTeachersByTeacherId(teacherId));
    }

    /**
     * 新增存储教师信息的
     */
    @PreAuthorize("@ss.hasPermi('system:teachers:add')")
    @Log(title = "存储教师信息的", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusTeachers busTeachers)
    {
        return toAjax(busTeachersService.insertBusTeachers(busTeachers));
    }

    /**
     * 修改存储教师信息的
     */
    @PreAuthorize("@ss.hasPermi('system:teachers:edit')")
    @Log(title = "存储教师信息的", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusTeachers busTeachers)
    {
        return toAjax(busTeachersService.updateBusTeachers(busTeachers));
    }

    /**
     * 删除存储教师信息的
     */
    @PreAuthorize("@ss.hasPermi('system:teachers:remove')")
    @Log(title = "存储教师信息的", businessType = BusinessType.DELETE)
	@DeleteMapping("/{teacherIds}")
    public AjaxResult remove(@PathVariable Long[] teacherIds)
    {
        return toAjax(busTeachersService.deleteBusTeachersByTeacherIds(teacherIds));
    }
}

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
import com.jiaowu.system.domain.BusGrades;
import com.jiaowu.system.service.IBusGradesService;
import com.jiaowu.common.utils.poi.ExcelUtil;
import com.jiaowu.common.core.page.TableDataInfo;

/**
 * 存储学生成绩信息的Controller
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@RestController
@RequestMapping("/system/grades")
public class BusGradesController extends BaseController
{
    @Autowired
    private IBusGradesService busGradesService;

    /**
     * 查询存储学生成绩信息的列表
     */
    @PreAuthorize("@ss.hasPermi('system:grades:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusGrades busGrades)
    {
        startPage();
        List<BusGrades> list = busGradesService.selectBusGradesList(busGrades);
        return getDataTable(list);
    }

    /**
     * 导出存储学生成绩信息的列表
     */
    @PreAuthorize("@ss.hasPermi('system:grades:export')")
    @Log(title = "存储学生成绩信息的", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BusGrades busGrades)
    {
        List<BusGrades> list = busGradesService.selectBusGradesList(busGrades);
        ExcelUtil<BusGrades> util = new ExcelUtil<BusGrades>(BusGrades.class);
        util.exportExcel(response, list, "存储学生成绩信息的数据");
    }

    /**
     * 获取存储学生成绩信息的详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:grades:query')")
    @GetMapping(value = "/{studentId}")
    public AjaxResult getInfo(@PathVariable("studentId") Long studentId)
    {
        return success(busGradesService.selectBusGradesByStudentId(studentId));
    }

    /**
     * 新增存储学生成绩信息的
     */
    @PreAuthorize("@ss.hasPermi('system:grades:add')")
    @Log(title = "存储学生成绩信息的", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusGrades busGrades)
    {
        return toAjax(busGradesService.insertBusGrades(busGrades));
    }

    /**
     * 修改存储学生成绩信息的
     */
    @PreAuthorize("@ss.hasPermi('system:grades:edit')")
    @Log(title = "存储学生成绩信息的", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusGrades busGrades)
    {
        return toAjax(busGradesService.updateBusGrades(busGrades));
    }

    /**
     * 删除存储学生成绩信息的
     */
    @PreAuthorize("@ss.hasPermi('system:grades:remove')")
    @Log(title = "存储学生成绩信息的", businessType = BusinessType.DELETE)
	@DeleteMapping("/{studentIds}")
    public AjaxResult remove(@PathVariable Long[] studentIds)
    {
        return toAjax(busGradesService.deleteBusGradesByStudentIds(studentIds));
    }
}

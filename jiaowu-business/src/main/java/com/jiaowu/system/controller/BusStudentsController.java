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
import com.jiaowu.system.domain.BusStudents;
import com.jiaowu.system.service.IBusStudentsService;
import com.jiaowu.common.utils.poi.ExcelUtil;
import com.jiaowu.common.core.page.TableDataInfo;

/**
 * 存储学生信息的Controller
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@RestController
@RequestMapping("/system/students")
public class BusStudentsController extends BaseController
{
    @Autowired
    private IBusStudentsService busStudentsService;

    /**
     * 查询存储学生信息的列表
     */
    @PreAuthorize("@ss.hasPermi('system:students:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusStudents busStudents)
    {
        startPage();
        List<BusStudents> list = busStudentsService.selectBusStudentsList(busStudents);
        return getDataTable(list);
    }

    /**
     * 导出存储学生信息的列表
     */
    @PreAuthorize("@ss.hasPermi('system:students:export')")
    @Log(title = "存储学生信息的", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BusStudents busStudents)
    {
        List<BusStudents> list = busStudentsService.selectBusStudentsList(busStudents);
        ExcelUtil<BusStudents> util = new ExcelUtil<BusStudents>(BusStudents.class);
        util.exportExcel(response, list, "存储学生信息的数据");
    }

    /**
     * 获取存储学生信息的详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:students:query')")
    @GetMapping(value = "/{studentId}")
    public AjaxResult getInfo(@PathVariable("studentId") Long studentId)
    {
        return success(busStudentsService.selectBusStudentsByStudentId(studentId));
    }

    /**
     * 新增存储学生信息的
     */
    @PreAuthorize("@ss.hasPermi('system:students:add')")
    @Log(title = "存储学生信息的", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusStudents busStudents)
    {
        return toAjax(busStudentsService.insertBusStudents(busStudents));
    }

    /**
     * 修改存储学生信息的
     */
    @PreAuthorize("@ss.hasPermi('system:students:edit')")
    @Log(title = "存储学生信息的", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusStudents busStudents)
    {
        return toAjax(busStudentsService.updateBusStudents(busStudents));
    }

    /**
     * 删除存储学生信息的
     */
    @PreAuthorize("@ss.hasPermi('system:students:remove')")
    @Log(title = "存储学生信息的", businessType = BusinessType.DELETE)
	@DeleteMapping("/{studentIds}")
    public AjaxResult remove(@PathVariable Long[] studentIds)
    {
        return toAjax(busStudentsService.deleteBusStudentsByStudentIds(studentIds));
    }
}

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
import com.jiaowu.system.domain.BusEnrollments;
import com.jiaowu.system.service.IBusEnrollmentsService;
import com.jiaowu.common.utils.poi.ExcelUtil;
import com.jiaowu.common.core.page.TableDataInfo;

/**
 * 存储学生选课信息的Controller
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@RestController
@RequestMapping("/system/enrollments")
public class BusEnrollmentsController extends BaseController
{
    @Autowired
    private IBusEnrollmentsService busEnrollmentsService;

    /**
     * 查询存储学生选课信息的列表
     */
    @PreAuthorize("@ss.hasPermi('system:enrollments:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusEnrollments busEnrollments)
    {
        startPage();
        List<BusEnrollments> list = busEnrollmentsService.selectBusEnrollmentsList(busEnrollments);
        return getDataTable(list);
    }

    /**
     * 导出存储学生选课信息的列表
     */
    @PreAuthorize("@ss.hasPermi('system:enrollments:export')")
    @Log(title = "存储学生选课信息的", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BusEnrollments busEnrollments)
    {
        List<BusEnrollments> list = busEnrollmentsService.selectBusEnrollmentsList(busEnrollments);
        ExcelUtil<BusEnrollments> util = new ExcelUtil<BusEnrollments>(BusEnrollments.class);
        util.exportExcel(response, list, "存储学生选课信息的数据");
    }

    /**
     * 获取存储学生选课信息的详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:enrollments:query')")
    @GetMapping(value = "/{studentId}")
    public AjaxResult getInfo(@PathVariable("studentId") Long studentId)
    {
        return success(busEnrollmentsService.selectBusEnrollmentsByStudentId(studentId));
    }

    /**
     * 新增存储学生选课信息的
     */
    @PreAuthorize("@ss.hasPermi('system:enrollments:add')")
    @Log(title = "存储学生选课信息的", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusEnrollments busEnrollments)
    {
        return toAjax(busEnrollmentsService.insertBusEnrollments(busEnrollments));
    }

    /**
     * 修改存储学生选课信息的
     */
    @PreAuthorize("@ss.hasPermi('system:enrollments:edit')")
    @Log(title = "存储学生选课信息的", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusEnrollments busEnrollments)
    {
        return toAjax(busEnrollmentsService.updateBusEnrollments(busEnrollments));
    }

    /**
     * 删除存储学生选课信息的
     */
    @PreAuthorize("@ss.hasPermi('system:enrollments:remove')")
    @Log(title = "存储学生选课信息的", businessType = BusinessType.DELETE)
	@DeleteMapping("/{studentIds}")
    public AjaxResult remove(@PathVariable Long[] studentIds)
    {
        return toAjax(busEnrollmentsService.deleteBusEnrollmentsByStudentIds(studentIds));
    }
}

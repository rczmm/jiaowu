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
import com.jiaowu.system.domain.BusClasses;
import com.jiaowu.system.service.IBusClassesService;
import com.jiaowu.common.utils.poi.ExcelUtil;
import com.jiaowu.common.core.page.TableDataInfo;

/**
 * 存储班级信息的Controller
 * 
 * @author ruoyi
 * @date 2024-12-05
 */
@RestController
@RequestMapping("/system/classes")
public class BusClassesController extends BaseController
{
    @Autowired
    private IBusClassesService busClassesService;

    /**
     * 查询存储班级信息的列表
     */
    @PreAuthorize("@ss.hasPermi('system:classes:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusClasses busClasses)
    {
        startPage();
        List<BusClasses> list = busClassesService.selectBusClassesList(busClasses);
        return getDataTable(list);
    }

    /**
     * 导出存储班级信息的列表
     */
    @PreAuthorize("@ss.hasPermi('system:classes:export')")
    @Log(title = "存储班级信息的", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BusClasses busClasses)
    {
        List<BusClasses> list = busClassesService.selectBusClassesList(busClasses);
        ExcelUtil<BusClasses> util = new ExcelUtil<BusClasses>(BusClasses.class);
        util.exportExcel(response, list, "存储班级信息的数据");
    }

    /**
     * 获取存储班级信息的详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:classes:query')")
    @GetMapping(value = "/{classId}")
    public AjaxResult getInfo(@PathVariable("classId") Long classId)
    {
        return success(busClassesService.selectBusClassesByClassId(classId));
    }

    /**
     * 新增存储班级信息的
     */
    @PreAuthorize("@ss.hasPermi('system:classes:add')")
    @Log(title = "存储班级信息的", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusClasses busClasses)
    {
        return toAjax(busClassesService.insertBusClasses(busClasses));
    }

    /**
     * 修改存储班级信息的
     */
    @PreAuthorize("@ss.hasPermi('system:classes:edit')")
    @Log(title = "存储班级信息的", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusClasses busClasses)
    {
        return toAjax(busClassesService.updateBusClasses(busClasses));
    }

    /**
     * 删除存储班级信息的
     */
    @PreAuthorize("@ss.hasPermi('system:classes:remove')")
    @Log(title = "存储班级信息的", businessType = BusinessType.DELETE)
	@DeleteMapping("/{classIds}")
    public AjaxResult remove(@PathVariable Long[] classIds)
    {
        return toAjax(busClassesService.deleteBusClassesByClassIds(classIds));
    }
}

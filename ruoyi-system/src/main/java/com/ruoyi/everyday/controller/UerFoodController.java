package com.ruoyi.everyday.controller;

import java.util.*;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ruoyi.common.annotation.AnonymousAccess;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.everyday.domain.UerFood;
import com.ruoyi.everyday.service.IUerFoodService;
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
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 食物Controller
 *
 * @author ruoyi
 * @date 2020-07-30
 */
@RestController
@RequestMapping("/everyday/food")
public class UerFoodController extends BaseController
{
    @Autowired
    private IUerFoodService uerFoodService;

    /**
     * 查询食物列表
     */
//    @PreAuthorize("@ss.hasPermi('system:food:list')")
    @AnonymousAccess
    @GetMapping("/list")
    public TableDataInfo list(UerFood uerFood)
    {
        logger.info("查询食物列表");
        startPage();
        List<UerFood> list =uerFoodService.criteriaQuery(uerFood);
        return getDataTable(list);
    }

    /**
     * 导出食物列表
     */
    @AnonymousAccess
//    @PreAuthorize("@ss.hasPermi('system:food:export')")
    @Log(title = "食物", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UerFood uerFood)
    {
        List<UerFood> list = uerFoodService.list();
        ExcelUtil<UerFood> util = new ExcelUtil<UerFood>(UerFood.class);
        return util.exportExcel(list, "food");
    }

    /**
     * 获取食物详细信息
     */
    @AnonymousAccess
//    @PreAuthorize("@ss.hasPermi('system:food:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(uerFoodService.getById(id));
    }

    /**
     * 新增食物
     */
//    @AnonymousAccess
//    @PreAuthorize("@ss.hasPermi('system:food:add')")
    @Log(title = "食物", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UerFood uerFood)
    {
        String date = DateUtil.formatDateTime(new Date()); ;

        uerFood.setCreateTime(date);
        return toAjax(uerFoodService.save(uerFood));
    }

    /**
     * 修改食物
     */
    @AnonymousAccess
//    @PreAuthorize("@ss.hasPermi('system:food:edit')")
    @Log(title = "食物", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UerFood uerFood)
    {
        return toAjax(uerFoodService.saveOrUpdate(uerFood));
    }

    /**
     * 删除食物
     */
    @AnonymousAccess
//    @PreAuthorize("@ss.hasPermi('system:food:remove')")
    @Log(title = "食物", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(uerFoodService.removeByIds(Arrays.asList(ids)));
    }
}

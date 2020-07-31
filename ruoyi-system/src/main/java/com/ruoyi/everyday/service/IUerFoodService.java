package com.ruoyi.everyday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.everyday.domain.UerFood;
import java.util.List;

/**
 * 食物Service接口
 *
 * @author ruoyi
 * @date 2020-07-30
 */
public interface IUerFoodService extends IService<UerFood>
{
    public UerFood seleList();

    /**
     * 查询
     * @param uerFood
     * @return
     */
    public List<UerFood> criteriaQuery(UerFood uerFood);
}

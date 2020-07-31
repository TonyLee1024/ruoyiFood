package com.ruoyi.everyday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.everyday.domain.UerFood;

/**
 * 食物Mapper接口
 *
 * @author ruoyi
 * @date 2020-07-30
 */
public interface UerFoodMapper extends BaseMapper<UerFood>
{
    public UerFood seleList();
}


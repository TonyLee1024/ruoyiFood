package com.ruoyi.everyday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.everyday.domain.UerFood;
import com.ruoyi.everyday.mapper.UerFoodMapper;
import com.ruoyi.everyday.service.IUerFoodService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 食物Service业务层处理
 *
 * @author ruoyi
 * @date 2020-07-30
 */
@Service
public class UerFoodServiceImpl  extends ServiceImpl<UerFoodMapper, UerFood>  implements IUerFoodService
{
    @Autowired
    private UerFoodMapper uerFoodMapper;


    @Override
    public UerFood seleList() {
        return uerFoodMapper.seleList();
    }
}


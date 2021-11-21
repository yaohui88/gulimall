package com.atguigu.gulimall.product.service;

import com.atgugui.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrGroupEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * ???Է??
 *
 * @author yaohui
 * @email tangyuan88@gmail.com
 * @date 2021-11-21 19:19:09
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


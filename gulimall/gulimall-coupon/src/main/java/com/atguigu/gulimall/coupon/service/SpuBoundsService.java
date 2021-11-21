package com.atguigu.gulimall.coupon.service;

import com.atgugui.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.SpuBoundsEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * ??Ʒspu???????
 *
 * @author yaohui
 * @email tangyuan88@gmail.com
 * @date 2021-11-21 23:08:13
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


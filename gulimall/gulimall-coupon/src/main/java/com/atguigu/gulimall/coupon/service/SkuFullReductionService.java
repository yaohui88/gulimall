package com.atguigu.gulimall.coupon.service;

import com.atgugui.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.SkuFullReductionEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * ??Ʒ??????Ϣ
 *
 * @author yaohui
 * @email tangyuan88@gmail.com
 * @date 2021-11-21 23:08:13
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.atguigu.gulimall.product.service;

import com.atgugui.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SkuImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * skuͼƬ
 *
 * @author yaohui
 * @email tangyuan88@gmail.com
 * @date 2021-11-21 19:19:09
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


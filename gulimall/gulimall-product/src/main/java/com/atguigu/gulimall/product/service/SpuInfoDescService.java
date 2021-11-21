package com.atguigu.gulimall.product.service;

import com.atgugui.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SpuInfoDescEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * spu??Ϣ???
 *
 * @author yaohui
 * @email tangyuan88@gmail.com
 * @date 2021-11-21 19:19:09
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


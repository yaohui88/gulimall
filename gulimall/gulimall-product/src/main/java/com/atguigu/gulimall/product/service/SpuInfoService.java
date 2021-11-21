package com.atguigu.gulimall.product.service;

import com.atgugui.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SpuInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * spu??Ϣ
 *
 * @author yaohui
 * @email tangyuan88@gmail.com
 * @date 2021-11-21 19:19:09
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


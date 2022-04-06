package com.atguigu.gulimall.member.feign;

import com.atgugui.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeiginService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}

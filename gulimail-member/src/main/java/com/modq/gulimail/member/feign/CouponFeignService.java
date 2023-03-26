package com.modq.gulimail.member.feign;

import com.modq.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimail-coupon")
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();
}

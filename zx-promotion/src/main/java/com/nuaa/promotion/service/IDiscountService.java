package com.nuaa.promotion.service;

import com.nuaa.api.dto.promotion.CouponDiscountDTO;
import com.nuaa.api.dto.promotion.OrderCouponDTO;
import com.nuaa.api.dto.promotion.OrderCourseDTO;

import java.util.List;

public interface IDiscountService {
    List<CouponDiscountDTO> findDiscountSolution(List<OrderCourseDTO> orderCourses);

    CouponDiscountDTO queryDiscountDetailByOrder(OrderCouponDTO orderCouponDTO);
}

package com.nuaa.trade.service;

import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.pay.sdk.dto.PayResultDTO;
import com.nuaa.trade.constants.OrderCancelReason;
import com.nuaa.trade.domain.dto.PlaceOrderDTO;
import com.nuaa.trade.domain.po.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.trade.domain.po.OrderDetail;
import com.nuaa.trade.domain.query.OrderPageQuery;
import com.nuaa.trade.domain.vo.OrderConfirmVO;
import com.nuaa.trade.domain.vo.OrderPageVO;
import com.nuaa.trade.domain.vo.OrderVO;
import com.nuaa.trade.domain.vo.PlaceOrderResultVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 订单 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IOrderService extends IService<Order> {

    PlaceOrderResultVO placeOrder(PlaceOrderDTO placeOrderDTO);

    @Transactional
    void saveOrderAndDetails(Order order, List<OrderDetail> orderDetails);

    void cancelOrder(Long orderId, OrderCancelReason cancelReason);

    void deleteOrder(Long id);

    PageDTO<OrderPageVO> queryMyOrderPage(OrderPageQuery pageQuery);

    OrderVO queryOrderById(Long id);

    PlaceOrderResultVO queryOrderStatus(Long orderId);

    void handlePaySuccess(PayResultDTO payResult);

    PlaceOrderResultVO enrolledFreeCourse(Long courseId);

    OrderConfirmVO prePlaceOrder(List<Long> courseIds);

}

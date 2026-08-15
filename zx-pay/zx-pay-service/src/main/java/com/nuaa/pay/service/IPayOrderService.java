package com.nuaa.pay.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.pay.domain.po.PayOrder;
import com.nuaa.pay.sdk.dto.PayApplyDTO;
import com.nuaa.pay.sdk.dto.PayResultDTO;

import java.time.LocalDateTime;

/**
 * <p>
 * 支付订单 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IPayOrderService extends IService<PayOrder> {

    String applyPayOrder(PayApplyDTO payApplyDTO);

    PayOrder queryByBizOrderNo(Long bizOrderNo);

    PayResultDTO queryPayResult(Long bizOrderId);

    PayOrder queryByPayOrderNo(Long payOrderNo);

    boolean markPayOrderSuccess(Long id, LocalDateTime successTime);

    PageDTO<PayOrder> queryPayingOrderByPage(int page, int size);

    void checkPayOrder(PayOrder payOrder);
}

package com.nuaa.pay.service;

import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.pay.domain.po.RefundOrder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.pay.sdk.dto.RefundApplyDTO;
import com.nuaa.pay.sdk.dto.RefundResultDTO;

/**
 * <p>
 * 退款订单 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IRefundOrderService extends IService<RefundOrder> {

    RefundResultDTO applyRefund(RefundApplyDTO refundApplyDTO);

    RefundResultDTO queryRefundResult(Long bizRefundOrderId);

    RefundOrder queryByRefundOrderNo(Long refundOrderNo);

    PageDTO<RefundOrder> queryRefundingOrderByPage(int pageNo, int size);

    void checkRefundOrder(RefundOrder refundOrder);

    RefundResultDTO queryRefundDetail(Long bizRefundOrderId);
}

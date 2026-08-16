package com.nuaa.trade.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.pay.sdk.dto.RefundResultDTO;
import com.nuaa.trade.domain.dto.ApproveFormDTO;
import com.nuaa.trade.domain.dto.RefundCancelDTO;
import com.nuaa.trade.domain.dto.RefundFormDTO;
import com.nuaa.trade.domain.po.RefundApply;
import com.nuaa.trade.domain.query.RefundApplyPageQuery;
import com.nuaa.trade.domain.vo.RefundApplyPageVO;
import com.nuaa.trade.domain.vo.RefundApplyVO;

import java.util.List;

/**
 * <p>
 * 退款申请 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IRefundApplyService extends IService<RefundApply> {

    List<RefundApply> queryByDetailId(Long id);

    void applyRefund(RefundFormDTO refundFormDTO);

    PageDTO<RefundApplyPageVO> queryRefundApplyByPage(RefundApplyPageQuery pageQuery);

    RefundApplyVO queryRefundDetailById(Long id);

    RefundApplyVO nextRefundApplyToApprove();

    void approveRefundApply(ApproveFormDTO approveDTO);

    void cancelRefundApply(RefundCancelDTO cancelDTO);

    RefundApplyVO queryRefundDetailByDetailId(Long id);

    void handleRefundResult(RefundResultDTO refundResult);

    List<RefundApply> queryApplyToSend(int page, int size);

    void sendRefundRequest(RefundApply refundApply);

    boolean checkRefundStatus(RefundApply refundApply);
}

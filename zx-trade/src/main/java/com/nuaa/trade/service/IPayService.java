package com.nuaa.trade.service;

import com.nuaa.trade.domain.dto.OrderDelayQueryDTO;
import com.nuaa.trade.domain.dto.PayApplyFormDTO;
import com.nuaa.trade.domain.vo.PayChannelVO;

import java.util.List;

public interface IPayService {
    List<PayChannelVO> queryPayChannels();

    String applyPayOrder(PayApplyFormDTO payApply);

    void queryPayResult(OrderDelayQueryDTO message);
}

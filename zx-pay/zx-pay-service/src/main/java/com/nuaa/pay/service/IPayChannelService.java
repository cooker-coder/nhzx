package com.nuaa.pay.service;

import com.nuaa.pay.sdk.dto.PayChannelDTO;
import com.nuaa.pay.domain.po.PayChannel;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 支付渠道 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IPayChannelService extends IService<PayChannel> {

    Long addPayChannel(PayChannelDTO channelDTO);

    void updatePayChannel(PayChannelDTO channelDTO);
}

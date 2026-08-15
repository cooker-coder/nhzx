package com.nuaa.message.thirdparty;

import com.nuaa.api.dto.sms.SmsInfoDTO;
import com.nuaa.message.domain.po.MessageTemplate;

/**
 * 第三方接口对接平台
 */
public interface ISmsHandler {

    /**
     * 发送短信
     */
    void send(SmsInfoDTO platformSmsInfoDTO, MessageTemplate template);


}

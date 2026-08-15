package com.nuaa.message.service;

import com.nuaa.api.dto.sms.SmsInfoDTO;
import com.nuaa.api.dto.user.UserDTO;
import com.nuaa.message.domain.po.NoticeTemplate;

import java.util.List;

public interface ISmsService {
    void sendMessageByTemplate(NoticeTemplate noticeTemplate, List<UserDTO> users);

    void sendMessage(SmsInfoDTO smsInfoDTO);

    void sendMessageAsync(SmsInfoDTO smsInfoDTO);
}

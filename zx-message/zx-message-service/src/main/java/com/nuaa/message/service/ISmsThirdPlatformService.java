package com.nuaa.message.service;

import com.nuaa.message.domain.dto.SmsThirdPlatformDTO;
import com.nuaa.message.domain.dto.SmsThirdPlatformFormDTO;
import com.nuaa.message.domain.query.SmsThirdPlatformPageQuery;
import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.message.domain.po.SmsThirdPlatform;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 第三方云通讯平台 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface ISmsThirdPlatformService extends IService<SmsThirdPlatform> {

    List<SmsThirdPlatform> queryAllPlatform();

    Long saveSmsThirdPlatform(SmsThirdPlatformFormDTO thirdPlatformDTO);

    void updateSmsThirdPlatform(SmsThirdPlatformFormDTO thirdPlatformDTO);

    PageDTO<SmsThirdPlatformDTO> querySmsThirdPlatforms(SmsThirdPlatformPageQuery query);

    SmsThirdPlatformDTO querySmsThirdPlatform(Long id);
}

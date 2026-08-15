package com.nuaa.message.service;

import com.nuaa.message.domain.dto.MessageTemplateDTO;
import com.nuaa.message.domain.dto.MessageTemplateFormDTO;
import com.nuaa.message.domain.query.MessageTemplatePageQuery;
import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.message.domain.po.MessageTemplate;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 第三方短信平台签名和模板信息 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IMessageTemplateService extends IService<MessageTemplate> {

    List<MessageTemplate> queryByNoticeTemplateId(Long id);

    Long saveMessageTemplate(MessageTemplateFormDTO messageTemplateDTO);

    void updateMessageTemplate(MessageTemplateFormDTO messageTemplateDTO);

    PageDTO<MessageTemplateDTO> queryMessageTemplates(MessageTemplatePageQuery pageQuery);

    MessageTemplateDTO queryMessageTemplate(Long id);
}

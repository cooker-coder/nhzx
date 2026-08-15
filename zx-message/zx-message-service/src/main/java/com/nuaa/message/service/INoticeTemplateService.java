package com.nuaa.message.service;

import com.nuaa.message.domain.dto.NoticeTemplateDTO;
import com.nuaa.message.domain.dto.NoticeTemplateFormDTO;
import com.nuaa.message.domain.query.NoticeTemplatePageQuery;
import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.message.domain.po.NoticeTemplate;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 通知模板 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface INoticeTemplateService extends IService<NoticeTemplate> {

    Long saveNoticeTemplate(NoticeTemplateFormDTO noticeTemplateFormDTO);

    void updateNoticeTemplate(NoticeTemplateFormDTO noticeTemplateFormDTO);

    PageDTO<NoticeTemplateDTO> queryNoticeTemplates(NoticeTemplatePageQuery pageQuery);

    NoticeTemplateDTO queryNoticeTemplate(Long id);

    NoticeTemplate queryByCode(String code);
}

package com.nuaa.message.service;

import com.nuaa.message.domain.po.NoticeTemplate;
import com.nuaa.message.domain.po.PublicNotice;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 公告消息模板 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IPublicNoticeService extends IService<PublicNotice> {

    void saveNoticeOfTemplate(NoticeTemplate noticeTemplate);
}

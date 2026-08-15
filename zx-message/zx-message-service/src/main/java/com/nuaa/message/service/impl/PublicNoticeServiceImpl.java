package com.nuaa.message.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nuaa.message.config.MessageProperties;
import com.nuaa.message.domain.po.NoticeTemplate;
import com.nuaa.message.domain.po.PublicNotice;
import com.nuaa.message.mapper.PublicNoticeMapper;
import com.nuaa.message.service.IPublicNoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * <p>
 * 公告消息模板 服务实现类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
@Service
@RequiredArgsConstructor
public class PublicNoticeServiceImpl extends ServiceImpl<PublicNoticeMapper, PublicNotice> implements IPublicNoticeService {

    private final MessageProperties messageProperties;
    @Override
    public void saveNoticeOfTemplate(NoticeTemplate noticeTemplate) {
        LocalDateTime now = LocalDateTime.now();
        PublicNotice notice = new PublicNotice();
        notice.setTitle(noticeTemplate.getTitle());
        notice.setContent(noticeTemplate.getContent());
        notice.setPushTime(now);
        notice.setType(noticeTemplate.getType());
        notice.setExpireTime(now.plusMonths(messageProperties.getNoticeTtlMonths()));
        save(notice);
    }
}

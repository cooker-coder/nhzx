package com.nuaa.message.service;

import com.nuaa.message.domain.dto.NoticeTaskDTO;
import com.nuaa.message.domain.dto.NoticeTaskFormDTO;
import com.nuaa.message.domain.query.NoticeTaskPageQuery;
import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.message.domain.po.NoticeTask;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 系统通告的任务表，可以延期或定期发送通告 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface INoticeTaskService extends IService<NoticeTask> {

    Long saveNoticeTask(NoticeTaskFormDTO noticeTaskFormDTO);

    void handleTask(NoticeTask noticeTask);

    void updateNoticeTask(NoticeTaskFormDTO noticeTaskFormDTO);

    PageDTO<NoticeTaskDTO> queryNoticeTasks(NoticeTaskPageQuery pageQuery);

    NoticeTaskDTO queryNoticeTask(Long id);

    PageDTO<NoticeTask> queryTodoNoticeTaskByPage(int pageNo, int size);
}

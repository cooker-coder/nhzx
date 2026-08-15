package com.nuaa.message.mapper;

import com.nuaa.message.domain.po.NoticeTask;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 系统通告的任务表，可以延期或定期发送通告 Mapper 接口
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface NoticeTaskMapper extends BaseMapper<NoticeTask> {

    @Select("SELECT user_id FROM notice_task_target WHERE task_id = #{task_id}")
    List<Long> queryTaskTargetByTaskId(Long taskId);
}

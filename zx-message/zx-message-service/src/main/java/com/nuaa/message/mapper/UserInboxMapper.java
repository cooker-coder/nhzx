package com.nuaa.message.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nuaa.message.domain.po.UserInbox;

/**
 * <p>
 * 用户通知记录 Mapper 接口
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface UserInboxMapper extends BaseMapper<UserInbox> {

    UserInbox queryLatestPublicNotice(Long userId);
}

package com.nuaa.message.service;

import com.nuaa.message.domain.dto.UserInboxDTO;
import com.nuaa.message.domain.dto.UserInboxFormDTO;
import com.nuaa.api.dto.user.UserDTO;
import com.nuaa.message.domain.query.UserInboxQuery;
import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.message.domain.po.NoticeTemplate;
import com.nuaa.message.domain.po.UserInbox;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户通知记录 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IUserInboxService extends IService<UserInbox> {

    void saveNoticeToInbox(NoticeTemplate noticeTemplate, List<UserDTO> users);

    PageDTO<UserInboxDTO> queryUserInBoxesPage(UserInboxQuery query);

    Long sentMessageToUser(UserInboxFormDTO userInboxFormDTO);
}

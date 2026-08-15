package com.nuaa.learning.service;

import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.learning.domain.dto.ReplyDTO;
import com.nuaa.learning.domain.po.InteractionReply;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.learning.domain.query.ReplyPageQuery;
import com.nuaa.learning.domain.vo.ReplyVO;

/**
 * <p>
 * 互动问题的回答或评论 服务类
 * </p>
 *
 * @author 开源社区
 */
public interface IInteractionReplyService extends IService<InteractionReply> {

    void saveReply(ReplyDTO replyDTO);

    PageDTO<ReplyVO> queryReplyPage(ReplyPageQuery pageQuery, boolean isStudent);

    void hiddenReply(Long id, Boolean hidden);

    ReplyVO queryReplyById(Long id);
}

package com.nuaa.user.service;

import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.user.domain.query.UserPageQuery;
import com.nuaa.user.domain.vo.TeacherPageVO;

/**
 * <p>
 * 教师详情表 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface ITeacherService{
    PageDTO<TeacherPageVO> queryTeacherPage(UserPageQuery pageQuery);

}

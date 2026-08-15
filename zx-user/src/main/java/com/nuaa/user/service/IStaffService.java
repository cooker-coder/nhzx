package com.nuaa.user.service;

import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.user.domain.query.UserPageQuery;
import com.nuaa.user.domain.vo.StaffVO;

/**
 * <p>
 * 员工详情表 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IStaffService {
    PageDTO<StaffVO> queryStaffPage(UserPageQuery pageQuery);
}

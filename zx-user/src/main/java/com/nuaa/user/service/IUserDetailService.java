package com.nuaa.user.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.user.domain.po.UserDetail;
import com.nuaa.user.domain.query.UserPageQuery;
import com.nuaa.common.enums.UserType;

import java.util.List;

/**
 * <p>
 * 教师详情表 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IUserDetailService extends IService<UserDetail> {

    UserDetail queryById(Long userId);

    List<UserDetail> queryByIds(List<Long> ids);

    Page<UserDetail> queryUserDetailByPage(UserPageQuery pageQuery, UserType type);
}

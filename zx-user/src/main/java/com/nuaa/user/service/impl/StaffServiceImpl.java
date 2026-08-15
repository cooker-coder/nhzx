package com.nuaa.user.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nuaa.api.cache.RoleCache;
import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.common.enums.UserType;
import com.nuaa.common.utils.BeanUtils;
import com.nuaa.user.domain.po.UserDetail;
import com.nuaa.user.domain.query.UserPageQuery;
import com.nuaa.user.domain.vo.StaffVO;
import com.nuaa.user.service.IStaffService;
import com.nuaa.user.service.IUserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工详情表 服务实现类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
@Service
@RequiredArgsConstructor
public class StaffServiceImpl implements IStaffService {

    private final IUserDetailService detailService;
    private final RoleCache roleCache;
    @Override
    public PageDTO<StaffVO> queryStaffPage(UserPageQuery query) {
        // 1.搜索
        Page<UserDetail> p = detailService.queryUserDetailByPage(query, UserType.STAFF);
        // 2.处理vo
        return PageDTO.of(p, u -> {
            StaffVO v = BeanUtils.toBean(u, StaffVO.class);
            v.setRoleName(roleCache.getRoleName(u.getRoleId()));
            return v;
        });
    }
}

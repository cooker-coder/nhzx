package com.nuaa.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.api.dto.user.LoginFormDTO;
import com.nuaa.api.dto.user.UserDTO;
import com.nuaa.common.domain.dto.LoginUserDTO;
import com.nuaa.user.domain.dto.UserFormDTO;
import com.nuaa.user.domain.po.User;
import com.nuaa.user.domain.vo.UserDetailVO;

/**
 * <p>
 * 学员用户表 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IUserService extends IService<User> {
    LoginUserDTO queryUserDetail(LoginFormDTO loginDTO, boolean isStaff);

    void resetPassword(Long userId);

    UserDetailVO myInfo();

    void addUserByPhone(User user, String code);

    void updatePasswordByPhone(String cellPhone, String code, String password);

    Long saveUser(UserDTO userDTO);

    void updateUser(UserDTO userDTO);

    void updateUserWithPassword(UserFormDTO userDTO);
}

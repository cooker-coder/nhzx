package com.nuaa.user.service;

import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.user.domain.dto.StudentFormDTO;
import com.nuaa.user.domain.query.UserPageQuery;
import com.nuaa.user.domain.vo.StudentPageVo;

/**
 * <p>
 * 学员详情表 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IStudentService {

    void saveStudent(StudentFormDTO studentFormDTO);

    void updateMyPassword(StudentFormDTO studentFormDTO);

    PageDTO<StudentPageVo> queryStudentPage(UserPageQuery pageQuery);
}

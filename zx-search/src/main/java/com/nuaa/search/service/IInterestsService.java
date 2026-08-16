package com.nuaa.search.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.search.domain.po.Interests;
import com.nuaa.api.dto.course.CategoryBasicDTO;

import java.util.List;

/**
 * <p>
 * 用户兴趣表，保存感兴趣的二级分类id 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IInterestsService extends IService<Interests> {

    void saveInterests(List<Long> interestedIds);

    List<CategoryBasicDTO> queryMyInterests();

    List<Long> queryMyInterestsIds();
}

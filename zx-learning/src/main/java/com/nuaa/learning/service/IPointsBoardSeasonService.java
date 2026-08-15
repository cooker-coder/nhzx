package com.nuaa.learning.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.learning.domain.po.PointsBoardSeason;

import java.time.LocalDateTime;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 开源社区
 */
public interface IPointsBoardSeasonService extends IService<PointsBoardSeason> {

    Integer querySeasonByTime(LocalDateTime time);
}

package com.nuaa.learning.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.learning.domain.po.PointsBoard;
import com.nuaa.learning.domain.query.PointsBoardQuery;
import com.nuaa.learning.domain.vo.PointsBoardVO;

import java.util.List;

/**
 * <p>
 * 学霸天梯榜 服务类
 * </p>
 *
 * @author 开源社区
 */
public interface IPointsBoardService extends IService<PointsBoard> {
    PointsBoardVO queryPointsBoardBySeason(PointsBoardQuery query);

    void createPointsBoardTableBySeason(Integer season);

    List<PointsBoard> queryCurrentBoardList(String key, Integer pageNo, Integer pageSize);
}

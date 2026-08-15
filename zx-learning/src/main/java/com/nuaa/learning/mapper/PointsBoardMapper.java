package com.nuaa.learning.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nuaa.learning.domain.po.PointsBoard;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 学霸天梯榜 Mapper 接口
 * </p>
 *
 * @author 开源社区
 */
public interface PointsBoardMapper extends BaseMapper<PointsBoard> {

    void createPointsBoardTable(@Param("tableName") String tableName);
}

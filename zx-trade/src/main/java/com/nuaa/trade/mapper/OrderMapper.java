package com.nuaa.trade.mapper;

import com.nuaa.trade.domain.po.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 订单 Mapper 接口
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface OrderMapper extends BaseMapper<Order> {

    Order getById(Long id);
}

package com.nuaa.trade.service;

import com.nuaa.trade.domain.po.Cart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.trade.domain.vo.CartVO;

import java.util.List;

/**
 * <p>
 * 购物车条目信息，也就是购物车中的课程 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface ICartService extends IService<Cart> {

    void addCourse2Cart(Long courseId);

    List<CartVO> getMyCarts();

    void deleteCartById(Long id);

    void deleteCartByIds(List<Long> ids);

    void deleteCartByUserAndCourseIds(Long userId, List<Long> courseIds);
}

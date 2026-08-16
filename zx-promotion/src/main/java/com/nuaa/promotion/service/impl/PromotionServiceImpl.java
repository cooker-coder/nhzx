package com.nuaa.promotion.service.impl;

import com.nuaa.promotion.domain.po.Promotion;
import com.nuaa.promotion.mapper.PromotionMapper;
import com.nuaa.promotion.service.IPromotionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 促销活动，形式多种多样，例如：优惠券 服务实现类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
@Service
public class PromotionServiceImpl extends ServiceImpl<PromotionMapper, Promotion> implements IPromotionService {

}

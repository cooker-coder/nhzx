package com.nuaa.promotion.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.promotion.domain.po.Coupon;
import com.nuaa.promotion.domain.po.ExchangeCode;
import com.nuaa.promotion.domain.query.CodeQuery;
import com.nuaa.promotion.domain.vo.ExchangeCodeVO;

/**
 * <p>
 * 兑换码 服务类
 * </p>
 *
 * @author 开源社区
 */
public interface IExchangeCodeService extends IService<ExchangeCode> {
    void asyncGenerateCode(Coupon coupon);

    boolean updateExchangeMark(long serialNum, boolean mark);

    PageDTO<ExchangeCodeVO> queryCodePage(CodeQuery query);

    Long exchangeTargetId(long serialNum);
}

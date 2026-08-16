package com.nuaa.promotion.controller;

import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.promotion.domain.query.CodeQuery;
import com.nuaa.promotion.domain.vo.ExchangeCodeVO;
import com.nuaa.promotion.service.IExchangeCodeService;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 兑换码 控制器
 * </p>
 *
 * @author 开源社区
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/codes")
@Tag(name = "兑换码控制器", description = "兑换码相关操作")
public class ExchangeCodeController {

    private final IExchangeCodeService codeService;

    @GetMapping("page")
    @Schema(description = "分页查询兑换码")
    public PageDTO<ExchangeCodeVO> queryCodePage(@Valid CodeQuery query){
        return codeService.queryCodePage(query);
    }
}

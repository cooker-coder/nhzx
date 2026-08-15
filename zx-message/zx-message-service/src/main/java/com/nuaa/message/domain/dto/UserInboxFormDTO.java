package com.nuaa.message.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 用户通知记录
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
@Schema(description = "用户私信表单实体")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInboxFormDTO {

    @Schema(description = "目标用户id")
    private Long userId;

    @Schema(description = "私信内容")
    private String content;
}
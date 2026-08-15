package com.nuaa.data.model.vo;

import com.nuaa.data.model.po.CourseInfo;
import lombok.Data;

import java.util.List;

/**
 * @ClassName Top10DataVO
 * @Author 开源社区
 * @Date 2026-06-30
 * @Version
 **/
@Data
public class Top10DataVO {
    // 热门课程
    private List<CourseInfo> hot;
    // 热销课程
    private List<CourseInfo> hotSales;
}

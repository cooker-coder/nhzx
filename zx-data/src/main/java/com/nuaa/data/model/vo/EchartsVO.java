package com.nuaa.data.model.vo;

import lombok.Data;

import java.util.List;

/**
 * echartVO
 * @ClassName EchartsVO
 * @Author 开源社区
 * @Date 2026-06-30
 * @Version
 **/
@Data
public class EchartsVO {
    private List<AxisVO> xAxis;
    private List<AxisVO> yAxis;
    private List<SerierVO> series;
}

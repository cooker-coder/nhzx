package com.nuaa.data.service;


import com.nuaa.data.model.dto.TodayDataDTO;
import com.nuaa.data.model.vo.TodayDataVO;

/**
 * @author 开源社区
 * @since 2026-06-30
 **/
public interface TodayDataService {

    /**
     * 获取今日数据
     * @return
     */
    TodayDataVO get();

    /**
     * 设置今日数据
     * @param todayDataDTO
     */
    void set(TodayDataDTO todayDataDTO);
}
package com.nuaa.data.service;


import com.nuaa.data.model.dto.Top10DataSetDTO;
import com.nuaa.data.model.vo.Top10DataVO;

/**
 * @author 开源社区
 * @since 2026-06-30
 **/
public interface Top10Service {

    /**
     * 获取top数据
     *
     * @return
     */
    Top10DataVO getTop10Data();

    /**
     * top 10数据设置
     * @param top10DataSetDTO
     */
    void setTop10Data(Top10DataSetDTO top10DataSetDTO);
}
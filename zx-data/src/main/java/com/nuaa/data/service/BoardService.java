package com.nuaa.data.service;


import com.nuaa.data.model.dto.BoardDataSetDTO;
import com.nuaa.data.model.vo.EchartsVO;

import java.util.List;

/**
 * @ClassName BoardService
 * @Author 开源社区
 * @Date 2026-06-30
 * @Version
 **/
public interface BoardService {

    /**
     * 看板数据获取
     *
     * @param types 数据类型
     * @return
     */
    EchartsVO boardData(List<Integer> types);

    /**
     * 设置看板数据
     *
     * @param boardDataSetDTO
     */
    void setBoardData(BoardDataSetDTO boardDataSetDTO);
}
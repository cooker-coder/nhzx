package com.nuaa.media.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.media.domain.dto.MediaDTO;
import com.nuaa.media.domain.dto.MediaUploadResultDTO;
import com.nuaa.media.domain.po.Media;
import com.nuaa.media.domain.query.MediaQuery;
import com.nuaa.media.domain.vo.MediaVO;
import com.nuaa.media.domain.vo.VideoPlayVO;

/**
 * <p>
 * 媒资表，主要是视频文件 服务类
 * </p>
 *
 * @author 开源社区
 * @since 2026-06-30
 */
public interface IMediaService extends IService<Media> {

    String getUploadSignature();

    VideoPlayVO getPlaySignatureBySectionId(Long fileId);

    MediaDTO save(MediaUploadResultDTO mediaResult);

    void updateMediaProcedureResult(Media media);

    void deleteMedia(String fileId);

    VideoPlayVO getPlaySignatureByMediaId(Long mediaId);

    PageDTO<MediaVO> queryMediaPage(MediaQuery query);
}

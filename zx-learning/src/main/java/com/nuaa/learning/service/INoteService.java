package com.nuaa.learning.service;

import com.nuaa.common.domain.dto.PageDTO;
import com.nuaa.learning.domain.dto.NoteFormDTO;
import com.nuaa.learning.domain.po.Note;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nuaa.learning.domain.query.NoteAdminPageQuery;
import com.nuaa.learning.domain.query.NotePageQuery;
import com.nuaa.learning.domain.vo.NoteAdminDetailVO;
import com.nuaa.learning.domain.vo.NoteAdminVO;
import com.nuaa.learning.domain.vo.NoteVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 开源社区
 */
public interface INoteService extends IService<Note> {

    void saveNote(NoteFormDTO noteDTO);

    void gatherNote(Long id);

    void removeGatherNote(Long id);

    void updateNote(NoteFormDTO noteDTO);

    PageDTO<NoteVO> queryNotePage(NotePageQuery query);

    PageDTO<NoteAdminVO> queryNotePageForAdmin(NoteAdminPageQuery query);

    NoteAdminDetailVO queryNoteDetailForAdmin(Long id);

    void hiddenNote(Long id, boolean hidden);

    void removeMyNote(Long id);
}

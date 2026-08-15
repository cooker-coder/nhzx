package com.nuaa.learning.service;

import com.nuaa.learning.domain.vo.SignResultVO;

public interface ISignRecordService {
    SignResultVO addSignRecords();

    Byte[] querySignRecords();

}

package com.nuaa.aigc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nuaa.aigc.entity.ChatRecord;
import com.nuaa.aigc.mapper.ChatRecordMapper;
import com.nuaa.aigc.service.ChatRecordService;
import org.springframework.stereotype.Service;

@Service
public class ChatRecordServiceImpl extends ServiceImpl<ChatRecordMapper, ChatRecord> implements ChatRecordService {
}

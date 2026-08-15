package com.nuaa.data.utils;

import com.nuaa.common.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName DataUtils
 * @Author 开源社区
 * @Date 2026-06-30
 * @Version
 **/
@Slf4j
public class DataUtils {

    public static int getVersion(int totalVersion) {
        return DateUtils.now().getDayOfMonth() % totalVersion;
    }
}

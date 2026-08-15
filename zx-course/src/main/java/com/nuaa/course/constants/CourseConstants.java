package com.nuaa.course.constants;

/**
 * @author 开源社区
 * @since 2026-06-30
 * @version 1.0.0 1.0
 **/
public class CourseConstants {

    public static final long CATEGORY_ROOT = 0;

    public class CourseStep {
        public static final int BASE_INFO = 1; //基本信息
        public static final int CATALOGUE = 2; //目录
        public static final int MEDIA = 3; //视频
        public static final int SUBJECT = 4; //题目
        public static final int TEACHER = 5; //老师
    }

    //目录类型
    public class CataType{
        public static final int CHAPTER = 1; //章
        public static final int SECTION = 2; //节
        public static final int PRATICE = 3; //练习或测试
    }

}

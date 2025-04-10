package com.ssg.springex.mappers;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
    @Select("select now()")
    String getTime();
}

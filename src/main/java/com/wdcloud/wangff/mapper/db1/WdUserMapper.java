package com.wdcloud.wangff.mapper.db1;

import com.wdcloud.wangff.model.WdUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface WdUserMapper extends Mapper<WdUser> {
    @Select("SELECT * FROM wd_user WHERE username = #{name}")
    WdUser findByName(@Param("name") String name);

    List<WdUser> abc();
}
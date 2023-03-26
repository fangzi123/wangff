package com.wdcloud.wangff.controller;

import com.alibaba.fastjson.JSON;
import com.wdcloud.wangff.mapper.db1.WdUserMapper;
import com.wdcloud.wangff.mapper.db2.NameInfo2Mapper;
import com.wdcloud.wangff.model.WdUser;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangff
 * @date 2019/12/26 15:40
 */
@RestController
@Log
public class TestController {
    @Autowired
    private WdUserMapper wdUserMapper;
    @Autowired
    private NameInfo2Mapper nameInfo2Mapper;

    @GetMapping("/wangff")
    public List get() {
        List a = wdUserMapper.selectAll();
        List b = nameInfo2Mapper.selectAll();
        WdUser c = wdUserMapper.findByName("wff1");
        System.out.printf(
                JSON.toJSONString(a));
        System.out.printf(JSON.toJSONString(b));
        System.out.printf(JSON.toJSONString(c));
        wdUserMapper.abc();
        return a;
    }
}

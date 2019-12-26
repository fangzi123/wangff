package com.wdcloud.wangff.controller;

import com.wdcloud.wangff.mapper.WdUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangff
 * @date 2019/12/26 15:40
 */
@RestController
public class TestController {
    @Autowired
    private WdUserMapper wdUserMapper;

    @GetMapping("/wangff")
    public List get(){
        return wdUserMapper.selectAll();
    }
}

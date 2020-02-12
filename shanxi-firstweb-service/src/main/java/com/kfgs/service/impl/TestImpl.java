package com.kfgs.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kfgs.firstweb.service.Test;
import org.springframework.transaction.annotation.Transactional;

@Service(timeout = 120000)
@Transactional
public class TestImpl implements Test {
    @Override
    public String test() {
        return "11111111111";
    }
}

package cn.fzz.service.impl;

import cn.fzz.service.TestRegistryService;
import org.springframework.stereotype.Service;

/**
 * Created by fanzezhen on 2018/7/4.
 * Desc:
 */
@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService {
    public String hello(String name) {
        return "hello" + name;
    }
}
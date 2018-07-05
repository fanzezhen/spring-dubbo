package cn.fzz.web;

import cn.fzz.service.TestRegistryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fanzezhen on 2018/7/4.
 * Desc:
 */
public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        context.start();

        TestRegistryService testRegistryService = (TestRegistryService) context.getBean("testRegistryService");

        String name = testRegistryService.hello("zz");
        System.out.println("xx==" + name);

    }
}

package cn.fzz.service;

import com.alibaba.dubbo.container.spring.SpringContainer;
import org.springframework.core.env.AbstractEnvironment;

/**
 * Created by fanzezhen on 2018/7/4.
 * Desc:
 */
public class Main {
    public static void main(String[] args) {
        System.setProperty(com.alibaba.dubbo.container.Main.SHUTDOWN_HOOK_KEY, "false");
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "dev");
//        System.setProperty(SpringContainer.SPRING_CONFIG, "classpath*:spring/applicationContext.xml");
        System.setProperty(SpringContainer.SPRING_CONFIG, "classpath:spring/applicationContext.xml");
        com.alibaba.dubbo.container.Main.main(args);
    }
}

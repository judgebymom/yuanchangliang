package cn.ycl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author YuanChangLiang
 * @Date 2020/8/29 17:55
 */
@SpringBootApplication
public class BackgroundApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackgroundApplication.class,args);
        System.out.println("\n\n\n ★★★★ 袁昌亮 Background模块 启动成功 ★★★★\n\n\n");
    }
}

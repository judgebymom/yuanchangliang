package cn.ycl.product;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @Author YuanChangLiang
 * @Date 2020/8/29 14:56
 */
@EnableDubbo
@SpringCloudApplication
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
        System.out.println("\n\n\n ★★★★ 袁昌亮 商品模块 启动成功 ★★★★\n\n\n");
    }
}

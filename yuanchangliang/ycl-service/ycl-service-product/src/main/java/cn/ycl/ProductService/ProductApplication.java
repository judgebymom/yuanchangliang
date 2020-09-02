package cn.ycl.ProductService;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author YuanChangLiang
 * @Date 2020/8/29 14:56
 */
@EnableDubbo
@SpringBootApplication
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
        System.out.println("\n\n\n ★★★★ 袁昌亮 商品模块 启动成功 ★★★★\n\n\n");
    }
}

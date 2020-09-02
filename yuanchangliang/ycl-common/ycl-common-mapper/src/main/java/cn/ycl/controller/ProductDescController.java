package cn.ycl.controller;

import cn.ycl.entity.ProductDesc;
import cn.ycl.service.ProductDescService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * ??Ʒ???(ProductDesc)表控制层
 *
 * @author makejava
 * @since 2020-08-29 10:10:09
 */
@RestController
@RequestMapping("productDesc")
public class ProductDescController {
    /**
     * 服务对象
     */
    @Resource
    private ProductDescService productDescService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ProductDesc selectOne(Long id) {
        return this.productDescService.queryById(id);
    }

}
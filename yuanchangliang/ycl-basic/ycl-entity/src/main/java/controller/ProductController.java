package controller;

import entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProductService;

import javax.annotation.Resource;


/**
 * ??Ʒ??Ϣ?(Product)表控制层
 *
 * @author makejava
 * @since 2020-08-29 09:12:55
 */
@RestController
@RequestMapping("product")
public class ProductController {
    /**
     * 服务对象
     */
    @Resource
    private ProductService productService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Product selectOne(Long id) {
        return this.productService.queryById(id);
    }

}
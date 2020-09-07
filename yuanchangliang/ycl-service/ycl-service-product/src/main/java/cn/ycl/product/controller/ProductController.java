package cn.ycl.product.controller;

import cn.ycl.product.entity.Product;
import cn.ycl.product.service.ProductService;
import cn.ycl.product.utils.BaseController;
import cn.ycl.product.utils.TableDataInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 产品(Product)表控制层
 *
 * @author makejava
 * @since 2020-09-03 17:11:49
 */
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
@RestController
@RequestMapping("/product")
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

    @GetMapping("/selectOne/{id}")
    public Product selectOne(@PathVariable("id") Long id) {
        return this.productService.queryById(id);
    }

    /**
     * 查询列表
     *
     * @return 多条数据
     */

    @GetMapping("/selectAll")
    public TableDataInfo selectAll() {
        System.out.println("查询数据中。。。。。。");
        BaseController baseController = new BaseController();
        baseController.startPage();
        List<Product> products = productService.queryAll(new Product());
        return baseController.getDataTable(products);
}

}
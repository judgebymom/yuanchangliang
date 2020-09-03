package product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import product.entity.ProductDesc;
import product.service.ProductDescService;

import javax.annotation.Resource;

/**
 * ??Ʒ???(ProductDesc)表控制层
 *
 * @author makejava
 * @since 2020-09-03 14:48:19
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
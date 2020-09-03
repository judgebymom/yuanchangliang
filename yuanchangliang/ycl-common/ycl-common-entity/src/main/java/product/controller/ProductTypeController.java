package product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import product.entity.ProductType;
import product.service.ProductTypeService;

import javax.annotation.Resource;

/**
 * ??Ʒ?(ProductType)表控制层
 *
 * @author makejava
 * @since 2020-09-03 14:48:49
 */
@RestController
@RequestMapping("productType")
public class ProductTypeController {
    /**
     * 服务对象
     */
    @Resource
    private ProductTypeService productTypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ProductType selectOne(Long id) {
        return this.productTypeService.queryById(id);
    }

}
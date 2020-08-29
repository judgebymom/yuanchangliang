package cn.ycl.controller;

import cn.ycl.entity.ProductType;
import cn.ycl.service.ProductTypeService;

import javax.annotation.Resource;

/**
 * ??Ʒ?(ProductType)表控制层
 *
 * @author makejava
 * @since 2020-08-29 10:10:57
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
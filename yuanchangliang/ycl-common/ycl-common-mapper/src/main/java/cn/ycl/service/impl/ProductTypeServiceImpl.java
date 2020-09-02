package cn.ycl.service.impl;

import cn.ycl.dao.ProductTypeDao;
import cn.ycl.entity.ProductType;
import cn.ycl.service.ProductTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ??Ʒ?(ProductType)表服务实现类
 *
 * @author makejava
 * @since 2020-08-29 10:10:57
 */
@Service("productTypeService")
public class ProductTypeServiceImpl implements ProductTypeService {
    @Resource
    private ProductTypeDao productTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductType queryById(Long id) {
        return this.productTypeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ProductType> queryAllByLimit(int offset, int limit) {
        return this.productTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param productType 实例对象
     * @return 实例对象
     */
    @Override
    public ProductType insert(ProductType productType) {
        this.productTypeDao.insert(productType);
        return productType;
    }

    /**
     * 修改数据
     *
     * @param productType 实例对象
     * @return 实例对象
     */
    @Override
    public ProductType update(ProductType productType) {
        this.productTypeDao.update(productType);
        return this.queryById(productType.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.productTypeDao.deleteById(id) > 0;
    }
}
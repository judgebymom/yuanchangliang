package cn.ycl.service.impl;

import cn.ycl.dao.ProductDescDao;
import cn.ycl.entity.ProductDesc;
import cn.ycl.service.ProductDescService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ??Ʒ???(ProductDesc)表服务实现类
 *
 * @author makejava
 * @since 2020-08-29 10:10:05
 */
@Service("productDescService")
public class ProductDescServiceImpl implements ProductDescService {
    @Resource
    private ProductDescDao productDescDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductDesc queryById(Long id) {
        return this.productDescDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ProductDesc> queryAllByLimit(int offset, int limit) {
        return this.productDescDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param productDesc 实例对象
     * @return 实例对象
     */
    @Override
    public ProductDesc insert(ProductDesc productDesc) {
        this.productDescDao.insert(productDesc);
        return productDesc;
    }

    /**
     * 修改数据
     *
     * @param productDesc 实例对象
     * @return 实例对象
     */
    @Override
    public ProductDesc update(ProductDesc productDesc) {
        this.productDescDao.update(productDesc);
        return this.queryById(productDesc.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.productDescDao.deleteById(id) > 0;
    }
}
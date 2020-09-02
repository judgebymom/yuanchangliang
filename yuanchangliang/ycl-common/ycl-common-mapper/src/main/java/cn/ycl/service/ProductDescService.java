package cn.ycl.service;

import cn.ycl.entity.ProductDesc;

import java.util.List;

/**
 * 产品描述表(ProductDesc)表服务接口
 *
 * @author makejava
 * @since 2020-08-29 10:10:03
 */
public interface ProductDescService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductDesc queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProductDesc> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param productDesc 实例对象
     * @return 实例对象
     */
    ProductDesc insert(ProductDesc productDesc);

    /**
     * 修改数据
     *
     * @param productDesc 实例对象
     * @return 实例对象
     */
    ProductDesc update(ProductDesc productDesc);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
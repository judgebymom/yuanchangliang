package product.dao;

import org.apache.ibatis.annotations.Param;
import product.entity.ProductDesc;

import java.util.List;

/**
 * ??Ʒ???(ProductDesc)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-03 14:48:18
 */
public interface ProductDescDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductDesc queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProductDesc> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param productDesc 实例对象
     * @return 对象列表
     */
    List<ProductDesc> queryAll(ProductDesc productDesc);

    /**
     * 新增数据
     *
     * @param productDesc 实例对象
     * @return 影响行数
     */
    int insert(ProductDesc productDesc);

    /**
     * 修改数据
     *
     * @param productDesc 实例对象
     * @return 影响行数
     */
    int update(ProductDesc productDesc);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}
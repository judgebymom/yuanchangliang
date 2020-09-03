package product.dao;

import org.apache.ibatis.annotations.Param;
import product.entity.ProductType;

import java.util.List;

/**
 * ??Ʒ?(ProductType)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-03 14:48:49
 */
public interface ProductTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductType queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProductType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param productType 实例对象
     * @return 对象列表
     */
    List<ProductType> queryAll(ProductType productType);

    /**
     * 新增数据
     *
     * @param productType 实例对象
     * @return 影响行数
     */
    int insert(ProductType productType);

    /**
     * 修改数据
     *
     * @param productType 实例对象
     * @return 影响行数
     */
    int update(ProductType productType);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}
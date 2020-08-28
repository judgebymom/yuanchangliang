package cn.ycl.base;

/**
 * @Author YuanChangLiang
 * @Date 2020/8/27 15:58
 */
public interface IBaseService<T> {


    int deleteByPrimaryKey(Long id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);



}

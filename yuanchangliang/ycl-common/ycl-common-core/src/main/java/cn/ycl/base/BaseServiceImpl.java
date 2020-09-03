package cn.ycl.base;

/**
 * @Author YuanChangLiang
 * @Date 2020/8/27 15:59
 */
public class BaseServiceImpl<T> implements IBaseService<T> {

    public IBaseDao<T> getBaseDao() {
        return null;
    }


    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(T t) {
        return 0;
    }

    @Override
    public int insertSelective(T t) {
        return 0;
    }

    @Override
    public T selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return 0;
    }
}

package priv.luojian.blog.dao;

/**
 * Created by Administrator on 2017/3/15.
 */
public interface BaseDao<E> {
    /**
     * 保存单个对象E
     */
    public void save(E entity);
    /**
     * 获取单个对象E
     */
    public E get(int id);
    /**
     * 更新单个对象E
     */
    public void update(E entity);
    /**
     * 删除单个对象E
     */
    public void remove(E entity);
}

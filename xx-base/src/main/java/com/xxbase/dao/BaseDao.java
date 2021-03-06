package com.xxbase.dao;


import com.xxbase.common.Page;
import com.xxbase.common.Pageable;
import com.xxbase.exception.ServiceException;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * <pre>
 *     持久层基本接口,对于每一个Entity基本上都有此接口方法.
 * </pre>
 * Created by lifang on 2015/1/21.
 */
public abstract interface BaseDao<T, ID extends Serializable> {

    public abstract T findById(ID id);

    public abstract T findByName(String name) throws ServiceException;

    public abstract List<T> findAll();

    public abstract Page<T> findPage(Pageable pageable);

    public abstract void persist(T t);

    public abstract void persistAll(Collection<T> coll);

    public abstract T merge(T t);

    public abstract void remove(T t);

    public abstract void clear();

    public abstract List<T> findAllByName(String name);

}

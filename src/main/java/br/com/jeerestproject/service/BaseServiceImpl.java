package br.com.jeerestproject.service;

import br.com.jeerestproject.dao.Dao;
import br.com.jeerestproject.domain.AbstractEntity;

import java.util.List;

/**
 * Created by laerteguedes on 14/12/16.
 */
public abstract class BaseServiceImpl<T extends AbstractEntity> implements BaseService<T> {

    public abstract Dao<T> getDao();

    @Override
    public void add(T t) {
        getDao().add(t);
    }

    @Override
    public void update(T t) {
        getDao().update(t);
    }

    @Override
    public void remove(T t) {
        getDao().remove(t);
    }

    @Override
    public T findById(Long id) {
        return getDao().findById(id);
    }

    @Override
    public List<T> findAll() {
        return getDao().findAll();
    }

    @Override
    public List<T> findAllPaginate(int firstResult, int maxResults) {
        return getDao().findAllPaginate(firstResult, maxResults);
    }
}

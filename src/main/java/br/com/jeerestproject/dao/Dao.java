package br.com.jeerestproject.dao;

import br.com.jeerestproject.domain.AbstractEntity;

import java.util.List;

/**
 * Created by laerteguedes on 24/10/16.
 */
public interface Dao<T extends AbstractEntity>{

    void add(T t);

    void update(T t);

    void remove(T t);

    T findById(Long id);

    List<T> findAll();

    List<T> findAllPaginate(int firstResult, int MaxResults);

}

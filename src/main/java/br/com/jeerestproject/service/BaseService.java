package br.com.jeerestproject.service;

import br.com.jeerestproject.domain.AbstractEntity;

import java.util.List;

/**
 * Created by laerteguedes on 14/12/16.
 */
public interface BaseService<T extends AbstractEntity> {

    void add(T t);

    void update(T t);

    void remove(T t);

    T findById(Long id);

    List<T> findAll();

    List<T> findAllPaginate(int firstResult, int MaxResults);

}

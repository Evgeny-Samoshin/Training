package com.company.Dao;

import com.company.Entities.Product;

import java.util.List;

public interface Queries<T> {

    void add (T p);
    void update (T p);
    void delete (T p);
    T getByID (T p);
    List<T> getAll();

}

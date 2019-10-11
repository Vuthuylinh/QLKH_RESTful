package linhVu.service;

import java.util.List;

public interface GeneralService <E>{
    List<E> findAll();

    E findById(Long id);

    void save(E e);

    void remove(Long id);
}

package edu.ccrm.service.interfaces;

import java.util.List;

public interface Searchable<T, R> {
    List<T> search(R criteria);
}
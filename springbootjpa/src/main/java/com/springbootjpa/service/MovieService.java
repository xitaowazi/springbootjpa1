package com.springbootjpa.service;

import com.springbootjpa.domain.Movie;

import java.util.List;
import java.util.Optional;

/**
 * 业务逻辑接口
 */
public interface MovieService {
    void save(Movie movie);

    void deleteById(Integer id);

    List<Movie> findAll();

    Optional<Movie> fingById(Integer id);
}

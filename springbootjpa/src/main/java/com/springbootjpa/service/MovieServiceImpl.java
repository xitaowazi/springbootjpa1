package com.springbootjpa.service;

import com.springbootjpa.domain.Movie;
import com.springbootjpa.domain.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 *业务逻辑接口的实现类
 */
@Service
@Transactional
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;


    //根据名字查询
    @Override
    public List<Movie> findByMovieName(String name) {
        return movieRepository.findByMovieName(name);
    }

    //模糊查询包含 name 的数据
    @Override
    public List<Movie> findByNameLike(String name) {
        return movieRepository.findByNameLike(name);
    }

    //模糊查询不包含 name 的数据
    @Override
    public List<Movie> findByNameNotLike(String name) {
        return movieRepository.findByNameNotLike(name);
    }

    //条件查询不包含 name 并等于 price 的数据
    @Override
    public List<Movie> findByNameNotLikeAndPrice(String name, Double price) {
        return movieRepository.findByNameNotLikeAndPrice(name,price);
    }

    @Override
    public List<Movie> findByActionTimeBetween(Date beginDate, Date endDate) {
        return movieRepository.findByActionTimeBetween(beginDate, endDate);
    }

    @Override
    public void save(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void deleteById(Integer id) {
        movieRepository.deleteById(id);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> fingById(Integer id) {
        return movieRepository.findById(id);
    }
}

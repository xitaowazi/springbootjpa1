package com.springbootjpa.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * 持久层：由 JPA 管理
 */
public interface MovieRepository extends JpaRepository<Movie,Integer>{
    // 包含一般增删改查

    //hql:hiberante query language:hiberante 查询语言 - 类名 + 属性名
    @Query(value = "select m from Movie m where m.name=:name")
    List<Movie> findByMovieName(@Param("name")String name);

    //模糊查询包含 name 的数据
    List<Movie> findByNameLike(String name);

    //模糊查询不包含 name 的数据
    List<Movie> findByNameNotLike(String name);

    //条件查询不包含 name 并等于 price 的数据
    List<Movie> findByNameNotLikeAndPrice(String name,Double price);


    List<Movie> findByActionTimeBetween(Date beginDate,Date endDate);
}

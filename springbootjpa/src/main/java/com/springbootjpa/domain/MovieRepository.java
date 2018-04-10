package com.springbootjpa.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 持久层：由 JPA 管理
 */
public interface MovieRepository extends JpaRepository<Movie,Integer>{
    // 包含一般增删改查
}

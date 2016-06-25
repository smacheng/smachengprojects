/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smacheng.domain.Tag;

/**
 * 标签tag
 *
 * @author Administrator
 */
@Repository
public interface TagDao extends JpaRepository<Tag, String> {

    @Query("FROM Tag t WHERE t.name = :name")
    public Tag getByName(@Param("name") String name);

    @Query("FROM Tag t WHERE t.name LIKE %:name% ")
    public List<Tag> findTagStringByName(@Param("name") String name);

}

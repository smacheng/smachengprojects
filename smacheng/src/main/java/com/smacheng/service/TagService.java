/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service;

import com.smacheng.domain.Tag;
import com.smacheng.model.TagModel;
import java.util.List;
import java.util.Set;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Administrator
 */
public interface TagService {

    public Tag create(Tag tag);

    public Tag getByName(String name);

    public List<String> findTagStringByName(String name);

    public List<TagModel> findTagsByName(String name);

    public Set<Tag> getTagsFromString(String tagString);

    public Page<TagModel> find(Pageable pageable);
}

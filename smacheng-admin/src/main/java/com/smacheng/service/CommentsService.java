/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.smacheng.commons.enums.CommentsType;
import com.smacheng.domain.Comments;

/**
 * @author Administrator
 * @date 2016-1-6 13:16:12
 * @version V1.0
 */
public interface CommentsService {

    public List<Comments> findByUserId(String userId);

    public List<Comments> findByTypeAndEntityId(CommentsType type, String entityId);
    
    public Page<Comments> findByTypeAndEntityId(CommentsType type, String entityId,Pageable pageable);
    
    public void save(Comments comments);

}

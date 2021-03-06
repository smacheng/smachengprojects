/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service;

import com.smacheng.domain.Member;
import com.smacheng.domain.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Administrator
 */
public interface MessageService {

    public void create(Message message);
    
     public Page<Message> findByReceiver(Member receiver, Pageable pageable);
}

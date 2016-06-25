/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service.bean;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.smacheng.dao.MessageDao;
import com.smacheng.domain.Member;
import com.smacheng.domain.Message;
import com.smacheng.service.MessageService;

/**
 * 站内消息
 *
 * @author Administrator
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageDao messageDao;

    @Override
    public void create(Message message) {
        messageDao.save(message);
    }

    @Override
    public Page<Message> findByReceiver(Member receiver, Pageable pageable) {
        return messageDao.findByReceiver(receiver, pageable);
    }
}

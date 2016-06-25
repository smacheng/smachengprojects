/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service;

import com.smacheng.commons.enums.EmailType;

/**
 *
 * @author Administrator
 */
public interface EmailService {
    
    void send(EmailType emailType,String toMail, String subject, String... contents);
}

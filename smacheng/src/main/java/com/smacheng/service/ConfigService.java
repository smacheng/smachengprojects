/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service;

import com.smacheng.commons.config.EmailConfig;
import com.smacheng.commons.config.OpenAuth2Config;
import com.smacheng.commons.config.SystemConfig;

/**
 *
 * @author Administrator
 */
public interface ConfigService {

    public String get();

    public SystemConfig getSystemConfig();

    public EmailConfig getEmailConfig();

    public OpenAuth2Config getOpenAuth2Config();
}

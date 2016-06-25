package com.smacheng.service.bean;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smacheng.dao.MemberAttributeDao;
import com.smacheng.domain.MemberAttribute;
import com.smacheng.service.MemberAttributeService;

/**
 * Service - 会员注册项
 *
 *
 *
 */
@Service("memberAttributeServiceImpl")
public class MemberAttributeServiceImpl implements MemberAttributeService {

    @Resource
    private MemberAttributeDao memberAttributeDao;

    @Transactional(readOnly = true)
    public List<MemberAttribute> findList() {
        return memberAttributeDao.findList();
    }

    @Transactional(readOnly = true)
    @Cacheable("memberAttribute")
    public List<MemberAttribute> findList(String cacheRegion) {
        return memberAttributeDao.findList();
    }
}

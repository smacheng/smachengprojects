/*
 * 
 * 
 * 
 */
package com.smacheng.service.bean;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smacheng.dao.AreaDao;
import com.smacheng.domain.Area;
import com.smacheng.service.AreaService;

/**
 * Service - 地区
 *
 *
 *
 */
@Service("areaServiceImpl")
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaDao areaDao;

    @Transactional(readOnly = true)
    public List<Area> findRoots() {
        return areaDao.findRoots();
    }
}

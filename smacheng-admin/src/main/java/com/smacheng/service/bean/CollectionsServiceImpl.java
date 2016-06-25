/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service.bean;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smacheng.dao.CollectionsDao;
import com.smacheng.domain.Collections;
import com.smacheng.domain.Photos;
import com.smacheng.service.CollectionsService;

/**
 * 收藏夹业务实现
 *
 * @author Administrator
 */
@Service("collectionsServiceImpl")
public class CollectionsServiceImpl implements CollectionsService {

    @Resource
    private CollectionsDao collectionsDao;

    @Override
    public List<Collections> findByMember(String memberId) {
        return collectionsDao.findByMember(memberId);
    }

    @Override
    public Collections findDefaultByMember(String memberId) {
        return collectionsDao.findByMemberAndDefault(memberId);
    }

    @Transactional
    @Override
    public void create(Collections collections) {
        collectionsDao.save(collections);
    }

    @Transactional
    @Override
    public void addFavorite(String photoId, String collectionsId) {
        Collections collections = collectionsDao.findOne(collectionsId);
        Photos photos = new Photos();
        photos.setId(photoId);
        collections.getPhotos().add(photos);
    }

}

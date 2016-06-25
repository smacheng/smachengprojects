/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service.bean;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smacheng.dao.PhotosAlbumDao;
import com.smacheng.domain.PhotosAlbum;
import com.smacheng.service.PhotosAlbumService;

/**
 *
 * @author youyou
 */
@Service("photosAlbumService")
public class PhotosAlbumServiceImpl implements PhotosAlbumService {

    Logger logger = LoggerFactory.getLogger(PhotosServiceImpl.class);

    @Resource
    private PhotosAlbumDao photosAlbumDao;

    @Override
    @Transactional
    public List<PhotosAlbum> findRoots() {
        List<PhotosAlbum> photosAlbums = photosAlbumDao.findRoots();
        return photosAlbums;
    }

    public List<PhotosAlbum> findRootsByMember(String memberId) {
        List<PhotosAlbum> photosAlbums = photosAlbumDao.findRootsByMember(memberId);
        return photosAlbums;
    }

    @Override
    public List<PhotosAlbum> getByParent(long ParentId) {
        return photosAlbumDao.findByParent(ParentId);
    }

    @Override
    @Transactional
    public void create(PhotosAlbum album) {
        photosAlbumDao.save(album);
    }

    @Override
    public PhotosAlbum findById(String id) {
        return photosAlbumDao.findOne(id);
    }

}

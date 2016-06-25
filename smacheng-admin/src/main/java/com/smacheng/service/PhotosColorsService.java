/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service;

import java.io.File;
import java.util.List;

import com.smacheng.domain.Photos;
import com.smacheng.domain.PhotosColors;

/**
 * 图片颜色截取
 *
 * @author Administrator
 */
public interface PhotosColorsService {

    /**
     * 生成图片颜色
     *
     * @param photos
     * @param source
     */
    public void generateColors(Photos photos, File source);

    /**
     * 获取图片主要颜色
     *
     * @param photosId
     * @return
     */
    public List<PhotosColors> findByPhotosId(String photosId);

    /**
     * 根据图片id删除颜色值
     *
     * @param photosId
     * @return
     */
    public int deleteByPhotosId(String photosId);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.model.dto;

import com.smacheng.domain.Photos;
import com.smacheng.model.PhotosModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Photosistrator
 */
public class PhotosDTO {
    
    public static PhotosModel getPhotosModelDTO(Photos photos) {
        PhotosModel result = null;
        if (photos != null) {
            result = new PhotosModel();
            
            result.setId(photos.getId());
            result.setThumbnail(photos.getThumbnail());
            result.setLarge(photos.getLarge());
            result.setSource(photos.getSource());
            result.setMedium(photos.getMedium());
            
            result.setTitle(photos.getTitle());
            
            result.setWidth(photos.getWidth());
            result.setHeight(photos.getHeight());
            result.setSize(photos.getSize());
//              model.setAlbum(album);
            result.setMember(MemberDTO.getMemberModelDTO(photos.getMember()));
            //tags

            result.setTags(TagDTO.getTagModelsDTO(photos.getTags()));
            
            result.setStatus(photos.getStatus());
            result.setOrder(photos.getOrder());
            result.setDescription(photos.getDescription());
            result.setStorageHost(photos.getStorageHost());
            result.setWallhaven(photos.getWallhaven());
            result.setCreateDate(photos.getCreateDate());
            result.setModifyDate(photos.getModifyDate());
        }
        return result;
    }

    /**
     * Photos转换成PhotosModel根据list转换
     *
     * @param photos
     * @return
     */
    public static List<PhotosModel> getPhotosModeslDTO(List<Photos> photos) {
        List<PhotosModel> result = new ArrayList<PhotosModel>(photos.size());
        if (photos.size() > 0) {
            result = new ArrayList(photos.size());
            for (Photos photo : photos) {
                //DTO转换
                PhotosModel model = new PhotosModel();

                //photos.setMember(m);
                model.setId(photo.getId());
                model.setThumbnail(photo.getThumbnail());
                
                model.setTitle(photo.getTitle());
                model.setWidth(photo.getWidth());
                model.setHeight(photo.getHeight());

//              model.setAlbum(album);
                model.setStatus(photo.getStatus());
                model.setOrder(photo.getOrder());
                model.setDescription(photo.getDescription());
                
                model.setStorageHost(photo.getStorageHost());
                model.setWallhaven(photo.getWallhaven());
                model.setCreateDate(photo.getCreateDate());
                model.setModifyDate(photo.getModifyDate());
                
                result.add(model);
            }
        }
        return result;
    }
}

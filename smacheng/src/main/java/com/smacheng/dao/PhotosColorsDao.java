package com.smacheng.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smacheng.domain.PhotosColors;

/**
 * 壁纸主要颜色
 *
 * @author Administrator
 *
 */
@Repository
public interface PhotosColorsDao extends JpaRepository<PhotosColors, String> {

    @Query("select photosColors from PhotosColors photosColors where photosColors.photos.id=:photosId")
    public List<PhotosColors> findByPhotosId(@Param("photosId") String photosId);

    @Modifying
    @Query(value = "delete from PhotosColors photosColors where photosColors.photos.id=:photosId")
    public int deleteByPhotosId(@Param("photosId") String photosId);
}

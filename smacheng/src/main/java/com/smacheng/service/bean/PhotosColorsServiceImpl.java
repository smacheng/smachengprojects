/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service.bean;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smacheng.dao.PhotosColorsDao;
import com.smacheng.domain.Photos;
import com.smacheng.domain.PhotosColors;
import com.smacheng.service.PhotosColorsService;

/**
 * @ 图片颜色截取
 *
 * @author Administrator
 */
@Service("photosColorsServiceImpl")
public class PhotosColorsServiceImpl implements PhotosColorsService {

	@Override
	public void generateColors(Photos photos, File source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PhotosColors> findByPhotosId(String photosId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPhotosId(String photosId) {
		// TODO Auto-generated method stub
		return 0;
	}
//
//    Logger logger = LoggerFactory.getLogger(PhotosColorsServiceImpl.class);
//
//    @Resource
//    private PhotosColorsDao photosColorsDao;
//
//    @Override
//    @Transactional
//    public void generateColors(Photos photos, File source) {
//        try {
//            //File file = new File("D:\\workspace\\GitHub\\croma\\images\\lockbur-com.jpg");
//            Image img = new AWTImage(source);
//            ColorPicker km = new KMeansColorPicker();
//            // ColorPicker km = new DBScanColorPicker();
//            //截取算法不一样
//            // ColorPicker km = new MedianCutColorPicker();
//            //6 取出6种颜色
//            List<Color> list = km.getUsefulColors(img, 6);
//            //file.delete();
//            for (Color c : list) {
//                PhotosColors colors = new PhotosColors();
//                colors.setBlue(c.getBlue());
//                colors.setGreen(c.getGreen());
//                colors.setRed(c.getRed());
//                colors.setColor(c.toHexString());
//
//                colors.setPhotos(photos);
//                photosColorsDao.save(colors);
//            }
//        } catch (IOException ex) {
//            logger.error("cut images color error inf :{}", ex);
//        }
//    }
//
//    /**
//     * 获取图片主要颜色
//     *
//     * @param photosId
//     * @return
//     */
//    @Override
//    public List<PhotosColors> findByPhotosId(String photosId) {
//        return photosColorsDao.findByPhotosId(photosId);
//    }
//
//    @Override
//    @Transactional
//    public int deleteByPhotosId(String photosId) {
//
//        return photosColorsDao.deleteByPhotosId(photosId);
//    }
//
//    /**
//     * @param urlPath
//     * @param fileName 默认存放到/tmp/
//     * @return
//     */
//    public File getImages(String urlPath, String fileName) {
//        logger.info("urlPath: " + urlPath);
//        Connection conn = Jsoup
//                .connect(urlPath)
//                .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.95 Safari/537.36");
//        try {
//            Connection.Response response = conn.ignoreContentType(true).execute();
//            if (response.statusCode() == 200) {
//                byte[] data = response.bodyAsBytes();
//                FileOutputStream outputStream = new FileOutputStream(fileName);
//                outputStream.write(data);
//                outputStream.close();
//                File sourceFile = new File(fileName);
//                return sourceFile;
//            } else {
//                logger.error("download {} 404 ", urlPath);
//            }
//        } catch (Exception e) {
//            logger.error("download error message: {}", e.getMessage());
//        }
//        return null;
//    }
}

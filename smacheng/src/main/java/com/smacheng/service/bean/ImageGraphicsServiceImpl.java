/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service.bean;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.smacheng.domain.Photos;
import com.smacheng.service.ImageGraphicsService;
import com.smacheng.service.PhotosService;
import com.smacheng.service.StorageService;

/**
 *
 * @author Administrator
 */
@Service("imageGraphicsServiceImpl")
public class ImageGraphicsServiceImpl implements ImageGraphicsService {

	@Override
	public void build(Photos photos, MultipartFile file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public File thumbnail(File sourceImage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildAvatar(String memberID, MultipartFile Imagefile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public byte[] scale(byte[] input, int height, int width) {
		// TODO Auto-generated method stub
		return null;
	}

//    Logger logger = LoggerFactory.getLogger(ImageGraphicsServiceImpl.class);
//
//    @Resource
//    private PhotosService photosService;
//
//    @Resource
//    private StorageService storageService;
//
//    @Resource
//    private ApplicationBean appBean;
//    //IM4JAVA是同时支持ImageMagick和GraphicsMagick的，如果为true则使用GM，如果为false支持IM。 
//    private static ConvertCmd cmd = new ConvertCmd(true);
//
//    @Override
//    @Deprecated
//    public void build(Photos photos, MultipartFile multipartFile) {
//        if (multipartFile != null && !multipartFile.isEmpty()) {
//            try {
//                File tempFile = new File(System.getProperty("java.io.tmpdir") + "/upload_" + multipartFile.getOriginalFilename());
//                if (!tempFile.getParentFile().exists()) {
//                    tempFile.getParentFile().mkdirs();
//                }
//                multipartFile.transferTo(tempFile);
//                //addTask(sourcePath, largePath, mediumPath, thumbnailPath, tempFile, multipartFile.getContentType());
//                String path = storageService.upload(tempFile);
//
//                //以前旧代码 引用wallhaven的地址
//                //Random r1 = new Random();
//                //int num = r1.nextInt(19) + 1;
//                //String thumbnail = "http://themes.mediacreed.com/html/synergy/assets/media/galleries/image_gallery/thumbs/thumb" + num + ".jpg";
//                //String medium = "http://themes.mediacreed.com/html/synergy/assets/media/galleries/image_gallery/images/image" + num + ".jpg";
//                /**
//                 * 使用EasyImage裁剪图片生成缩略图
//                 */
//                EasyImage image = new EasyImage(tempFile);
//                float width = image.getWidth();
//                //根据百分比裁剪
//                int resize = (int) ((200 / width) * 100);
//                image.resize(resize);
//                //先保存到临时目录
//                image.saveAs("/tmp/" + tempFile.getName());
//                File tempThumbnail = new File("/tmp/" + tempFile.getName());
//                String thumbnail = storageService.upload(tempThumbnail);
//                //上传完毕后删除
//                tempThumbnail.delete();
//
//            } catch (IOException | IllegalStateException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    /**
//     * 生成缩略图
//     *
//     * @param sourceImage
//     * @return
//     */
//    @Override
//    public File thumbnail(File sourceImage) {
//        String thumbnail = "/tmp/thumbnail_" + sourceImage.getName();
//        try {
//            IMOperation op = new IMOperation();
//            op.addImage(sourceImage.getAbsolutePath());
//            //op.resize(300, 200);
//            //先缩放，后居中切割图片 
//            op.resize(300, 200, '^').gravity("center").extent(300, 200);  
//            op.quality(85d);
//            op.addImage(thumbnail);
//
//            String osName = System.getProperty("os.name").toLowerCase();
//            if (osName.contains("win")) {
//                //C:\Program Files\GraphicsMagick-1.3.23-Q16
//                //linux下不要设置此值，不然会报错  
//                cmd.setSearchPath("C:\\Program Files\\GraphicsMagick-1.3.23-Q8");
//            }
//            cmd.setErrorConsumer(StandardStream.STDERR);
//            cmd.run(op);
//        } catch (IOException | InterruptedException | IM4JavaException ex) {
//            ex.printStackTrace();
//        }
//        return new File(thumbnail);
//    }
//
//    /**
//     * *
//     * 头像不同尺寸裁剪
//     *
//     * @param memberID
//     * @param multipartFile
//     */
//    @Override
//    public void buildAvatar(String memberID, MultipartFile multipartFile) {
//        try {
//            //image/png  image/gif
//            String type = multipartFile.getContentType().split("/")[1];
//            //会员的ID.png 会员的ID-200.png 尺寸为200
//            File destFile = new File("/var/avatars/" + memberID + "." + type);
//            multipartFile.transferTo(destFile);
//
//            EasyImage image = new EasyImage(destFile);
//            float width = image.getWidth();
//            //根据百分比裁剪 宽200
//            int resize = (int) ((200 / width) * 100);
//            image.resize(resize);
//            //保存到/var/avatars/
//            image.saveAs("/var/avatars/" + memberID + "-200" + "." + type);
//
//        } catch (IOException | IllegalStateException ex) {
//            logger.error("update user ({}) avatar failure,Image File name is ({}) ", memberID, multipartFile.getOriginalFilename());
//            logger.error("{}", ex);
//        }
//    }
//
//    @Override
//    public byte[] scale(byte[] input, int height, int width) {
//        File inputFile = null;
//        File outputFile = null;
//        try {
//            inputFile = File.createTempFile("input", ".tmp");
//            outputFile = File.createTempFile("output", ".tmp");
//
//            FileUtils.writeByteArrayToFile(inputFile, input);
//
//            IMOperation op = new IMOperation();
//            op.addImage(inputFile.getAbsolutePath());
//            //op.size(width, height); 不要使用改方法 图片不清晰
//            op.resize(width, height);
//            op.quality(95d);
//            op.addImage(outputFile.getAbsolutePath());
//            logger.debug("Command will be {}", op);
//            cmd.run(op);
//            return FileUtils.readFileToByteArray(outputFile);
//        } catch (IOException | InterruptedException | IM4JavaException ex) {
//            ex.printStackTrace();
//        } finally {
//            inputFile.delete();
//            outputFile.delete();
//        }
//        return null;
//    }
}

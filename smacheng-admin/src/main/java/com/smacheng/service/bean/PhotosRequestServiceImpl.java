package com.smacheng.service.bean;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.smacheng.commons.enums.PhotosRequestStatus;
import com.smacheng.domain.PhotosRequest;
import com.smacheng.model.PhotosRequestModel;
import com.smacheng.service.PhotosRequestService;

/**
 * 图片上传申请
 *
 * @author Administrator
 */
@Service
public class PhotosRequestServiceImpl implements PhotosRequestService {

	@Override
	public PhotosRequestModel get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<PhotosRequestModel> find(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PhotosRequestModel create(PhotosRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int makrStatus(String id, PhotosRequestStatus status) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Page<PhotosRequestModel> findByStatus(PhotosRequestStatus status, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<PhotosRequestModel> findByStatusList(List<PhotosRequestStatus> statusList, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
//
//    private final static Logger logger = LoggerFactory.getLogger(PhotosRequestServiceImpl.class);
//
//    @Resource
//    private PhotosRequestDao photosRequestDao;
//
//    @Override
//    public PhotosRequestModel get(String id) {
//        PhotosRequest request = photosRequestDao.findOne(id);
//        return PhotosRequestDTO.getPhotosRequestModelDTO(request);
//    }
//
//    @Override
//    public Page<PhotosRequestModel> find(Pageable pageable) {
//        Page<PhotosRequest> page = photosRequestDao.findAll(pageable);
//
//        List<PhotosRequest> content = page.getContent();
//
//        List<PhotosRequestModel> models = PhotosRequestDTO.getPhotosRequestModeslDTO(content);
//        Page<PhotosRequestModel> result = new PageImpl<PhotosRequestModel>(models, pageable, page.getTotalElements());
//        return result;
//    }
//
//    @Override
//    @Transactional
//    public PhotosRequestModel create(PhotosRequest request) {
//        PhotosRequest entity = photosRequestDao.save(request);
//        return PhotosRequestDTO.getPhotosRequestModelDTO(entity);
//    }
//
//    @Override
//    @Transactional
//    public int makrStatus(String id, PhotosRequestStatus status) {
//        return photosRequestDao.makrStatus(id, status);
//    }
//
//    @Override
//    public Page<PhotosRequestModel> findByStatus(PhotosRequestStatus status, Pageable pageable) {
//        Page<PhotosRequest> page = photosRequestDao.findByStatus(status, pageable);
//
//        List<PhotosRequest> content = page.getContent();
//
//        List<PhotosRequestModel> models = PhotosRequestDTO.getPhotosRequestModeslDTO(content);
//        Page<PhotosRequestModel> result = new PageImpl<PhotosRequestModel>(models, pageable, page.getTotalElements());
//        return result;
//    }
//
//    @Override
//    public Page<PhotosRequestModel> findByStatusList(List<PhotosRequestStatus> statusList, Pageable pageable) {
//        Page<PhotosRequest> page = photosRequestDao.findByStatusIn(statusList, pageable);
//
//        List<PhotosRequest> content = page.getContent();
//
//        List<PhotosRequestModel> models = PhotosRequestDTO.getPhotosRequestModeslDTO(content);
//        Page<PhotosRequestModel> result = new PageImpl<PhotosRequestModel>(models, pageable, page.getTotalElements());
//
//        return result;
//    }

}

package com.sinaukoding.ecommerce.service.app;

import com.sinaukoding.ecommerce.model.enums.TipeUpload;
import com.sinaukoding.ecommerce.model.response.BaseResponse;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    BaseResponse<?> upload(MultipartFile files, TipeUpload tipeUpload);

    Resource loadFileAsResource(String pathFile);

}
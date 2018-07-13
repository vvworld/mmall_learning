package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by VV on 2018/7/9
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}

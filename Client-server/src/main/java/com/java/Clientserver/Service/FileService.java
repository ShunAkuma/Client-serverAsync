package com.java.Clientserver.Service;

import com.java.Clientserver.Model.Object;
import com.java.Clientserver.Repository.ObjectRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {
    private ObjectRepository objectRepository;

    public FileService(ObjectRepository objectRepository) {
        this.objectRepository = objectRepository;
    }

    @Async
    public Object saveToDataBase(Object object){

        return objectRepository.save(object);
    }

    public Object dessializer(MultipartFile file){
        return new Object();
    }
}
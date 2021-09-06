package com.java.Clientserver.Service;

import com.java.Clientserver.Model.perobject;
import com.java.Clientserver.Repository.ObjectRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class FileService {
    private ObjectRepository objectRepository;

    public FileService(ObjectRepository objectRepository) {
        this.objectRepository = objectRepository;
    }

    @Async
    public perobject saveToDataBase(perobject object){

        return objectRepository.save(object);
    }

}
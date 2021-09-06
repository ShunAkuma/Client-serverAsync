package com.java.Clientserver.Controller;

import com.java.Clientserver.Model.perobject;
import com.java.Clientserver.Service.FileService;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/main/upload")
public class UploadingFile {
    private FileService fileService;

    public UploadingFile(FileService fileService) {
        this.fileService = fileService;
    }


    @PostMapping(value = "/test")
    @Async
    public ResponseEntity receivingFiles(@RequestBody perobject object) throws InterruptedException {
//        TimeUnit.SECONDS.sleep(5);
        fileService.saveToDataBase(object);
        return ResponseEntity.ok("Upload and save success!");
    }

}

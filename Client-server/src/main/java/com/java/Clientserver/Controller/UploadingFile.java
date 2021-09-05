package com.java.Clientserver.Controller;

import com.java.Clientserver.Model.Object;
import com.java.Clientserver.Service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping(value = "/main/upload")
public class UploadingFile {
    private FileService fileService;

    public UploadingFile(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping
    public ResponseEntity uploadFile(@RequestParam("file") MultipartFile file){
        fileService.dessializer(file);
        return ResponseEntity.ok("File succeed upload!");
    }

    @PostMapping(value = "/test")
    @Async
    public ResponseEntity testingController(@RequestBody Object object) throws InterruptedException {
//        TimeUnit.SECONDS.sleep(5);
        fileService.saveToDataBase(object);
        return ResponseEntity.ok("COOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOL");
    }
    @GetMapping(value = "/test")
    public  ResponseEntity testControllerGet(){
        return ResponseEntity.ok("Code: 200");
    }
}

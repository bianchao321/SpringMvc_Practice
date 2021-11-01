package com.bc.f_fileupload;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("user")
@ComponentScan()
public class UserController {
    @RequestMapping("upload")
    public String upload(@RequestParam CommonsMultipartFile photo, HttpServletRequest request) throws IOException {
        System.out.println("f1 0000000");
        // 名字不能写死
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        // 扩展名不能写死
        // 照片名字
        String originalFilename = photo.getOriginalFilename();
        int i = originalFilename.lastIndexOf(".");
        String ext = originalFilename.substring(i);
        // 文件的新名字
        String new_photoname = uuid + ext;
        // 文件存储的路径
        String path = request.getRealPath("/images");
        System.out.println(path);
        photo.transferTo(new File(path, new_photoname));
        return "f";
    }
}

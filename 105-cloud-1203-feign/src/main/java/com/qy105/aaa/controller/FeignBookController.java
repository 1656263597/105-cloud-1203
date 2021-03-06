package com.qy105.aaa.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qy105孔佑森
 * @version 1.0
 * @Date 2019/12/3
 */
@RestController
public class FeignBookController {
    @Autowired
    private BookService bookService;
    @HystrixCommand
    @GetMapping("feignGetAllBook")
    public List<BookInfo> getAllBook() {
        List<BookInfo> allBook = bookService.getAllBook();
        System.out.println("feign get book " + allBook.size());
        return allBook;
    }
}
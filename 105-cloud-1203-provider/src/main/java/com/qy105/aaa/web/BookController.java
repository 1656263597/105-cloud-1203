package com.qy105.aaa.web;

import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qy105孔佑森
 * @version 1.0
 * @Date 2019/11/29
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    private int i = 1;

    @GetMapping("getAllBook")
    @ResponseBody
    public List<BookInfo> getAllBook() {
        List<BookInfo> allBook = bookService.getAllBook();
        if (allBook == null) {
            return null;
        }
        for (BookInfo bookInfo : allBook) {
            System.out.println(bookInfo);
        }
        if (i++ % 2 == 0) {
            throw new IllegalArgumentException();
        }
        /*try {
            Thread.sleep(15000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return allBook;
    }
}

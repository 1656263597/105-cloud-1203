package com.qy105.aaa.service;

import com.qy105.aaa.model.BookInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qy105孔佑森
 * @version 1.0
 * @Date 2019/12/3
 */
@Service
public class BookServiceHystrixImpl implements BookService {
    @Override
    public List<BookInfo> getAllBook() {
        System.out.println("服务降级中");
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("语文书");
        List<BookInfo> bookInfoList = new ArrayList<BookInfo>();
        bookInfoList.add(bookInfo);
        return bookInfoList;
    }
}

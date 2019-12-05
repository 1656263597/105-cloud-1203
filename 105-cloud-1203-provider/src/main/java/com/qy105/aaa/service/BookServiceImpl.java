package com.qy105.aaa.service;

import com.qy105.aaa.mapper.BookMapper;
import com.qy105.aaa.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qy105孔佑森
 * @version 1.0
 * @Date 2019/12/2
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<BookInfo> getAllBook() {
        List<BookInfo> bookInfos = bookMapper.getAllBook();
        if (bookInfos == null) {
            return null;
        }else {
            return bookInfos;
        }
    }
}

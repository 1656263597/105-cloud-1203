package com.qy105.aaa.service;

import com.qy105.aaa.model.BookInfo;

import java.util.List;

/**
 * @author qy105孔佑森
 * @version 1.0
 * @Date 2019/12/3
 */
public interface BookService {
    /**
     *公共接口 获取所有书籍
     * @return
     */
    List<BookInfo> getAllBook();
}

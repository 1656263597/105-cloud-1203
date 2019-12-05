package com.qy105.aaa.mapper;

import com.qy105.aaa.model.BookInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author qy105孔佑森
 * @version 1.0
 * @Date 2019/12/2
 */
@Mapper
public interface BookMapper {
    /**
     *拿到所有书籍
     * @return
     */
    @Select("select * from book_info")
    List<BookInfo> getAllBook();
}

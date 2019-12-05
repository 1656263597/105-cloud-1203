package com.qy105.aaa.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author qy105孔佑森
 * @version 1.0
 * @Date 2019/12/3
 */
@Data
public class BookInfo implements Serializable {
    private Long bookId;
    private String bookName;
    private Integer bookStore;
    private BigDecimal bookPrice;
}

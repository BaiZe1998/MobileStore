package com.yucong.phone_store.dto;

import lombok.Data;

//DTO data to object，将业务对象，一个或多个封装成数据库中能直接插入的对象格式 调用Jpa的方式
//与VO的功能正好相反，往往是用户点击发送某个请求后，后台需要根据这些请求中的数据查询多个表，然后将数据封装成一个对象，然后利用jpa插入数据库
@Data
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private Integer specsId;
    private Integer phoneQuantity;
}

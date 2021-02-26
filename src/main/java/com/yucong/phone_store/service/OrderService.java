package com.yucong.phone_store.service;

import com.yucong.phone_store.dto.OrderDTO;
import com.yucong.phone_store.vo.OrderDetailVO;

public interface OrderService {
    //创建订单的方法
    public OrderDTO create(OrderDTO orderDTO);
    //根据订单id，返回订单的详情
    public OrderDetailVO findOrderDetailByOrderId(String orderId);
    public String pay(String orderId);
}

package com.yucong.phone_store.repository;

import com.yucong.phone_store.entity.OrderMaster;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    @Test
    void findAll(){
        List<OrderMaster> list = repository.findAll();
        for (OrderMaster orderMaster : list) {
            System.out.println(orderMaster);
        }
    }

    //这里由于是单元测试，对象是直接创建的，但实际应该是先对传过来的数据进行一些业务处理后组合成一个需要插入的订单的对象
    @Test
    void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("张三");
        orderMaster.setBuyerAddress("广东省深圳市罗湖区科技路123号456室");
        orderMaster.setBuyerPhone("13678787878");
        orderMaster.setOrderAmount(new BigDecimal(6400));
        orderMaster.setPayStatus(0);
        orderMaster.setPhoneIcon("../static/e84a2e03-7f19-41d2-98a5-a5c16b7e252d.jpg");
        orderMaster.setPhoneId(1);
        orderMaster.setPhoneName("Honor 8A");
        orderMaster.setPhoneQuantity(2);
        orderMaster.setSpecsId(1);
        orderMaster.setSpecsName("32GB");
        orderMaster.setSpecsPrice(new BigDecimal(320000));
        repository.save(orderMaster);
    }

    @Test
    void findById(){
        //这里要注意，findById的方法由于是主键，定义了@Id注解，虽然表的字段中没有一个叫id的字段，只有order_id，但也可以查，归功于@Id注解
        //而想根据表中的其他字段来查询订单表，方法的名称必须严格对应表中的字段名（或者说对象的方法名要与字段的名称严格对应）
        OrderMaster orderMaster = repository.findById("123456").get();
        System.out.println(orderMaster);
    }

    @Test
    void pay(){
        OrderMaster orderMaster = repository.findById("123456").get();
        orderMaster.setPayStatus(1);
        repository.save(orderMaster);
    }
}
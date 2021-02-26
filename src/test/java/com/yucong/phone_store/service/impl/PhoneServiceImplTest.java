package com.yucong.phone_store.service.impl;

import com.yucong.phone_store.service.PhoneService;
import com.yucong.phone_store.vo.DataVO;
import com.yucong.phone_store.vo.PhoneInfoVO;
import com.yucong.phone_store.vo.SpecsPackageVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PhoneServiceImplTest {

    //如果需要自动装载，首先它要是一个被IOC容器管理的Bean
    @Autowired
    private PhoneService phoneService;

    @Test
    void findDataVO() {
        DataVO dataVO = phoneService.findDataVO();
        int id = 0;
    }

    @Test
    void findPhoneInfoVOByCategoryType() {
        List<PhoneInfoVO> list = phoneService.findPhoneInfoVOByCategoryType(2);
        int id = 0;
    }

    @Test
    void findSku(){
        SpecsPackageVO specsPackageVO = phoneService.findSpecsByPhoneId(1);
        int id = 0;
    }

    @Test
    void subStock() {
        //这是针对Service接口实现类的接口测试
        phoneService.subStock(1, 100);
    }
}
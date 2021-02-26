package com.yucong.phone_store.repository;

import com.yucong.phone_store.entity.BuyerAddress;
import org.springframework.data.jpa.repository.JpaRepository;

//只需要自定义接口继承Jpa的接口就行了，不用自己写实现类，但是具体涉及到对应数据表的方法Jpa不可能都给你定义好，要自己手写
public interface BuyerAddressRepository extends JpaRepository<BuyerAddress, Integer> {
}

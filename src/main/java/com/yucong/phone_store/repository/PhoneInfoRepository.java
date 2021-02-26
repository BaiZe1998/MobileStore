package com.yucong.phone_store.repository;

import com.yucong.phone_store.entity.PhoneInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneInfoRepository extends JpaRepository<PhoneInfo, Integer> {
    //方法的形式参数是自定义的，但是推荐与对象的变量名相同
    public List<PhoneInfo> findAllByCategoryType(Integer categoryType);
}

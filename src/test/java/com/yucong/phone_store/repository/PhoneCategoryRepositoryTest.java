package com.yucong.phone_store.repository;

import com.yucong.phone_store.entity.PhoneCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//关于创建单元测试，右键接口，goto，test，然后就能创建
@SpringBootTest
class PhoneCategoryRepositoryTest {
    //每次需要一个对象的时候，需要自动注入，接口的实现类无序我们定义，Jpa负责
    @Autowired
    private PhoneCategoryRepository repository;

    @Test
    void findAll(){
        //Jpa只要遵守了类和变量的命名规则，这些操作数据库的语句就已经被定义成方法可以直接使用，变成了面向对象的思维
        //不用再写sql语句
        List<PhoneCategory> list = repository.findAll();
        for (PhoneCategory phoneCategory : list) {
            System.out.println(phoneCategory);
        }
    }

    @Test
    void findByCategoryType(){
        //因为我们将数据表与其中的字段完全匹配了一个实体类，所以利用Jpa可以将查询的结果绑定成一个对象
        PhoneCategory phoneCategory = repository.findByCategoryType(1);
        System.out.println(phoneCategory);
    }
}
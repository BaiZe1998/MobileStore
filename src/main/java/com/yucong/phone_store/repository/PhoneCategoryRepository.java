package com.yucong.phone_store.repository;

import com.yucong.phone_store.entity.PhoneCategory;
import org.springframework.data.jpa.repository.JpaRepository;

//继承jap的接口，泛型参数为对应的实体类和主键对应的数据类型
//使用Spring Data Jpa我们只要自己创建接口继承它给出的接口，然后将实体类和表配起来，就可以直接使用操作数据库的命令
//是一个全自动的ORMapping框架，底层是Hibernate
//Mybatis是一个半自动的ORM框架，我记得还要写sql，然后自己操作获取结果集
public interface PhoneCategoryRepository extends JpaRepository<PhoneCategory, Integer> {
    //Jap会自动声明一些类通用的查询操作，类似于findAll，findById等，但是与具体数据表的字段完全对应的方法是不可能自动实现的，这里我们要手动声明
    //注意这里方法的名字只要是find + 实体类的成员变量，它就有代码提示，只要满足规则Jpa就会自动实现方法查询对应数据返回对象
    public PhoneCategory findByCategoryType(Integer categoryType);
}

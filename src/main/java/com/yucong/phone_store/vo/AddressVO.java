package com.yucong.phone_store.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressVO {
    //对于VO结尾的对象，其中的成员变量的名称可以选择与接口要求返回的json属性相同，也可以
    //与repository实体类相同方便使用beanutil传递数据，在用jsonproperty注解，如果不用beanUtil则不用强行
    //要求VO的成员变量的名称与entity中的类的成员变量的名称相同
    private Integer id;
    private String areaCode;
    private String name;
    private String tel;
    private String address;
}

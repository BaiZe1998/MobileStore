package com.yucong.phone_store.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PhoneCategoryVO {
    //首先要保证这里需要的成员变量是从对应的repository层的对象的成员变量，需要哪几个就复制哪几个，确保类型名称以及属性名都相同
    //将对象以json对象返回时，对应的属性名为绑定的属性名
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
}

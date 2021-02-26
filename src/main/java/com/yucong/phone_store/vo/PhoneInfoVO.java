package com.yucong.phone_store.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

//首先我们通过Spring Data Jpa以操作对象的形式获得数据表中的对象，或者对象集合，然后通过
//一个Spring的工具直接将需要的字段值传递给VO对象的成员变量，当然部分字段肯定是需要手动复制的
//然后再通过JsonProperty注解的形式设定将VO对象的成员变量的名称与转化成Json对象后对应的属性名相绑定
//repository获得对象或对象集合 -> 装配VO，VO之间还有嵌套 -> JSON
@Data
@AllArgsConstructor
public class PhoneInfoVO {
    //这里的属性名只有在转换成Json格式之后，变量名才会变化，在Java的调试系统之中，依旧是按照这里成员变量声明的形式
    @JsonProperty("id")
    private Integer phoneId;
    @JsonProperty("title")
    private String phoneName;
    @JsonProperty("price")
    private String phonePrice;
    @JsonProperty("desc")
    private String phoneDescription;
    //这里tag就不用了，因为它本身就叫tag
    private List<Map<String,String>> tag;
    @JsonProperty("thumb")
    private String phoneIcon;
}

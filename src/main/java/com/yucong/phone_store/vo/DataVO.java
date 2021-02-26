package com.yucong.phone_store.vo;

import lombok.Data;

import java.util.List;

@Data
public class DataVO {
    //注意这里的变量名categories需要与接口需求相同，或者用@JsonProperty注解进行绑定
    //这里的目的是组装成一个对象，然后以json格式返回，而对象与json格式的转换则很方便，只要能组装成功，就能返回需要的json
    private List<PhoneCategoryVO> categories;
    //这里我猜测如果不用JsonProperty注解则是json的属性就是成员变量的名称，所以这里设置为相同，节省了注解的步骤
    private List<PhoneInfoVO> phones;
}

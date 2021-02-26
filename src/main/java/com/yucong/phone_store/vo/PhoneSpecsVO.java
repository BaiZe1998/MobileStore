package com.yucong.phone_store.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PhoneSpecsVO {
    //首先要注意这里因为这个视图对象的属性已经和repository查询的结果PhoneSpecs实体对象属性完全相同
    //因此可以借助BeanUtil工具类完成属性的传递，这里讲成员变量的名字与其匹配，然后添加JsonProperty注解
    //完成成员变量名与json对象属性名的对应
    @JsonProperty("id")
    private Integer specsId;
    @JsonProperty("name")
    private String specsName;
    @JsonProperty("imgUrl")
    private String specsIcon;
    @JsonProperty("previewImgUrl")
    private String specsPreview;
}

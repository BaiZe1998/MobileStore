package com.yucong.phone_store.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

//Form中的与DTO还是有所不同，form侧重于提交的表单请求，其中的数据基本不用再经过复杂的拼接得到数据库中对应的格式
//基本一个form对象中就已经包含了需要的所有数据
@Data
public class AddressForm {
    private Integer id;
    @NotEmpty(message = "姓名不能为空")
    private String name;
    @NotEmpty(message = "电话不能为空")
    private String tel;
    @NotEmpty(message = "省不能为空")
    private String province;
    @NotEmpty(message = "市不能为空")
    private String city;
    @NotEmpty(message = "区不能为空")
    private String county;
    @NotEmpty(message = "编码不能为空")
    private String areaCode;
    @NotEmpty(message = "详细地址不能为空")
    private String addressDetail;
}

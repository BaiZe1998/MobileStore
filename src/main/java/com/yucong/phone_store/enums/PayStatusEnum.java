package com.yucong.phone_store.enums;

import lombok.Getter;

@Getter
//PayStatusEnum.UNPAID.getCode()可以取到对应的枚举对象的属性值
public enum  PayStatusEnum {
    UNPAID(0, "未支付"),
    PAID(1, "已支付");
    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

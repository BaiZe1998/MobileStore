package com.yucong.phone_store.exception;

import com.yucong.phone_store.enums.ResultEnum;

public class PhoneException extends RuntimeException {
    //自定义异常传入枚举类，调用带参构造器，抛出自定义异常
    public PhoneException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
    }

    public PhoneException(String error) {
        super(error);
    }
}

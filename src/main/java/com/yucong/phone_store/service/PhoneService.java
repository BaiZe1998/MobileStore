package com.yucong.phone_store.service;

import com.yucong.phone_store.entity.PhoneCategory;
import com.yucong.phone_store.vo.DataVO;
import com.yucong.phone_store.vo.PhoneInfoVO;
import com.yucong.phone_store.vo.SpecsPackageVO;

import java.util.List;

public interface PhoneService {
    public DataVO findDataVO();
    public List<PhoneInfoVO> findPhoneInfoVOByCategoryType(Integer categoryType);
    //注意这是在service层中的接口，本质上是处理业务逻辑的，所以实现类是我们自己写的
    //与repository层的Jpa不需要自己写实现类是不同的，这里接口中定义的抽象方法的命名是自定义的
    //而repository层中的接口继承了Jpa的接口之后，如果要定义一些方法，则其命名是有具体约束的
    public SpecsPackageVO findSpecsByPhoneId(Integer phoneId);
    public void subStock(Integer specsId,Integer quantity);
}

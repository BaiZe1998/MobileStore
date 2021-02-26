package com.yucong.phone_store.service;

import com.yucong.phone_store.form.AddressForm;
import com.yucong.phone_store.vo.AddressVO;

import java.util.List;

public interface AddressService {
    public List<AddressVO> findAll();
    public void saveOrUpdate(AddressForm addressForm);
}

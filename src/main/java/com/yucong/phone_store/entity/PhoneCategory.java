package com.yucong.phone_store.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class PhoneCategory {
    //设置主键，以及逐渐的增加规则：自增
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    //这里如果不用@Column注解，则要求变量名与数据表中的字段名相同，去掉下划线，并遵守驼峰命名规则
    private String categoryName;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;
}

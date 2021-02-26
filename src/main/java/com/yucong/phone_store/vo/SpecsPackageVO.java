package com.yucong.phone_store.vo;

import lombok.Data;

import java.util.Map;

@Data
public class SpecsPackageVO {
    //这里定义的是视图对象，整个对象应该是对应接口中data的部分，这里猜测类似的一层一层的树形的数据
    //属性名会由父亲定义，然后装入对应子对象
    //内部是data对象的各个子对象所构成的视图对象，所以猜测最终还是会被注入到一个对象的data属性中，
    //目前还有一些疑惑是map键值对是如何最后能解析成json形式的？？
    private Map<String,String> goods;
    private SkuVO sku;
}

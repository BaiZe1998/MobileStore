package com.yucong.phone_store.util;

import java.util.Random;

public class KeyUtil {
    //这里保证了线程安全，所以系统时间一定是唯一的
    public static synchronized String createUniqueKey(){
        Random random = new Random();
        Integer key = random.nextInt(900000)+100000;
        return System.currentTimeMillis() + String.valueOf(key);
    }
}

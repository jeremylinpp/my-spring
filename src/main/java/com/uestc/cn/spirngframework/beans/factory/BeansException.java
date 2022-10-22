package com.uestc.cn.spirngframework.beans.factory;

/**
 * @ClassName: BeansException.java
 * @Description: TODO 类描述
 * @Author: linchen8@lenovo.com
 * @Date: 2022/10/22 15:45
 **/
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

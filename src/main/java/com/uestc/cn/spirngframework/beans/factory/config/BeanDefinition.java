package com.uestc.cn.spirngframework.beans.factory.config;


/**
 * @ClassName: BeanDefinition.java
 * @Description: bean定义
 * @Author: linchen8@lenovo.com
 * @Date: 2022/10/22 15:19
 **/
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }


    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}

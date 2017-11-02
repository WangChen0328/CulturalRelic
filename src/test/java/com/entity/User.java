package com.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class User implements BeanFactoryAware,BeanNameAware,
        InitializingBean,DisposableBean {

    private String username;

    public User() {
        System.out.println("初始化 user");
    }

    public void setUsername(String username) {
        System.out.println("设置 username");
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用 BeanFactoryAware.beanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("调用 BeanNameAware.setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用 DisposableBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用 InitializingBean.afterPropertiesSet");
    }

    public void myInit() {
        System.out.println("调用 myInit");
    }

    public void myDestroy() {
        System.out.println("调用 myDestroy");
    }
}

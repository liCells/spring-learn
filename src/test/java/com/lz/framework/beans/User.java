package com.lz.framework.beans;

/**
 * 测试注册bean
 *
 * @Created: 21/10/14 13:14
 * @Author: LZ
 */
public class User {
    private String account;

    public void add() {
        System.out.println("Success.");
    }

    public User() {
    }

    public User(String account) {
        this.account = account;
    }
}

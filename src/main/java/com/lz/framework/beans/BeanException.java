package com.lz.framework.beans;

/**
 * Bean异常
 *
 * @Created: 21/10/14 12:53
 * @Author: LZ
 */
public class BeanException extends RuntimeException {
    public BeanException(String msg) {
        super(msg);
    }
    public BeanException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}

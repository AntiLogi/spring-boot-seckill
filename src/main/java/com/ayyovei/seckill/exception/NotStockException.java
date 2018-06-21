package com.ayyovei.seckill.exception;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/6/21
 */
public class NotStockException extends RuntimeException {
    public NotStockException(String description){
         super(description);
    }
}

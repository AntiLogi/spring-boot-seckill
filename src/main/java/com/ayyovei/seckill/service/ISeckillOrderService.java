package com.ayyovei.seckill.service;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/6/22
 */
public interface ISeckillOrderService {
    /**
     * 创建订单
     */
    void createOrder(int seckillId,int uid);

    boolean verificate(int seckillId,int uid);
}

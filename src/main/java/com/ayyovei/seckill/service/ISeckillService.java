package com.ayyovei.seckill.service;

import com.ayyovei.seckill.entity.Seckill;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/6/22
 */
public interface ISeckillService {

    Seckill checkCount(int seckillId);

    void decreaseStock(Seckill seckill);
}

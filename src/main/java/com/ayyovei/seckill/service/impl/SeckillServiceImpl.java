package com.ayyovei.seckill.service.impl;

import com.ayyovei.seckill.entity.Seckill;
import com.ayyovei.seckill.service.ISeckillService;
import org.springframework.stereotype.Service;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/6/22
 */
@Service
public class SeckillServiceImpl implements ISeckillService {
    @Override
    public Seckill checkCount(int seckillId) {
        return null;
    }

    @Override
    public void decreaseStock(Seckill seckill) {

    }
}

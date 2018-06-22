package com.ayyovei.seckill.service.impl;

import com.ayyovei.seckill.entity.Seckill;
import com.ayyovei.seckill.service.ISeckillOrderService;
import com.ayyovei.seckill.service.ISeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/6/22
 */
@Service
public class SeckillOrderServiceImpl implements ISeckillOrderService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ISeckillOrderService seckillOrderService;
    @Autowired
    private ISeckillService seckillService;

    @Override
    public void createOrder(int seckillId, int uid) {
        //校验资格
        if (verificate(seckillId, uid)) {
            //核对库存
            Seckill seckill = seckillService.checkCount(seckillId);
            //扣库存
            seckillService.decreaseStock(seckill);
            //创建订单


        } else {
            logger.info("很抱歉，不能重复秒杀");
            throw new RuntimeException("不能重复秒杀");
        }

    }

    @Override
    public boolean verificate(int seckillId, int uid) {
        return false;
    }

    public void save(){

    }
}

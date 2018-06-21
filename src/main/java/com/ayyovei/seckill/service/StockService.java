package com.ayyovei.seckill.service;

import com.ayyovei.seckill.entity.Stock;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/6/21
 */
public interface StockService {
    void saleStock(Stock stock);
    Stock checkStock(Integer id);
}

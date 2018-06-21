package com.ayyovei.seckill.service.impl;

import com.ayyovei.seckill.dao.StockMapper;
import com.ayyovei.seckill.entity.Stock;
import com.ayyovei.seckill.exception.NotStockException;
import com.ayyovei.seckill.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/6/21
 */
@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockMapper stockMapper;
    @Override
    public void saleStock(Stock stock) {
        stock.setCount(stock.getCount()-1);
        stockMapper.updateByPrimaryKey(stock);
    }

    @Override
    public Stock checkStock(Integer id) {
        Stock stock = stockMapper.selectByPrimaryKey(id);
        if(getRemain(stock)>0){
            throw new NotStockException("没有库存");
        }
        return stock;
    }

    public int getRemain(Stock stock){

        if (stock==null){
            return -1;
        }
        return stock.getCount()-stock.getSale();
    }
}

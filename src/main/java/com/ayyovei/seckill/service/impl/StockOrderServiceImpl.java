package com.ayyovei.seckill.service.impl;

import com.ayyovei.seckill.dao.StockOrderMapper;
import com.ayyovei.seckill.entity.Stock;
import com.ayyovei.seckill.entity.StockOrder;
import com.ayyovei.seckill.service.StockOrderService;
import com.ayyovei.seckill.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/6/21
 */
@Service
public class StockOrderServiceImpl implements StockOrderService {

    @Autowired
    private StockOrderMapper stockOrderMapper;
    @Autowired
    private StockService stockService;

    @Override
    public int createStockOrder (int sId) {
        //核对库存
        Stock stock = stockService.checkStock(sId);
        //减库存并更新
        stockService.saleStock(stock);
        //创建订单
        int result =createOrder(stock);
        return result;
    }
    public int createOrder(Stock stock){
        StockOrder stockOrder = new StockOrder();
        stockOrder.setName(stock.getName());
        stockOrder.setSid(stock.getId());
        stockOrder.setCreateTime(new Date());
        int result = stockOrderMapper.insert(stockOrder);
        return result;
    }


}

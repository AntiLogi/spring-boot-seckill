package com.ayyovei.seckill.web;

import com.ayyovei.seckill.service.StockOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/6/21
 */
@RestController
@RequestMapping("seckill")
public class SecKillController {

    @Autowired
    private StockOrderService stockOrderService;

    @RequestMapping("/createOrder/{sid}")
    public String createOrder(@PathVariable int sid){
      int result = stockOrderService.createStockOrder(sid);
        return String.valueOf(result);
    }
}

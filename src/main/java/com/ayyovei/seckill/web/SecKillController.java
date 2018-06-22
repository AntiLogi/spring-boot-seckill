package com.ayyovei.seckill.web;

import com.ayyovei.seckill.service.ISeckillOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**seckill
 * @author chenxiaobin
 * @description
 * @create 2018/6/21
 */
@RestController
public class SecKillController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ISeckillOrderService seckillOrderService;

    @RequestMapping("/seckill/{seckillId}/{userId}")
    public String createOrder(@PathVariable int seckillId,@PathVariable int userId){
        boolean verificate = seckillOrderService.verificate(seckillId, userId);

            seckillOrderService.createOrder(seckillId,userId);

            logger.info("很抱歉，不能重复秒杀");


        return String.valueOf(userId);
    }
    @RequestMapping("/test")
    public String test(){

        return "can you see that?";
    }

}

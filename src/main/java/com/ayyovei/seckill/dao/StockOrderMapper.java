package com.ayyovei.seckill.dao;

import com.ayyovei.seckill.entity.StockOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface StockOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StockOrder record);

    int insertSelective(StockOrder record);

    StockOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StockOrder record);

    int updateByPrimaryKey(StockOrder record);
}
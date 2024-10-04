package com.example.progectmodul2.dao;

import com.example.progectmodul2.enums.StatusOrdersEnum;
import com.example.progectmodul2.model.OrdersEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface OrdersDao {
    @Transactional
    public void updateOrders(long id, StatusOrdersEnum statusOrdersEnum);
}

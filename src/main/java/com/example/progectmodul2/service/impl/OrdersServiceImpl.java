package com.example.progectmodul2.service.impl;


import com.example.progectmodul2.dao.OrdersDao;
import com.example.progectmodul2.enums.StatusOrdersEnum;
import com.example.progectmodul2.model.OrdersEntity;

import com.example.progectmodul2.service.UpdateOrdersSetStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements UpdateOrdersSetStatus {
    @Autowired
    OrdersDao ordersDao;

    @Override
    public void updateOrders(long id, StatusOrdersEnum statusOrdersEnum) {
        ordersDao.updateOrders(id, statusOrdersEnum);
    }
}

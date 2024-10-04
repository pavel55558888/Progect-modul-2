package com.example.progectmodul2.service;

import com.example.progectmodul2.enums.StatusOrdersEnum;
import org.springframework.stereotype.Service;

@Service
public interface UpdateOrdersSetStatus {
    public void updateOrders(long id, StatusOrdersEnum statusOrdersEnum);
}

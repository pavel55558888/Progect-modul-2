package com.example.progectmodul2.dao.impl;

import com.example.progectmodul2.dao.OrdersDao;
import com.example.progectmodul2.enums.StatusOrdersEnum;
import com.example.progectmodul2.model.OrdersEntity;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrdersDaoImpl implements OrdersDao {
    @Autowired
    EntityManager entityManager;

    @Override
    public void updateOrders(long id, StatusOrdersEnum statusOrdersEnum) {
        entityManager.createQuery("update OrdersEntity set status = :param1 where id = :param2")
                .setParameter("param1", statusOrdersEnum.getValue())
                .setParameter("param2",id)
                .executeUpdate();
    }
}

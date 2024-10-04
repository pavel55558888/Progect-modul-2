package com.example.progectmodul2.update_status;

import com.example.progectmodul2.enums.StatusOrdersEnum;
import com.example.progectmodul2.service.UpdateOrdersSetStatus;
import lombok.SneakyThrows;

public class UpdateStatusOrder extends Thread{
    private final UpdateOrdersSetStatus updateOrdersSetStatus;
    private long id;

    public UpdateStatusOrder(Long id, UpdateOrdersSetStatus updateOrdersSetStatus) {
        this.id = id;
        this.updateOrdersSetStatus = updateOrdersSetStatus;
        this.start();
    }

    @SneakyThrows
    @Override
    public void run() {
        Thread.sleep(10000);

        updateOrdersSetStatus.updateOrders(id, StatusOrdersEnum.Sent);

        Thread.sleep(10000);

        updateOrdersSetStatus.updateOrders(id, StatusOrdersEnum.Completed);

        System.out.println("Выполнено, id заказа:   " + id);
    }
}

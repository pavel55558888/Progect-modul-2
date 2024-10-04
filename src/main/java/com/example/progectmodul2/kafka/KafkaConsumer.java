package com.example.progectmodul2.kafka;

import com.example.progectmodul2.service.UpdateOrdersSetStatus;
import com.example.progectmodul2.update_status.UpdateStatusOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @Autowired
    UpdateOrdersSetStatus updateOrdersSetStatus;
    @KafkaListener(topics = "TestTopic", groupId = "group")
    public void listener(String message){
        System.out.println(message);
        UpdateStatusOrder updateStatusOrder = new UpdateStatusOrder(Long.parseLong(message), updateOrdersSetStatus);
    }
}

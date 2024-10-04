package com.example.progectmodul2.enums;

import lombok.Getter;

@Getter
public enum StatusOrdersEnum {
    Created("Создан"), Sent("Отправлен"), Completed("Выполнен");

    private String value;

    StatusOrdersEnum(String value) {
        this.value = value;
    }

}

package com.southsystem.inventoryControl.inventory.enums;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;

@JsonSerialize(using = EnumSerializer.class)
@AllArgsConstructor
@Getter
public enum InventoryEnum implements EnumDescription {

    TYPE_1("Tipo 1"),
    TYPE_2("Tipo 2"),
    TYPE_3("Tipo 3");

    private String description;
}

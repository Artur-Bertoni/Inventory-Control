package com.southsystem.inventoryControl.inventory.util.mapper;

import org.mapstruct.factory.Mappers;

public class MapperConstants {

    public static final InventoryMapper inventoryMapper = Mappers.getMapper(InventoryMapper.class);

    private MapperConstants() {
    }
}

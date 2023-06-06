package com.southsystem.inventoryControl.inventory.util.mapper;

import com.southsystem.inventoryControl.inventory.collection.Inventory;
import com.southsystem.inventoryControl.inventory.dto.InventoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface InventoryMapper {

    @Mapping(target = "id", ignore = true)
    InventoryDTO buildInventoryDTO(Inventory inventory);

    @Mapping(target = "id", ignore = true)
    Inventory buildInventory(InventoryDTO inventoryDTO);
}

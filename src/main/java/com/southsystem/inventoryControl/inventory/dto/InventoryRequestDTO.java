package com.southsystem.inventoryControl.inventory.dto;

import com.southsystem.inventoryControl.inventory.enums.InventoryEnum;
import lombok.Builder;
import lombok.Value;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;

@Value
@With
@Jacksonized
@Builder
public class InventoryRequestDTO {

    String name;
    Integer code;
    BigDecimal price;
    InventoryEnum type;
}

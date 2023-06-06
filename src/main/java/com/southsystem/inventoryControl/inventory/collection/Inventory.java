package com.southsystem.inventoryControl.inventory.collection;

import com.southsystem.inventoryControl.inventory.enums.InventoryEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "inventory")
public class Inventory {

    @Id
    private String id;
    private String name;
    private Integer code;
    private BigDecimal price;
    private InventoryEnum type;
}

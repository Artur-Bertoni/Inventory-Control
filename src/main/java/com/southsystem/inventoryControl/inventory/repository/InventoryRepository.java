package com.southsystem.inventoryControl.inventory.repository;

import com.southsystem.inventoryControl.inventory.collection.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends MongoRepository<Inventory, String> {
}

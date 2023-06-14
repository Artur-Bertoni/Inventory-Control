package com.southsystem.inventoryControl.inventory.service;

import com.southsystem.inventoryControl.inventory.dto.InventoryDTO;
import com.southsystem.inventoryControl.inventory.dto.InventoryRequestDTO;
import com.southsystem.inventoryControl.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.southsystem.inventoryControl.inventory.util.mapper.MapperConstants.inventoryMapper;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository repository;

    public List<InventoryDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(inventoryMapper::buildInventoryDTO)
                .collect(Collectors.toList());
    }

    public InventoryDTO findById(String id) {
        if (repository.existsById(id)) {
            return inventoryMapper.buildInventoryDTO(repository.findById(id).get());
        }
        return null;
    }

    public InventoryDTO create(InventoryRequestDTO requestDTO) {
        return inventoryMapper.buildInventoryDTO(repository.save(inventoryMapper.buildInventory(requestDTO)));
    }
}

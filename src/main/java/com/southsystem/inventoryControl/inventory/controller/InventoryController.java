package com.southsystem.inventoryControl.inventory.controller;

import com.southsystem.inventoryControl.inventory.dto.InventoryRequestDTO;
import com.southsystem.inventoryControl.inventory.dto.InventoryDTO;
import com.southsystem.inventoryControl.inventory.service.InventoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
@Tag(name = "Inventory")
public class InventoryController {

    private final InventoryService service;

    @GetMapping
    @Operation(summary = "Find All Inventory Items",
            responses = {@ApiResponse(responseCode = "200", description = "Resource successfully retrieved",
                    content = @Content(schema = @Schema(implementation = InventoryDTO.class)))})
    public List<InventoryDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find Inventory Item By Id",
            responses = {@ApiResponse(responseCode = "200", description = "Resource successfully retrieved",
                    content = @Content(schema = @Schema(implementation = InventoryDTO.class)))})
    public InventoryDTO findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @Operation(summary = "Post Item",
            responses = {@ApiResponse(responseCode = "201", description = "Resource successfully created",
                    content = @Content(schema = @Schema(implementation = InventoryDTO.class)))})
    public InventoryDTO create(@RequestBody InventoryRequestDTO requestDTO) {
        return service.create(requestDTO);
    }
}

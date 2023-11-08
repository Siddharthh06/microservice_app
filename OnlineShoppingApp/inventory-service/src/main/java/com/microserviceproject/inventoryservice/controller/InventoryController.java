package com.microserviceproject.inventoryservice.controller;

import com.microserviceproject.inventoryservice.dto.InventoryResponse;
import com.microserviceproject.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController {

    private final InventoryService inventoryService;

    // this mapping is used when only 1 skucode is passed as the request parameter
    // the link is of the form:
        // http://localhost:8080/inventory-service/api/inventory/iphone_13
    /* @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("sku-code") String skuCode) {
        log.info("Received inventory check request for skuCode: {}", skuCode);
        return inventoryService.isInStock(skuCode);
    }
    */

    // to pass multiple skucode as the request parameter of the form:
        // http://localhost:8080/inventory-service/api/inventory/skuCode=iphone_13&skuCode=iphone_13_red
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}

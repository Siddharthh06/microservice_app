package com.microserviceproject.inventoryservice.repository;

import com.microserviceproject.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}

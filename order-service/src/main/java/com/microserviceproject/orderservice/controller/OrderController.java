package com.microserviceproject.orderservice.controller;

import com.microserviceproject.orderservice.dto.OrderRequest;
import com.microserviceproject.orderservice.service.OrderService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest); // the order will be saved to the database
        return "Order Placed Successfully";
    }

    // to check if the server is running
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getServerStatus() {
        return "server is running";
    }


}

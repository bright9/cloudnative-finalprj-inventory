package com.bright9.finalproject.inventory.domain;

import com.bright9.finalproject.inventory.domain.*;
import com.bright9.finalproject.inventory.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String status;
    private String address;
}

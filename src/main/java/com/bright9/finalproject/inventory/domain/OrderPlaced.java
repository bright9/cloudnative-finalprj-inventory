package com.bright9.finalproject.inventory.domain;

import com.bright9.finalproject.inventory.domain.*;
import com.bright9.finalproject.inventory.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String customerId;
    private String status;
    private String address;
}

package com.bright9.finalproject.inventory.domain;

import com.bright9.finalproject.inventory.domain.*;
import com.bright9.finalproject.inventory.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OutOfStock extends AbstractEvent {

    private Long id;
    private Long stock;
    private Long orderId;

    public OutOfStock(Inventory aggregate) {
        super(aggregate);
    }

    public OutOfStock() {
        super();
    }
}
//>>> DDD / Domain Event

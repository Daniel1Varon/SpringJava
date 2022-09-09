package com.platzi.market.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PurchaseItem {
    private long productId;
    private int quantity;
    private double total;
    private boolean active;

}

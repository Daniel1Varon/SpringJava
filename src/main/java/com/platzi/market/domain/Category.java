package com.platzi.market.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Category {
    private int categoryId;
    private String category;
    private boolean active;
}

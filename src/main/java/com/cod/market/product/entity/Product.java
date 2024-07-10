package com.cod.market.product.entity;

import com.cod.market.market.base.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseEntity {

    private String name;
    private int price;

}

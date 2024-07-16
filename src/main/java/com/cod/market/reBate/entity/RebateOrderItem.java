package com.cod.market.reBate.entity;

import com.cod.market.market.base.entity.BaseEntity;
import com.cod.market.oder.entity.Order;
import com.cod.market.oder.entity.OrderItem;
import com.cod.market.product.entity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RebateOrderItem extends BaseEntity {
    @ManyToOne(fetch = LAZY)
    private Order order;
    @ManyToOne(fetch = LAZY)
    private OrderItem orderitem;
    @ManyToOne(fetch = LAZY)
    private Product product;

    private int price; // 판매가
    private int payPrice; // 결제 금액
    private boolean isPaid; // 결제여부
    private LocalDateTime payDate;
}


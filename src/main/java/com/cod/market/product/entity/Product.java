package com.cod.market.product.entity;

import com.cod.market.cart.entity.Cart;
import com.cod.market.market.base.BaseEntity;
import com.cod.market.market.entity.Market;
import com.cod.market.question.entity.Question;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@Entity
@ToString
@SuperBuilder
@NoArgsConstructor
public class Product extends BaseEntity {

    private String name;
    private String description;
    private String isActive;
    private String thumbnailImg;
    private int price;
    private int hitCount;

    @ManyToOne
    private Market market;
    @OneToMany(mappedBy = "product",cascade = CascadeType.REMOVE)
    private List<Question> questionList;

    @OneToMany(mappedBy = "product",cascade = CascadeType.REMOVE)
    private List<Cart> cartList;
}

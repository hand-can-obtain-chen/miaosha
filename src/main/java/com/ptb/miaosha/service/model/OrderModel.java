package com.ptb.miaosha.service.model;

import java.math.BigDecimal;

//用户下单的交易模型
public class OrderModel {

    //为什么不像之前一样使用Integer作为id的属性呢，因为订单号普遍比较长，会超出integer的整型限制
    private String id;

    //购买的用户id
    private Integer userId;

    //购买商品的单价
    //记录购买商品的单价，之后不管价格如何改变产生订单的单价都不会变 若promoId非空，则表示秒杀商品的价格
    private BigDecimal itemPrice;

    //购买的商品id
    private Integer itemId;

    //若非空，则表示是以秒杀商品的方式下单
    private Integer promoId;

    //购买的数量
    private Integer amount;

    //购买的金额 若promoId非空，则表示秒杀商品的价格
    private BigDecimal orderPrice;

    public String getId() {
        return id;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

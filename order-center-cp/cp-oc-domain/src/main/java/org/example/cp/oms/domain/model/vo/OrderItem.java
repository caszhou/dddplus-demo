package org.example.cp.oms.domain.model.vo;

import java.math.BigDecimal;

import org.example.cp.oms.spec.model.vo.IOrderItem;

import lombok.Data;

/**
 * 订单项.
 * <p>
 * 每个{@link org.example.cp.oms.domain.model.OrderMain}包含多个订单项.
 * </p>
 */
@Data
public class OrderItem implements IOrderItem {
    private String sku;

    private Integer quantity;

    private String orderLine;

    private BigDecimal price;
}

package org.example.cp.oms.infra.dao;

import java.util.List;

import org.example.cp.oms.infra.po.OrderItemData;

public interface OrderItemDao {
    List<OrderItemData> itemsOfOrder(Long orderId);
}

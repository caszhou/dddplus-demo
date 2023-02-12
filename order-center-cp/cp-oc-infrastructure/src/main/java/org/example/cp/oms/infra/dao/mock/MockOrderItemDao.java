package org.example.cp.oms.infra.dao.mock;

import java.util.List;

import org.example.cp.oms.infra.dao.OrderItemDao;
import org.example.cp.oms.infra.po.OrderItemData;
import org.springframework.stereotype.Component;

// 实际项目，可以使用MyBatis/Hibernate/JPA等
@Component
public class MockOrderItemDao implements OrderItemDao {
    @Override
    public List<OrderItemData> itemsOfOrder(Long orderId) {
        return null;
    }
}

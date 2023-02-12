package org.example.cp.oms.domain.facade.repository;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.domain.model.OrderMain;

public interface IOrderRepository {
    void persist(@NotNull OrderMain orderModel);

    OrderMain getOrder(@NotNull Long orderId);
}

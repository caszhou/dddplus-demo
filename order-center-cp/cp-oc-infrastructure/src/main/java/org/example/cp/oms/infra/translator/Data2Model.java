package org.example.cp.oms.infra.translator;

import java.util.List;

import org.example.cp.oms.domain.model.OrderModelCreator;
import org.example.cp.oms.infra.po.OrderItemData;
import org.example.cp.oms.infra.po.OrderMainData;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface Data2Model {
    Data2Model instance = Mappers.getMapper(Data2Model.class);

    OrderModelCreator translate(OrderMainData orderMainData, @Context List<OrderItemData> orderItemData);
}

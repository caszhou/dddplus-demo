package org.example.cp.oms.controller.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class CancelOrderRequest implements Serializable {
    private static final long serialVersionUID = 870061998490977022L;

    @NotNull
    private String orderNo;
}

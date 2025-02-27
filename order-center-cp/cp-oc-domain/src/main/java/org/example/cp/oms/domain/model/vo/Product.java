package org.example.cp.oms.domain.model.vo;

import org.example.cp.oms.spec.model.vo.IProduct;

import lombok.Data;

/**
 * 订单里包含的增值服务产品.
 */
@Data
public class Product implements IProduct {
    private String code;

    void setCode(String code) {
        this.code = code;
    }

    @Override
    public String code() {
        return code;
    }
}

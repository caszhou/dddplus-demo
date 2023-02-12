package org.example.cp.oms.domain.model.vo;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.domain.model.OrderModelCreator;
import org.example.cp.oms.spec.model.vo.IProduct;
import org.example.cp.oms.spec.model.vo.IProductDelegate;

public class ProductDelegate implements IProductDelegate {
    private List<Product> products;

    private ProductDelegate() {}

    public static ProductDelegate createWith(@NotNull OrderModelCreator creator) {
        ProductDelegate delegate = new ProductDelegate();
        delegate.products = new ArrayList<>();
        return delegate;
    }

    @Override
    public List<? extends IProduct> getProducts() {
        return products;
    }
}

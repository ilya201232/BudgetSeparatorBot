package ru.toolsbots.budgetseparatorbot.service;

import ru.toolsbots.budgetseparatorbot.dto.ProductDTO;
import ru.toolsbots.budgetseparatorbot.model.Check;
import ru.toolsbots.budgetseparatorbot.model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Check check, ProductDTO productDTO);

    void removeProduct(long productId);

    void setName(long productId, String name);

    void setCategory(long productId, String category);

    void setAmount(long productId, float amount);

    void setPrice(long productId, float price);

    void changeAllocation(long productId, List<String> newUsersAllocationList);

}

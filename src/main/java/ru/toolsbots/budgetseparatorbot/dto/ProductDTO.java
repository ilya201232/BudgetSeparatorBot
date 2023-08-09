package ru.toolsbots.budgetseparatorbot.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class ProductDTO {

    private String name;

    private String category;

    private float amount;

    private float price;

    private List<String> allocationUsersTelegramIds;

}

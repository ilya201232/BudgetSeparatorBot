package ru.toolsbots.budgetseparatorbot.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Builder
@Getter
@Setter
public class CheckDTO {

    private String storeName;

    private String storeAddress;

    private Timestamp date;

    private String ownerTelegramId;

    private List<ProductDTO> productDTOList;
}

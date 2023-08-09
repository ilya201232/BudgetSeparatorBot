package ru.toolsbots.budgetseparatorbot.service;

import ru.toolsbots.budgetseparatorbot.dto.CheckDTO;
import ru.toolsbots.budgetseparatorbot.model.Check;
import ru.toolsbots.budgetseparatorbot.model.User;

import java.sql.Timestamp;

public interface CheckService {

    Check createCheck(Timestamp date, CheckDTO checkDTO);

    void removeCheck(long checkId);

    void setStoreName(long checkId, String storeName);

    void setStoreAddress(long checkId, String storeAddress);

    void setDate(long checkId, Timestamp date);

    void setOwner(long checkId, String newOwnerTelegramId);



}

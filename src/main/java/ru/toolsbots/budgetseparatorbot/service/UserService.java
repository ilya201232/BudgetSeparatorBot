package ru.toolsbots.budgetseparatorbot.service;

import ru.toolsbots.budgetseparatorbot.model.Group;
import ru.toolsbots.budgetseparatorbot.model.User;
import ru.toolsbots.budgetseparatorbot.model.enums.UserRole;

public interface UserService {

    User createUser(String telegramId, UserRole role, String name);

    User getUserByTelegramId(String telegramId);

    void deleteUser(String telegramId);

    void setRole(String telegramId, UserRole role);

    void setName(String telegramId, String name);

}

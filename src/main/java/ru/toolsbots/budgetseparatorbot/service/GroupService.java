package ru.toolsbots.budgetseparatorbot.service;

import ru.toolsbots.budgetseparatorbot.model.Group;
import ru.toolsbots.budgetseparatorbot.model.User;

public interface GroupService {

    Group createGroup(User initiatorUser);

    void addUserToGroup(long groupId, User user);

    void removeUserFromGroup(String telegramId);

    void deleteGroup(long groupId);

    // TODO: is it possible to pass Group object?
    void setName(long groupId, String name);

    void setDescription(long groupId, String description);


}

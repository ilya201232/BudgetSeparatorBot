package ru.toolsbots.budgetseparatorbot.model;

import jakarta.persistence.*;
import ru.toolsbots.budgetseparatorbot.model.enums.UserRole;

import java.util.List;

/**
 * Model describing User entity.
 *
 * @author Ilya Aristarkhov
 */
@Entity
@Table(name = "users")
public class User extends BaseModel {

    /**
     * Telegram ID of the user
     */
    @Column(name = "telegram_id", unique = true, nullable = false)
    private String telegramId;

    /**
     * User role
     */
    @Column(nullable = false)
    private UserRole role;

    /**
     * User name
     */
    @Column(nullable = false)
    private String name;

    /**
     * The group the user is in. Can be empty.
     */
    // Тут нет каскада, т.к. при удалении пользователя группа не должна удаляться
    // Удаляются только чеки, в которых фигурирует данный пользователь.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;

}

package ru.toolsbots.budgetseparatorbot.model;

import jakarta.persistence.*;

import java.util.List;

/**
 * Identifies list of users that share checks (see {@link Check}).
 */
@Entity
@Table(name = "groups")
public class Group extends BaseModel {

    /**
     * Name of the Group
     */
    private String name;

    /**
     * Description of the Group
     */
    private String description;

    /**
     * List of users in the Group
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "group")
    private List<User> usersInGroup;
}

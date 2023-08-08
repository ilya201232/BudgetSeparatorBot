package ru.toolsbots.budgetseparatorbot.model;

import jakarta.persistence.*;

import java.util.List;

/**
 * Entity for storing products from checks
 *
 * @author Ilya Aristarkhov
 */
@Entity
@Table(name = "products")
public class Product extends BaseModel {

    /**
     * Check the product belongs to
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "check_id", nullable = false)
    private Check check;

    /**
     * Name of the check
     */
    private String name;

    /**
     * Category of the check
     */
    private String category;

    /**
     * Amount of the product. <br>
     * Examples: <br>
     * - 0.5 grams of cheese <br>
     * - 3 packets of milk <br>
     */
    @Column(nullable = false)
    private float amount;

    /**
     * Price for one {@link Product#amount} of the product
     */
    @Column(nullable = false)
    private float price;

    /**
     * List of users (see {@link User}) that the product allocated between
     */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "allocations",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    // TODO - cascade!
    private List<User> allocatedUsers;

}

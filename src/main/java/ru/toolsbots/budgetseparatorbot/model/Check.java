package ru.toolsbots.budgetseparatorbot.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * Entity for storing checks
 *
 * @author Ilya Aristarkhov
 */
@Entity
@Table(name = "checks")
public class Check extends BaseModel {

    /**
     * Name of the store where the check came from
     */
    @Column(name = "store_name")
    private String storeName;

    /**
     * Address of the store where the check came from
     */
    @Column(name = "store_address")
    private String storeAddress;

    /**
     * Time and date of the check creation
     */
    @Column(nullable = false)
    private Timestamp date;

    /**
     * User that owns the check
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    /**
     * List of products this check has
     */
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "check")
    private List<Product> products;

}

package ru.toolsbots.budgetseparatorbot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;


@MappedSuperclass
@Getter
public class BaseModel {

    @Id
    @GeneratedValue
    private long id;

}

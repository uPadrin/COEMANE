package com.mewtow.cardProcessor.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.opencsv.bean.CsvBindByPosition;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tb_person")
public class Person {

    @Id
    @CsvBindByPosition(position = 0)
    private Long id;

    @NotNull
    @CsvBindByPosition(position = 4)
    private  String name;

    @NotNull
    @CsvBindByPosition(position = 5)
    private int age;

    @OneToMany
    @JsonIgnoreProperties("person")
    private Transaction transaction;
}

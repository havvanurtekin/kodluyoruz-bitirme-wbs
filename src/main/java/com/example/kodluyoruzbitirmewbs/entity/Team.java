package com.example.kodluyoruzbitirmewbs.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Team {
    @Id
    @Column(name = "id", nullable = false)
    private int id;


}

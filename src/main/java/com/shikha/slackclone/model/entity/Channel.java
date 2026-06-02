package com.shikha.slackclone.model.entity;

import jakarta.persistence.*;

@Entity
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
package com.example.tapaz.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name="avtomobil")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name ="reng")
    String color;
    @Column(name = "qiymeti")
    Double qiymet;
    @ManyToOne
     @JoinColumn(name = "model_id",referencedColumnName = "id")
    Model model;
}

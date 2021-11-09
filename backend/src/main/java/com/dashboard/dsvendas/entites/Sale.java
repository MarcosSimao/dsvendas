package com.dashboard.dsvendas.entites;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="tb_sales")
public class Sale implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;
}

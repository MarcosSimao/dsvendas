package com.dashboard.dsvendas.entites.dto;

import com.dashboard.dsvendas.entites.Sale;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalerDto {

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    private SellerDto sellerDto;

    public SalerDto(Sale saler){
        this.id= saler.getId();
        this.visited= saler.getVisited();
        this.deals= saler.getDeals();
        this.amount= saler.getAmount();
        this.date=saler.getDate();
        this.sellerDto=new SellerDto(saler.getSeller());
    }
}

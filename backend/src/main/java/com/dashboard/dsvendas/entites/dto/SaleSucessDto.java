package com.dashboard.dsvendas.entites.dto;

import com.dashboard.dsvendas.entites.Seller;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SaleSucessDto implements Serializable {
    private String sellername;
    private Long visited;
    private Long deals;

    public SaleSucessDto(Seller seller,Long visited,Long deals){
        this.sellername=seller.getName();
        this.visited=visited;
        this.deals=deals;
    }
}

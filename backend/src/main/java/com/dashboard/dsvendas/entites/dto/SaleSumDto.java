package com.dashboard.dsvendas.entites.dto;

import com.dashboard.dsvendas.entites.Seller;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SaleSumDto implements Serializable {
    private String sellername;
    private Double sum;

    public SaleSumDto(Seller seller,Double sum){
        this.sellername=seller.getName();
        this.sum=sum;
    }
}

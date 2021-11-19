package com.dashboard.dsvendas.entites.dto;

import com.dashboard.dsvendas.entites.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerDto implements Serializable {

    private Long id;
    private String name;
    public SellerDto(Seller seller){
        id= seller.getId();
        name= seller.getName();
    }
}

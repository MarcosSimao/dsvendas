package com.dashboard.dsvendas.service;


import com.dashboard.dsvendas.entites.Sale;
import com.dashboard.dsvendas.entites.dto.SaleSucessDto;
import com.dashboard.dsvendas.entites.dto.SaleSumDto;
import com.dashboard.dsvendas.entites.dto.SalerDto;
import com.dashboard.dsvendas.repository.SaleRepository;
import com.dashboard.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    @Autowired
    SellerRepository sellerRepository;
   @Transactional
    public Page<SalerDto> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> sale= saleRepository.findAll(pageable);
        return sale.map(x-> new SalerDto(x));
    }
    @Transactional
    public List<SaleSumDto> amountGroupBySeler(){
        return saleRepository.amountGroupedBySeller();
    }
    @Transactional
    public List<SaleSucessDto> sucessGroupBySeler(){
        return saleRepository.sucessGroupedBySeller();
    }
}

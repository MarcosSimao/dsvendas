package com.dashboard.dsvendas.service;

import com.dashboard.dsvendas.entites.Seller;
import com.dashboard.dsvendas.entites.dto.SellerDto;
import com.dashboard.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDto> findAll(){
        List<Seller> s =sellerRepository.findAll();
        return s.stream().map(x-> new SellerDto(x)).collect(Collectors.toList());
    }
}

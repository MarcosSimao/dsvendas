package com.dashboard.dsvendas.controller;

import com.dashboard.dsvendas.entites.dto.SellerDto;
import com.dashboard.dsvendas.service.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
    @Autowired
    private SellerService sellerService;
    @GetMapping
    public ResponseEntity<List<SellerDto>> findAll(){
        List<SellerDto> seller =sellerService.findAll();
        return ResponseEntity.ok(seller);
    }
}

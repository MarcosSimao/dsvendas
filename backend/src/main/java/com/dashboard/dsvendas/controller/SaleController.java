package com.dashboard.dsvendas.controller;

import com.dashboard.dsvendas.entites.dto.SaleSucessDto;
import com.dashboard.dsvendas.entites.dto.SaleSumDto;
import com.dashboard.dsvendas.entites.dto.SalerDto;
import com.dashboard.dsvendas.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    SaleService saleService;


    @GetMapping
    public ResponseEntity<Page<SalerDto>> findAll(Pageable pageable) {

        Page<SalerDto> s = saleService.findAll(pageable);
        return ResponseEntity.ok(s);

    }

    @GetMapping("/soma")
    public ResponseEntity<List<SaleSumDto>> amountGroupBySeler(){
        List<SaleSumDto>list=saleService.amountGroupBySeler();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/sucess")
    public ResponseEntity<List<SaleSucessDto>> sucessGroupBySeler(){
        List<SaleSucessDto>list=saleService.sucessGroupBySeler();
        return ResponseEntity.ok(list);
    }
}

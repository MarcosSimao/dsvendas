package com.dashboard.dsvendas.repository;

import com.dashboard.dsvendas.entites.Sale;
import com.dashboard.dsvendas.entites.dto.SaleSumDto;
import com.dashboard.dsvendas.entites.dto.SaleSucessDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Repository
@Transactional(readOnly = true)
public interface SaleRepository extends JpaRepository<Sale,Long> {
    @Query("SELECT new com.dashboard.dsvendas.entites.dto.SaleSumDto(obj.seller,SUM(obj.amount)) from Sale AS obj GROUP BY obj.seller")
    List<SaleSumDto> amountGroupedBySeller();
    @Query("SELECT new com.dashboard.dsvendas.entites.dto.SaleSucessDto(obj.seller,SUM(obj.visited),SUM(obj.deals)) from Sale AS obj GROUP BY obj.seller")
    List<SaleSucessDto> sucessGroupedBySeller();
}

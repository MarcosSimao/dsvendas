package com.dashboard.dsvendas.repository;

import com.dashboard.dsvendas.entites.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,Long> {
}

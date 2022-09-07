package com.joseerivam.salesreport.repositories;

import com.joseerivam.salesreport.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

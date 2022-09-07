package com.joseerivam.salesreport.services;


import com.joseerivam.salesreport.entities.Sale;
import com.joseerivam.salesreport.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales(){
        return repository.findAll();
    }
}

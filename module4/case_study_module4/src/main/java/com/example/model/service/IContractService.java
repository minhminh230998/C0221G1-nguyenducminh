package com.example.model.service;

import com.example.model.entity.contract.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> findAll();
    void saveContract(Contract contract);

}

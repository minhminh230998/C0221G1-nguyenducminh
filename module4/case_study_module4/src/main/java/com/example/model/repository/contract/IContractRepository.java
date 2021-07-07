package com.example.model.repository.contract;

import com.example.model.entity.contract.Contract;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends PagingAndSortingRepository<Contract,Integer> {
}

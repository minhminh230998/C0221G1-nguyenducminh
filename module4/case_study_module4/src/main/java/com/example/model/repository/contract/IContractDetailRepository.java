package com.example.model.repository.contract;

import com.example.model.entity.contract.ContractDetail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface IContractDetailRepository extends PagingAndSortingRepository<ContractDetail,Integer> {
}

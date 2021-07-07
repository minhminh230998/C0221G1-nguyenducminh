package com.example.model.service;

import com.example.model.entity.contract.AttachService;
import com.example.model.entity.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    void saveContractDetail(ContractDetail contractDetail);
    List<AttachService> findAllAttachService();
}

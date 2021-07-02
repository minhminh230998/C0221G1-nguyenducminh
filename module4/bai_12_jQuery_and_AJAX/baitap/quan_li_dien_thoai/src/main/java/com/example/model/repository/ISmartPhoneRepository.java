package com.example.model.repository;

import com.example.model.entity.SmartPhone;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartPhoneRepository extends PagingAndSortingRepository<SmartPhone,Long> {
}

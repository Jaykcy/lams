package com.xhjsj.repository;

import com.xhjsj.domain.AdminInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminInfoRepository extends JpaRepository<AdminInfo, Integer> {
    AdminInfo findByAName(String name);

    AdminInfo findByANumber(String number);
}

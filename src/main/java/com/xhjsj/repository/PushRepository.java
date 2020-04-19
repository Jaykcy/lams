package com.xhjsj.repository;

import com.xhjsj.domain.Push;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface PushRepository extends JpaRepository<Push, Integer> {

}

package com.service.akash.repository;

import com.service.akash.model.UserAk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserAk,String> {


}

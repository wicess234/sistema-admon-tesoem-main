package com.example.controlescolar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.controlescolar.Entity.Spriden;



@Repository
public interface ISpridemRepository extends JpaRepository<Spriden, Long> {
	


}

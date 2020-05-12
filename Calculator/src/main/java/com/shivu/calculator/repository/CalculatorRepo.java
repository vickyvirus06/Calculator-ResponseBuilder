package com.shivu.calculator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivu.calculator.entity.Calculator;

@Repository
public interface CalculatorRepo extends JpaRepository<Calculator, Integer> {
	public List<Calculator> findByOperation(String operation);

}

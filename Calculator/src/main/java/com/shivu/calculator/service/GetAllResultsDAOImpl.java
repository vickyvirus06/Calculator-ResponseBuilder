package com.shivu.calculator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivu.calculator.controller.response.AllResultResponse;
import com.shivu.calculator.dao.GetAllResultsDAO;
import com.shivu.calculator.entity.Calculator;
import com.shivu.calculator.repository.CalculatorRepo;

@Service
public class GetAllResultsDAOImpl implements GetAllResultsDAO {
	
	@Autowired
	private CalculatorRepo calculatorRepo;

	@Override
	public AllResultResponse getAllResults(String operation) {
		 
		List<Calculator> allResults = calculatorRepo.findByOperation(operation);
		return new AllResultResponse().getAllOperationResult(allResults);
	}

}

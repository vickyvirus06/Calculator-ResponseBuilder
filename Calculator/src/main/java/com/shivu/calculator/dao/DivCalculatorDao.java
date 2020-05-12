package com.shivu.calculator.dao;

import com.shivu.calculator.controller.response.PerformedResultResponse;
import com.shivu.calculator.entity.Calculator;
import com.shivu.calculator.exception.CalculatorException;

public interface DivCalculatorDao {
	
	public PerformedResultResponse divvalue(Calculator calculator) throws CalculatorException;

}

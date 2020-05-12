package com.shivu.calculator.dao;

import com.shivu.calculator.controller.response.PerformedResultResponse;
import com.shivu.calculator.entity.Calculator;
import com.shivu.calculator.exception.CalculatorException;

public interface MulCalculatorDao {
	
	public PerformedResultResponse mulvalue(Calculator calculator) throws CalculatorException;

}

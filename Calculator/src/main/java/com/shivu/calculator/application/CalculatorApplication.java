package com.shivu.calculator.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shivu.calculator.controller.response.AllResultResponse;
import com.shivu.calculator.controller.response.PerformedResultResponse;
import com.shivu.calculator.dao.AddCalculatorDao;
import com.shivu.calculator.dao.DivCalculatorDao;
import com.shivu.calculator.dao.GetAllResultsDAO;
import com.shivu.calculator.dao.MulCalculatorDao;
import com.shivu.calculator.dao.SubCalculatorDao;
import com.shivu.calculator.entity.Calculator;
import com.shivu.calculator.exception.CalculatorException;


@Component
public class CalculatorApplication {

	@Autowired
	private AddCalculatorDao addCalculatorDao;
	
	@Autowired
	private SubCalculatorDao subCalculatorDao;
	
	@Autowired
	private MulCalculatorDao mulCalculatorDao;
	
	@Autowired
	private DivCalculatorDao divCalculatorDao;
	
	@Autowired
	private GetAllResultsDAO   getAllResultsDao;
	
	
	public PerformedResultResponse getResult(Calculator calculator) throws CalculatorException
	{
		if(calculator.getOperation().toLowerCase().equals("add"))
		{
			return addCalculatorDao.addValue(calculator);
		}
		else if(calculator.getOperation().toLowerCase().equals("sub"))
		{
			return subCalculatorDao.subvalue(calculator);
		}
		else if(calculator.getOperation().toLowerCase().equals("mul"))
		{
			return mulCalculatorDao.mulvalue(calculator);
		}
		else if(calculator.getOperation().toLowerCase().equals("div"))
		{
			return divCalculatorDao.divvalue(calculator);
		}
		return null;
	}


	public AllResultResponse getAllResults(String operation) {
		 System.out.println(getAllResultsDao.getAllResults("Hii"+operation));
		return getAllResultsDao.getAllResults(operation);
	}
}

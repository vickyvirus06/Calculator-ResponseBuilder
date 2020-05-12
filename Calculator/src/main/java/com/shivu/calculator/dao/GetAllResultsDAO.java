package com.shivu.calculator.dao;

import com.shivu.calculator.controller.response.AllResultResponse;

public interface GetAllResultsDAO {

	public AllResultResponse getAllResults(String operation);
}

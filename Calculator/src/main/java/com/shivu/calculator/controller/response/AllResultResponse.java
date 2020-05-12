package com.shivu.calculator.controller.response;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.shivu.calculator.controller.response.PerformedResultResponse.GetResultResponse;
import com.shivu.calculator.entity.Calculator;

@Component
public class AllResultResponse {
	
	private List<GetResultResponse> getAllResultResponse;
	
	public void setGetAllResultResponse(List<GetResultResponse> getAllResultResponse) {
		this.getAllResultResponse = getAllResultResponse;
	}

	

	public List<GetResultResponse> getGetAllResultResponse() {
		return getAllResultResponse;
	}
	
	public AllResultResponse getAllOperationResult(List<Calculator> allData)
	{
		getAllResultResponse = allData.stream().map
		(alldata->new GetResultResponse(alldata.getNumber1(),alldata.getNumber2(),alldata.getOperation(),alldata.getResult())).
		collect(Collectors.toList());
		AllResultResponse resultResponse = new AllResultResponse();
		resultResponse.setGetAllResultResponse(getAllResultResponse);
		
		return resultResponse;
		
		
	}
	
	
}

package com.shivu.calculator.controller.response;


import com.shivu.calculator.entity.Calculator;

public class PerformedResultResponse {
	
	private GetResultResponse getPerformedResult;
	
	public GetResultResponse getGetPerformedResult() {
		return getPerformedResult;
	}
	
	public void setGetPerformedResult(GetResultResponse getPerformedResult) {
		this.getPerformedResult = getPerformedResult;
	}
	
	static class GetResultResponse
	{
		private float number1;
		private float number2;
		private String operation;
		private float result;
		
		public GetResultResponse(float number1, float number2, String operation,float result) {
			this.number1 = number1;
			this.number2 = number2;
			this.operation = operation;
			this.result = result;
		}

		
		public float getNumber1() {
			return number1;
		}


		public void setNumber1(float number1) {
			this.number1 = number1;
		}


		public float getNumber2() {
			return number2;
		}


		public void setNumber2(float number2) {
			this.number2 = number2;
		}


		public String getOperation() {
			return operation;
		}


		public void setOperation(String operation) {
			this.operation = operation;
		}


		public float getResult() {
			return result;
		}


		public void setResult(float result) {
			this.result = result;
		}




	}
	public PerformedResultResponse getPerformedOperation(Calculator calculator)
	{
		GetResultResponse getResultResponse = new GetResultResponse(calculator.getNumber1(), calculator.getNumber2(), calculator.getOperation(),calculator.getResult());
		PerformedResultResponse resultResponse = new PerformedResultResponse();
		resultResponse.setGetPerformedResult(getResultResponse);
		return resultResponse;
	}

}

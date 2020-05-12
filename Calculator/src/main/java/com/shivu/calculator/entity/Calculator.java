package com.shivu.calculator.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calculator_master")
public class Calculator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private float number1;
	private float number2;
	private String operation;
	private float result;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Calculator [id=" + id + ", number1=" + number1 + ", number2=" + number2 + ", operation=" + operation
				+ ", result=" + result + "]";
	}
	
	
	
	
	
}

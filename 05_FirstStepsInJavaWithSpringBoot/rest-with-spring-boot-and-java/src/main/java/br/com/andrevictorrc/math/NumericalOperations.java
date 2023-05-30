package br.com.andrevictorrc.math;

public class NumericalOperations {
	
	
	public NumericalOperations() {
		
	}
	
	public Double SumOperation(Double firstNumber, Double secondNumber) {
		
		return firstNumber + secondNumber;
	}
	
	public Double SubtractionOperation(Double firstNumber, Double secondNumber) {

		return firstNumber - secondNumber;
	}
	
	public Double DivisionOperation(Double firstNumber, Double secondNumber) {
		
		return firstNumber / secondNumber;
	}
	
	public Double MultiplicationOperation(Double firstNumber, Double secondNumber) {
		
		return firstNumber * secondNumber;		
	}
	
	public Double MeanOperation(Double firstNumber, Double secondNumber) {
		
		return (firstNumber + secondNumber) / 2;		
	}
	
	public Double squareRootOperation(Double number) {
		
		return Math.sqrt(number);		
	}
	
}

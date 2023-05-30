package br.com.andrevictorrc.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.andrevictorrc.converters.NumberConverter;
import br.com.andrevictorrc.exceptions.UnsuportedMathOperationException;
import br.com.andrevictorrc.math.NumericalOperations;

@RestController
public class MathController {
	
	private NumericalOperations result = new NumericalOperations();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		
		return result.SumOperation(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double subtraction(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		
		return result.SubtractionOperation(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double multiplication(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		
		return result.MultiplicationOperation(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double division(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		
		return result.DivisionOperation(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double mean(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		
		return result.MeanOperation(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
	public double squareRoot(@PathVariable(value = "number") String number) throws Exception {
		
		if(!NumberConverter.isNumeric(number)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		
		return result.squareRootOperation(NumberConverter.convertToDouble(number));
	}
	
}

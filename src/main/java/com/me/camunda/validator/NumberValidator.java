package com.me.camunda.validator;

import java.util.Map;

import org.camunda.bpm.engine.impl.form.validator.FormFieldValidator;
import org.camunda.bpm.engine.impl.form.validator.FormFieldValidatorContext;

public class NumberValidator implements FormFieldValidator {
	
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 10;

	@Override
	public boolean validate(Object submittedValue, FormFieldValidatorContext validatorContext) {
		Map<String, Object> submittedValues = validatorContext.getSubmittedValues();
		for (Map.Entry<String, Object> entry : submittedValues.entrySet()) {
			if (isValidNumber((Long) submittedValues.get(entry))) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isValidNumber(Long value) {
		boolean isValid = false;
		if(value >= MIN_NUMBER && value <= MAX_NUMBER) {
			isValid = true;
		}
		return isValid;
	}
	
}

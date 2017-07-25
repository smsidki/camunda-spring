package com.me.camunda.validator;

import java.util.Map;

import org.camunda.bpm.engine.impl.form.validator.FormFieldValidator;
import org.camunda.bpm.engine.impl.form.validator.FormFieldValidatorContext;

public class StringValidator implements FormFieldValidator {
	
	private static final int MIN_LENGTH = 4;
	private static final int MAX_LENGTH = 16;

	@Override
	public boolean validate(Object submittedValue, FormFieldValidatorContext validatorContext) {
		Map<String,Object> submittedValues = validatorContext.getSubmittedValues();
		for(Map.Entry<String,Object> entry : submittedValues.entrySet()) {
			if(entry.getValue() instanceof String && !isValidText((String) entry.getValue())) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isValidText(String value) {
		boolean isValid = false;
		if(value.length() >= MIN_LENGTH && value.length() <= MAX_LENGTH) {
			isValid = true;
		}
		return isValid;
	}
	
}

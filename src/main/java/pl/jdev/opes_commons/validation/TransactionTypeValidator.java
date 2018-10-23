package pl.jdev.opes_commons.validation;

import pl.jdev.opes_commons.domain.transaction.TransactionType;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class TransactionTypeValidator implements ConstraintValidator<SupportedTransactionType, TransactionType> {
    @Override
    public void initialize(SupportedTransactionType constraintAnnotation) {
    }

    @Override
    public boolean isValid(TransactionType value, ConstraintValidatorContext context) {
        return value != null && Arrays.asList(TransactionType.values()).contains(value.toString());
    }
}

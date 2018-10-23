package pl.jdev.opes_commons.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class InstrumentValidator
        implements ConstraintValidator<SupportedInstrument, pl.jdev.opes_commons.domain.instrument.Instrument> {
    @Override
    public void initialize(SupportedInstrument constraintAnnotation) {
    }

    @Override
    public boolean isValid(pl.jdev.opes_commons.domain.instrument.Instrument value,
                           ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        if (!isMatchingInstrumentPattern(value)) {
            return false;
        }
        if (!hasSupportedCurrencyCodes(value)) {
            return false;
        }
        return true;
    }

    private boolean hasSupportedCurrencyCodes(pl.jdev.opes_commons.domain.instrument.Instrument value) {
        // TODO impl
        return true;
    }

    private boolean isMatchingInstrumentPattern(pl.jdev.opes_commons.domain.instrument.Instrument value) {
        // TODO impl
        return true;
    }
}

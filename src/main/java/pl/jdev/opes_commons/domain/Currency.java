package pl.jdev.opes_commons.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Currency {

    @Autowired
    private final CurrencyEnum currencyEnum;

    public Currency(String currencyCode) {
        currencyEnum = CurrencyEnum.valueOf(currencyCode.toUpperCase());
    }

    @Override
    public String toString() {
        return currencyEnum.name();
    }

}

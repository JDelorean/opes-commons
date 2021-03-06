package pl.jdev.opes_commons.rest.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(onConstructor = @__({@JsonCreator}))
public class CreateOrderAction implements Action {
    private String accountId;
    private String extAccountId;
    private String tradeId;
    private String extTradeId;
}

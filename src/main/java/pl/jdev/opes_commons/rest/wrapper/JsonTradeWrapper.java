package pl.jdev.opes_commons.rest.wrapper;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Data;
import pl.jdev.opes_commons.domain.trade.Trade;

@Data
@AllArgsConstructor(staticName = "payloadOf", onConstructor = @__({@JsonCreator}))
public class JsonTradeWrapper {
    private Trade trade;
}

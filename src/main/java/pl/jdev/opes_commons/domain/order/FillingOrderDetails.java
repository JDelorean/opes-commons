package pl.jdev.opes_commons.domain.order;

import lombok.Builder;
import lombok.Data;
import pl.jdev.opes_commons.domain.ClientExtensions;

import java.util.Date;

@Data
@Builder
public class FillingOrderDetails {
    private String price;
    private TimeInForce timeInForce;
    private Date gtdTime;
    private ClientExtensions clientExtensions;
}
package pl.jdev.opes_commons.domain.pricing;

import com.fasterxml.jackson.annotation.JsonProperty;

@Deprecated
enum PriceStatus {
    @JsonProperty("tradeable")
    TRADEABLE,
    @JsonProperty("non-tradeable")
    NON_TRADABLE,
    @JsonProperty("invalid")
    INVALID;
}
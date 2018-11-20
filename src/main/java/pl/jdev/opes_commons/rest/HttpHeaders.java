package pl.jdev.opes_commons.rest;

import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;

public class HttpHeaders extends org.springframework.http.HttpHeaders {
    public static final String DATA_TYPE = "Data-Type";
    public static final String EVENT_TYPE = "Event-Type";

    public void setDataType(@Nullable String dataType) {
        if (dataType != null) {
            set(DATA_TYPE, dataType);
        } else {
            set(DATA_TYPE, null);
        }
    }

    @Nullable
    public String getDataType() {
        String value = getFirst(DATA_TYPE);
        return (StringUtils.hasLength(value) ? value : null);
    }

    public void setEventType(@Nullable String eventType) {
        if (eventType != null) {
            set(EVENT_TYPE, eventType);
        } else {
            set(EVENT_TYPE, null);
        }
    }

    @Nullable
    public String getEventType() {
        String value = getFirst(EVENT_TYPE);
        return (StringUtils.hasLength(value) ? value : null);
    }
}
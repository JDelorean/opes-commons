package pl.jdev.opes_commons.rest.message.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(staticName = "payloadOf", onConstructor = @__({@JsonCreator}))
public class JsonTransactionRerouteWrapper {
    private String from;
    private String to;
    private int pageSize;
    private int count;
    private List<String> pages;
}
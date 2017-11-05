package com.example.greeterstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "greeter")
@Data
public class GreeterProperties {
    private static final String NAME = "Cherprang";
    private static final String GROUPNAME = "BNK48";

    private String name = NAME;
    private String groupName = GROUPNAME;
}

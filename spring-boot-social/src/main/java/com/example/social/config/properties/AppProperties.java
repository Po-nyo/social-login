package com.example.social.config.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private String tokenSecret;
    private long tokenExpiry;
    private long refreshTokenExpiry;
    private List<String> oAuth2RedirectUris;
}

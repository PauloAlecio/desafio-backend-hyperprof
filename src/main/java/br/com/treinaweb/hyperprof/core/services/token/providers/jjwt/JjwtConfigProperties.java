package br.com.treinaweb.hyperprof.core.services.token.providers.jjwt;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "br.com.treinaweb.hyperprof.core.services.token.jjwt")
public class JjwtConfigProperties {

    private String accessTokenSigingKey;
    private Long accessTokenExpirationInSeconds;
    private String refreshTokenSigingKey;
    private Long refreshTokenExpirationInSeconds;

}

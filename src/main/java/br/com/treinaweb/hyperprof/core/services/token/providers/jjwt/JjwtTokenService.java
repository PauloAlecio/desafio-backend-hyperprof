package br.com.treinaweb.hyperprof.core.services.token.providers.jjwt;

import br.com.treinaweb.hyperprof.core.services.token.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JjwtTokenService implements TokenService {

    private final JjwtConfigProperties configProperties;
    @Override
    public String gerarAccessToken ( String subject ) {
        return null;
    }

    @Override
    public String getSubjectDoAccessToken ( String accessToken ) {
        return null;
    }

    @Override
    public String gerarRefreshToken ( String subject ) {
        return null;
    }

    @Override
    public String getSubjectDoRefreshToken ( String refreshToken ) {
        return null;
    }

    @Override
    public void invalidarTokens ( String... tokens ) {

    }
}

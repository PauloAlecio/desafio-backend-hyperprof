package br.com.treinaweb.hyperprof.core.repositories;

import br.com.treinaweb.hyperprof.core.models.TokenInvalido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenInvalidoRepository extends
    JpaRepository<TokenInvalido, Long>
{

    boolean existsByToken(String token);

}

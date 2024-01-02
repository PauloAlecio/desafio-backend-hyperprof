package br.com.treinaweb.hyperprof.core.repositories;

import br.com.treinaweb.hyperprof.core.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProfessorRepository extends JpaRepository<Professor,Long>
{
    List<Professor> findByDescricaoContaining(String descricao);

    Optional<Professor> findByEmail(String email);
    boolean existsByEmail(String email);
}

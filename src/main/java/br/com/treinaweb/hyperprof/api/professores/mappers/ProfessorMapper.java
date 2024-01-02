package br.com.treinaweb.hyperprof.api.professores.mappers;

import br.com.treinaweb.hyperprof.api.professores.dtos.ProfessorRequest;
import br.com.treinaweb.hyperprof.api.professores.dtos.ProfessorResponse;
import br.com.treinaweb.hyperprof.core.models.Professor;

public interface ProfessorMapper
{
    ProfessorResponse toProfessorResponse( Professor professor);
    Professor toProfessor( ProfessorRequest professorRequest);
}

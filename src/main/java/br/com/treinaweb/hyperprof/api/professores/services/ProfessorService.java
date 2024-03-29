package br.com.treinaweb.hyperprof.api.professores.services;

import br.com.treinaweb.hyperprof.api.professores.dtos.ProfessorRequest;
import br.com.treinaweb.hyperprof.api.professores.dtos.ProfessorResponse;

import java.util.List;

public interface ProfessorService
{
    List<ProfessorResponse> buscarProfessores(String descricao);
    ProfessorResponse buscarProfessorPorId(Long professorId);

    ProfessorResponse cadastrarProfessor( ProfessorRequest professorRequest);

    ProfessorResponse atualizarProfessorLogado(ProfessorRequest professorRequest);
}

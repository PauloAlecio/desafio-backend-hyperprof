package br.com.treinaweb.hyperprof.api.alunos.controllers;

import br.com.treinaweb.hyperprof.api.alunos.dtos.AlunoRequest;
import br.com.treinaweb.hyperprof.api.alunos.dtos.AlunoResponse;
import br.com.treinaweb.hyperprof.api.alunos.services.AlunoService;
import br.com.treinaweb.hyperprof.api.commons.routes.ApiRoutes;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AlunoRestController {

    private final AlunoService alunoService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(ApiRoutes.CADASTRAR_ALUNO)
    public AlunoResponse cadastrarAluno(
        @RequestBody
        @Valid
        AlunoRequest alunoRequest,
        @PathVariable
        Long professorId
    ) {
        return alunoService.cadastrarAluno(alunoRequest, professorId);
    }



}
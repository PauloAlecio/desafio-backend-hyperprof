package br.com.treinaweb.hyperprof.api.professores.controllers;

import br.com.treinaweb.hyperprof.api.commons.routes.ApiRoutes;
import br.com.treinaweb.hyperprof.api.professores.dtos.ProfessorResponse;
import br.com.treinaweb.hyperprof.api.professores.services.MeService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MeRestController {

    private final MeService meService;

    @PreAuthorize("isAuthenticated()")
    @GetMapping(ApiRoutes.PROFESSOR_LOGADO)
    public ProfessorResponse buscarProfessorLogado() {
        return meService.buscarProfessorLogado();
    }

}
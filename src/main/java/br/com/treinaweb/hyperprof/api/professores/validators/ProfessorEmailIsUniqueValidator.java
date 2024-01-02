package br.com.treinaweb.hyperprof.api.professores.validators;

import br.com.treinaweb.hyperprof.core.repositories.ProfessorRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProfessorEmailIsUniqueValidator implements
    ConstraintValidator<ProfessorEmailIsUnique, String>
{

    private final ProfessorRepository professorRepository;

    @Override
    @SuppressWarnings("null")
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        return !professorRepository.existsByEmail(value);
    }

}
package ru.mycompany.phrase.domain.api;

import lombok.*;
import org.springframework.validation.annotation.Validated;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class RegistrationReq {

    @NotNull(message = "authorization должен быть заполнен")
    @Valid
    private AuthorizationReq authorizationReq;


}

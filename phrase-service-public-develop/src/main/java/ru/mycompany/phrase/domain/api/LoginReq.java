package ru.mycompany.phrase.domain.api;

import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class LoginReq {

    @NotNull(message = "authorization должен быть заполнен")
    private AuthorizationReq authorizationReq;
}

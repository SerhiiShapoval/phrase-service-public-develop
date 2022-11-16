package ru.mycompany.phrase.domain.api;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class LoginResp {

    private String accessToken;
}

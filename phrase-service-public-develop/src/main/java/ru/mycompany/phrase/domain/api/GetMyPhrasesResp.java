package ru.mycompany.phrase.domain.api;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class GetMyPhrasesResp {

    private List<PhraseResp> phrases;
}

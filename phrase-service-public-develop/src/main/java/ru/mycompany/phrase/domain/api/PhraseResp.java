package ru.mycompany.phrase.domain.api;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PhraseResp {

    private long id;
    private String text;
    private String timeInsert;
    private List<String> tags;
}

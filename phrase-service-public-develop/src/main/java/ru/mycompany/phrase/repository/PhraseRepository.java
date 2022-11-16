package ru.mycompany.phrase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mycompany.phrase.domain.entity.Phrase;

public interface PhraseRepository extends JpaRepository <Phrase,Long>{

}

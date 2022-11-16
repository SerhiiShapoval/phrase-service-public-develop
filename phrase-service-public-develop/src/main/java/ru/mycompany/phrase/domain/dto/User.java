package ru.mycompany.phrase.domain.dto;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    private String nickname;
    @Column(name = "password")
    private String encryptPassword;
    @Column(name = "access_token")
    private String accessToken;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}

package ru.mycompany.phrase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import ru.mycompany.phrase.domain.dto.User;

import javax.crypto.spec.OAEPParameterSpec;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{
    boolean existsByNickname(String nickname);


    User findUserByNicknameAndEncryptPassword(String nickname,String password);
    User findUserByAccessToken (String accessToken);

}

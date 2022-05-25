package com.example.social.api.repository;

import com.example.social.api.entity.UserRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRefreshTokenRepository extends JpaRepository<UserRefreshToken, Long> {

    UserRefreshToken findByUsername(String username);
    UserRefreshToken findByUsernameAndRefreshToken(String username, String refreshToken);
}

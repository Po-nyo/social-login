package com.example.social.api.repository;

import com.example.social.api.entity.User;
import com.example.social.oauth.entity.ProviderType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByUsernameAndProviderType(String username, ProviderType providerType);
}

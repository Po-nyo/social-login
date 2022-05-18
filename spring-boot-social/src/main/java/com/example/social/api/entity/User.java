package com.example.social.api.entity;

import com.example.social.oauth.entity.ProviderType;
import com.example.social.oauth.entity.RoleType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String email;
    private String name;
    private String password;
    private String profileImageUrl;

    @Enumerated(EnumType.STRING)
    private ProviderType providerType;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}

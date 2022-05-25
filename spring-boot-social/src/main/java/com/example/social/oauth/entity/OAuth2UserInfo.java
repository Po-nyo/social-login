package com.example.social.oauth.entity;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class OAuth2UserInfo {
    protected ProviderType providerType;
    protected Map<String, Object> attributes;

    public String getId() {
        switch (providerType) {
            case GOOGLE:
                return (String) attributes.get("sub");
            case FACEBOOK:
                return (String) attributes.get("id");
        }
        return null;
    }

    public String getName() {
        switch (providerType) {
            case GOOGLE:
            case FACEBOOK:
                return (String) attributes.get("name");
        }
        return null;
    }

    public String getEmail() {
        switch (providerType) {
            case GOOGLE:
            case FACEBOOK:
                return (String) attributes.get("email");
        }
        return null;
    }

    public String getImageUrl() {
        switch (providerType) {
            case GOOGLE:
                return (String) attributes.get("picture");
            case FACEBOOK:
                return (String) attributes.get("imageUrl");
        }
        return null;
    }
}

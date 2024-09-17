package api.banap.domain.entities.auth;

import api.banap.domain.AggregateRoot;

import java.time.Instant;

public class Token extends AggregateRoot<TokenID> {

    private String token;
    private String refreshToken;
    private Instant createdAt;

    private Token(TokenID tokenID, final String token,final String refreshToken, final Instant createdAt) {
        super(tokenID);
        this.token = token;
        this.refreshToken = refreshToken;
        this.createdAt = createdAt;
    }

    public static Token newToken(final String token, final String refreshToken) {
        final TokenID anId = TokenID.unique();
        final Instant createdAt = Instant.now();
        return new Token(anId, token, refreshToken, createdAt);
    }

    public String getToken() {
        return token;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}

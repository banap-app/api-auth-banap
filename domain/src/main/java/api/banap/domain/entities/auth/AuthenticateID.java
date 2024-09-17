package api.banap.domain.entities.auth;

import api.banap.domain.Identifier;

import java.util.Objects;
import java.util.UUID;

public class AuthenticateID extends Identifier {

    private final String value;

    private AuthenticateID(final String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String getValue() {
        return value;
    }

    public static AuthenticateID unique() {
        return AuthenticateID.from(UUID.randomUUID().toString().toLowerCase());
    }

    public static AuthenticateID from(final String anId) {
        return new AuthenticateID(anId);
    }
}

package api.banap.domain.entities.auth;

import api.banap.domain.Identifier;

import java.util.Objects;
import java.util.UUID;

public class TokenID extends Identifier {

    private final String value;

    private TokenID(final String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String getValue() {
        return value;
    }

    public static TokenID unique(){
        return TokenID.from(UUID.randomUUID().toString().toLowerCase());
    }

    public static TokenID from(final String anId) {
        return new TokenID(anId);
    }


}

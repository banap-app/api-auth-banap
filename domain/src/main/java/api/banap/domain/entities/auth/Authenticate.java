package api.banap.domain.entities.auth;

import api.banap.domain.AggregateRoot;

public class Authenticate extends AggregateRoot<AuthenticateID> {

    private final String username;
    private final String email;

    protected Authenticate(AuthenticateID authenticateID) {
        super(authenticateID);
    }
}

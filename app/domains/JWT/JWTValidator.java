package domains.JWT;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.typesafe.config.Config;
import play.Logger;
import play.libs.F;

import javax.inject.Inject;
import java.io.UnsupportedEncodingException;

public class JWTValidator {

    public enum Error {
        ERR_INVALID_SIGNATURE_OR_CLAIM
    }

    private String secret;
    private JWTVerifier verifier;

    @Inject
    public JWTValidator(Config config) throws UnsupportedEncodingException {
        this.secret = config.getString("play.http.secret.key");

        Algorithm algorithm = Algorithm.HMAC256(secret);
        verifier = JWT.require(algorithm)
                .withIssuer("ThePlayApp")
                .build();
    }

    public F.Either<Error, VerifiedJWT> verify(String token) {
        try {
            DecodedJWT jwt = verifier.verify(token);
            VerifiedJWT verifiedJwt = new VerifiedJWT(jwt);
            return F.Either.Right(verifiedJwt);
        } catch (JWTVerificationException exception) {
            // Invalid signature/claims
            Logger.error("f=JwtValidatorImpl, event=verify, exception=JWTVerificationException, msg={}",
                    exception.getMessage());
            return F.Either.Left(Error.ERR_INVALID_SIGNATURE_OR_CLAIM);
        }
    }
}

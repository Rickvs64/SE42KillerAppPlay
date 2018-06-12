package domains.JWT;

import play.Logger;
import play.libs.F;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.Optional;
import java.util.function.Function;

import static play.mvc.Results.forbidden;

public class JWTControllerHelper {

    private static final String HEADER_AUTHORIZATION = "Authorization";
    private static final String BEARER = "Bearer ";
    private static final String ERR_AUTHORIZATION_HEADER = "ERR_AUTHORIZATION_HEADER";
    private JWTValidator jwtValidator;

    @Inject
    public JWTControllerHelper(JWTValidator jwtValidator) {
        this.jwtValidator = jwtValidator;
    }

    public Result verify(Http.Request request, Function<F.Either<JWTValidator.Error, VerifiedJWT>, Result> f) {
        Optional<String> authHeader =  request.getHeaders().get(HEADER_AUTHORIZATION);

        if (!authHeader.filter(ah -> ah.contains(BEARER)).isPresent()) {
            Logger.error("f=JWTControllerHelper, event=verify, error=authHeaderNotPresent");
            return forbidden(ERR_AUTHORIZATION_HEADER);
        }

        String token = authHeader.map(ah -> ah.replace(BEARER, "")).orElse("");
        return f.apply(jwtValidator.verify(token));
    }
}

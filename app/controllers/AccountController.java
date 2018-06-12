package controllers;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.typesafe.config.Config;
import domains.Account;
import domains.JWT.JWTControllerHelper;
import domains.JWT.VerifiedJWT;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.IAccountRepo;
import repositories.SQLAccountRepo;

import javax.inject.Inject;
import java.io.UnsupportedEncodingException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;


public class AccountController extends Controller {

    @Inject
    private JWTControllerHelper jwtControllerHelper;

    @Inject
    private Config config;

    IAccountRepo accountRepo = new SQLAccountRepo();

    public Result getAllAccounts() {
        return ok(Json.toJson(accountRepo.getAllAccounts()));
    }

    public Result getAccountById(Long id) {
        return ok(Json.toJson(accountRepo.getAccountById(id)));
    }

    public Result deleteAccount(Long id) {
        if (accountRepo.deleteAccount(accountRepo.getAccountById(id))) {
            return ok(Json.toJson("Successfully deleted!"));
        }
        else {
            return ok(Json.toJson("Nope. That failed."));
        }
    }

    // POST
    public Result addAccount() {
        Account acc = new Account();
        JsonNode json = request().body().asJson();
        acc.setEmail(json.findPath("email").textValue());
        acc.setPassword(json.findPath("password").textValue());
        accountRepo.addAccount(acc);
        return ok(Json.toJson(acc.getEmail() + " has been successfully created."));
    }

    // PUT
    public Result updateAccount(Long id) {
        Account acc = new Account();
        acc.setId(id);
        JsonNode json = request().body().asJson();
        acc.setEmail(json.findPath("email").textValue());
        acc.setPassword(json.findPath("password").textValue());
        accountRepo.updateAccount(acc);
        return ok(Json.toJson(acc));
    }

    // POST, requires JWT
    public Result addAccountJWT() {
        return jwtControllerHelper.verify(request(), res -> {
            if (res.left.isPresent()) {
                return forbidden(res.left.get().toString());
            }

            VerifiedJWT verifiedJwt = res.right.get();
            Logger.debug("{}", verifiedJwt);

            Account acc = new Account();
            JsonNode json = request().body().asJson();
            acc.setEmail(json.findPath("email").textValue());
            acc.setPassword(json.findPath("password").textValue());
            accountRepo.addAccount(acc);
            return ok(Json.toJson(acc.getEmail() + " has been successfully created. Your JWT was considered valid."));
        });
    }

    // GET
    public Result getToken(Long userId) throws UnsupportedEncodingException {
        JsonNode body = request().body().asJson();

        return ok(getSignedToken(userId));
   ,. }

    /**
     * Creates a signed token that expires automatically after 10 minutes.
     * @param userId
     * @return
     * @throws UnsupportedEncodingException
     */
    private String getSignedToken(Long userId) throws UnsupportedEncodingException {
        String secret = config.getString("play.http.secret.key");

        Algorithm algorithm = Algorithm.HMAC256(secret);
        return JWT.create()
                .withIssuer("ThePlayApp")
                .withClaim("user_id", userId)
                .withExpiresAt(Date.from(ZonedDateTime.now(ZoneId.systemDefault()).plusMinutes(10).toInstant()))
                .sign(algorithm);
    }

}

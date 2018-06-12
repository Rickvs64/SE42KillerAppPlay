package domains.JWT;

import com.auth0.jwt.interfaces.DecodedJWT;
import play.libs.Json;

import java.util.Date;

public class VerifiedJWT {
    private String header;
    private String payload;
    private String issuer;
    private Long userId;
    private Date expiresAt;

    public VerifiedJWT(DecodedJWT decodedJWT) {
        this.header = decodedJWT.getHeader();
        this.payload = decodedJWT.getPayload();
        this.issuer = decodedJWT.getIssuer();
        this.expiresAt = decodedJWT.getExpiresAt();
        this.userId = decodedJWT.getClaim("user_id").asLong();
    }

    public String getHeader() {
        return header;
    }

    public String getPayload() {
        return payload;
    }

    public String getIssuer() {
        return issuer;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public String toString() {
        return Json.toJson(this).toString();
    }
}

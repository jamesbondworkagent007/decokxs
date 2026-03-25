package com.reown.android.verify.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class VerifyServerPublicKey {
    public final long expiresAt;
    public final JWK jwk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifyServerPublicKey copy$default(VerifyServerPublicKey verifyServerPublicKey, JWK jwk, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            jwk = verifyServerPublicKey.jwk;
        }
        if ((i & 2) != 0) {
            j = verifyServerPublicKey.expiresAt;
        }
        return verifyServerPublicKey.copy(jwk, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JWK component1() {
        return this.jwk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.expiresAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifyServerPublicKey copy(@Json(name = "publicKey") @NotNull JWK jwk, @Json(name = "expiresAt") long j) {
        Intrinsics.checkNotNullParameter(jwk, "");
        return new VerifyServerPublicKey(jwk, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyServerPublicKey)) {
            return false;
        }
        VerifyServerPublicKey verifyServerPublicKey = (VerifyServerPublicKey) obj;
        return Intrinsics.EZpvd(this.jwk, verifyServerPublicKey.jwk) && this.expiresAt == verifyServerPublicKey.expiresAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JWK getJwk() {
        return this.jwk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.jwk.hashCode() * 31) + Long.hashCode(this.expiresAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyServerPublicKey(jwk=" + this.jwk + ", expiresAt=" + this.expiresAt + ")";
    }

    public VerifyServerPublicKey(@Json(name = "publicKey") @NotNull JWK jwk, @Json(name = "expiresAt") long j) {
        Intrinsics.checkNotNullParameter(jwk, "");
        this.jwk = jwk;
        this.expiresAt = j;
    }
}

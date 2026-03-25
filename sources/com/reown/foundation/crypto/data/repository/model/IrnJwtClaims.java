package com.reown.foundation.crypto.data.repository.model;

import com.reown.foundation.util.jwt.JwtClaims;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class IrnJwtClaims implements JwtClaims {
    private final String audience;
    private final long expiration;
    private final long issuedAt;
    private final String issuer;
    private final String subject;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IrnJwtClaims copy$default(IrnJwtClaims irnJwtClaims, String str, String str2, String str3, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = irnJwtClaims.issuer;
        }
        if ((i & 2) != 0) {
            str2 = irnJwtClaims.subject;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = irnJwtClaims.audience;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = irnJwtClaims.issuedAt;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = irnJwtClaims.expiration;
        }
        return irnJwtClaims.copy(str, str4, str5, j3, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.issuer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.subject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.audience;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.issuedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IrnJwtClaims copy(@Json(name = "iss") @NotNull String str, @Json(name = "sub") @NotNull String str2, @Json(name = "aud") @NotNull String str3, @Json(name = "iat") long j, @Json(name = "exp") long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new IrnJwtClaims(str, str2, str3, j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IrnJwtClaims)) {
            return false;
        }
        IrnJwtClaims irnJwtClaims = (IrnJwtClaims) obj;
        return Intrinsics.EZpvd((Object) this.issuer, (Object) irnJwtClaims.issuer) && Intrinsics.EZpvd((Object) this.subject, (Object) irnJwtClaims.subject) && Intrinsics.EZpvd((Object) this.audience, (Object) irnJwtClaims.audience) && this.issuedAt == irnJwtClaims.issuedAt && this.expiration == irnJwtClaims.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAudience() {
        return this.audience;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getIssuedAt() {
        return this.issuedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.foundation.util.jwt.JwtClaims
    public String getIssuer() {
        return this.issuer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubject() {
        return this.subject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.issuer.hashCode() * 31) + this.subject.hashCode()) * 31) + this.audience.hashCode()) * 31) + Long.hashCode(this.issuedAt)) * 31) + Long.hashCode(this.expiration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IrnJwtClaims(issuer=" + this.issuer + ", subject=" + this.subject + ", audience=" + this.audience + ", issuedAt=" + this.issuedAt + ", expiration=" + this.expiration + ")";
    }

    public IrnJwtClaims(@Json(name = "iss") @NotNull String str, @Json(name = "sub") @NotNull String str2, @Json(name = "aud") @NotNull String str3, @Json(name = "iat") long j, @Json(name = "exp") long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.issuer = str;
        this.subject = str2;
        this.audience = str3;
        this.issuedAt = j;
        this.expiration = j2;
    }
}

package com.reown.android.internal.common.jwt.did;

import com.reown.android.internal.common.jwt.did.EncodeDidJwtPayloadUseCase;
import com.reown.foundation.util.jwt.JwtClaims;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class EncodeIdentityKeyDidJwtPayloadUseCase implements EncodeDidJwtPayloadUseCase<IdentityKey> {
    public final String accountId;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.reown.android.internal.common.jwt.did.EncodeIdentityKeyDidJwtPayloadUseCase.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ EncodeIdentityKeyDidJwtPayloadUseCase(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public EncodeIdentityKeyDidJwtPayloadUseCase(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Lcom/reown/android/internal/common/jwt/did/EncodeDidJwtPayloadUseCase$Params;)Lcom/reown/foundation/util/jwt/JwtClaims; */
    @Override // com.reown.android.internal.common.jwt.did.EncodeDidJwtPayloadUseCase
    public IdentityKey invoke(@NotNull EncodeDidJwtPayloadUseCase.Params params) {
        Intrinsics.checkNotNullParameter(params, "");
        return new IdentityKey(params.getIssuer(), params.getKeyserverUrl(), params.getIssuedAt(), params.getExpiration(), JwtUtilsKt.encodeDidPkh(this.accountId), null, 32, null);
    }

    /* JADX INFO: loaded from: classes24.dex */
    @JsonClass(generateAdapter = true)
    public static final class IdentityKey implements JwtClaims {
        public final String act;
        public final String audience;
        public final long expiration;
        public final long issuedAt;
        public final String issuer;
        public final String pkh;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.issuer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.audience;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component3() {
            return this.issuedAt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component4() {
            return this.expiration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.pkh;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.act;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IdentityKey copy(@Json(name = "iss") @NotNull String str, @Json(name = "aud") @NotNull String str2, @Json(name = "iat") long j, @Json(name = "exp") long j2, @Json(name = JwtUtilsKt.DID_METHOD_PKH) @NotNull String str3, @Json(name = "act") @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new IdentityKey(str, str2, j, j2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdentityKey)) {
                return false;
            }
            IdentityKey identityKey = (IdentityKey) obj;
            return Intrinsics.EZpvd((Object) this.issuer, (Object) identityKey.issuer) && Intrinsics.EZpvd((Object) this.audience, (Object) identityKey.audience) && this.issuedAt == identityKey.issuedAt && this.expiration == identityKey.expiration && Intrinsics.EZpvd((Object) this.pkh, (Object) identityKey.pkh) && Intrinsics.EZpvd((Object) this.act, (Object) identityKey.act);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAct() {
            return this.act;
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
        public final String getPkh() {
            return this.pkh;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.issuer.hashCode() * 31) + this.audience.hashCode()) * 31) + Long.hashCode(this.issuedAt)) * 31) + Long.hashCode(this.expiration)) * 31) + this.pkh.hashCode()) * 31) + this.act.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "IdentityKey(issuer=" + this.issuer + ", audience=" + this.audience + ", issuedAt=" + this.issuedAt + ", expiration=" + this.expiration + ", pkh=" + this.pkh + ", act=" + this.act + ")";
        }

        public IdentityKey(@Json(name = "iss") @NotNull String str, @Json(name = "aud") @NotNull String str2, @Json(name = "iat") long j, @Json(name = "exp") long j2, @Json(name = JwtUtilsKt.DID_METHOD_PKH) @NotNull String str3, @Json(name = "act") @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.issuer = str;
            this.audience = str2;
            this.issuedAt = j;
            this.expiration = j2;
            this.pkh = str3;
            this.act = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 long)
  (r15v0 long)
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("unregister_identity") : (r18v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String):void (m)] (LINE:24) call: com.reown.android.internal.common.jwt.did.EncodeIdentityKeyDidJwtPayloadUseCase.IdentityKey.<init>(java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ IdentityKey(String str, String str2, long j, long j2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, j, j2, str3, (i & 32) != 0 ? "unregister_identity" : str4);
        }
    }
}

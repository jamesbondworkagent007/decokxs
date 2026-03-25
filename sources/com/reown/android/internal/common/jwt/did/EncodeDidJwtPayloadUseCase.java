package com.reown.android.internal.common.jwt.did;

import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.util.jwt.JwtClaims;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public interface EncodeDidJwtPayloadUseCase<R extends JwtClaims> {
    R invoke(@NotNull Params params);

    public static final class Params {
        public final long expirySourceDuration;
        public final TimeUnit expiryTimeUnit;
        public final Pair<Long, Long> iatAndExp;
        public final String identityPublicKey;
        public final String keyserverUrl;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 long), (r5v0 java.util.concurrent.TimeUnit) A[MD:(java.lang.String, java.lang.String, long, java.util.concurrent.TimeUnit):void (m)] call: com.reown.android.internal.common.jwt.did.EncodeDidJwtPayloadUseCase.Params.<init>(java.lang.String, java.lang.String, long, java.util.concurrent.TimeUnit):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Params(String str, String str2, long j, TimeUnit timeUnit, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, j, timeUnit);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-B2nhYrw$default, reason: not valid java name */
        public static /* synthetic */ Params m7200copyB2nhYrw$default(Params params, String str, String str2, long j, TimeUnit timeUnit, int i, Object obj) {
            if ((i & 1) != 0) {
                str = params.identityPublicKey;
            }
            if ((i & 2) != 0) {
                str2 = params.keyserverUrl;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                j = params.expirySourceDuration;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                timeUnit = params.expiryTimeUnit;
            }
            return params.m7202copyB2nhYrw(str, str3, j2, timeUnit);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: component1-uN_RPug, reason: not valid java name */
        public final String m7201component1uN_RPug() {
            return this.identityPublicKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.keyserverUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component3() {
            return this.expirySourceDuration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TimeUnit component4() {
            return this.expiryTimeUnit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-B2nhYrw, reason: not valid java name */
        public final Params m7202copyB2nhYrw(@NotNull String str, @NotNull String str2, long j, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(timeUnit, "");
            return new Params(str, str2, j, timeUnit, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return PublicKey.m7319equalsimpl0(this.identityPublicKey, params.identityPublicKey) && Intrinsics.EZpvd((Object) this.keyserverUrl, (Object) params.keyserverUrl) && this.expirySourceDuration == params.expirySourceDuration && this.expiryTimeUnit == params.expiryTimeUnit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getExpirySourceDuration() {
            return this.expirySourceDuration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TimeUnit getExpiryTimeUnit() {
            return this.expiryTimeUnit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: getIdentityPublicKey-uN_RPug, reason: not valid java name */
        public final String m7203getIdentityPublicKeyuN_RPug() {
            return this.identityPublicKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getKeyserverUrl() {
            return this.keyserverUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((PublicKey.m7321hashCodeimpl(this.identityPublicKey) * 31) + this.keyserverUrl.hashCode()) * 31) + Long.hashCode(this.expirySourceDuration)) * 31) + this.expiryTimeUnit.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Params(identityPublicKey=" + PublicKey.m7322toStringimpl(this.identityPublicKey) + ", keyserverUrl=" + this.keyserverUrl + ", expirySourceDuration=" + this.expirySourceDuration + ", expiryTimeUnit=" + this.expiryTimeUnit + ")";
        }

        public Params(String str, String str2, long j, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(timeUnit, "");
            this.identityPublicKey = str;
            this.keyserverUrl = str2;
            this.expirySourceDuration = j;
            this.expiryTimeUnit = timeUnit;
            this.iatAndExp = JwtUtilsKt.jwtIatAndExp$default(TimeUnit.SECONDS, j, timeUnit, 0L, 8, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (30 long) : (r10v0 long))
  (wrap:java.util.concurrent.TimeUnit:?: TERNARY null = ((wrap:int:0x0007: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.concurrent.TimeUnit:0x000b: SGET  A[WRAPPED] (LINE:15) java.util.concurrent.TimeUnit.DAYS java.util.concurrent.TimeUnit) : (r12v0 java.util.concurrent.TimeUnit))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, long, java.util.concurrent.TimeUnit, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:15) call: com.reown.android.internal.common.jwt.did.EncodeDidJwtPayloadUseCase.Params.<init>(java.lang.String, java.lang.String, long, java.util.concurrent.TimeUnit, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
        public /* synthetic */ Params(String str, String str2, long j, TimeUnit timeUnit, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? 30L : j, (i & 8) != 0 ? TimeUnit.DAYS : timeUnit, null);
        }

        public final long getIssuedAt() {
            return this.iatAndExp.getFirst().longValue();
        }

        public final long getExpiration() {
            return this.iatAndExp.getSecond().longValue();
        }

        public final String getIssuer() {
            return JwtUtilsKt.encodeEd25519DidKey(PublicKey.m7320getKeyAsBytesimpl(this.identityPublicKey));
        }
    }
}

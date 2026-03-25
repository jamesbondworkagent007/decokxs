package com.reown.foundation.util.jwt;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class JwtHeader {
    public static final Companion Companion = new Companion(null);
    private static final JwtHeader EdDSA = new JwtHeader("EdDSA", "JWT");
    private final String algorithm;
    private final String encoded;
    private final String type;

    @Json(ignore = true)
    public static /* synthetic */ void getEncoded$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgorithm() {
        return this.algorithm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncoded() {
        return this.encoded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    public JwtHeader(@Json(name = "alg") @NotNull String str, @Json(name = ClientData.KEY_TYPE) @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.algorithm = str;
        this.type = str2;
        this.encoded = JwtUtilsKt.encodeJSON(this);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.util.jwt.JwtHeader.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final JwtHeader getEdDSA() {
            return JwtHeader.EdDSA;
        }
    }
}

package com.amplifyframework.api.aws.auth;

import android.util.Base64;
import com.google.android.exoplayer2.C;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class CognitoJWTParser {
    public static final Companion Companion = new Companion(null);
    private static final int JWT_PARTS = 3;
    private static final int PAYLOAD = 1;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.api.aws.auth.CognitoJWTParser.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final JSONObject getPayload(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                validateJWT(str);
                byte[] bArrDecode = Base64.decode((String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (Object) null).get(1), 8);
                Intrinsics.copydefault(bArrDecode);
                Charset charsetForName = Charset.forName(C.UTF8_NAME);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "");
                return new JSONObject(new String(bArrDecode, charsetForName));
            } catch (UnsupportedEncodingException e) {
                throw new CognitoParameterInvalidException(e.getMessage(), null, 2, null);
            } catch (JSONException e2) {
                throw new CognitoParameterInvalidException(e2.getMessage(), null, 2, null);
            } catch (Exception unused) {
                throw new CognitoParameterInvalidException("error in parsing JSON", null, 2, null);
            }
        }

        private final void validateJWT(String str) {
            if (StringsKt__StringsKt.split$default((CharSequence) str, new String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (Object) null).size() != 3) {
                throw new CognitoParameterInvalidException("not a JSON Web Token", null, 2, null);
            }
        }

        public final String getClaim(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            try {
                return getPayload(str).get(str2).toString();
            } catch (Exception unused) {
                throw new CognitoParameterInvalidException("invalid token", null, 2, null);
            }
        }
    }
}

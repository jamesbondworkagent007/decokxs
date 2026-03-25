package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class JWTParser {
    private static final int HEADER = 0;
    public static final JWTParser INSTANCE = new JWTParser();
    private static final int JWT_PARTS = 3;
    private static final int PAYLOAD = 1;
    private static final int SIGNATURE = 2;

    private JWTParser() {
    }

    public final JSONObject getHeader(@NotNull String str) throws UnknownException {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            validateJWT(str);
            byte[] bArrDecode = Base64.decode(((String[]) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (Object) null).toArray(new String[0]))[0], 8);
            Intrinsics.copydefault(bArrDecode);
            return new JSONObject(new String(bArrDecode, Charsets.UTF_8));
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            throw new UnknownException((localizedMessage != null ? localizedMessage : "") + ", error in parsing JSON", null, 2, null);
        }
    }

    public final JSONObject getPayload(@NotNull String str) throws UnknownException {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            validateJWT(str);
            byte[] bArrDecode = Base64.decode(((String[]) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (Object) null).toArray(new String[0]))[1], 8);
            Intrinsics.copydefault(bArrDecode);
            return new JSONObject(new String(bArrDecode, Charsets.UTF_8));
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            throw new UnknownException((localizedMessage != null ? localizedMessage : "") + ", error in parsing JSON", null, 2, null);
        }
    }

    public final String getSignature(@NotNull String str) throws UnknownException {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            validateJWT(str);
            byte[] bArrDecode = Base64.decode(((String[]) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (Object) null).toArray(new String[0]))[2], 8);
            Intrinsics.copydefault(bArrDecode);
            return new String(bArrDecode, Charsets.UTF_8);
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            throw new UnknownException((localizedMessage != null ? localizedMessage : "") + ", error in parsing JSON", null, 2, null);
        }
    }

    public final String getClaim(@NotNull String str, String str2) throws UnknownException {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return str;
        }
        try {
            return String.valueOf(str2 != null ? getPayload(str).get(str2) : null);
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            throw new UnknownException((localizedMessage != null ? localizedMessage : "") + ", Invalid token", null, 2, null);
        }
    }

    public final boolean hasClaim(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return getPayload(str).has(str2);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void validateJWT(@NotNull String str) throws UnknownException {
        Intrinsics.checkNotNullParameter(str, "");
        if (((String[]) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (Object) null).toArray(new String[0])).length != 3) {
            throw new UnknownException("Not a JSON web token. Error in parsing JSON", null, 2, null);
        }
    }
}

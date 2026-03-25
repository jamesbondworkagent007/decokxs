package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PkceHelper {
    public static final PkceHelper INSTANCE = new PkceHelper();

    private PkceHelper() {
    }

    public final String generateRandom() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }

    public final String generateHash(@NotNull String str) throws Exception {
        Intrinsics.checkNotNullParameter(str, "");
        Charset charsetForName = Charset.forName(C.ASCII_NAME);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "");
        byte[] bytes = str.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bytes, 0, bytes.length);
        String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
        Intrinsics.copydefault((Object) strEncodeToString);
        return strEncodeToString;
    }

    public final String encodeBase64(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Charset charsetForName = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "");
        byte[] bytes = str.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String strEncodeToString = Base64.encodeToString(bytes, 3);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }
}

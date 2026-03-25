package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CognitoDeviceHelper {
    public static final CognitoDeviceHelper INSTANCE = new CognitoDeviceHelper();
    public static final int SALT_LENGTH_BITS = 128;

    private CognitoDeviceHelper() {
    }

    public final Map<String, String> generateVerificationParameters(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        BigInteger bigInteger = new BigInteger(128, new SecureRandom());
        SRPHelper sRPHelper = new SRPHelper(string);
        sRPHelper.setUserPoolParams(str, str2);
        BigInteger bigIntegerComputePasswordVerifier$aws_auth_cognito_release = sRPHelper.computePasswordVerifier$aws_auth_cognito_release(bigInteger);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strEncodeToString = Base64.encodeToString(bigInteger.toByteArray(), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        linkedHashMap.put("salt", strEncodeToString);
        String strEncodeToString2 = Base64.encodeToString(bigIntegerComputePasswordVerifier$aws_auth_cognito_release.toByteArray(), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString2, "");
        linkedHashMap.put("verifier", strEncodeToString2);
        linkedHashMap.put("secret", string);
        return linkedHashMap;
    }
}

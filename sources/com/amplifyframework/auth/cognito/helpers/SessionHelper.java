package com.amplifyframework.auth.cognito.helpers;

import androidx.autofill.HintConstants;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import j$.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionHelper {
    public static final SessionHelper INSTANCE = new SessionHelper();

    private SessionHelper() {
    }

    public final Instant getExpiration$aws_auth_cognito_release(@NotNull String str) throws UnknownException {
        Intrinsics.checkNotNullParameter(str, "");
        String claim = JWTParser.INSTANCE.getClaim(str, "exp");
        if (claim != null) {
            return Instant.ofEpochSecond(Long.parseLong(claim));
        }
        return null;
    }

    public final String getUsername(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return JWTParser.INSTANCE.getClaim(str, HintConstants.AUTOFILL_HINT_USERNAME);
    }

    public final String getUserSub(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return JWTParser.INSTANCE.getClaim(str, "sub");
    }

    public final boolean isValidTokens(@NotNull CognitoUserPoolTokens cognitoUserPoolTokens) {
        Intrinsics.checkNotNullParameter(cognitoUserPoolTokens, "");
        Instant instantNow = Instant.now();
        return cognitoUserPoolTokens.getIdToken() != null && cognitoUserPoolTokens.getAccessToken() != null && instantNow.compareTo(getExpiration$aws_auth_cognito_release(cognitoUserPoolTokens.getIdToken())) < 0 && instantNow.compareTo(getExpiration$aws_auth_cognito_release(cognitoUserPoolTokens.getAccessToken())) < 0;
    }

    public final boolean isValidSession(@NotNull AWSCredentials aWSCredentials) {
        Intrinsics.checkNotNullParameter(aWSCredentials, "");
        Instant instantNow = Instant.now();
        Long expiration = aWSCredentials.getExpiration();
        return instantNow.compareTo(expiration != null ? Instant.ofEpochSecond(expiration.longValue()) : null) < 0;
    }
}

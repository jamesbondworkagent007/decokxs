package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.AWSCognitoUserPoolTokens;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.result.AuthSessionResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class FlutterFactory {
    public static final FlutterFactory INSTANCE = new FlutterFactory();

    private FlutterFactory() {
    }

    public final AWSCognitoUserPoolTokens createAWSCognitoUserPoolTokens(String str, String str2, String str3) {
        return new AWSCognitoUserPoolTokens(str, str2, str3);
    }

    public final AWSCognitoAuthSession createAWSCognitoAuthSession(boolean z, @NotNull AuthSessionResult<String> authSessionResult, @NotNull AuthSessionResult<AWSCredentials> authSessionResult2, @NotNull AuthSessionResult<String> authSessionResult3, @NotNull AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResult4) {
        Intrinsics.checkNotNullParameter(authSessionResult, "");
        Intrinsics.checkNotNullParameter(authSessionResult2, "");
        Intrinsics.checkNotNullParameter(authSessionResult3, "");
        Intrinsics.checkNotNullParameter(authSessionResult4, "");
        return new AWSCognitoAuthSession(z, authSessionResult, authSessionResult2, authSessionResult3, authSessionResult4);
    }
}

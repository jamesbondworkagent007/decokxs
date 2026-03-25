package com.amplifyframework.auth;

import com.amplifyframework.auth.result.AuthSessionResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AWSAuthSessionBehavior<TokensType> extends AuthSession {
    private final AuthSessionResult<AWSCredentials> awsCredentialsResult;
    private final AuthSessionResult<String> identityIdResult;
    private final AuthSessionResult<TokensType> tokensResult;
    private final AuthSessionResult<String> userSubResult;

    public abstract String getAccessToken();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthSessionResult<AWSCredentials> getAwsCredentialsResult() {
        return this.awsCredentialsResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthSessionResult<String> getIdentityIdResult() {
        return this.identityIdResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthSessionResult<TokensType> getTokensResult() {
        return this.tokensResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthSessionResult<String> getUserSubResult() {
        return this.userSubResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSAuthSessionBehavior(boolean z, @NotNull AuthSessionResult<String> authSessionResult, @NotNull AuthSessionResult<AWSCredentials> authSessionResult2, @NotNull AuthSessionResult<String> authSessionResult3, @NotNull AuthSessionResult<TokensType> authSessionResult4) {
        super(z);
        Intrinsics.checkNotNullParameter(authSessionResult, "");
        Intrinsics.checkNotNullParameter(authSessionResult2, "");
        Intrinsics.checkNotNullParameter(authSessionResult3, "");
        Intrinsics.checkNotNullParameter(authSessionResult4, "");
        this.identityIdResult = authSessionResult;
        this.awsCredentialsResult = authSessionResult2;
        this.userSubResult = authSessionResult3;
        this.tokensResult = authSessionResult4;
    }
}

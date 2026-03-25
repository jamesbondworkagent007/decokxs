package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.AWSAuthSessionBehavior;
import com.amplifyframework.auth.AWSCognitoUserPoolTokens;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.result.AuthSessionResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSCognitoAuthSession extends AWSAuthSessionBehavior<AWSCognitoUserPoolTokens> {
    private final String accessToken;
    private final AuthSessionResult<AWSCredentials> awsCredentialsResult;
    private final AuthSessionResult<String> identityIdResult;
    private final boolean isSignedIn;
    private final AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokensResult;
    private final AuthSessionResult<String> userSubResult;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.amplifyframework.auth.cognito.AWSCognitoAuthSession */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthSession copy$default(AWSCognitoAuthSession aWSCognitoAuthSession, boolean z, AuthSessionResult authSessionResult, AuthSessionResult authSessionResult2, AuthSessionResult authSessionResult3, AuthSessionResult authSessionResult4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aWSCognitoAuthSession.isSignedIn;
        }
        if ((i & 2) != 0) {
            authSessionResult = aWSCognitoAuthSession.identityIdResult;
        }
        AuthSessionResult authSessionResult5 = authSessionResult;
        if ((i & 4) != 0) {
            authSessionResult2 = aWSCognitoAuthSession.awsCredentialsResult;
        }
        AuthSessionResult authSessionResult6 = authSessionResult2;
        if ((i & 8) != 0) {
            authSessionResult3 = aWSCognitoAuthSession.userSubResult;
        }
        AuthSessionResult authSessionResult7 = authSessionResult3;
        if ((i & 16) != 0) {
            authSessionResult4 = aWSCognitoAuthSession.userPoolTokensResult;
        }
        return aWSCognitoAuthSession.copy(z, authSessionResult5, authSessionResult6, authSessionResult7, authSessionResult4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isSignedIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthSessionResult<String> component2() {
        return this.identityIdResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthSessionResult<AWSCredentials> component3() {
        return this.awsCredentialsResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthSessionResult<String> component4() {
        return this.userSubResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthSessionResult<AWSCognitoUserPoolTokens> component5() {
        return this.userPoolTokensResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCognitoAuthSession copy(boolean z, @NotNull AuthSessionResult<String> authSessionResult, @NotNull AuthSessionResult<AWSCredentials> authSessionResult2, @NotNull AuthSessionResult<String> authSessionResult3, @NotNull AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResult4) {
        Intrinsics.checkNotNullParameter(authSessionResult, "");
        Intrinsics.checkNotNullParameter(authSessionResult2, "");
        Intrinsics.checkNotNullParameter(authSessionResult3, "");
        Intrinsics.checkNotNullParameter(authSessionResult4, "");
        return new AWSCognitoAuthSession(z, authSessionResult, authSessionResult2, authSessionResult3, authSessionResult4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.AuthSession
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoAuthSession)) {
            return false;
        }
        AWSCognitoAuthSession aWSCognitoAuthSession = (AWSCognitoAuthSession) obj;
        return this.isSignedIn == aWSCognitoAuthSession.isSignedIn && Intrinsics.EZpvd(this.identityIdResult, aWSCognitoAuthSession.identityIdResult) && Intrinsics.EZpvd(this.awsCredentialsResult, aWSCognitoAuthSession.awsCredentialsResult) && Intrinsics.EZpvd(this.userSubResult, aWSCognitoAuthSession.userSubResult) && Intrinsics.EZpvd(this.userPoolTokensResult, aWSCognitoAuthSession.userPoolTokensResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.AWSAuthSessionBehavior
    public String getAccessToken() {
        return this.accessToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.AWSAuthSessionBehavior
    public AuthSessionResult<AWSCredentials> getAwsCredentialsResult() {
        return this.awsCredentialsResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.AWSAuthSessionBehavior
    public AuthSessionResult<String> getIdentityIdResult() {
        return this.identityIdResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthSessionResult<AWSCognitoUserPoolTokens> getUserPoolTokensResult() {
        return this.userPoolTokensResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.AWSAuthSessionBehavior
    public AuthSessionResult<String> getUserSubResult() {
        return this.userSubResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    @Override // com.amplifyframework.auth.AuthSession
    public int hashCode() {
        boolean z = this.isSignedIn;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((r0 * 31) + this.identityIdResult.hashCode()) * 31) + this.awsCredentialsResult.hashCode()) * 31) + this.userSubResult.hashCode()) * 31) + this.userPoolTokensResult.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.AuthSession
    public boolean isSignedIn() {
        return this.isSignedIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.AuthSession
    public String toString() {
        return "AWSCognitoAuthSession(isSignedIn=" + this.isSignedIn + ", identityIdResult=" + this.identityIdResult + ", awsCredentialsResult=" + this.awsCredentialsResult + ", userSubResult=" + this.userSubResult + ", userPoolTokensResult=" + this.userPoolTokensResult + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSCognitoAuthSession(boolean z, @NotNull AuthSessionResult<String> authSessionResult, @NotNull AuthSessionResult<AWSCredentials> authSessionResult2, @NotNull AuthSessionResult<String> authSessionResult3, @NotNull AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResult4) {
        super(z, authSessionResult, authSessionResult2, authSessionResult3, authSessionResult4);
        Intrinsics.checkNotNullParameter(authSessionResult, "");
        Intrinsics.checkNotNullParameter(authSessionResult2, "");
        Intrinsics.checkNotNullParameter(authSessionResult3, "");
        Intrinsics.checkNotNullParameter(authSessionResult4, "");
        this.isSignedIn = z;
        this.identityIdResult = authSessionResult;
        this.awsCredentialsResult = authSessionResult2;
        this.userSubResult = authSessionResult3;
        this.userPoolTokensResult = authSessionResult4;
        AWSCognitoUserPoolTokens value = authSessionResult4.getValue();
        this.accessToken = value != null ? value.getAccessToken() : null;
    }
}

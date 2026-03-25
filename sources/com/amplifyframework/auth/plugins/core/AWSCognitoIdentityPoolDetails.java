package com.amplifyframework.auth.plugins.core;

import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.auth.result.AuthSessionResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AWSCognitoIdentityPoolDetails {
    public static final Companion Companion = new Companion(null);
    private static final ConfigurationException configurationException = new ConfigurationException("Identity Pool not configured.", "Please check Cognito identity pool configuration.", null, 4, null);
    private final AuthSessionResult<AWSCredentials> awsCredentialsResult;
    private final AuthSessionResult<String> identityIdResult;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolDetails */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoIdentityPoolDetails copy$default(AWSCognitoIdentityPoolDetails aWSCognitoIdentityPoolDetails, AuthSessionResult authSessionResult, AuthSessionResult authSessionResult2, int i, Object obj) {
        if ((i & 1) != 0) {
            authSessionResult = aWSCognitoIdentityPoolDetails.identityIdResult;
        }
        if ((i & 2) != 0) {
            authSessionResult2 = aWSCognitoIdentityPoolDetails.awsCredentialsResult;
        }
        return aWSCognitoIdentityPoolDetails.copy(authSessionResult, authSessionResult2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthSessionResult<String> component1() {
        return this.identityIdResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthSessionResult<AWSCredentials> component2() {
        return this.awsCredentialsResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCognitoIdentityPoolDetails copy(@NotNull AuthSessionResult<String> authSessionResult, @NotNull AuthSessionResult<AWSCredentials> authSessionResult2) {
        Intrinsics.checkNotNullParameter(authSessionResult, "");
        Intrinsics.checkNotNullParameter(authSessionResult2, "");
        return new AWSCognitoIdentityPoolDetails(authSessionResult, authSessionResult2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoIdentityPoolDetails)) {
            return false;
        }
        AWSCognitoIdentityPoolDetails aWSCognitoIdentityPoolDetails = (AWSCognitoIdentityPoolDetails) obj;
        return Intrinsics.EZpvd(this.identityIdResult, aWSCognitoIdentityPoolDetails.identityIdResult) && Intrinsics.EZpvd(this.awsCredentialsResult, aWSCognitoIdentityPoolDetails.awsCredentialsResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthSessionResult<AWSCredentials> getAwsCredentialsResult() {
        return this.awsCredentialsResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthSessionResult<String> getIdentityIdResult() {
        return this.identityIdResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.identityIdResult.hashCode() * 31) + this.awsCredentialsResult.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AWSCognitoIdentityPoolDetails(identityIdResult=" + this.identityIdResult + ", awsCredentialsResult=" + this.awsCredentialsResult + ")";
    }

    public AWSCognitoIdentityPoolDetails(@NotNull AuthSessionResult<String> authSessionResult, @NotNull AuthSessionResult<AWSCredentials> authSessionResult2) {
        Intrinsics.checkNotNullParameter(authSessionResult, "");
        Intrinsics.checkNotNullParameter(authSessionResult2, "");
        this.identityIdResult = authSessionResult;
        this.awsCredentialsResult = authSessionResult2;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AWSCognitoIdentityPoolDetails configErrorResult() {
            AuthSessionResult authSessionResultFailure = AuthSessionResult.failure(AWSCognitoIdentityPoolDetails.configurationException);
            Intrinsics.checkNotNullExpressionValue(authSessionResultFailure, "");
            AuthSessionResult authSessionResultFailure2 = AuthSessionResult.failure(AWSCognitoIdentityPoolDetails.configurationException);
            Intrinsics.checkNotNullExpressionValue(authSessionResultFailure2, "");
            return new AWSCognitoIdentityPoolDetails(authSessionResultFailure, authSessionResultFailure2);
        }
    }
}

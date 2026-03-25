package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.AWSAuthSessionBehavior;
import com.amplifyframework.auth.AWSCognitoUserPoolTokens;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.helpers.SessionHelper;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.auth.exceptions.SignedOutException;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.auth.result.AuthSessionResult;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSCognitoAuthSessionKt {
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.amplifyframework.statemachine.codegen.data.AmplifyCredential */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isValid(@NotNull AmplifyCredential amplifyCredential) {
        Intrinsics.checkNotNullParameter(amplifyCredential, "");
        if (amplifyCredential instanceof AmplifyCredential.UserPool) {
            return SessionHelper.INSTANCE.isValidTokens(((AmplifyCredential.UserPool) amplifyCredential).getSignedInData().getCognitoUserPoolTokens());
        }
        if (amplifyCredential instanceof AmplifyCredential.UserAndIdentityPool) {
            SessionHelper sessionHelper = SessionHelper.INSTANCE;
            AmplifyCredential.UserAndIdentityPool userAndIdentityPool = (AmplifyCredential.UserAndIdentityPool) amplifyCredential;
            if (sessionHelper.isValidTokens(userAndIdentityPool.getSignedInData().getCognitoUserPoolTokens()) && sessionHelper.isValidSession(userAndIdentityPool.getCredentials())) {
                return true;
            }
        } else if (amplifyCredential instanceof AmplifyCredential.IdentityPoolTypeCredential) {
            return SessionHelper.INSTANCE.isValidSession(((AmplifyCredential.IdentityPoolTypeCredential) amplifyCredential).getCredentials());
        }
        return false;
    }

    public static /* synthetic */ AWSAuthSessionBehavior getCognitoSession$default(AmplifyCredential amplifyCredential, AuthException authException, int i, Object obj) {
        if ((i & 1) != 0) {
            authException = new SignedOutException(null, null, null, 7, null);
        }
        return getCognitoSession(amplifyCredential, authException);
    }

    private static final AuthSessionResult<AWSCredentials> getCognitoSession$getCredentialsResult(com.amplifyframework.statemachine.codegen.data.AWSCredentials aWSCredentials) {
        AWSCredentials aWSCredentialsCreateAWSCredentials = AWSCredentials.Factory.createAWSCredentials(aWSCredentials.getAccessKeyId(), aWSCredentials.getSecretAccessKey(), aWSCredentials.getSessionToken(), aWSCredentials.getExpiration());
        AuthSessionResult<AWSCredentials> authSessionResultSuccess = aWSCredentialsCreateAWSCredentials != null ? AuthSessionResult.success(aWSCredentialsCreateAWSCredentials) : null;
        if (authSessionResultSuccess != null) {
            return authSessionResultSuccess;
        }
        AuthSessionResult<AWSCredentials> authSessionResultFailure = AuthSessionResult.failure(new UnknownException("Failed to fetch AWS credentials.", null, 2, null));
        Intrinsics.checkNotNullExpressionValue(authSessionResultFailure, "");
        return authSessionResultFailure;
    }

    private static final AuthSessionResult<String> getCognitoSession$getIdentityIdResult(String str) {
        if (str.length() > 0) {
            AuthSessionResult<String> authSessionResultSuccess = AuthSessionResult.success(str);
            Intrinsics.checkNotNullExpressionValue(authSessionResultSuccess, "");
            return authSessionResultSuccess;
        }
        AuthSessionResult<String> authSessionResultFailure = AuthSessionResult.failure(new UnknownException("Failed to fetch identity id.", null, 2, null));
        Intrinsics.checkNotNullExpressionValue(authSessionResultFailure, "");
        return authSessionResultFailure;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final AuthSessionResult<String> getCognitoSession$getUserSubResult(CognitoUserPoolTokens cognitoUserPoolTokens) {
        String userSub;
        if (cognitoUserPoolTokens != null) {
            try {
                String accessToken = cognitoUserPoolTokens.getAccessToken();
                userSub = accessToken != null ? SessionHelper.INSTANCE.getUserSub(accessToken) : null;
            } catch (Exception e) {
                AuthSessionResult<String> authSessionResultFailure = AuthSessionResult.failure(new UnknownException(null, e, 1, null));
                Intrinsics.copydefault(authSessionResultFailure);
                return authSessionResultFailure;
            }
        }
        AuthSessionResult<String> authSessionResultSuccess = AuthSessionResult.success(userSub);
        Intrinsics.copydefault(authSessionResultSuccess);
        return authSessionResultSuccess;
    }

    private static final AuthSessionResult<AWSCognitoUserPoolTokens> getCognitoSession$getUserPoolTokensResult(CognitoUserPoolTokens cognitoUserPoolTokens) {
        AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResultSuccess = AuthSessionResult.success(new AWSCognitoUserPoolTokens(cognitoUserPoolTokens.getAccessToken(), cognitoUserPoolTokens.getIdToken(), cognitoUserPoolTokens.getRefreshToken()));
        Intrinsics.checkNotNullExpressionValue(authSessionResultSuccess, "");
        return authSessionResultSuccess;
    }

    public static final AWSAuthSessionBehavior<AWSCognitoUserPoolTokens> getCognitoSession(@NotNull AmplifyCredential amplifyCredential, @NotNull AuthException authException) {
        Intrinsics.checkNotNullParameter(amplifyCredential, "");
        Intrinsics.checkNotNullParameter(authException, "");
        if (amplifyCredential instanceof AmplifyCredential.UserPool) {
            AuthSessionResult authSessionResultFailure = AuthSessionResult.failure(new ConfigurationException("Could not retrieve Identity ID", "Cognito Identity not configured. Please check amplifyconfiguration.json file.", null, 4, null));
            Intrinsics.checkNotNullExpressionValue(authSessionResultFailure, "");
            AuthSessionResult authSessionResultFailure2 = AuthSessionResult.failure(new ConfigurationException("Could not fetch AWS Cognito credentials", "Cognito Identity not configured. Please check amplifyconfiguration.json file.", null, 4, null));
            Intrinsics.checkNotNullExpressionValue(authSessionResultFailure2, "");
            AmplifyCredential.UserPool userPool = (AmplifyCredential.UserPool) amplifyCredential;
            return new AWSCognitoAuthSession(true, authSessionResultFailure, authSessionResultFailure2, getCognitoSession$getUserSubResult(userPool.getSignedInData().getCognitoUserPoolTokens()), getCognitoSession$getUserPoolTokensResult(userPool.getSignedInData().getCognitoUserPoolTokens()));
        }
        if (amplifyCredential instanceof AmplifyCredential.UserAndIdentityPool) {
            AmplifyCredential.UserAndIdentityPool userAndIdentityPool = (AmplifyCredential.UserAndIdentityPool) amplifyCredential;
            return new AWSCognitoAuthSession(true, getCognitoSession$getIdentityIdResult(userAndIdentityPool.getIdentityId()), getCognitoSession$getCredentialsResult(userAndIdentityPool.getCredentials()), getCognitoSession$getUserSubResult(userAndIdentityPool.getSignedInData().getCognitoUserPoolTokens()), getCognitoSession$getUserPoolTokensResult(userAndIdentityPool.getSignedInData().getCognitoUserPoolTokens()));
        }
        if (amplifyCredential instanceof AmplifyCredential.IdentityPool) {
            AmplifyCredential.IdentityPool identityPool = (AmplifyCredential.IdentityPool) amplifyCredential;
            AuthSessionResult<String> cognitoSession$getIdentityIdResult = getCognitoSession$getIdentityIdResult(identityPool.getIdentityId());
            AuthSessionResult<AWSCredentials> cognitoSession$getCredentialsResult = getCognitoSession$getCredentialsResult(identityPool.getCredentials());
            AuthSessionResult authSessionResultFailure3 = AuthSessionResult.failure(new SignedOutException(null, null, null, 7, null));
            Intrinsics.checkNotNullExpressionValue(authSessionResultFailure3, "");
            AuthSessionResult authSessionResultFailure4 = AuthSessionResult.failure(new SignedOutException(null, null, null, 7, null));
            Intrinsics.checkNotNullExpressionValue(authSessionResultFailure4, "");
            return new AWSCognitoAuthSession(false, cognitoSession$getIdentityIdResult, cognitoSession$getCredentialsResult, authSessionResultFailure3, authSessionResultFailure4);
        }
        if (amplifyCredential instanceof AmplifyCredential.IdentityPoolFederated) {
            InvalidStateException invalidStateException = new InvalidStateException("Users Federated to Identity Pool do not have User Pool access.", "To access User Pool data, you must use a Sign In method.", null, 4, null);
            AmplifyCredential.IdentityPoolFederated identityPoolFederated = (AmplifyCredential.IdentityPoolFederated) amplifyCredential;
            AuthSessionResult<String> cognitoSession$getIdentityIdResult2 = getCognitoSession$getIdentityIdResult(identityPoolFederated.getIdentityId());
            AuthSessionResult<AWSCredentials> cognitoSession$getCredentialsResult2 = getCognitoSession$getCredentialsResult(identityPoolFederated.getCredentials());
            AuthSessionResult authSessionResultFailure5 = AuthSessionResult.failure(invalidStateException);
            Intrinsics.checkNotNullExpressionValue(authSessionResultFailure5, "");
            AuthSessionResult authSessionResultFailure6 = AuthSessionResult.failure(invalidStateException);
            Intrinsics.checkNotNullExpressionValue(authSessionResultFailure6, "");
            return new AWSCognitoAuthSession(true, cognitoSession$getIdentityIdResult2, cognitoSession$getCredentialsResult2, authSessionResultFailure5, authSessionResultFailure6);
        }
        AuthSessionResult authSessionResultFailure7 = AuthSessionResult.failure(authException);
        Intrinsics.checkNotNullExpressionValue(authSessionResultFailure7, "");
        AuthSessionResult authSessionResultFailure8 = AuthSessionResult.failure(authException);
        Intrinsics.checkNotNullExpressionValue(authSessionResultFailure8, "");
        AuthSessionResult authSessionResultFailure9 = AuthSessionResult.failure(authException);
        Intrinsics.checkNotNullExpressionValue(authSessionResultFailure9, "");
        AuthSessionResult authSessionResultFailure10 = AuthSessionResult.failure(authException);
        Intrinsics.checkNotNullExpressionValue(authSessionResultFailure10, "");
        return new AWSCognitoAuthSession(false, authSessionResultFailure7, authSessionResultFailure8, authSessionResultFailure9, authSessionResultFailure10);
    }
}

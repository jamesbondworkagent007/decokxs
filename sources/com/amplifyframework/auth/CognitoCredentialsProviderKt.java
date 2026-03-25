package com.amplifyframework.auth;

/* JADX INFO: loaded from: classes2.dex */
public final class CognitoCredentialsProviderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final AWSAuthSessionBehavior<?> toAWSAuthSession(AuthSession authSession) {
        if (authSession instanceof AWSAuthSessionBehavior) {
            return (AWSAuthSessionBehavior) authSession;
        }
        return null;
    }
}

package com.amplifyframework.auth;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.result.AuthSessionResult;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.InterfaceC52697wV;
import o.InterfaceC57843yq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class CognitoCredentialsProvider implements AuthCredentialsProvider {
    private final AuthCategory authCategory;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.AuthCredentialsProvider
    public Object getIdentityId(@NotNull Continuation<? super String> continuation) {
        return getIdentityId$suspendImpl(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    public Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) {
        return resolve$suspendImpl(this, interfaceC57843yq, continuation);
    }

    @InternalAmplifyApi
    public CognitoCredentialsProvider(@NotNull AuthCategory authCategory) {
        Intrinsics.checkNotNullParameter(authCategory, "");
        this.authCategory = authCategory;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CognitoCredentialsProvider() {
        AuthCategory authCategory = Amplify.Auth;
        Intrinsics.checkNotNullExpressionValue(authCategory, "");
        this(authCategory);
    }

    public static /* synthetic */ Object resolve$suspendImpl(CognitoCredentialsProvider cognitoCredentialsProvider, InterfaceC57843yq interfaceC57843yq, Continuation<? super InterfaceC52697wV> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        cognitoCredentialsProvider.authCategory.fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$resolve$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSession authSession) {
                Unit unit;
                AuthSessionResult<AWSCredentials> awsCredentialsResult;
                AWSCredentials value;
                Intrinsics.checkNotNullParameter(authSession, "");
                AWSAuthSessionBehavior aWSAuthSession = CognitoCredentialsProviderKt.toAWSAuthSession(authSession);
                if (aWSAuthSession == null || (awsCredentialsResult = aWSAuthSession.getAwsCredentialsResult()) == null || (value = awsCredentialsResult.getValue()) == null) {
                    unit = null;
                } else {
                    Continuation<InterfaceC52697wV> continuation2 = c56434yFf;
                    Result.Application application = Result.Companion;
                    continuation2.resumeWith(Result.m7377constructorimpl(AWSCredentialsKt.toSdkCredentials(value)));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    Continuation<InterfaceC52697wV> continuation3 = c56434yFf;
                    Result.Application application2 = Result.Companion;
                    continuation3.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new AuthException("Failed to get credentials. Check if you are signed in and configured identity pools correctly.", "Sorry, we don't have a suggested fix for this error yet.", null, 4, null))));
                }
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$resolve$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<InterfaceC52697wV> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    public static /* synthetic */ Object getIdentityId$suspendImpl(CognitoCredentialsProvider cognitoCredentialsProvider, Continuation<? super String> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        cognitoCredentialsProvider.authCategory.fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$getIdentityId$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSession authSession) {
                Unit unit;
                AuthSessionResult<String> identityIdResult;
                String value;
                Intrinsics.checkNotNullParameter(authSession, "");
                AWSAuthSessionBehavior aWSAuthSession = CognitoCredentialsProviderKt.toAWSAuthSession(authSession);
                if (aWSAuthSession == null || (identityIdResult = aWSAuthSession.getIdentityIdResult()) == null || (value = identityIdResult.getValue()) == null) {
                    unit = null;
                } else {
                    Continuation<String> continuation2 = c56434yFf;
                    Result.Application application = Result.Companion;
                    continuation2.resumeWith(Result.m7377constructorimpl(value));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    Continuation<String> continuation3 = c56434yFf;
                    Result.Application application2 = Result.Companion;
                    continuation3.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new AuthException("Failed to get identity ID. Check if you are signed in and configured identity pools correctly.", "Sorry, we don't have a suggested fix for this error yet.", null, 4, null))));
                }
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$getIdentityId$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<String> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    @Override // com.amplifyframework.auth.AuthCredentialsProvider
    public void getAccessToken(@NotNull final Consumer<String> consumer, @NotNull final Consumer<Exception> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        this.authCategory.fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                CognitoCredentialsProvider.getAccessToken$lambda$3(consumer2, consumer, (AuthSession) obj);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                CognitoCredentialsProvider.getAccessToken$lambda$4(consumer2, (AuthException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAccessToken$lambda$3(Consumer consumer, Consumer consumer2, AuthSession authSession) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        Intrinsics.checkNotNullParameter(authSession, "");
        AWSAuthSessionBehavior aWSAuthSession = CognitoCredentialsProviderKt.toAWSAuthSession(authSession);
        Unit unit = null;
        String accessToken = aWSAuthSession != null ? aWSAuthSession.getAccessToken() : null;
        if (accessToken != null) {
            consumer2.accept(accessToken);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            consumer.accept(new AuthException("Token is null", "Token received but is null. Check if you are signed in", null, 4, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAccessToken$lambda$4(Consumer consumer, AuthException authException) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(authException, "");
        consumer.accept(authException);
    }
}

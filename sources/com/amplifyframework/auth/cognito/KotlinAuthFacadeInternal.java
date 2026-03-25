package com.amplifyframework.auth.cognito;

import android.app.Activity;
import android.content.Intent;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthDevice;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.TOTPSetupDetails;
import com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions;
import com.amplifyframework.auth.cognito.result.FederateToIdentityPoolResult;
import com.amplifyframework.auth.options.AuthConfirmResetPasswordOptions;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import com.amplifyframework.auth.options.AuthConfirmSignUpOptions;
import com.amplifyframework.auth.options.AuthFetchSessionOptions;
import com.amplifyframework.auth.options.AuthResendSignUpCodeOptions;
import com.amplifyframework.auth.options.AuthResendUserAttributeConfirmationCodeOptions;
import com.amplifyframework.auth.options.AuthResetPasswordOptions;
import com.amplifyframework.auth.options.AuthSignInOptions;
import com.amplifyframework.auth.options.AuthSignOutOptions;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.auth.options.AuthUpdateUserAttributeOptions;
import com.amplifyframework.auth.options.AuthUpdateUserAttributesOptions;
import com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.auth.result.AuthResetPasswordResult;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.AuthSignOutResult;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.auth.result.AuthUpdateAttributeResult;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinAuthFacadeInternal {
    private final RealAWSCognitoAuthPlugin delegate;

    public KotlinAuthFacadeInternal(@NotNull RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
        Intrinsics.checkNotNullParameter(realAWSCognitoAuthPlugin, "");
        this.delegate = realAWSCognitoAuthPlugin;
    }

    public final Object signUp(@NotNull String str, @NotNull String str2, @NotNull AuthSignUpOptions authSignUpOptions, @NotNull Continuation<? super AuthSignUpResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.signUp(str, str2, authSignUpOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signUp$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignUpResult authSignUpResult) {
                Intrinsics.checkNotNullParameter(authSignUpResult, "");
                Continuation<AuthSignUpResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignUpResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signUp$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSignUpResult> continuation2 = c56434yFf;
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

    public final Object confirmSignUp(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super AuthSignUpResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.confirmSignUp(str, str2, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignUp$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignUpResult authSignUpResult) {
                Intrinsics.checkNotNullParameter(authSignUpResult, "");
                Continuation<AuthSignUpResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignUpResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignUp$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSignUpResult> continuation2 = c56434yFf;
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

    public final Object confirmSignUp(@NotNull String str, @NotNull String str2, @NotNull AuthConfirmSignUpOptions authConfirmSignUpOptions, @NotNull Continuation<? super AuthSignUpResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.confirmSignUp(str, str2, authConfirmSignUpOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignUp$4$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignUpResult authSignUpResult) {
                Intrinsics.checkNotNullParameter(authSignUpResult, "");
                Continuation<AuthSignUpResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignUpResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignUp$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSignUpResult> continuation2 = c56434yFf;
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

    public final Object resendSignUpCode(@NotNull String str, @NotNull Continuation<? super AuthCodeDeliveryDetails> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.resendSignUpCode(str, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resendSignUpCode$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthCodeDeliveryDetails authCodeDeliveryDetails) {
                Intrinsics.checkNotNullParameter(authCodeDeliveryDetails, "");
                Continuation<AuthCodeDeliveryDetails> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authCodeDeliveryDetails));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resendSignUpCode$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthCodeDeliveryDetails> continuation2 = c56434yFf;
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

    public final Object resendSignUpCode(@NotNull String str, @NotNull AuthResendSignUpCodeOptions authResendSignUpCodeOptions, @NotNull Continuation<? super AuthCodeDeliveryDetails> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.resendSignUpCode(str, authResendSignUpCodeOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resendSignUpCode$4$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthCodeDeliveryDetails authCodeDeliveryDetails) {
                Intrinsics.checkNotNullParameter(authCodeDeliveryDetails, "");
                Continuation<AuthCodeDeliveryDetails> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authCodeDeliveryDetails));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resendSignUpCode$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthCodeDeliveryDetails> continuation2 = c56434yFf;
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

    public final Object signIn(String str, String str2, @NotNull Continuation<? super AuthSignInResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.signIn(str, str2, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signIn$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignInResult authSignInResult) {
                Intrinsics.checkNotNullParameter(authSignInResult, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signIn$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
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

    public final Object signIn(String str, String str2, @NotNull AuthSignInOptions authSignInOptions, @NotNull Continuation<? super AuthSignInResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.signIn(str, str2, authSignInOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signIn$4$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignInResult authSignInResult) {
                Intrinsics.checkNotNullParameter(authSignInResult, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signIn$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
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

    public final Object confirmSignIn(@NotNull String str, @NotNull Continuation<? super AuthSignInResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.confirmSignIn(str, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignIn$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignInResult authSignInResult) {
                Intrinsics.checkNotNullParameter(authSignInResult, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignIn$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
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

    public final Object confirmSignIn(@NotNull String str, @NotNull AuthConfirmSignInOptions authConfirmSignInOptions, @NotNull Continuation<? super AuthSignInResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.confirmSignIn(str, authConfirmSignInOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignIn$4$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignInResult authSignInResult) {
                Intrinsics.checkNotNullParameter(authSignInResult, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignIn$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
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

    public final Object signInWithSocialWebUI(@NotNull AuthProvider authProvider, @NotNull Activity activity, @NotNull Continuation<? super AuthSignInResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.signInWithSocialWebUI(authProvider, activity, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithSocialWebUI$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignInResult authSignInResult) {
                Intrinsics.checkNotNullParameter(authSignInResult, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithSocialWebUI$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
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

    public final Object signInWithSocialWebUI(@NotNull AuthProvider authProvider, @NotNull Activity activity, @NotNull AuthWebUISignInOptions authWebUISignInOptions, @NotNull Continuation<? super AuthSignInResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.signInWithSocialWebUI(authProvider, activity, authWebUISignInOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithSocialWebUI$4$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignInResult authSignInResult) {
                Intrinsics.checkNotNullParameter(authSignInResult, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithSocialWebUI$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
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

    public final Object signInWithWebUI(@NotNull Activity activity, @NotNull Continuation<? super AuthSignInResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.signInWithWebUI(activity, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithWebUI$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignInResult authSignInResult) {
                Intrinsics.checkNotNullParameter(authSignInResult, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithWebUI$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
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

    public final Object signInWithWebUI(@NotNull Activity activity, @NotNull AuthWebUISignInOptions authWebUISignInOptions, @NotNull Continuation<? super AuthSignInResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.signInWithWebUI(activity, authWebUISignInOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithWebUI$4$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignInResult authSignInResult) {
                Intrinsics.checkNotNullParameter(authSignInResult, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithWebUI$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSignInResult> continuation2 = c56434yFf;
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

    public final void handleWebUISignInResponse(Intent intent) {
        this.delegate.handleWebUISignInResponse(intent);
    }

    public final Object fetchAuthSession(@NotNull Continuation<? super AuthSession> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchAuthSession$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSession authSession) {
                Intrinsics.checkNotNullParameter(authSession, "");
                Continuation<AuthSession> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSession));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchAuthSession$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSession> continuation2 = c56434yFf;
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

    public final Object fetchAuthSession(@NotNull AuthFetchSessionOptions authFetchSessionOptions, @NotNull Continuation<? super AuthSession> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.fetchAuthSession(authFetchSessionOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchAuthSession$4$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSession authSession) {
                Intrinsics.checkNotNullParameter(authSession, "");
                Continuation<AuthSession> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSession));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchAuthSession$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthSession> continuation2 = c56434yFf;
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

    public final Object rememberDevice(@NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.rememberDevice(new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$rememberDevice$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$rememberDevice$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object forgetDevice(@NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.forgetDevice(new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$forgetDevice$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$forgetDevice$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object forgetDevice(@NotNull AuthDevice authDevice, @NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.forgetDevice(authDevice, new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$forgetDevice$4$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$forgetDevice$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object fetchDevices(@NotNull Continuation<? super List<AuthDevice>> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.fetchDevices(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchDevices$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull List<AuthDevice> list) {
                Intrinsics.checkNotNullParameter(list, "");
                Continuation<List<AuthDevice>> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(list));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchDevices$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<List<AuthDevice>> continuation2 = c56434yFf;
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

    public final Object resetPassword(@NotNull String str, @NotNull Continuation<? super AuthResetPasswordResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.resetPassword(str, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resetPassword$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthResetPasswordResult authResetPasswordResult) {
                Intrinsics.checkNotNullParameter(authResetPasswordResult, "");
                Continuation<AuthResetPasswordResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authResetPasswordResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resetPassword$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthResetPasswordResult> continuation2 = c56434yFf;
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

    public final Object resetPassword(@NotNull String str, @NotNull AuthResetPasswordOptions authResetPasswordOptions, @NotNull Continuation<? super AuthResetPasswordResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.resetPassword(str, authResetPasswordOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resetPassword$4$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthResetPasswordResult authResetPasswordResult) {
                Intrinsics.checkNotNullParameter(authResetPasswordResult, "");
                Continuation<AuthResetPasswordResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authResetPasswordResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resetPassword$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthResetPasswordResult> continuation2 = c56434yFf;
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

    public final Object confirmResetPassword(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.confirmResetPassword(str, str2, str3, new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmResetPassword$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmResetPassword$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object confirmResetPassword(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, @NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.confirmResetPassword(str, str2, str3, authConfirmResetPasswordOptions, new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmResetPassword$4$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmResetPassword$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object updatePassword(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.updatePassword(str, str2, new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updatePassword$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updatePassword$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object fetchUserAttributes(@NotNull Continuation<? super List<AuthUserAttribute>> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.fetchUserAttributes(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchUserAttributes$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull List<AuthUserAttribute> list) {
                Intrinsics.checkNotNullParameter(list, "");
                Continuation<List<AuthUserAttribute>> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(list));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchUserAttributes$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<List<AuthUserAttribute>> continuation2 = c56434yFf;
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

    public final Object updateUserAttribute(@NotNull AuthUserAttribute authUserAttribute, @NotNull Continuation<? super AuthUpdateAttributeResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.updateUserAttribute(authUserAttribute, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updateUserAttribute$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthUpdateAttributeResult authUpdateAttributeResult) {
                Intrinsics.checkNotNullParameter(authUpdateAttributeResult, "");
                Continuation<AuthUpdateAttributeResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authUpdateAttributeResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updateUserAttribute$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthUpdateAttributeResult> continuation2 = c56434yFf;
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

    public final Object updateUserAttribute(@NotNull AuthUserAttribute authUserAttribute, @NotNull AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, @NotNull Continuation<? super AuthUpdateAttributeResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.updateUserAttribute(authUserAttribute, authUpdateUserAttributeOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updateUserAttribute$4$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthUpdateAttributeResult authUpdateAttributeResult) {
                Intrinsics.checkNotNullParameter(authUpdateAttributeResult, "");
                Continuation<AuthUpdateAttributeResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authUpdateAttributeResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updateUserAttribute$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthUpdateAttributeResult> continuation2 = c56434yFf;
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

    public final Object updateUserAttributes(@NotNull List<AuthUserAttribute> list, @NotNull Continuation<? super Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.updateUserAttributes(list, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updateUserAttributes$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull Map<AuthUserAttributeKey, AuthUpdateAttributeResult> map) {
                Intrinsics.checkNotNullParameter(map, "");
                Continuation<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(map));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updateUserAttributes$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation2 = c56434yFf;
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

    public final Object updateUserAttributes(@NotNull List<AuthUserAttribute> list, @NotNull AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, @NotNull Continuation<? super Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.updateUserAttributes(list, authUpdateUserAttributesOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updateUserAttributes$4$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull Map<AuthUserAttributeKey, AuthUpdateAttributeResult> map) {
                Intrinsics.checkNotNullParameter(map, "");
                Continuation<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(map));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updateUserAttributes$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> continuation2 = c56434yFf;
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

    public final Object resendUserAttributeConfirmationCode(@NotNull AuthUserAttributeKey authUserAttributeKey, @NotNull Continuation<? super AuthCodeDeliveryDetails> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.resendUserAttributeConfirmationCode(authUserAttributeKey, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resendUserAttributeConfirmationCode$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthCodeDeliveryDetails authCodeDeliveryDetails) {
                Intrinsics.checkNotNullParameter(authCodeDeliveryDetails, "");
                Continuation<AuthCodeDeliveryDetails> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authCodeDeliveryDetails));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resendUserAttributeConfirmationCode$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthCodeDeliveryDetails> continuation2 = c56434yFf;
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

    public final Object resendUserAttributeConfirmationCode(@NotNull AuthUserAttributeKey authUserAttributeKey, @NotNull AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, @NotNull Continuation<? super AuthCodeDeliveryDetails> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.resendUserAttributeConfirmationCode(authUserAttributeKey, authResendUserAttributeConfirmationCodeOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resendUserAttributeConfirmationCode$4$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthCodeDeliveryDetails authCodeDeliveryDetails) {
                Intrinsics.checkNotNullParameter(authCodeDeliveryDetails, "");
                Continuation<AuthCodeDeliveryDetails> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authCodeDeliveryDetails));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resendUserAttributeConfirmationCode$4$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthCodeDeliveryDetails> continuation2 = c56434yFf;
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

    public final Object confirmUserAttribute(@NotNull AuthUserAttributeKey authUserAttributeKey, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.confirmUserAttribute(authUserAttributeKey, str, new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmUserAttribute$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmUserAttribute$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object getCurrentUser(@NotNull Continuation<? super AuthUser> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.getCurrentUser(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$getCurrentUser$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthUser authUser) {
                Intrinsics.checkNotNullParameter(authUser, "");
                Continuation<AuthUser> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authUser));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$getCurrentUser$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<AuthUser> continuation2 = c56434yFf;
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

    public final Object signOut(@NotNull Continuation<? super AuthSignOutResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.signOut(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signOut$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignOutResult authSignOutResult) {
                Intrinsics.checkNotNullParameter(authSignOutResult, "");
                Continuation<AuthSignOutResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignOutResult));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    public final Object signOut(@NotNull AuthSignOutOptions authSignOutOptions, @NotNull Continuation<? super AuthSignOutResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.signOut(authSignOutOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signOut$4$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthSignOutResult authSignOutResult) {
                Intrinsics.checkNotNullParameter(authSignOutResult, "");
                Continuation<AuthSignOutResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(authSignOutResult));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    public final Object deleteUser(@NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.deleteUser(new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$deleteUser$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$deleteUser$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object federateToIdentityPool(@NotNull String str, @NotNull AuthProvider authProvider, FederateToIdentityPoolOptions federateToIdentityPoolOptions, @NotNull Continuation<? super FederateToIdentityPoolResult> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.federateToIdentityPool(str, authProvider, federateToIdentityPoolOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$federateToIdentityPool$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull FederateToIdentityPoolResult federateToIdentityPoolResult) {
                Intrinsics.checkNotNullParameter(federateToIdentityPoolResult, "");
                Continuation<FederateToIdentityPoolResult> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(federateToIdentityPoolResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$federateToIdentityPool$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<FederateToIdentityPoolResult> continuation2 = c56434yFf;
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

    public final Object clearFederationToIdentityPool(@NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.clearFederationToIdentityPool(new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$clearFederationToIdentityPool$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$clearFederationToIdentityPool$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object setUpTOTP(@NotNull Continuation<? super TOTPSetupDetails> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.setUpTOTP(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$setUpTOTP$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull TOTPSetupDetails tOTPSetupDetails) {
                Intrinsics.checkNotNullParameter(tOTPSetupDetails, "");
                Continuation<TOTPSetupDetails> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(tOTPSetupDetails));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$setUpTOTP$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<TOTPSetupDetails> continuation2 = c56434yFf;
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

    public final Object verifyTOTPSetup(@NotNull String str, @NotNull AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, @NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.verifyTOTPSetup(str, authVerifyTOTPSetupOptions, new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$verifyTOTPSetup$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$verifyTOTPSetup$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object fetchMFAPreference(@NotNull Continuation<? super UserMFAPreference> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.fetchMFAPreference(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchMFAPreference$2$1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull UserMFAPreference userMFAPreference) {
                Intrinsics.checkNotNullParameter(userMFAPreference, "");
                Continuation<UserMFAPreference> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(userMFAPreference));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchMFAPreference$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<UserMFAPreference> continuation2 = c56434yFf;
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

    public final Object updateMFAPreference(MFAPreference mFAPreference, MFAPreference mFAPreference2, @NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        this.delegate.updateMFAPreference(mFAPreference, mFAPreference2, new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updateMFAPreference$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updateMFAPreference$2$2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(@NotNull AuthException authException) {
                Intrinsics.checkNotNullParameter(authException, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(authException)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }
}

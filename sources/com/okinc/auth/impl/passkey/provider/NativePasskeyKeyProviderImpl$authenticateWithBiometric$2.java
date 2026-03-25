package com.okinc.auth.impl.passkey.provider;

import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.pUU;
import uniffi.account.OkxPasskeyException;

/* JADX INFO: loaded from: classes23.dex */
public final class NativePasskeyKeyProviderImpl$authenticateWithBiometric$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ BiometricPrompt.CryptoObject $cryptoObject;
    final /* synthetic */ Executor $executor;
    final /* synthetic */ BiometricPrompt.PromptInfo $promptInfo;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativePasskeyKeyProviderImpl$authenticateWithBiometric$2(FragmentActivity fragmentActivity, Executor executor, BiometricPrompt.CryptoObject cryptoObject, BiometricPrompt.PromptInfo promptInfo, Continuation<? super NativePasskeyKeyProviderImpl$authenticateWithBiometric$2> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$executor = executor;
        this.$cryptoObject = cryptoObject;
        this.$promptInfo = promptInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NativePasskeyKeyProviderImpl$authenticateWithBiometric$2(this.$activity, this.$executor, this.$cryptoObject, this.$promptInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NativePasskeyKeyProviderImpl$authenticateWithBiometric$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FragmentActivity fragmentActivity = this.$activity;
            Executor executor = this.$executor;
            BiometricPrompt.CryptoObject cryptoObject = this.$cryptoObject;
            BiometricPrompt.PromptInfo promptInfo = this.$promptInfo;
            this.L$0 = fragmentActivity;
            this.L$1 = executor;
            this.L$2 = cryptoObject;
            this.L$3 = promptInfo;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
            cancellableContinuationImpl.initCancellability();
            BiometricPrompt biometricPrompt = new BiometricPrompt(fragmentActivity, executor, new Activity(cancellableContinuationImpl));
            if (cryptoObject != null) {
                biometricPrompt.authenticate(promptInfo, cryptoObject);
            } else {
                biometricPrompt.authenticate(promptInfo);
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
            if (result == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    public static final class Activity extends BiometricPrompt.AuthenticationCallback {
        public final /* synthetic */ CancellableContinuation<Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(CancellableContinuation<? super Unit> cancellableContinuation) {
            this.copydefault = cancellableContinuation;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onAuthenticationError(int i, CharSequence charSequence) {
            Throwable userCancelled;
            Intrinsics.checkNotNullParameter(charSequence, "");
            pUU.KWHzl("NativePasskeyKeyProviderImpl", "onAuthenticationError " + ((Object) charSequence) + " " + ((Object) charSequence));
            if (this.copydefault.isActive()) {
                pUU.copydefault("NativePasskeyKeyProviderImpl", "onAuthenticationError errorCode: " + i);
                if (i == 5) {
                    userCancelled = new OkxPasskeyException.UserCancelled();
                } else if (i == 7) {
                    userCancelled = new OkxPasskeyException.DeviceLockout();
                } else if (i != 13) {
                    if (i != 9) {
                        if (i != 10) {
                            userCancelled = new OkxPasskeyException.KeyDataInvalid();
                        }
                    }
                }
                CancellableContinuation<Unit> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(userCancelled)));
            }
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
            Intrinsics.checkNotNullParameter(authenticationResult, "");
            pUU.KWHzl("NativePasskeyKeyProviderImpl", "onAuthenticationSucceeded crypto=" + (authenticationResult.getCryptoObject() != null));
            if (this.copydefault.isActive()) {
                CancellableContinuation<Unit> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }
    }
}

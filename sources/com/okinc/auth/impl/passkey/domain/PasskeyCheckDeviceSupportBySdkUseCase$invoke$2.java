package com.okinc.auth.impl.passkey.domain;

import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5903aFJ;
import o.C6617aSi;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyCheckDeviceSupportBySdkUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ C5903aFJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCheckDeviceSupportBySdkUseCase$invoke$2(C5903aFJ c5903aFJ, Continuation<? super PasskeyCheckDeviceSupportBySdkUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5903aFJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyCheckDeviceSupportBySdkUseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((PasskeyCheckDeviceSupportBySdkUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Task<Boolean> taskIsUserVerifyingPlatformAuthenticatorAvailable = this.this$0.EZpvd.isUserVerifyingPlatformAuthenticatorAvailable();
            Intrinsics.checkNotNullExpressionValue(taskIsUserVerifyingPlatformAuthenticatorAvailable, "");
            this.label = 1;
            obj = C6617aSi.EZpvd(taskIsUserVerifyingPlatformAuthenticatorAvailable, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Boolean bool = (Boolean) obj;
        pUU.AEQbTJ("passkey checkDeviceSupportBySdkUseCase: " + bool);
        return bool;
    }
}

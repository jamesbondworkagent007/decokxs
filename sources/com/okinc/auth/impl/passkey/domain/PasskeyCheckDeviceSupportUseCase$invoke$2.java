package com.okinc.auth.impl.passkey.domain;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5908aFO;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyCheckDeviceSupportUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5908aFO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCheckDeviceSupportUseCase$invoke$2(C5908aFO c5908aFO, Continuation<? super PasskeyCheckDeviceSupportUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5908aFO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyCheckDeviceSupportUseCase$invoke$2 passkeyCheckDeviceSupportUseCase$invoke$2 = new PasskeyCheckDeviceSupportUseCase$invoke$2(this.this$0, continuation);
        passkeyCheckDeviceSupportUseCase$invoke$2.L$0 = obj;
        return passkeyCheckDeviceSupportUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((PasskeyCheckDeviceSupportUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C5908aFO c5908aFO = this.this$0;
            try {
                Result.Application application = Result.Companion;
                boolean zAEQbTJ = c5908aFO.AEQbTJ();
                boolean zOLrzqt = c5908aFO.OLrzqt();
                pUU.AEQbTJ("passkey isDeviceSupportFido: sdkRequirement:" + zAEQbTJ + " / sdkInstalled:" + zOLrzqt);
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(zAEQbTJ && zOLrzqt));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Result.m7383isFailureimpl(objM7377constructorimpl) ? C56443yFo.KWHzl(false) : objM7377constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

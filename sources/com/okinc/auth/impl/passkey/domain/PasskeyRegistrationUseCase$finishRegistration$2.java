package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.api.passkey.PasskeyScenario;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5913aFT;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRegistrationUseCase$finishRegistration$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $responseJson;
    final /* synthetic */ PasskeyScenario $scenario;
    int label;
    final /* synthetic */ C5913aFT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRegistrationUseCase$finishRegistration$2(C5913aFT c5913aFT, String str, PasskeyScenario passkeyScenario, Continuation<? super PasskeyRegistrationUseCase$finishRegistration$2> continuation) {
        super(2, continuation);
        this.this$0 = c5913aFT;
        this.$responseJson = str;
        this.$scenario = passkeyScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRegistrationUseCase$finishRegistration$2(this.this$0, this.$responseJson, this.$scenario, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((PasskeyRegistrationUseCase$finishRegistration$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5913aFT c5913aFT = this.this$0;
            String str = this.$responseJson;
            PasskeyScenario passkeyScenario = this.$scenario;
            this.label = 1;
            objCopydefault = c5913aFT.copydefault(null, str, passkeyScenario, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objCopydefault);
    }
}

package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send;

import com.okinc.auth.impl.mfa.model.MfaFailure;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C5882aEp;

/* JADX INFO: loaded from: classes3.dex */
public final class SendCrossDeviceVerificationRequestViewModel$onMfaError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MfaFailure $error;
    int label;
    final /* synthetic */ SendCrossDeviceVerificationRequestViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendCrossDeviceVerificationRequestViewModel$onMfaError$1(MfaFailure mfaFailure, SendCrossDeviceVerificationRequestViewModel sendCrossDeviceVerificationRequestViewModel, Continuation<? super SendCrossDeviceVerificationRequestViewModel$onMfaError$1> continuation) {
        super(2, continuation);
        this.$error = mfaFailure;
        this.this$0 = sendCrossDeviceVerificationRequestViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SendCrossDeviceVerificationRequestViewModel$onMfaError$1(this.$error, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SendCrossDeviceVerificationRequestViewModel$onMfaError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5882aEp.KWHzl.KWHzl("[Send verification request]", "on MFA error, error=" + this.$error);
            MutableSharedFlow mutableSharedFlow = this.this$0.KWHzl;
            MfaFailure mfaFailure = this.$error;
            this.label = 1;
            if (mutableSharedFlow.emit(mfaFailure, this) == objCopydefault) {
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
}

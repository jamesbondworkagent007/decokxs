package com.okinc.auth.impl.passkey.ui.twofa;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyTwoFaOtpViewModel$getCountDownTimer$1$onFinish$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PasskeyTwoFaOtpViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyTwoFaOtpViewModel$getCountDownTimer$1$onFinish$1(PasskeyTwoFaOtpViewModel passkeyTwoFaOtpViewModel, Continuation<? super PasskeyTwoFaOtpViewModel$getCountDownTimer$1$onFinish$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyTwoFaOtpViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyTwoFaOtpViewModel$getCountDownTimer$1$onFinish$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyTwoFaOtpViewModel$getCountDownTimer$1$onFinish$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AkhnZx = false;
            MutableSharedFlow mutableSharedFlow = this.this$0.AhwBna;
            Boolean boolKWHzl = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.AYXKKw();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        MutableSharedFlow mutableSharedFlow2 = this.this$0.valueOf;
        Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
        this.label = 2;
        if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
            return objCopydefault;
        }
        this.this$0.AYXKKw();
        return Unit.INSTANCE;
    }
}

package com.okinc.auth.impl.passkey.ui.recover;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRecoverViewModel$clickReset$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PasskeyRecoverViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRecoverViewModel$clickReset$1(PasskeyRecoverViewModel passkeyRecoverViewModel, Continuation<? super PasskeyRecoverViewModel$clickReset$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyRecoverViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRecoverViewModel$clickReset$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyRecoverViewModel$clickReset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PasskeyRecoverViewModel passkeyRecoverViewModel = this.this$0;
            this.label = 1;
            obj = passkeyRecoverViewModel.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            MutableSharedFlow mutableSharedFlow = this.this$0.AhwBna;
            String strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.QVAiDq);
            this.label = 2;
            if (mutableSharedFlow.emit(strAYXKKw, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        MutableSharedFlow mutableSharedFlow2 = this.this$0.valueOf;
        Unit unit = Unit.INSTANCE;
        this.label = 3;
        if (mutableSharedFlow2.emit(unit, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}

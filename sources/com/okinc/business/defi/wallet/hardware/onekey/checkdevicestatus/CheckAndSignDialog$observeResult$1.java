package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckAndSignDialog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.eHO;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckAndSignDialog$observeResult$1 extends SuspendLambda implements Function2<eHO, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CheckAndSignDialog this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckAndSignDialog$observeResult$1(CheckAndSignDialog checkAndSignDialog, Continuation<? super CheckAndSignDialog$observeResult$1> continuation) {
        super(2, continuation);
        this.this$0 = checkAndSignDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheckAndSignDialog$observeResult$1 checkAndSignDialog$observeResult$1 = new CheckAndSignDialog$observeResult$1(this.this$0, continuation);
        checkAndSignDialog$observeResult$1.L$0 = obj;
        return checkAndSignDialog$observeResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(eHO eho, Continuation<? super Unit> continuation) {
        return ((CheckAndSignDialog$observeResult$1) create(eho, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            eHO eho = (eHO) this.L$0;
            if (eho == null) {
                return Unit.INSTANCE;
            }
            CheckAndSignDialog.StateListAnimator stateListAnimatorEZpvd = this.this$0.EZpvd();
            if (stateListAnimatorEZpvd != null) {
                stateListAnimatorEZpvd.EZpvd(eho);
            }
            this.this$0.dismiss();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.okinc.tradingbot.impl.strategy.fragment.detail;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C51015vez;
import o.C52179wBv;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;

/* JADX INFO: loaded from: classes17.dex */
public final class DcaOngoingFragment$initViewModel$4 extends SuspendLambda implements Function2<vNB<? extends C51015vez>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C52179wBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcaOngoingFragment$initViewModel$4(C52179wBv c52179wBv, Continuation<? super DcaOngoingFragment$initViewModel$4> continuation) {
        super(2, continuation);
        this.this$0 = c52179wBv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DcaOngoingFragment$initViewModel$4 dcaOngoingFragment$initViewModel$4 = new DcaOngoingFragment$initViewModel$4(this.this$0, continuation);
        dcaOngoingFragment$initViewModel$4.L$0 = obj;
        return dcaOngoingFragment$initViewModel$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends C51015vez> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<C51015vez>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<C51015vez> vnb, Continuation<? super Unit> continuation) {
        return ((DcaOngoingFragment$initViewModel$4) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            if (vnb instanceof vNB.StateListAnimator) {
                String message = ((vNB.StateListAnimator) vnb).AEQbTJ().getMessage();
                if (message != null) {
                    C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                }
            } else if (vnb instanceof vNB.TaskDescription) {
                this.this$0.AEQbTJ();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

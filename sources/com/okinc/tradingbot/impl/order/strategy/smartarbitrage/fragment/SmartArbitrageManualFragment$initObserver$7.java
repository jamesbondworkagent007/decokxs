package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment;

import com.okinc.tradingbot.impl.dto.HomeArbitrageResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C52903wbR;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;

/* JADX INFO: loaded from: classes16.dex */
public final class SmartArbitrageManualFragment$initObserver$7 extends SuspendLambda implements Function2<vNB<? extends HomeArbitrageResponse>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C52903wbR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbitrageManualFragment$initObserver$7(C52903wbR c52903wbR, Continuation<? super SmartArbitrageManualFragment$initObserver$7> continuation) {
        super(2, continuation);
        this.this$0 = c52903wbR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartArbitrageManualFragment$initObserver$7 smartArbitrageManualFragment$initObserver$7 = new SmartArbitrageManualFragment$initObserver$7(this.this$0, continuation);
        smartArbitrageManualFragment$initObserver$7.L$0 = obj;
        return smartArbitrageManualFragment$initObserver$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends HomeArbitrageResponse> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<HomeArbitrageResponse>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<HomeArbitrageResponse> vnb, Continuation<? super Unit> continuation) {
        return ((SmartArbitrageManualFragment$initObserver$7) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String message;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            if (vnb instanceof vNB.TaskDescription) {
                this.this$0.zsXlph();
                this.this$0.OLrzqt(((HomeArbitrageResponse) ((vNB.TaskDescription) vnb).AEQbTJ()).AEQbTJ());
            } else if ((vnb instanceof vNB.StateListAnimator) && (message = ((vNB.StateListAnimator) vnb).AEQbTJ().getMessage()) != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

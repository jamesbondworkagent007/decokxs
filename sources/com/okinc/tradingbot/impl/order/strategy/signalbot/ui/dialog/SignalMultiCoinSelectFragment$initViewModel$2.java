package com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.uSK;
import o.vZA;
import o.wYF;

/* JADX INFO: loaded from: classes11.dex */
public final class SignalMultiCoinSelectFragment$initViewModel$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ vZA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalMultiCoinSelectFragment$initViewModel$2(vZA vza, Continuation<? super SignalMultiCoinSelectFragment$initViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = vza;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignalMultiCoinSelectFragment$initViewModel$2 signalMultiCoinSelectFragment$initViewModel$2 = new SignalMultiCoinSelectFragment$initViewModel$2(this.this$0, continuation);
        signalMultiCoinSelectFragment$initViewModel$2.Z$0 = ((Boolean) obj).booleanValue();
        return signalMultiCoinSelectFragment$initViewModel$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((SignalMultiCoinSelectFragment$initViewModel$2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        wYF wyf;
        C52794wYp c52794wYpAEQbTJ;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            uSK usk = this.this$0.AhwBna;
            if (usk != null && (wyf = usk.KWHzl) != null && (c52794wYpAEQbTJ = wyf.AEQbTJ()) != null) {
                c52794wYpAEQbTJ.setEnabled(z);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

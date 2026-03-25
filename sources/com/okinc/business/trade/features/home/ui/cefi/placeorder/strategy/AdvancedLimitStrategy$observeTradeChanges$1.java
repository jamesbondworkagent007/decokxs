package com.okinc.business.trade.features.home.ui.cefi.placeorder.strategy;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C30626leh;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedLimitStrategy$observeTradeChanges$1 extends SuspendLambda implements yHO<C30626leh, String, Continuation<? super C30626leh>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedLimitStrategy$observeTradeChanges$1(Continuation<? super AdvancedLimitStrategy$observeTradeChanges$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(C30626leh c30626leh, String str, Continuation<? super C30626leh> continuation) {
        AdvancedLimitStrategy$observeTradeChanges$1 advancedLimitStrategy$observeTradeChanges$1 = new AdvancedLimitStrategy$observeTradeChanges$1(continuation);
        advancedLimitStrategy$observeTradeChanges$1.L$0 = c30626leh;
        advancedLimitStrategy$observeTradeChanges$1.L$1 = str;
        return advancedLimitStrategy$observeTradeChanges$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        C30626leh c30626leh = (C30626leh) this.L$0;
        return c30626leh.KWHzl((895 & 1) != 0 ? c30626leh.valueOf : null, (895 & 2) != 0 ? c30626leh.EZpvd : null, (895 & 4) != 0 ? c30626leh.AYXKKw : null, (895 & 8) != 0 ? c30626leh.AEQbTJ : null, (895 & 16) != 0 ? c30626leh.AhwBna : null, (895 & 32) != 0 ? c30626leh.OLrzqt : null, (895 & 64) != 0 ? c30626leh.KWHzl : false, (895 & 128) != 0 ? c30626leh.djBIcL : (String) this.L$1, (895 & 256) != 0 ? c30626leh.gEmmrt : null, (895 & 512) != 0 ? c30626leh.copydefault : null);
    }
}

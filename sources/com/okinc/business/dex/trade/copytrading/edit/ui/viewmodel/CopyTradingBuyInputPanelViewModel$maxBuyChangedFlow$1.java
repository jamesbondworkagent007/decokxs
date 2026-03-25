package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHT;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingBuyInputPanelViewModel$maxBuyChangedFlow$1 extends SuspendLambda implements yHT<Pair<? extends Boolean, ? extends String>, Boolean, Boolean, Continuation<? super Pair<? extends Boolean, ? extends String>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradingBuyInputPanelViewModel$maxBuyChangedFlow$1(Continuation<? super CopyTradingBuyInputPanelViewModel$maxBuyChangedFlow$1> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(Pair<? extends Boolean, ? extends String> pair, Boolean bool, Boolean bool2, Continuation<? super Pair<? extends Boolean, ? extends String>> continuation) {
        return invoke((Pair<Boolean, String>) pair, bool.booleanValue(), bool2.booleanValue(), (Continuation<? super Pair<Boolean, String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(Pair<Boolean, String> pair, boolean z, boolean z2, Continuation<? super Pair<Boolean, String>> continuation) {
        CopyTradingBuyInputPanelViewModel$maxBuyChangedFlow$1 copyTradingBuyInputPanelViewModel$maxBuyChangedFlow$1 = new CopyTradingBuyInputPanelViewModel$maxBuyChangedFlow$1(continuation);
        copyTradingBuyInputPanelViewModel$maxBuyChangedFlow$1.L$0 = pair;
        copyTradingBuyInputPanelViewModel$maxBuyChangedFlow$1.Z$0 = z;
        copyTradingBuyInputPanelViewModel$maxBuyChangedFlow$1.Z$1 = z2;
        return copyTradingBuyInputPanelViewModel$maxBuyChangedFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            boolean z = this.Z$0;
            return C56390yDp.OLrzqt(C56443yFo.KWHzl((this.Z$1 && z && !((Boolean) pair.component1()).booleanValue()) ? false : true), (String) pair.component2());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

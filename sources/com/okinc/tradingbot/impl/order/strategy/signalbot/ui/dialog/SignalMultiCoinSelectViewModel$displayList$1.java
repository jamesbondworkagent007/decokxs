package com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog;

import com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class SignalMultiCoinSelectViewModel$displayList$1 extends SuspendLambda implements yHO<List<? extends SignalMultiCoinPairSelectItemData>, String, Continuation<? super Pair<? extends List<? extends SignalMultiCoinPairSelectItemData>, ? extends String>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalMultiCoinSelectViewModel$displayList$1(Continuation<? super SignalMultiCoinSelectViewModel$displayList$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(List<? extends SignalMultiCoinPairSelectItemData> list, String str, Continuation<? super Pair<? extends List<? extends SignalMultiCoinPairSelectItemData>, ? extends String>> continuation) {
        return invoke2((List<SignalMultiCoinPairSelectItemData>) list, str, (Continuation<? super Pair<? extends List<SignalMultiCoinPairSelectItemData>, String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<SignalMultiCoinPairSelectItemData> list, String str, Continuation<? super Pair<? extends List<SignalMultiCoinPairSelectItemData>, String>> continuation) {
        SignalMultiCoinSelectViewModel$displayList$1 signalMultiCoinSelectViewModel$displayList$1 = new SignalMultiCoinSelectViewModel$displayList$1(continuation);
        signalMultiCoinSelectViewModel$displayList$1.L$0 = list;
        signalMultiCoinSelectViewModel$displayList$1.L$1 = str;
        return signalMultiCoinSelectViewModel$displayList$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56390yDp.OLrzqt((List) this.L$0, (String) this.L$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

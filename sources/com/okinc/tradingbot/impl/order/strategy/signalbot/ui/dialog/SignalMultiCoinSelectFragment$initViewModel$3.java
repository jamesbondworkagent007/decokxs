package com.okinc.tradingbot.impl.order.strategy.signalbot.ui.dialog;

import com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33070mpX;
import o.C52794wYp;
import o.C55688xof;
import o.C56391yDq;
import o.C56442yFn;
import o.pTB;
import o.uSK;
import o.vZA;
import o.wYF;

/* JADX INFO: loaded from: classes11.dex */
public final class SignalMultiCoinSelectFragment$initViewModel$3 extends SuspendLambda implements Function2<List<? extends SignalMultiCoinPairSelectItemData>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ vZA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalMultiCoinSelectFragment$initViewModel$3(vZA vza, Continuation<? super SignalMultiCoinSelectFragment$initViewModel$3> continuation) {
        super(2, continuation);
        this.this$0 = vza;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignalMultiCoinSelectFragment$initViewModel$3 signalMultiCoinSelectFragment$initViewModel$3 = new SignalMultiCoinSelectFragment$initViewModel$3(this.this$0, continuation);
        signalMultiCoinSelectFragment$initViewModel$3.L$0 = obj;
        return signalMultiCoinSelectFragment$initViewModel$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends SignalMultiCoinPairSelectItemData> list, Continuation<? super Unit> continuation) {
        return invoke2((List<SignalMultiCoinPairSelectItemData>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<SignalMultiCoinPairSelectItemData> list, Continuation<? super Unit> continuation) {
        return ((SignalMultiCoinSelectFragment$initViewModel$3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        wYF wyf;
        C52794wYp c52794wYpCopydefault;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            String str = C33070mpX.AYXKKw(C55688xof.Application.FF) + " (" + pTB.formatLocalized$default(String.valueOf(list.size()), null, 1, null) + ")";
            uSK usk = this.this$0.AhwBna;
            if (usk != null && (wyf = usk.KWHzl) != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                c52794wYpCopydefault.setText(str);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.okinc.find_ui.ranking.stock;

import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC34993nmt;
import o.C27563jxZ;
import o.C35095nop;
import o.C56391yDq;
import o.C56442yFn;
import o.sZQ;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeStockRankingContainerFragment$jumpToMarkets$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35095nop this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeStockRankingContainerFragment$jumpToMarkets$1(C35095nop c35095nop, Continuation<? super MarketHomeStockRankingContainerFragment$jumpToMarkets$1> continuation) {
        super(2, continuation);
        this.this$0 = c35095nop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeStockRankingContainerFragment$jumpToMarkets$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeStockRankingContainerFragment$jumpToMarkets$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (C27563jxZ.OLrzqt.fetchVPNInfo()) {
                Context context = this.this$0.getContext();
                if (context != null) {
                    sZQ.EZpvd.AEQbTJ(context, "Stock");
                }
            } else {
                this.this$0.startActivity(new Intent(this.this$0.getContext(), (Class<?>) ActivityC34993nmt.class));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.gWP;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyViewModel$trackSubmitClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $autoSell;
    final /* synthetic */ String $buyType;
    final /* synthetic */ boolean $copySell;
    final /* synthetic */ boolean $isMaxBuy;
    final /* synthetic */ boolean $skipHl;
    final /* synthetic */ TokenFilter $tokenFilter;
    int label;
    final /* synthetic */ CopyTradingEditStrategyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyViewModel$trackSubmitClick$1(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, String str, boolean z, boolean z2, boolean z3, boolean z4, TokenFilter tokenFilter, Continuation<? super CopyTradingEditStrategyViewModel$trackSubmitClick$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyViewModel;
        this.$buyType = str;
        this.$isMaxBuy = z;
        this.$skipHl = z2;
        this.$copySell = z3;
        this.$autoSell = z4;
        this.$tokenFilter = tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyViewModel$trackSubmitClick$1(this.this$0, this.$buyType, this.$isMaxBuy, this.$skipHl, this.$copySell, this.$autoSell, this.$tokenFilter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyViewModel$trackSubmitClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            gWP gwp = this.this$0.fJNWhG;
            String strEZpvd = this.this$0.EZpvd();
            String str = this.$buyType;
            boolean z = this.$isMaxBuy;
            boolean z2 = this.$skipHl;
            boolean z3 = this.$copySell;
            boolean z4 = this.$autoSell;
            String threshold = this.$tokenFilter.getThreshold();
            if (threshold == null) {
                threshold = "";
            }
            String maxThreshold = this.$tokenFilter.getMaxThreshold();
            if (maxThreshold == null) {
                maxThreshold = "";
            }
            gwp.KWHzl(strEZpvd, str, z, z2, z3, z4, threshold, maxThreshold, this.$tokenFilter.getMinMc(), this.$tokenFilter.getMaxMc(), this.$tokenFilter.getMinLiquidity(), this.$tokenFilter.getMaxLiquidity(), this.$tokenFilter.getMinAge(), this.$tokenFilter.getMaxAge(), this.$tokenFilter.getBlackCoinList().toString(), this.this$0.valueOf());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

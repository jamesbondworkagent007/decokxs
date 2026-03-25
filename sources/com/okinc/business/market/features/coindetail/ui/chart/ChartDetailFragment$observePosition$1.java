package com.okinc.business.market.features.coindetail.ui.chart;

import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class ChartDetailFragment$observePosition$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ChartDetailFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartDetailFragment$observePosition$1(ChartDetailFragment chartDetailFragment, Continuation<? super ChartDetailFragment$observePosition$1> continuation) {
        super(2, continuation);
        this.this$0 = chartDetailFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartDetailFragment$observePosition$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartDetailFragment$observePosition$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ChartDetailFragment chartDetailFragment;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketCoinDetailViewModel marketCoinDetailViewModelDjBIcL = this.this$0.djBIcL();
            this.label = 1;
            obj = marketCoinDetailViewModelDjBIcL.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chartDetailFragment = (ChartDetailFragment) this.L$0;
                C56391yDq.AEQbTJ(obj);
                chartDetailFragment.fetchVPNInfo();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        ((CharSequence) obj).length();
        ChartDetailFragment chartDetailFragment2 = this.this$0;
        this.L$0 = chartDetailFragment2;
        this.label = 2;
        if (DelayKt.delay(1000L, this) == objCopydefault) {
            return objCopydefault;
        }
        chartDetailFragment = chartDetailFragment2;
        chartDetailFragment.fetchVPNInfo();
        return Unit.INSTANCE;
    }
}

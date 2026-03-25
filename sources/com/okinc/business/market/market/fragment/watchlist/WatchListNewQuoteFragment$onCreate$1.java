package com.okinc.business.market.market.fragment.watchlist;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.tradeapi.bean.MarketDataSource;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.kIH;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListNewQuoteFragment$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kIH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListNewQuoteFragment$onCreate$1(kIH kih, Continuation<? super WatchListNewQuoteFragment$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = kih;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListNewQuoteFragment$onCreate$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListNewQuoteFragment$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowConflate = FlowKt.conflate(this.this$0.EZpvd().copydefault());
            final kIH kih = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$onCreate$1.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(ArrayList<Pair<CoinQuote, MarketDataSource>> arrayList, Continuation<? super Unit> continuation) {
                    if (!kih.KWHzl && !kih.valueOf()) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(kih), null, null, new WatchListNewQuoteFragment$onCreate$1$1$1(kih, arrayList, null), 3, null);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowConflate.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

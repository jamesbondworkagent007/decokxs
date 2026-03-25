package com.okinc.kline.ui;

import android.widget.TextView;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC36020oMh;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.oZM;

/* JADX INFO: loaded from: classes23.dex */
public final class CoinInfoChartFragment$startWsWork$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ oZM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinInfoChartFragment$startWsWork$1(oZM ozm, Continuation<? super CoinInfoChartFragment$startWsWork$1> continuation) {
        super(2, continuation);
        this.this$0 = ozm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinInfoChartFragment$startWsWork$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinInfoChartFragment$startWsWork$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oZM ozm = this.this$0;
            String str = ozm.EZpvd;
            if (str == null) {
                str = "";
            }
            Flow<List<TickersData>> flowKWHzl = ozm.KWHzl(C56402yEa.EZpvd(str));
            final oZM ozm2 = this.this$0;
            FlowCollector<? super List<TickersData>> flowCollector = new FlowCollector() { // from class: com.okinc.kline.ui.CoinInfoChartFragment$startWsWork$1.1
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<TickersData> list, Continuation<? super Unit> continuation) {
                    TextView textView;
                    if (!list.isEmpty()) {
                        ozm2.KWHzl = (TickersData) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
                        AbstractC36020oMh abstractC36020oMh = ozm2.isConnected;
                        if (abstractC36020oMh != null && (textView = abstractC36020oMh.AhwBna) != null && textView.getVisibility() == 4) {
                            ozm2.AEQbTJ();
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowKWHzl.collect(flowCollector, this) == objCopydefault) {
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

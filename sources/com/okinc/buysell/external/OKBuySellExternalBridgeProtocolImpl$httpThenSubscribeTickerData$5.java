package com.okinc.buysell.external;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$5 extends SuspendLambda implements Function2<FlowCollector<? super Map<String, ? extends TickersData>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$5(Continuation<? super OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$5> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$5 oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$5 = new OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$5(continuation);
        oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$5.L$0 = obj;
        return oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Map<String, ? extends TickersData>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Map<String, TickersData>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Map<String, TickersData>> flowCollector, Continuation<? super Unit> continuation) {
        return ((OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$5) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Map mapKWHzl = C56424yEw.KWHzl();
            this.label = 1;
            if (flowCollector.emit(mapKWHzl, this) == objCopydefault) {
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

package com.okinc.buysell.external;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$2 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends Pair<? extends String, ? extends TickersData>>>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$2(Continuation<? super OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$2> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends Pair<? extends String, ? extends TickersData>>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<Pair<String, TickersData>>>) flowCollector, th, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<Pair<String, TickersData>>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$2 oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$2 = new OKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$2(continuation);
        oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$2.L$0 = flowCollector;
        return oKBuySellExternalBridgeProtocolImpl$httpThenSubscribeTickerData$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List listAhwBna = yDY.AhwBna();
            this.label = 1;
            if (flowCollector.emit(listAhwBna, this) == objCopydefault) {
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

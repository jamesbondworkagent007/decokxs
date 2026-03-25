package com.okinc.buysell.external;

import com.okinc.okex.lite.home.bean.LiteUserResidenceType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.svI;

/* JADX INFO: loaded from: classes7.dex */
public final class OKBuySellExternalBridgeProtocolImpl$getLiteUserResidenceTypeLegacy$2 extends SuspendLambda implements Function2<FlowCollector<? super LiteUserResidenceType>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKBuySellExternalBridgeProtocolImpl$getLiteUserResidenceTypeLegacy$2(Continuation<? super OKBuySellExternalBridgeProtocolImpl$getLiteUserResidenceTypeLegacy$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKBuySellExternalBridgeProtocolImpl$getLiteUserResidenceTypeLegacy$2 oKBuySellExternalBridgeProtocolImpl$getLiteUserResidenceTypeLegacy$2 = new OKBuySellExternalBridgeProtocolImpl$getLiteUserResidenceTypeLegacy$2(continuation);
        oKBuySellExternalBridgeProtocolImpl$getLiteUserResidenceTypeLegacy$2.L$0 = obj;
        return oKBuySellExternalBridgeProtocolImpl$getLiteUserResidenceTypeLegacy$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super LiteUserResidenceType> flowCollector, Continuation<? super Unit> continuation) {
        return ((OKBuySellExternalBridgeProtocolImpl$getLiteUserResidenceTypeLegacy$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            svI svi = (svI) C43251rlk.copydefault(svI.class);
            this.L$0 = flowCollector;
            this.label = 1;
            obj = svi.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}

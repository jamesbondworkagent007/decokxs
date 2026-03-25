package com.okinc.buysell.external;

import com.okinc.biz.model.SupportService;
import com.okinc.okx.paymentapi.service.SmartBotParams;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C6811aWS;
import o.InterfaceC6804aWL;

/* JADX INFO: loaded from: classes7.dex */
public final class OKBuySellExternalBridgeProtocolImpl$getSupportEntrance$1 extends SuspendLambda implements Function2<FlowCollector<? super SupportService>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $entranceId;
    final /* synthetic */ SmartBotParams $smartBotParams;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKBuySellExternalBridgeProtocolImpl$getSupportEntrance$1(String str, SmartBotParams smartBotParams, Continuation<? super OKBuySellExternalBridgeProtocolImpl$getSupportEntrance$1> continuation) {
        super(2, continuation);
        this.$entranceId = str;
        this.$smartBotParams = smartBotParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKBuySellExternalBridgeProtocolImpl$getSupportEntrance$1 oKBuySellExternalBridgeProtocolImpl$getSupportEntrance$1 = new OKBuySellExternalBridgeProtocolImpl$getSupportEntrance$1(this.$entranceId, this.$smartBotParams, continuation);
        oKBuySellExternalBridgeProtocolImpl$getSupportEntrance$1.L$0 = obj;
        return oKBuySellExternalBridgeProtocolImpl$getSupportEntrance$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super SupportService> flowCollector, Continuation<? super Unit> continuation) {
        return ((OKBuySellExternalBridgeProtocolImpl$getSupportEntrance$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            SmartBotParams smartBotParams = this.$smartBotParams;
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "currency", smartBotParams.copydefault());
            JsonElementBuildersKt.put(jsonObjectBuilder, "tradeType", smartBotParams.gEmmrt().getType());
            JsonElementBuildersKt.put(jsonObjectBuilder, "depositPlatformCode", smartBotParams.OLrzqt());
            JsonElementBuildersKt.put(jsonObjectBuilder, "fromPage", smartBotParams.AYXKKw());
            JsonElementBuildersKt.put(jsonObjectBuilder, "orderId", smartBotParams.AhwBna());
            JsonElementBuildersKt.put(jsonObjectBuilder, OtcExtraKeys.AMOUNT, smartBotParams.EZpvd());
            JsonElementBuildersKt.put(jsonObjectBuilder, "errorCode", smartBotParams.AEQbTJ());
            JsonElementBuildersKt.put(jsonObjectBuilder, "flow", smartBotParams.KWHzl());
            C6811aWS c6811aWS = new C6811aWS(this.$entranceId, null, null, jsonObjectBuilder.build(), 6, null);
            InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class);
            this.L$0 = flowCollector;
            this.label = 1;
            obj = interfaceC6804aWL.AEQbTJ(c6811aWS, this);
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

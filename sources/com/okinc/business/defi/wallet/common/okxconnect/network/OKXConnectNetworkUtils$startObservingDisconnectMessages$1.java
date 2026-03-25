package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.DisconnectedTopic;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcMessage;
import com.reown.android.push.notifications.PushMessagingService;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.AbstractC57572yku;
import o.C16000ebf;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$startObservingDisconnectMessages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$startObservingDisconnectMessages$1(C16000ebf c16000ebf, Continuation<? super OKXConnectNetworkUtils$startObservingDisconnectMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectNetworkUtils$startObservingDisconnectMessages$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectNetworkUtils$startObservingDisconnectMessages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("OKXConnectNetworkUtils", "startObservingDisconnectMessages");
            SharedFlow<DisconnectedTopic> sharedFlowDjBIcL = this.this$0.djBIcL();
            final C16000ebf c16000ebf = this.this$0;
            FlowCollector<? super DisconnectedTopic> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$startObservingDisconnectMessages$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(DisconnectedTopic disconnectedTopic, Continuation<? super Unit> continuation) {
                    String topic = disconnectedTopic.getTopic();
                    JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                    JsonElementBuildersKt.put(jsonObjectBuilder, PushMessagingService.KEY_TOPIC, topic);
                    Unit unit = Unit.INSTANCE;
                    RpcMessage rpcMessage = new RpcMessage((String) null, (String) null, "receiveDisconnect", jsonObjectBuilder.build(), 3, (DefaultConstructorMarker) null);
                    pUU.KWHzl("OKXConnectNetworkUtils", "onDisconnectReceived " + rpcMessage);
                    AbstractC57572yku abstractC57572ykuFetchVPNInfo = c16000ebf.fetchVPNInfo();
                    Json jsonKWHzl = c16000ebf.KWHzl();
                    jsonKWHzl.getSerializersModule();
                    abstractC57572ykuFetchVPNInfo.copydefault(jsonKWHzl.encodeToString(RpcMessage.Companion.serializer(), rpcMessage));
                    return unit;
                }
            };
            this.label = 1;
            if (sharedFlowDjBIcL.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}

package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.DisconnectedTopic;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse;
import com.okinc.core.livelistener.OKIncomingData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.serialization.json.Json;
import o.C16000ebf;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$webSocketService$2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKIncomingData $data;
    Object L$0;
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$webSocketService$2$2$1(C16000ebf c16000ebf, OKIncomingData oKIncomingData, Continuation<? super OKXConnectNetworkUtils$webSocketService$2$2$1> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
        this.$data = oKIncomingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectNetworkUtils$webSocketService$2$2$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectNetworkUtils$webSocketService$2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        RpcResponse rpcResponse;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("OKXConnectNetworkUtils", "Handle incoming message failed: " + e.getMessage(), e);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Json jsonKWHzl = this.this$0.KWHzl();
            String originMsg = this.$data.getOriginMsg();
            if (originMsg == null) {
                originMsg = "";
            }
            jsonKWHzl.getSerializersModule();
            rpcResponse = (RpcResponse) jsonKWHzl.decodeFromString(RpcResponse.Companion.serializer(), originMsg);
            MutableSharedFlow mutableSharedFlow = this.this$0.fJNWhG;
            this.L$0 = rpcResponse;
            this.label = 1;
            if (mutableSharedFlow.emit(rpcResponse, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            rpcResponse = (RpcResponse) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (rpcResponse instanceof RpcResponse.Disconnect) {
            MutableSharedFlow mutableSharedFlow2 = this.this$0.copydefault;
            DisconnectedTopic data = ((RpcResponse.Disconnect) rpcResponse).getParams().getData();
            this.L$0 = null;
            this.label = 2;
            if (mutableSharedFlow2.emit(data, this) == objCopydefault) {
                return objCopydefault;
            }
        } else if (rpcResponse instanceof RpcResponse.Push) {
            MutableSharedFlow mutableSharedFlow3 = this.this$0.fIwbmz;
            this.L$0 = null;
            this.label = 3;
            if (mutableSharedFlow3.emit(rpcResponse, this) == objCopydefault) {
                return objCopydefault;
            }
        } else if (rpcResponse instanceof RpcResponse.FetchSuccess) {
            MutableSharedFlow mutableSharedFlow4 = this.this$0.AkhnZx;
            this.L$0 = null;
            this.label = 4;
            if (mutableSharedFlow4.emit(rpcResponse, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}

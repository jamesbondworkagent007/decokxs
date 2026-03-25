package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcMessage;
import com.reown.android.push.notifications.PushMessagingService;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C16000ebf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$fetchMessages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isWithInternalData;
    final /* synthetic */ String $topic;
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$fetchMessages$1(C16000ebf c16000ebf, String str, boolean z, Continuation<? super OKXConnectNetworkUtils$fetchMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
        this.$topic = str;
        this.$isWithInternalData = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectNetworkUtils$fetchMessages$1(this.this$0, this.$topic, this.$isWithInternalData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectNetworkUtils$fetchMessages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$topic;
            boolean z = this.$isWithInternalData;
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, PushMessagingService.KEY_TOPIC, str);
            if (z) {
                JsonElementBuildersKt.put(jsonObjectBuilder, "withInternalData", C56443yFo.KWHzl(true));
            }
            Unit unit = Unit.INSTANCE;
            RpcMessage rpcMessage = new RpcMessage((String) null, (String) null, "fetchMessages", jsonObjectBuilder.build(), 3, (DefaultConstructorMarker) null);
            C16000ebf c16000ebf = this.this$0;
            this.label = 1;
            if (c16000ebf.KWHzl(rpcMessage, false, (Continuation<? super Result<Unit>>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        return Unit.INSTANCE;
    }
}

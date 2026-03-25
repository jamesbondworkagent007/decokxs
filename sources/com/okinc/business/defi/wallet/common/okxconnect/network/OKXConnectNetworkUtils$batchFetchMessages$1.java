package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$batchFetchMessages$1;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C16000ebf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$batchFetchMessages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $topics;
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$batchFetchMessages$1(C16000ebf c16000ebf, List<String> list, Continuation<? super OKXConnectNetworkUtils$batchFetchMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
        this.$topics = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectNetworkUtils$batchFetchMessages$1(this.this$0, this.$topics, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectNetworkUtils$batchFetchMessages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final List<String> list = this.$topics;
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.putJsonArray(jsonObjectBuilder, "topics", new Function1() { // from class: o.ebi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return OKXConnectNetworkUtils$batchFetchMessages$1.invokeSuspend$lambda$2$lambda$1(list, (JsonArrayBuilder) obj2);
                }
            });
            Unit unit = Unit.INSTANCE;
            RpcMessage rpcMessage = new RpcMessage((String) null, (String) null, "batchFetchMessages", jsonObjectBuilder.build(), 3, (DefaultConstructorMarker) null);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(List list, JsonArrayBuilder jsonArrayBuilder) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JsonElementBuildersKt.add(jsonArrayBuilder, (String) it.next());
        }
        return Unit.INSTANCE;
    }
}

package com.okinc.business.defi.wallet.common.tonconnect.network;

import com.google.common.net.HttpHeaders;
import com.okinc.business.defi.wallet.common.tonconnect.network.SSEvent;
import com.okinc.business.defi.wallet.common.tonconnect.network.TonConnectNetworkUtils$sse$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.serialization.json.Json;
import o.C16066ecs;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import okhttp3.sse.EventSources;

/* JADX INFO: loaded from: classes4.dex */
public final class TonConnectNetworkUtils$sse$1 extends SuspendLambda implements Function2<ProducerScope<? super SSEvent>, Continuation<? super Unit>, Object> {
    final /* synthetic */ OkHttpClient $this_sse;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C16066ecs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonConnectNetworkUtils$sse$1(C16066ecs c16066ecs, String str, OkHttpClient okHttpClient, Continuation<? super TonConnectNetworkUtils$sse$1> continuation) {
        super(2, continuation);
        this.this$0 = c16066ecs;
        this.$url = str;
        this.$this_sse = okHttpClient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TonConnectNetworkUtils$sse$1 tonConnectNetworkUtils$sse$1 = new TonConnectNetworkUtils$sse$1(this.this$0, this.$url, this.$this_sse, continuation);
        tonConnectNetworkUtils$sse$1.L$0 = obj;
        return tonConnectNetworkUtils$sse$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super SSEvent> producerScope, Continuation<? super Unit> continuation) {
        return ((TonConnectNetworkUtils$sse$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar extends EventSourceListener {
        public final /* synthetic */ C16066ecs AEQbTJ;
        public final /* synthetic */ ProducerScope<SSEvent> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super com.okinc.business.defi.wallet.common.tonconnect.network.SSEvent> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(C16066ecs c16066ecs, ProducerScope<? super SSEvent> producerScope) {
            this.AEQbTJ = c16066ecs;
            this.OLrzqt = producerScope;
        }

        @Override // okhttp3.sse.EventSourceListener
        public void onEvent(EventSource eventSource, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(eventSource, "");
            Intrinsics.checkNotNullParameter(str3, "");
            pUU.EZpvd("TonConnectNetworkUtils", "sse onEvent " + str + ", " + str2 + ", " + str3 + "}");
            Json json = this.AEQbTJ.copydefault;
            json.getSerializersModule();
            this.OLrzqt.mo5769trySendJP2dKIU(new SSEvent(str, str2, (SSEvent.BridgeMessage) json.decodeFromString(SSEvent.BridgeMessage.Companion.serializer(), str3)));
        }

        @Override // okhttp3.sse.EventSourceListener
        public void onFailure(EventSource eventSource, Throwable th, Response response) {
            Intrinsics.checkNotNullParameter(eventSource, "");
            this.OLrzqt.close(th);
        }

        @Override // okhttp3.sse.EventSourceListener
        public void onClosed(EventSource eventSource) {
            Intrinsics.checkNotNullParameter(eventSource, "");
            SendChannel.DefaultImpls.close$default(this.OLrzqt, null, 1, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            ActionBar actionBar = new ActionBar(this.this$0, producerScope);
            final EventSource eventSourceNewEventSource = EventSources.createFactory(this.$this_sse).newEventSource(this.this$0.AEQbTJ(this.$url).addHeader(HttpHeaders.ACCEPT, "text/event-stream").addHeader("Cache-Control", "no-cache").addHeader(HttpHeaders.CONNECTION, "keep-alive").build(), actionBar);
            Function0 function0 = new Function0() { // from class: o.ecq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return TonConnectNetworkUtils$sse$1.invokeSuspend$lambda$0(eventSourceNewEventSource);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(EventSource eventSource) {
        eventSource.cancel();
        return Unit.INSTANCE;
    }
}

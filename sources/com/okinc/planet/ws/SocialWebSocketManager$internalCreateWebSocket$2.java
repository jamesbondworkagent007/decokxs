package com.okinc.planet.ws;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.planet.ws.SocialWebSocketManager$internalCreateWebSocket$2;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.serialization.DeserializationStrategy;
import o.AbstractC33132mqg;
import o.AbstractC57556yke;
import o.C33489mxS;
import o.C43296rmc;
import o.C56391yDq;
import o.C56442yFn;
import o.C57554ykc;
import o.C57567ykp;
import o.InterfaceC57559ykh;
import o.pUU;
import o.tWG;
import o.yDY;

/* JADX INFO: Add missing generic type declarations: [Output] */
/* JADX INFO: loaded from: classes10.dex */
public final class SocialWebSocketManager$internalCreateWebSocket$2<Output> extends SuspendLambda implements Function2<ProducerScope<? super Output>, Continuation<? super Unit>, Object> {
    final /* synthetic */ WsArgV5 $arg;
    final /* synthetic */ Function1<T, Output> $mapper;
    final /* synthetic */ DeserializationStrategy<T> $serializer;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tWG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.serialization.DeserializationStrategy<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super T, ? extends Output> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SocialWebSocketManager$internalCreateWebSocket$2(tWG twg, WsArgV5 wsArgV5, DeserializationStrategy<? extends T> deserializationStrategy, Function1<? super T, ? extends Output> function1, Continuation<? super SocialWebSocketManager$internalCreateWebSocket$2> continuation) {
        super(2, continuation);
        this.this$0 = twg;
        this.$arg = wsArgV5;
        this.$serializer = deserializationStrategy;
        this.$mapper = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SocialWebSocketManager$internalCreateWebSocket$2 socialWebSocketManager$internalCreateWebSocket$2 = new SocialWebSocketManager$internalCreateWebSocket$2(this.this$0, this.$arg, this.$serializer, this.$mapper, continuation);
        socialWebSocketManager$internalCreateWebSocket$2.L$0 = obj;
        return socialWebSocketManager$internalCreateWebSocket$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Output> producerScope, Continuation<? super Unit> continuation) {
        return ((SocialWebSocketManager$internalCreateWebSocket$2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            C57567ykp c57567ykpOLrzqt = this.this$0.OLrzqt();
            if (c57567ykpOLrzqt == null) {
                return Unit.INSTANCE;
            }
            C43296rmc.AEQbTJ("SocialTradingWebSocketManager", "Setting up listener: " + this.$arg.getUniqueKey() + "?extra=" + this.$arg.getExtraParams());
            C57554ykc.Application application = C57554ykc.Companion;
            String channel = this.$arg.getChannel();
            ArrayList<? extends InterfaceC57559ykh> arrayListCopydefault = yDY.copydefault(this.$arg);
            final DeserializationStrategy<T> deserializationStrategy = this.$serializer;
            final Function1<T, Output> function1 = this.$mapper;
            final AbstractC57556yke abstractC57556ykeAEQbTJ = application.AEQbTJ(channel, c57567ykpOLrzqt, arrayListCopydefault, new Function2() { // from class: o.tWI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return SocialWebSocketManager$internalCreateWebSocket$2.invokeSuspend$lambda$1(producerScope, deserializationStrategy, function1, (AbstractC33132mqg) obj2, (OKIncomingData) obj3);
                }
            });
            abstractC57556ykeAEQbTJ.AhwBna();
            Function0 function0 = new Function0() { // from class: o.tWH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SocialWebSocketManager$internalCreateWebSocket$2.invokeSuspend$lambda$2(abstractC57556ykeAEQbTJ);
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
    public static final Unit invokeSuspend$lambda$1(ProducerScope producerScope, DeserializationStrategy deserializationStrategy, Function1 function1, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Object payload = oKIncomingData.getPayload();
        String str = payload instanceof String ? (String) payload : null;
        if (str == null) {
            return Unit.INSTANCE;
        }
        try {
            Result.Application application = Result.Companion;
            pUU.EZpvd("SocialTradingWebSocketManager", "trySend is " + ChannelResult.m7430isSuccessimpl(producerScope.mo5769trySendJP2dKIU(function1.invoke(C33489mxS.KWHzl.OLrzqt(deserializationStrategy, str)))));
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(AbstractC57556yke abstractC57556yke) {
        abstractC57556yke.djBIcL();
        C43296rmc.AEQbTJ("SocialTradingWebSocketManager", "Listener is stopped!!");
        return Unit.INSTANCE;
    }
}

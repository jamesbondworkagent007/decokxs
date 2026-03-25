package com.okinc.business.invest_biz.data.logic.ws;

import androidx.exifinterface.media.ExifInterface;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializersKt;
import o.AbstractC33132mqg;
import o.AbstractC57556yke;
import o.AbstractC58185ywX;
import o.C23597iCg;
import o.C33489mxS;
import o.C56391yDq;
import o.C56442yFn;
import o.C56519yIj;
import o.C57554ykc;
import o.C57567ykp;
import o.InterfaceC56559yJw;
import o.InterfaceC57559ykh;
import o.pUU;
import o.yDY;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes23.dex */
public final class InvestWebSocketManager$createWebSocket$1<T> extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C23597iCg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestWebSocketManager$createWebSocket$1(String str, C23597iCg c23597iCg, Continuation<? super InvestWebSocketManager$createWebSocket$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = c23597iCg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.OLrzqt();
        InvestWebSocketManager$createWebSocket$1 investWebSocketManager$createWebSocket$1 = new InvestWebSocketManager$createWebSocket$1(this.$channelId, this.this$0, continuation);
        investWebSocketManager$createWebSocket$1.L$0 = obj;
        return investWebSocketManager$createWebSocket$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        return ((InvestWebSocketManager$createWebSocket$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Application implements Function2<AbstractC33132mqg, OKIncomingData, Unit> {
        public final /* synthetic */ ProducerScope<T> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(ProducerScope<? super T> producerScope) {
            this.EZpvd = producerScope;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
            copydefault(abstractC33132mqg, oKIncomingData);
            return Unit.INSTANCE;
        }

        public final void copydefault(AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
            Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
            Intrinsics.checkNotNullParameter(oKIncomingData, "");
            Object payload = oKIncomingData.getPayload();
            String str = payload instanceof String ? (String) payload : null;
            if (str == null) {
                return;
            }
            try {
                ProducerScope<T> producerScope = this.EZpvd;
                C33489mxS c33489mxS = C33489mxS.KWHzl;
                Intrinsics.KWHzl(6, ExifInterface.GPS_DIRECTION_TRUE);
                C56519yIj.copydefault("kotlinx.serialization.serializer.simple");
                producerScope.mo5769trySendJP2dKIU((T) c33489mxS.OLrzqt((DeserializationStrategy) SerializersKt.serializer((InterfaceC56559yJw) null), str));
            } catch (Throwable th) {
                pUU.AEQbTJ("InvestWebSocketManager", "Failed to decode", th);
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProducerScope producerScope;
        AbstractC57556yke abstractC57556ykeAEQbTJ;
        Object objAwaitFirst;
        final AbstractC57556yke abstractC57556yke;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                producerScope = (ProducerScope) this.L$0;
                C57554ykc.Application application = C57554ykc.Companion;
                String str = this.$channelId;
                C57567ykp c57567ykpKWHzl = this.this$0.KWHzl();
                ArrayList<? extends InterfaceC57559ykh> arrayListCopydefault = yDY.copydefault(new WsArgV5(this.$channelId, null, null, null, null, null, null, null, 254, null));
                Intrinsics.OLrzqt();
                abstractC57556ykeAEQbTJ = application.AEQbTJ(str, c57567ykpKWHzl, arrayListCopydefault, new Application(producerScope));
                C23597iCg c23597iCg = this.this$0;
                try {
                    Result.Application application2 = Result.Companion;
                    AbstractC58185ywX<Boolean> abstractC58185ywXIsConnected = c23597iCg.gEmmrt.isConnected();
                    this.L$0 = producerScope;
                    this.L$1 = abstractC57556ykeAEQbTJ;
                    this.label = 1;
                    objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXIsConnected, this);
                    if (objAwaitFirst == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC57556yke = abstractC57556ykeAEQbTJ;
                } catch (Throwable th) {
                    th = th;
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    abstractC57556yke = abstractC57556ykeAEQbTJ;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                abstractC57556yke = (AbstractC57556yke) this.L$1;
                producerScope = (ProducerScope) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    objAwaitFirst = obj;
                } catch (Throwable th2) {
                    th = th2;
                    abstractC57556ykeAEQbTJ = abstractC57556yke;
                    Result.Application application32 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    abstractC57556yke = abstractC57556ykeAEQbTJ;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Boolean) objAwaitFirst);
            if (Result.m7384isSuccessimpl(objM7377constructorimpl) && ((Boolean) objM7377constructorimpl).booleanValue()) {
                abstractC57556yke.AhwBna();
            }
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                abstractC57556yke.AhwBna();
            }
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.okinc.business.invest_biz.data.logic.ws.InvestWebSocketManager$createWebSocket$1.2
                public final void KWHzl() {
                    abstractC57556yke.djBIcL();
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ Unit invoke() {
                    KWHzl();
                    return Unit.INSTANCE;
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        }
    }
}

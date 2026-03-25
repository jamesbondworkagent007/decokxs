package com.okinc.business.invest_biz.data.logic.ws;

import com.okinc.business.invest_biz.data.logic.ws.bean.InvestNotify;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.v5config.WsArgV5;
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
import o.AbstractC33132mqg;
import o.AbstractC57556yke;
import o.AbstractC58185ywX;
import o.C23597iCg;
import o.C33489mxS;
import o.C56391yDq;
import o.C56442yFn;
import o.C57554ykc;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestWebSocketManager$special$$inlined$createWebSocket$2 extends SuspendLambda implements Function2<ProducerScope<? super InvestNotify>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C23597iCg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestWebSocketManager$special$$inlined$createWebSocket$2(String str, C23597iCg c23597iCg, Continuation continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = c23597iCg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestWebSocketManager$special$$inlined$createWebSocket$2 investWebSocketManager$special$$inlined$createWebSocket$2 = new InvestWebSocketManager$special$$inlined$createWebSocket$2(this.$channelId, this.this$0, continuation);
        investWebSocketManager$special$$inlined$createWebSocket$2.L$0 = obj;
        return investWebSocketManager$special$$inlined$createWebSocket$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super InvestNotify> producerScope, Continuation<? super Unit> continuation) {
        return ((InvestWebSocketManager$special$$inlined$createWebSocket$2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final ProducerScope producerScope;
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
                abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ(this.$channelId, this.this$0.KWHzl(), yDY.copydefault(new WsArgV5(this.$channelId, null, null, null, null, null, null, null, 254, null)), new Function2<AbstractC33132mqg, OKIncomingData, Unit>() { // from class: com.okinc.business.invest_biz.data.logic.ws.InvestWebSocketManager$special$$inlined$createWebSocket$2.5
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* synthetic */ Unit invoke(AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
                        EZpvd(abstractC33132mqg, oKIncomingData);
                        return Unit.INSTANCE;
                    }

                    public final void EZpvd(AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
                        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
                        Intrinsics.checkNotNullParameter(oKIncomingData, "");
                        Object payload = oKIncomingData.getPayload();
                        String str = payload instanceof String ? (String) payload : null;
                        if (str == null) {
                            return;
                        }
                        try {
                            producerScope.mo5769trySendJP2dKIU((InvestNotify) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) InvestNotify.Companion.serializer(), str));
                        } catch (Throwable th) {
                            pUU.AEQbTJ("InvestWebSocketManager", "Failed to decode", th);
                        }
                    }
                });
                C23597iCg c23597iCg = this.this$0;
                try {
                    Result.Application application = Result.Companion;
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
                    Result.Application application2 = Result.Companion;
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
                    Result.Application application22 = Result.Companion;
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
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.okinc.business.invest_biz.data.logic.ws.InvestWebSocketManager$special$$inlined$createWebSocket$2.1
                public final void copydefault() {
                    abstractC57556yke.djBIcL();
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ Unit invoke() {
                    copydefault();
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

package com.okinc.kline.ws;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.kline.ws.KLineWsManager$createSimplifiedWsListener$2;
import java.util.List;
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
import kotlinx.coroutines.channels.SendChannel;
import o.AbstractC33132mqg;
import o.AbstractC57572yku;
import o.C37962pHd;
import o.C56391yDq;
import o.C56442yFn;
import o.C57554ykc;
import o.C57573ykv;
import o.pUU;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes9.dex */
public final class KLineWsManager$createSimplifiedWsListener$2<T> extends SuspendLambda implements Function2<ProducerScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $domainUrl;
    final /* synthetic */ Function0<List<T>> $onConnectionFailure;
    final /* synthetic */ Function1<String, List<T>> $parseData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C37962pHd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends java.util.List<? extends T>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, ? extends java.util.List<? extends T>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KLineWsManager$createSimplifiedWsListener$2(C37962pHd c37962pHd, String str, Function0<? extends List<? extends T>> function0, Function1<? super String, ? extends List<? extends T>> function1, Continuation<? super KLineWsManager$createSimplifiedWsListener$2> continuation) {
        super(2, continuation);
        this.this$0 = c37962pHd;
        this.$domainUrl = str;
        this.$onConnectionFailure = function0;
        this.$parseData = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KLineWsManager$createSimplifiedWsListener$2 kLineWsManager$createSimplifiedWsListener$2 = new KLineWsManager$createSimplifiedWsListener$2(this.this$0, this.$domainUrl, this.$onConnectionFailure, this.$parseData, continuation);
        kLineWsManager$createSimplifiedWsListener$2.L$0 = obj;
        return kLineWsManager$createSimplifiedWsListener$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super List<? extends T>> producerScope, Continuation<? super Unit> continuation) {
        return ((KLineWsManager$createSimplifiedWsListener$2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            C57573ykv c57573ykvCreateV5SimplifiedConnection$default = C37962pHd.createV5SimplifiedConnection$default(this.this$0, this.$domainUrl, false, 2, null);
            C57554ykc.Application application = C57554ykc.Companion;
            final Function0<List<T>> function0 = this.$onConnectionFailure;
            Function1<? super OKWsConnectionState, Unit> function1 = new Function1() { // from class: o.pHg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return KLineWsManager$createSimplifiedWsListener$2.invokeSuspend$lambda$0(producerScope, function0, (OKWsConnectionState) obj2);
                }
            };
            final Function1<String, List<T>> function12 = this.$parseData;
            final AbstractC57572yku abstractC57572ykuOLrzqt = application.OLrzqt(c57573ykvCreateV5SimplifiedConnection$default, function1, new Function2() { // from class: o.pHk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return KLineWsManager$createSimplifiedWsListener$2.invokeSuspend$lambda$5(producerScope, function12, (AbstractC33132mqg) obj2, (OKIncomingData) obj3);
                }
            });
            abstractC57572ykuOLrzqt.AhwBna();
            Function0 function02 = new Function0() { // from class: o.pHo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return KLineWsManager$createSimplifiedWsListener$2.invokeSuspend$lambda$6(abstractC57572ykuOLrzqt);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function02, this) == objCopydefault) {
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
    public static final Unit invokeSuspend$lambda$5(ProducerScope producerScope, Function1 function1, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Object objM7377constructorimpl;
        String originMsg = oKIncomingData.getOriginMsg();
        if (originMsg != null) {
            try {
                Result.Application application = Result.Companion;
                List list = (List) function1.invoke(originMsg);
                objM7377constructorimpl = Result.m7377constructorimpl(list != null ? ChannelResult.m7420boximpl(producerScope.mo5769trySendJP2dKIU(list)) : null);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("KLineWsManager", "Data parsing failed", thM7380exceptionOrNullimpl);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ProducerScope producerScope, Function0 function0, OKWsConnectionState oKWsConnectionState) {
        pUU.KWHzl("KLineWsManager", "New connection state: " + oKWsConnectionState);
        if (oKWsConnectionState == OKWsConnectionState.FAILURE) {
            producerScope.mo5769trySendJP2dKIU(function0.invoke());
            SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6(AbstractC57572yku abstractC57572yku) {
        abstractC57572yku.djBIcL();
        return Unit.INSTANCE;
    }
}

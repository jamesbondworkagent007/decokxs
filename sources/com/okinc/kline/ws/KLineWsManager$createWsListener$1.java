package com.okinc.kline.ws;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.kline.ws.KLineWsManager$createWsListener$1;
import java.util.ArrayList;
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
import o.AbstractC33132mqg;
import o.AbstractC57556yke;
import o.C54401xHa;
import o.C56391yDq;
import o.C56442yFn;
import o.C57554ykc;
import o.C57567ykp;
import o.InterfaceC57559ykh;
import o.pUU;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes9.dex */
public final class KLineWsManager$createWsListener$1<T> extends SuspendLambda implements Function2<ProducerScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList<? extends InterfaceC57559ykh> $args;
    final /* synthetic */ String $channelId;
    final /* synthetic */ Function1<String, List<T>> $parseData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, ? extends java.util.List<? extends T>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KLineWsManager$createWsListener$1(String str, ArrayList<? extends InterfaceC57559ykh> arrayList, Function1<? super String, ? extends List<? extends T>> function1, Continuation<? super KLineWsManager$createWsListener$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.$args = arrayList;
        this.$parseData = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KLineWsManager$createWsListener$1 kLineWsManager$createWsListener$1 = new KLineWsManager$createWsListener$1(this.$channelId, this.$args, this.$parseData, continuation);
        kLineWsManager$createWsListener$1.L$0 = obj;
        return kLineWsManager$createWsListener$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super List<? extends T>> producerScope, Continuation<? super Unit> continuation) {
        return ((KLineWsManager$createWsListener$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            C57567ykp v5Connection$default = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null);
            if (v5Connection$default == null) {
                return Unit.INSTANCE;
            }
            C57554ykc.Application application = C57554ykc.Companion;
            String str = this.$channelId;
            ArrayList<? extends InterfaceC57559ykh> arrayList = this.$args;
            final Function1<String, List<T>> function1 = this.$parseData;
            final AbstractC57556yke abstractC57556ykeAEQbTJ = application.AEQbTJ(str, v5Connection$default, arrayList, new Function2() { // from class: o.pHm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return KLineWsManager$createWsListener$1.invokeSuspend$lambda$4(producerScope, function1, (AbstractC33132mqg) obj2, (OKIncomingData) obj3);
                }
            });
            abstractC57556ykeAEQbTJ.AhwBna();
            Function0 function0 = new Function0() { // from class: o.pHn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return KLineWsManager$createWsListener$1.invokeSuspend$lambda$5(abstractC57556ykeAEQbTJ);
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
    public static final Unit invokeSuspend$lambda$4(ProducerScope producerScope, Function1 function1, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
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
    public static final Unit invokeSuspend$lambda$5(AbstractC57556yke abstractC57556yke) {
        abstractC57556yke.djBIcL();
        return Unit.INSTANCE;
    }
}

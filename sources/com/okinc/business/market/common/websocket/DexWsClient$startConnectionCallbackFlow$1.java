package com.okinc.business.market.common.websocket;

import com.okinc.business.market.common.websocket.DexWsClient$startConnectionCallbackFlow$1;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.v5config.WsSubscribeArgV5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC33132mqg;
import o.AbstractC57556yke;
import o.C27640jyx;
import o.C56391yDq;
import o.C56442yFn;
import o.C57554ykc;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class DexWsClient$startConnectionCallbackFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList<? extends WsSubscribeArgV5> $argument;
    final /* synthetic */ String $channelId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C27640jyx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexWsClient$startConnectionCallbackFlow$1(String str, C27640jyx c27640jyx, ArrayList<? extends WsSubscribeArgV5> arrayList, Continuation<? super DexWsClient$startConnectionCallbackFlow$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = c27640jyx;
        this.$argument = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DexWsClient$startConnectionCallbackFlow$1 dexWsClient$startConnectionCallbackFlow$1 = new DexWsClient$startConnectionCallbackFlow$1(this.$channelId, this.this$0, this.$argument, continuation);
        dexWsClient$startConnectionCallbackFlow$1.L$0 = obj;
        return dexWsClient$startConnectionCallbackFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super String> producerScope, Continuation<? super Unit> continuation) {
        return ((DexWsClient$startConnectionCallbackFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            try {
                final AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ(this.$channelId, this.this$0.OLrzqt, this.$argument, new Function2() { // from class: o.jyv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return DexWsClient$startConnectionCallbackFlow$1.invokeSuspend$lambda$0(producerScope, (AbstractC33132mqg) obj2, (OKIncomingData) obj3);
                    }
                });
                abstractC57556ykeAEQbTJ.AhwBna();
                List list = this.this$0.AhwBna;
                C27640jyx c27640jyx = this.this$0;
                synchronized (list) {
                    c27640jyx.AhwBna.add(abstractC57556ykeAEQbTJ);
                }
                final C27640jyx c27640jyx2 = this.this$0;
                Function0 function0 = new Function0() { // from class: o.jyz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return DexWsClient$startConnectionCallbackFlow$1.invokeSuspend$lambda$4(abstractC57556ykeAEQbTJ, c27640jyx2);
                    }
                };
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
                    return objCopydefault;
                }
            } catch (Exception e) {
                pUU.KWHzl(e);
                producerScope.close(e);
                return Unit.INSTANCE;
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
    public static final Unit invokeSuspend$lambda$0(ProducerScope producerScope, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Object payload = oKIncomingData.getPayload();
        Intrinsics.copydefault(payload, "");
        producerScope.mo5769trySendJP2dKIU((String) payload);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(AbstractC57556yke abstractC57556yke, C27640jyx c27640jyx) {
        try {
            abstractC57556yke.djBIcL();
            synchronized (c27640jyx.AhwBna) {
                c27640jyx.AhwBna.remove(abstractC57556yke);
            }
        } catch (Exception e) {
            pUU.KWHzl(e);
        }
        return Unit.INSTANCE;
    }
}

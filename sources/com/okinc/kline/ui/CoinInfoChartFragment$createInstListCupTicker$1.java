package com.okinc.kline.ui;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.kline.ui.CoinInfoChartFragment$createInstListCupTicker$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC33132mqg;
import o.AbstractC55672xoP;
import o.AbstractC57556yke;
import o.C54344xEy;
import o.C54407xHg;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC57559ykh;

/* JADX INFO: loaded from: classes23.dex */
public final class CoinInfoChartFragment$createInstListCupTicker$1 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends TickersData>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $ccy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinInfoChartFragment$createInstListCupTicker$1(List<String> list, Continuation<? super CoinInfoChartFragment$createInstListCupTicker$1> continuation) {
        super(2, continuation);
        this.$ccy = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoinInfoChartFragment$createInstListCupTicker$1 coinInfoChartFragment$createInstListCupTicker$1 = new CoinInfoChartFragment$createInstListCupTicker$1(this.$ccy, continuation);
        coinInfoChartFragment$createInstListCupTicker$1.L$0 = obj;
        return coinInfoChartFragment$createInstListCupTicker$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProducerScope<? super List<? extends TickersData>> producerScope, Continuation<? super Unit> continuation) {
        return invoke2((ProducerScope<? super List<TickersData>>) producerScope, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProducerScope<? super List<TickersData>> producerScope, Continuation<? super Unit> continuation) {
        return ((CoinInfoChartFragment$createInstListCupTicker$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            ArrayList<? extends InterfaceC57559ykh> arrayList = new ArrayList<>();
            Iterator<T> it = this.$ccy.iterator();
            while (it.hasNext()) {
                arrayList.add(new WsArgV5("cup-tickers-3s", null, null, null, (String) it.next(), null, null, null, 238, null));
            }
            final AbstractC57556yke abstractC57556ykeAEQbTJ = C54407xHg.Companion.AEQbTJ("cup-tickers-3s", new C54344xEy(new TaskDescription()).AYXKKw(), arrayList, new Function2() { // from class: o.pad
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return CoinInfoChartFragment$createInstListCupTicker$1.invokeSuspend$lambda$1(producerScope, (AbstractC33132mqg) obj2, (OKIncomingData) obj3);
                }
            });
            abstractC57556ykeAEQbTJ.AhwBna();
            Function0 function0 = new Function0() { // from class: o.pac
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CoinInfoChartFragment$createInstListCupTicker$1.invokeSuspend$lambda$2(abstractC57556ykeAEQbTJ);
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

    public static final class TaskDescription extends AbstractC55672xoP {
        public TaskDescription() {
            super("", "", "", "", "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(ProducerScope producerScope, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(oKIncomingData.getPayload().toString());
        if (tickersDataOLrzqt != null) {
            producerScope.mo5769trySendJP2dKIU(C56402yEa.EZpvd(tickersDataOLrzqt));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(AbstractC57556yke abstractC57556yke) {
        abstractC57556yke.djBIcL();
        C54407xHg.Companion.EZpvd("cup-tickers-3s", abstractC57556yke);
        return Unit.INSTANCE;
    }
}

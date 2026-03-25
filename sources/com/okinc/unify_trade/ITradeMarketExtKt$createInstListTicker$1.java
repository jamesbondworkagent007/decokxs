package com.okinc.unify_trade;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.unify_trade.ITradeMarketExtKt$createInstListTicker$1;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC33132mqg;
import o.AbstractC57556yke;
import o.C54401xHa;
import o.C54407xHg;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC57559ykh;
import o.pUU;

/* JADX INFO: loaded from: classes11.dex */
public final class ITradeMarketExtKt$createInstListTicker$1 extends SuspendLambda implements Function2<ProducerScope<? super OKIncomingData>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $ccy;
    final /* synthetic */ String $channelId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ITradeMarketExtKt$createInstListTicker$1(String str, List<String> list, Continuation<? super ITradeMarketExtKt$createInstListTicker$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.$ccy = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ITradeMarketExtKt$createInstListTicker$1 iTradeMarketExtKt$createInstListTicker$1 = new ITradeMarketExtKt$createInstListTicker$1(this.$channelId, this.$ccy, continuation);
        iTradeMarketExtKt$createInstListTicker$1.L$0 = obj;
        return iTradeMarketExtKt$createInstListTicker$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super OKIncomingData> producerScope, Continuation<? super Unit> continuation) {
        return ((ITradeMarketExtKt$createInstListTicker$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            ArrayList<? extends InterfaceC57559ykh> arrayList = new ArrayList<>();
            if (Intrinsics.EZpvd((Object) this.$channelId, (Object) "cup-tickers-3s")) {
                List<String> list = this.$ccy;
                String str = this.$channelId;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new WsArgV5(str, null, null, null, (String) it.next(), null, null, null, 238, null));
                    str = str;
                }
            } else {
                List<String> list2 = this.$ccy;
                String str2 = this.$channelId;
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new WsArgV5(str2, (String) it2.next(), null, null, null, null, null, null, 252, null));
                    str2 = str2;
                }
            }
            final AbstractC57556yke abstractC57556ykeAEQbTJ = C54407xHg.Companion.AEQbTJ(this.$channelId, C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null), arrayList, new Function2() { // from class: o.xnV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return ITradeMarketExtKt$createInstListTicker$1.invokeSuspend$lambda$2(producerScope, (AbstractC33132mqg) obj2, (OKIncomingData) obj3);
                }
            });
            abstractC57556ykeAEQbTJ.AhwBna();
            pUU.KWHzl("MARKET_TICKER", "listener start, channelId = " + this.$channelId);
            final String str3 = this.$channelId;
            Function0 function0 = new Function0() { // from class: o.xnU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ITradeMarketExtKt$createInstListTicker$1.invokeSuspend$lambda$3(abstractC57556ykeAEQbTJ, str3);
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
    public static final Unit invokeSuspend$lambda$2(ProducerScope producerScope, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        BuildersKt__Builders_commonKt.launch$default(producerScope, Dispatchers.getDefault(), null, new ITradeMarketExtKt$createInstListTicker$1$cupTickerListener$1$1(producerScope, oKIncomingData, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(AbstractC57556yke abstractC57556yke, String str) {
        abstractC57556yke.djBIcL();
        C54407xHg.Companion.EZpvd(str, abstractC57556yke);
        pUU.KWHzl("MARKET_TICKER", "remove tickerlistener " + str);
        return Unit.INSTANCE;
    }
}

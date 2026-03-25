package com.okinc.kline.ui;

import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C48914uef;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC38857phO;

/* JADX INFO: loaded from: classes23.dex */
public final class MarketKlinePortraitFragment$coinInfoUpdated$2$str$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ ViewOnClickListenerC38857phO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketKlinePortraitFragment$coinInfoUpdated$2$str$1(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, Continuation<? super MarketKlinePortraitFragment$coinInfoUpdated$2$str$1> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC38857phO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketKlinePortraitFragment$coinInfoUpdated$2$str$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((MarketKlinePortraitFragment$coinInfoUpdated$2$str$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            BizInstrument bizInstrument = this.this$0.fJNWhG;
            if (bizInstrument != null && bizInstrument.isPreMarketPair()) {
                C48914uef c48914uef = C48914uef.EZpvd;
                MarketCoinInfo marketCoinInfoFARcdN = this.this$0.fARcdN();
                String premarketTitle$default = C48914uef.getPremarketTitle$default(c48914uef, marketCoinInfoFARcdN != null ? marketCoinInfoFARcdN.getInstrumentId() : null, false, 2, null);
                return premarketTitle$default == null ? "" : premarketTitle$default;
            }
            C48914uef c48914uef2 = C48914uef.EZpvd;
            MarketCoinInfo marketCoinInfoFARcdN2 = this.this$0.fARcdN();
            String instrumentId = marketCoinInfoFARcdN2 != null ? marketCoinInfoFARcdN2.getInstrumentId() : null;
            MarketCoinInfo marketCoinInfoFARcdN3 = this.this$0.fARcdN();
            return C48914uef.getTitleByIdAndType$default(c48914uef2, instrumentId, marketCoinInfoFARcdN3 != null ? marketCoinInfoFARcdN3.getInstrumentType() : null, false, false, null, true, false, 92, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.okinc.business.market.market.fragment.watchlist;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.fragment.watchlist.WatchListTabFragment$observer$1$1$1;
import com.okinc.core.util.SPUtils;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C27889kHb;
import o.C56391yDq;
import o.C56442yFn;
import o.kIY;
import o.xUD;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListTabFragment$observer$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList<MarketDataSource> $this_notifyChange;
    int label;
    final /* synthetic */ kIY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListTabFragment$observer$1$1$1(ArrayList<MarketDataSource> arrayList, kIY kiy, Continuation<? super WatchListTabFragment$observer$1$1$1> continuation) {
        super(2, continuation);
        this.$this_notifyChange = arrayList;
        this.this$0 = kiy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListTabFragment$observer$1$1$1(this.$this_notifyChange, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListTabFragment$observer$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        BizInstrument bizInstrumentValueOf;
        CountDownInfo countDownInfoAEQbTJ;
        BizInstrument bizInstrumentValueOf2;
        CountDownInfo countDownInfoAEQbTJ2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl("SPOT");
            AbstractC54531xLw abstractC54531xLwKWHzl2 = xUD.KWHzl("SWAP");
            ArrayList<MarketDataSource> arrayList = this.$this_notifyChange;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                MarketDataSource marketDataSource = (MarketDataSource) obj2;
                String instType = marketDataSource.getInstType();
                CountDownType showType = null;
                if (Intrinsics.EZpvd((Object) instType, (Object) "SPOT")) {
                    if (abstractC54531xLwKWHzl != null) {
                        String instId = marketDataSource.getInstId();
                        bizInstrumentValueOf = abstractC54531xLwKWHzl.valueOf(instId != null ? instId : "");
                    } else {
                        bizInstrumentValueOf = null;
                    }
                    if (bizInstrumentValueOf != null && (countDownInfoAEQbTJ = xUD.AEQbTJ(bizInstrumentValueOf.getInstId(), "SPOT")) != null) {
                        showType = countDownInfoAEQbTJ.getShowType();
                    }
                    if (showType != CountDownType.SHOW_CANCEL) {
                        arrayList2.add(obj2);
                    }
                } else {
                    if (Intrinsics.EZpvd((Object) instType, (Object) "SWAP")) {
                        if (abstractC54531xLwKWHzl2 != null) {
                            String instId2 = marketDataSource.getInstId();
                            bizInstrumentValueOf2 = abstractC54531xLwKWHzl2.valueOf(instId2 != null ? instId2 : "");
                        } else {
                            bizInstrumentValueOf2 = null;
                        }
                        if (bizInstrumentValueOf2 != null && (countDownInfoAEQbTJ2 = xUD.AEQbTJ(bizInstrumentValueOf2.getInstId(), "SWAP")) != null) {
                            showType = countDownInfoAEQbTJ2.getShowType();
                        }
                        if (showType != CountDownType.SHOW_CANCEL) {
                        }
                    }
                    arrayList2.add(obj2);
                }
            }
            C27889kHb c27889kHb = C27889kHb.AEQbTJ;
            final kIY kiy = this.this$0;
            final ArrayList<MarketDataSource> arrayList3 = this.$this_notifyChange;
            c27889kHb.EZpvd(arrayList2, new Function1() { // from class: o.kJh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return WatchListTabFragment$observer$1$1$1.invokeSuspend$lambda$3(kiy, arrayList3, (java.util.List) obj3);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(kIY kiy, ArrayList arrayList, List list) {
        kiy.KWHzl((List<CoinQuote>) list);
        SPUtils.put("is_have_watch", Boolean.valueOf(!list.isEmpty()));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(kiy), null, null, new WatchListTabFragment$observer$1$1$1$1$1(kiy, list, arrayList, null), 3, null);
        return Unit.INSTANCE;
    }
}

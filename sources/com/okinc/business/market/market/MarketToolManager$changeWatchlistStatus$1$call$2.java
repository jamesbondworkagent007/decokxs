package com.okinc.business.market.market;

import androidx.lifecycle.MutableLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BizResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54646xQb;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class MarketToolManager$changeWatchlistStatus$1$call$2 extends FunctionReferenceImpl implements Function2<BizInstrument, MutableLiveData<BizResp>, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketToolManager$changeWatchlistStatus$1$call$2(Object obj) {
        super(2, obj, AbstractC54646xQb.class, "addWatchList", "addWatchList(Lcom/okinc/unify_trade/biz/BizInstrument;Landroidx/lifecycle/MutableLiveData;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData) {
        invoke2(bizInstrument, mutableLiveData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        ((AbstractC54646xQb) this.receiver).AEQbTJ(bizInstrument, mutableLiveData);
    }
}

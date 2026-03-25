package com.okinc.kline.ui;

import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C38795pgF;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class MarketKlineLandScapeFragment$showSearchPopupWindow$1 extends FunctionReferenceImpl implements Function1<MarketCoinInfo, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketKlineLandScapeFragment$showSearchPopupWindow$1(Object obj) {
        super(1, obj, C38795pgF.class, "onSearchItemChanged", "onSearchItemChanged(Lcom/okinc/kline/api/bean/MarketCoinInfo;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MarketCoinInfo marketCoinInfo) {
        invoke2(marketCoinInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MarketCoinInfo marketCoinInfo) {
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        ((C38795pgF) this.receiver).AEQbTJ(marketCoinInfo);
    }
}

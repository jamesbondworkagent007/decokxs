package com.okinc.tradingbot.impl.market_place;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.xVN;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class MarketPlacePresenter$getLoadingFunc$1 extends FunctionReferenceImpl implements Function1<ViewGroup, Unit> {
    public static final MarketPlacePresenter$getLoadingFunc$1 INSTANCE = new MarketPlacePresenter$getLoadingFunc$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketPlacePresenter$getLoadingFunc$1() {
        super(1, xVN.class, "loadingTradeStrategy", "loadingTradeStrategy(Landroid/view/ViewGroup;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ViewGroup viewGroup) {
        invoke2(viewGroup);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        xVN.KWHzl(viewGroup);
    }
}

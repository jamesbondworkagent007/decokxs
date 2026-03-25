package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class OverviewFragment$handleContentClick$4 extends FunctionReferenceImpl implements Function1<TacticsData, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OverviewFragment$handleContentClick$4(Object obj) {
        super(1, obj, OverviewFragment.class, "onShare", "onShare(Lcom/okinc/unify_trade/bot/data/TacticsData;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TacticsData tacticsData) {
        invoke2(tacticsData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        ((OverviewFragment) this.receiver).EZpvd(tacticsData);
    }
}

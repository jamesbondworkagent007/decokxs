package com.okinc.tradingbot.impl.strategy.fragment.list_common;

import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C52324wHe;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class TacticsListFragment$handleContentClick$2 extends FunctionReferenceImpl implements Function1<TacticsData, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsListFragment$handleContentClick$2(Object obj) {
        super(1, obj, C52324wHe.class, "onShare", "onShare(Lcom/okinc/unify_trade/bot/data/TacticsData;)V", 0);
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
        ((C52324wHe) this.receiver).EZpvd(tacticsData);
    }
}

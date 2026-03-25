package com.okinc.business.dexui.main.swap.trade.single.advanced;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class SwapSingleTradeContentFragment$onSearchItemClick$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SwapSingleTradeContentFragment$onSearchItemClick$1(Object obj) {
        super(1, obj, SwapSingleTradeContentFragment.class, "walletSwitchCallback", "walletSwitchCallback(Z)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((SwapSingleTradeContentFragment) this.receiver).AYXKKw(z);
    }
}

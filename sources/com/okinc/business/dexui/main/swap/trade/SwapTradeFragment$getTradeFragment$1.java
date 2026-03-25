package com.okinc.business.dexui.main.swap.trade;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class SwapTradeFragment$getTradeFragment$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SwapTradeFragment$getTradeFragment$1(Object obj) {
        super(1, obj, SwapTradeFragment.class, "updateKlineVisibility", "updateKlineVisibility(Z)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((SwapTradeFragment) this.receiver).OLrzqt(z);
    }
}

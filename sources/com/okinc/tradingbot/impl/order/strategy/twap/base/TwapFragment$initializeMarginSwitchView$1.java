package com.okinc.tradingbot.impl.order.strategy.twap.base;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.AbstractC53400wkl;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class TwapFragment$initializeMarginSwitchView$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwapFragment$initializeMarginSwitchView$1(Object obj) {
        super(0, obj, AbstractC53400wkl.class, "isMarginSupported", "isMarginSupported()Z", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((AbstractC53400wkl) this.receiver).fJNWhG());
    }
}

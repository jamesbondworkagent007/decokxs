package com.okinc.tradingbot.impl.order.strategy.smarticeberg;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C53036wds;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class SmartIcebergFragment$initializeMarginSwitchView$4 extends FunctionReferenceImpl implements Function0<Boolean> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartIcebergFragment$initializeMarginSwitchView$4(Object obj) {
        super(0, obj, C53036wds.class, "isMarginSupported", "isMarginSupported()Z", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((C53036wds) this.receiver).fJNWhG());
    }
}

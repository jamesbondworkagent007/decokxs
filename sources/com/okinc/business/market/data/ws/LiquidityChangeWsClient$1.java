package com.okinc.business.market.data.ws;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C27673jzd;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class LiquidityChangeWsClient$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiquidityChangeWsClient$1(Object obj) {
        super(1, obj, C27673jzd.class, "onNewEvent", "onNewEvent(Ljava/lang/String;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((C27673jzd) this.receiver).EZpvd(str);
    }
}

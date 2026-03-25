package com.okinc.market.common.debugger;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C38413pXw;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OKMarketDebugActivity$Companion$startActivity$1 extends FunctionReferenceImpl implements Function1<Context, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKMarketDebugActivity$Companion$startActivity$1(Object obj) {
        super(1, obj, C38413pXw.Application.class, "debugAction", "debugAction$OKMarket_market_common_impl(Landroid/content/Context;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Context context) {
        invoke2(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ((C38413pXw.Application) this.receiver).copydefault(context);
    }
}

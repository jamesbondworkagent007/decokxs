package com.okinc.business.dexui.main.swap.trade.single.defiplatform;

import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC25022ioq;
import o.yHT;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class OneSwapV6DeFiPlatformSelectionActivity$onCreate$fragment$1 extends FunctionReferenceImpl implements yHT<String, String, V6BaseQuoteResponse, Boolean, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OneSwapV6DeFiPlatformSelectionActivity$onCreate$fragment$1(Object obj) {
        super(4, obj, ActivityC25022ioq.class, "onSelectDeFiPlatform", "onSelectDeFiPlatform(Ljava/lang/String;Ljava/lang/String;Lcom/okinc/business/dex/trade/core/domain/model/V6BaseQuoteResponse;Z)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHT
    public /* synthetic */ Unit invoke(String str, String str2, V6BaseQuoteResponse v6BaseQuoteResponse, Boolean bool) {
        invoke(str, str2, v6BaseQuoteResponse, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(String str, String str2, V6BaseQuoteResponse v6BaseQuoteResponse, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        ((ActivityC25022ioq) this.receiver).OLrzqt(str, str2, v6BaseQuoteResponse, z);
    }
}

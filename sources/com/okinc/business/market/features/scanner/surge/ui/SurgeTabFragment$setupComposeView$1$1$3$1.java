package com.okinc.business.market.features.scanner.surge.ui;

import com.okinc.business.dex.api.bean.TokenBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C29401ksu;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class SurgeTabFragment$setupComposeView$1$1$3$1 extends FunctionReferenceImpl implements Function1<TokenBase, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SurgeTabFragment$setupComposeView$1$1$3$1(Object obj) {
        super(1, obj, C29401ksu.class, "showQuickBuyBottomSheet", "showQuickBuyBottomSheet(Lcom/okinc/business/dex/api/bean/TokenBase;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TokenBase tokenBase) {
        invoke2(tokenBase);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        ((C29401ksu) this.receiver).copydefault(tokenBase);
    }
}

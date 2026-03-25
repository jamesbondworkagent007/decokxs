package com.okinc.business.market.features.favorites.editing.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.ActivityC26135jTf;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class MarketFavoritesGroupsEditActivity$updateLoadGroupsUiStateView$1 extends AdaptedFunctionReference implements Function0<Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketFavoritesGroupsEditActivity$updateLoadGroupsUiStateView$1(Object obj) {
        super(0, obj, ActivityC26135jTf.class, "loadData", "loadData(Z)V", 0);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ActivityC26135jTf.loadData$default((ActivityC26135jTf) this.receiver, false, 1, null);
    }
}

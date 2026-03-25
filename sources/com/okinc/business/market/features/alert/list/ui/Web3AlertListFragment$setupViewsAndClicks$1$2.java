package com.okinc.business.market.features.alert.list.ui;

import com.okinc.business.market.data.model.alert.AlertUiItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C25829jHx;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class Web3AlertListFragment$setupViewsAndClicks$1$2 extends FunctionReferenceImpl implements Function1<AlertUiItem, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Web3AlertListFragment$setupViewsAndClicks$1$2(Object obj) {
        super(1, obj, C25829jHx.class, "itemSelectionListener", "itemSelectionListener(Lcom/okinc/business/market/data/model/alert/AlertUiItem;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AlertUiItem alertUiItem) {
        invoke2(alertUiItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AlertUiItem alertUiItem) {
        Intrinsics.checkNotNullParameter(alertUiItem, "");
        ((C25829jHx) this.receiver).EZpvd(alertUiItem);
    }
}

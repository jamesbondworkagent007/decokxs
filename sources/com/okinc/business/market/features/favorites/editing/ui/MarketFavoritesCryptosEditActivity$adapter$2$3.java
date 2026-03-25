package com.okinc.business.market.features.favorites.editing.ui;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.jSN;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class MarketFavoritesCryptosEditActivity$adapter$2$3 extends FunctionReferenceImpl implements Function1<RecyclerView.ViewHolder, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketFavoritesCryptosEditActivity$adapter$2$3(Object obj) {
        super(1, obj, jSN.class, "startDrag", "startDrag(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RecyclerView.ViewHolder viewHolder) {
        invoke2(viewHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        ((jSN) this.receiver).copydefault(viewHolder);
    }
}

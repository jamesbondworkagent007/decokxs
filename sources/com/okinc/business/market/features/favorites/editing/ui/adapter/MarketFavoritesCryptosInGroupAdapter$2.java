package com.okinc.business.market.features.favorites.editing.ui.adapter;

import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C26175jUs;
import o.jTH;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class MarketFavoritesCryptosInGroupAdapter$2 extends FunctionReferenceImpl implements yHO<Integer, Boolean, C26175jUs, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketFavoritesCryptosInGroupAdapter$2(Object obj) {
        super(3, obj, jTH.class, "toggleSingleSelected", "toggleSingleSelected(IZLcom/okinc/business/market/features/favorites/editing/ui/model/MarketFavoritesListItemVo;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ Unit invoke(Integer num, Boolean bool, C26175jUs c26175jUs) {
        invoke(num.intValue(), bool.booleanValue(), c26175jUs);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, boolean z, C26175jUs c26175jUs) {
        Intrinsics.checkNotNullParameter(c26175jUs, "");
        ((jTH) this.receiver).EZpvd(i, z, c26175jUs);
    }
}

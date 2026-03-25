package com.okinc.business.market.features.favorites.editing.ui;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.ActivityC26135jTf;
import o.C26170jUn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class MarketFavoritesGroupsEditActivity$observeUiStates$4 extends AdaptedFunctionReference implements Function2<InterfaceC49371unL<? extends Pair<? extends List<? extends C26170jUn>, ? extends List<? extends C26170jUn>>>, Continuation<? super Unit>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketFavoritesGroupsEditActivity$observeUiStates$4(Object obj) {
        super(2, obj, ActivityC26135jTf.class, "updateLoadGroupsSilentlyUiStateView", "updateLoadGroupsSilentlyUiStateView(Lcom/okinc/trade/arch/ui/StateVariant;)V", 4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends Pair<? extends List<? extends C26170jUn>, ? extends List<? extends C26170jUn>>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>>) interfaceC49371unL, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ActivityC26135jTf.AYXKKw((ActivityC26135jTf) this.receiver, interfaceC49371unL, continuation);
    }
}

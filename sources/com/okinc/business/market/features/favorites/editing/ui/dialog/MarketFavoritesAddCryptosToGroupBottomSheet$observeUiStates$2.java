package com.okinc.business.market.features.favorites.editing.ui.dialog;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.C26169jUm;
import o.InterfaceC49371unL;
import o.jTS;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class MarketFavoritesAddCryptosToGroupBottomSheet$observeUiStates$2 extends AdaptedFunctionReference implements Function2<InterfaceC49371unL<? extends List<? extends C26169jUm>>, Continuation<? super Unit>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketFavoritesAddCryptosToGroupBottomSheet$observeUiStates$2(Object obj) {
        super(2, obj, jTS.class, "updateCustomGroupUiStateView", "updateCustomGroupUiStateView(Lcom/okinc/trade/arch/ui/StateVariant;)V", 4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends List<? extends C26169jUm>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<? extends List<C26169jUm>>) interfaceC49371unL, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<? extends List<C26169jUm>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return jTS.copydefault((jTS) this.receiver, interfaceC49371unL, continuation);
    }
}

package com.okinc.business.market.features.favorites.editing.ui.dialog;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.InterfaceC49371unL;
import o.jTS;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class MarketFavoritesAddCryptosToGroupBottomSheet$observeUiStates$4 extends AdaptedFunctionReference implements Function2<InterfaceC49371unL<? extends Pair<? extends List<? extends String>, ? extends List<? extends String>>>, Continuation<? super Unit>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketFavoritesAddCryptosToGroupBottomSheet$observeUiStates$4(Object obj) {
        super(2, obj, jTS.class, "updateAddToButtonState", "updateAddToButtonState(Lcom/okinc/trade/arch/ui/StateVariant;)V", 4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends Pair<? extends List<? extends String>, ? extends List<? extends String>>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<? extends Pair<? extends List<String>, ? extends List<String>>>) interfaceC49371unL, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<? extends Pair<? extends List<String>, ? extends List<String>>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return jTS.AEQbTJ((jTS) this.receiver, interfaceC49371unL, continuation);
    }
}

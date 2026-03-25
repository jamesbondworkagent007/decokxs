package com.okinc.business.market.features.favorites.editing.ui;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.C26175jUs;
import o.InterfaceC49371unL;
import o.jSN;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class MarketFavoritesCryptosEditActivity$observeUiStates$4 extends AdaptedFunctionReference implements Function2<InterfaceC49371unL<? extends Pair<? extends String, ? extends List<? extends C26175jUs>>>, Continuation<? super Unit>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketFavoritesCryptosEditActivity$observeUiStates$4(Object obj) {
        super(2, obj, jSN.class, "updateRemoveCryptosUiStateView", "updateRemoveCryptosUiStateView(Lcom/okinc/trade/arch/ui/StateVariant;)V", 4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends Pair<? extends String, ? extends List<? extends C26175jUs>>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<? extends Pair<String, ? extends List<C26175jUs>>>) interfaceC49371unL, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<? extends Pair<String, ? extends List<C26175jUs>>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return jSN.djBIcL((jSN) this.receiver, interfaceC49371unL, continuation);
    }
}

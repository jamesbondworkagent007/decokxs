package com.okinc.okmarket.ui.dialog;

import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.C46665tbU;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class MarketFavSwitchBottomSheet$initListener$2 extends AdaptedFunctionReference implements Function2<InterfaceC49371unL<? extends MarketHomeV2ViewModel.TaskDescription>, Continuation<? super Unit>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketFavSwitchBottomSheet$initListener$2(Object obj) {
        super(2, obj, C46665tbU.class, "updateGroupUi", "updateGroupUi(Lcom/okinc/trade/arch/ui/StateVariant;)V", 4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends MarketHomeV2ViewModel.TaskDescription> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<MarketHomeV2ViewModel.TaskDescription>) interfaceC49371unL, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<MarketHomeV2ViewModel.TaskDescription> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return C46665tbU.AEQbTJ((C46665tbU) this.receiver, interfaceC49371unL, continuation);
    }
}

package com.okinc.dexkline.utils;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes18.dex */
public final class FragmentUtils$matchViewModel$$inlined$viewModels$default$2 extends Lambda implements Function0<ViewModelStore> {
    final /* synthetic */ InterfaceC56387yDm $owner$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentUtils$matchViewModel$$inlined$viewModels$default$2(InterfaceC56387yDm interfaceC56387yDm) {
        super(0);
        this.$owner$delegate = interfaceC56387yDm;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStore invoke() {
        ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(this.$owner$delegate).getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
        return viewModelStore;
    }
}

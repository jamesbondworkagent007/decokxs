package com.okinc.business.defi.wallet.imported;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes15.dex */
public final class DefiWalletSelectNetworkActivity$special$$inlined$viewModels$default$4 extends Lambda implements Function0<ViewModelProvider.Factory> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletSelectNetworkActivity$special$$inlined$viewModels$default$4(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewModelProvider.Factory invoke() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
        return defaultViewModelProviderFactory;
    }
}

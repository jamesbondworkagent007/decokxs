package com.okinc.tradeuilib.extension;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentExtensionKt$parentViewModels$$inlined$viewModels$default$3 extends Lambda implements Function0<CreationExtras> {
    final /* synthetic */ Function0 $extrasProducer;
    final /* synthetic */ InterfaceC56387yDm $owner$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentExtensionKt$parentViewModels$$inlined$viewModels$default$3(Function0 function0, InterfaceC56387yDm interfaceC56387yDm) {
        super(0);
        this.$extrasProducer = function0;
        this.$owner$delegate = interfaceC56387yDm;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CreationExtras invoke() {
        CreationExtras creationExtras;
        Function0 function0 = this.$extrasProducer;
        if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
            return creationExtras;
        }
        ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(this.$owner$delegate);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
        CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
        return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
    }
}

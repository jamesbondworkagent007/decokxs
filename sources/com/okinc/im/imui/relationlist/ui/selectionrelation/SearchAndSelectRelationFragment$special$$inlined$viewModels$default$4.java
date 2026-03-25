package com.okinc.im.imui.relationlist.ui.selectionrelation;

import android.os.SystemClock;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes16.dex */
public final class SearchAndSelectRelationFragment$special$$inlined$viewModels$default$4 extends Lambda implements Function0<CreationExtras> {
    public static int AEQbTJ;
    public static int OLrzqt;
    final /* synthetic */ Function0 $extrasProducer;
    final /* synthetic */ InterfaceC56387yDm $owner$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchAndSelectRelationFragment$special$$inlined$viewModels$default$4(Function0 function0, InterfaceC56387yDm interfaceC56387yDm) {
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

    public static int EZpvd() {
        int i = AEQbTJ;
        int i2 = i % 9651762;
        AEQbTJ = i + 1;
        if (i2 != 0) {
            return OLrzqt;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        OLrzqt = iUptimeMillis;
        return iUptimeMillis;
    }
}

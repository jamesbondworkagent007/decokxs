package o;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.savedstate.SavedStateRegistryOwner;
import com.okinc.business.market.features.vibes.ui.VibesViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kAL extends AbstractSavedStateViewModelFactory {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kAL(@NotNull SavedStateRegistryOwner savedStateRegistryOwner) {
        super(savedStateRegistryOwner, null);
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public <T extends ViewModel> T create(@NotNull java.lang.String str, @NotNull java.lang.Class<T> cls, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        if (cls.isAssignableFrom(VibesViewModel.class)) {
            kAD kad = kAD.EZpvd;
            return new VibesViewModel(kad.isConnected(), kad.AuCTel(), kad.fIwbmz(), kad.fJNWhG(), savedStateHandle, kad.fetchVPNInfo());
        }
        throw new java.lang.IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }
}

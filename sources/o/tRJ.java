package o;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tRJ<VM extends ViewModel> extends AbstractSavedStateViewModelFactory {
    public final Function1<SavedStateHandle, VM> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.lifecycle.SavedStateHandle, ? extends VM extends androidx.lifecycle.ViewModel> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tRJ(@NotNull SavedStateRegistryOwner savedStateRegistryOwner, android.os.Bundle bundle, @NotNull Function1<? super SavedStateHandle, ? extends VM> function1) {
        super(savedStateRegistryOwner, bundle);
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public <T extends ViewModel> T create(@NotNull java.lang.String str, @NotNull java.lang.Class<T> cls, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        VM vmInvoke = this.copydefault.invoke(savedStateHandle);
        Intrinsics.copydefault(vmInvoke, "");
        return vmInvoke;
    }
}

package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class iNB implements ViewModelProvider.Factory {
    public final java.util.Map<java.lang.Class<? extends ViewModel>, yCP<ViewModel>> OLrzqt;

    @yCM
    public iNB(@NotNull java.util.Map<java.lang.Class<? extends ViewModel>, yCP<ViewModel>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.OLrzqt = map;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        yCP<ViewModel> ycp = this.OLrzqt.get(cls);
        if (ycp != null) {
            ViewModel viewModel = ycp.get();
            Intrinsics.copydefault(viewModel, "");
            return (T) viewModel;
        }
        throw new java.lang.IllegalArgumentException("Unknown ViewModel class: " + cls.getSimpleName());
    }
}

package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fcp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18144fcp implements ViewModelProvider.Factory {
    public final C18192fdk copydefault;

    public C18144fcp(@NotNull C18192fdk c18192fdk) {
        Intrinsics.checkNotNullParameter(c18192fdk, "");
        this.copydefault = c18192fdk;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        if (!Intrinsics.EZpvd(cls, C18142fcn.class)) {
            throw new java.lang.IllegalArgumentException("This factory can only create NftTopCollectionsViewModel".toString());
        }
        return new C18142fcn(this.copydefault);
    }
}

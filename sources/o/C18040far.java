package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.far, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18040far implements ViewModelProvider.Factory {
    public final C18192fdk OLrzqt;

    public C18040far(@NotNull C18192fdk c18192fdk) {
        Intrinsics.checkNotNullParameter(c18192fdk, "");
        this.OLrzqt = c18192fdk;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        if (!Intrinsics.EZpvd(cls, C18035fam.class)) {
            throw new java.lang.IllegalArgumentException("This factory can only create CryptoReadsViewModel".toString());
        }
        return new C18035fam(this.OLrzqt);
    }
}

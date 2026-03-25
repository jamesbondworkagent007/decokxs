package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.lifecycle.impl.net.LifecycleApiRetrofitService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pOl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38160pOl implements ViewModelProvider.Factory {
    public final LifecycleApiRetrofitService AEQbTJ;
    public final C38069pLb EZpvd;
    public final pKY OLrzqt;
    public final C38068pLa copydefault;

    @yCM
    public C38160pOl(@NotNull LifecycleApiRetrofitService lifecycleApiRetrofitService, @NotNull C38069pLb c38069pLb, @NotNull C38068pLa c38068pLa, @NotNull pKY pky) {
        Intrinsics.checkNotNullParameter(lifecycleApiRetrofitService, "");
        Intrinsics.checkNotNullParameter(c38069pLb, "");
        Intrinsics.checkNotNullParameter(c38068pLa, "");
        Intrinsics.checkNotNullParameter(pky, "");
        this.AEQbTJ = lifecycleApiRetrofitService;
        this.EZpvd = c38069pLb;
        this.copydefault = c38068pLa;
        this.OLrzqt = pky;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        if (!Intrinsics.EZpvd(cls, C38072pLe.class)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return new C38072pLe(this.AEQbTJ, this.EZpvd, this.copydefault, this.OLrzqt);
    }
}

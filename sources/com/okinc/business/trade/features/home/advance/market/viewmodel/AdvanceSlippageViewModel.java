package com.okinc.business.trade.features.home.advance.market.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import o.C25301iuD;
import o.C25416iwM;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvanceSlippageViewModel extends ViewModel {
    public final C25416iwM EZpvd;
    public final MutableLiveData<C25301iuD> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C25301iuD> copydefault() {
        return this.copydefault;
    }

    @yCM
    public AdvanceSlippageViewModel(@NotNull C25416iwM c25416iwM) {
        Intrinsics.checkNotNullParameter(c25416iwM, "");
        this.EZpvd = c25416iwM;
        this.copydefault = new MutableLiveData<>();
    }

    public final void AEQbTJ(@NotNull C25301iuD c25301iuD) {
        Intrinsics.checkNotNullParameter(c25301iuD, "");
        this.copydefault.setValue(c25301iuD);
    }

    public final String EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return this.EZpvd.EZpvd(str, str2, str3);
    }
}

package com.okinc.dexkline.market.features.coincheck;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.C32296mWt;
import o.C32302mWz;
import o.mUR;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CoinCheckViewModel extends AbstractC33073mpa {
    public final C32302mWz KWHzl;
    public final MutableLiveData<C32296mWt> OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32296mWt> OLrzqt() {
        return this.OLrzqt;
    }

    @yCM
    public CoinCheckViewModel(@NotNull C32302mWz c32302mWz) {
        Intrinsics.checkNotNullParameter(c32302mWz, "");
        this.KWHzl = c32302mWz;
        this.OLrzqt = new MutableLiveData<>();
        this.copydefault = 70003;
    }

    public static /* synthetic */ void loadCoinCheckData$default(CoinCheckViewModel coinCheckViewModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        coinCheckViewModel.AEQbTJ(str, str2, z);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CoinCheckViewModel$loadCoinCheckData$1(this, z, str, str2, null), 3, null);
    }

    public final void copydefault() {
        this.OLrzqt.setValue(new C32296mWt(false, null, true, 3, null));
    }
}

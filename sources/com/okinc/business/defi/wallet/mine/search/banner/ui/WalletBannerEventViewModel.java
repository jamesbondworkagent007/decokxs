package com.okinc.business.defi.wallet.mine.search.banner.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C18927fre;
import o.C18928frf;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBannerEventViewModel extends ViewModel {
    public final C18928frf AEQbTJ;
    public final LiveData<List<C18927fre>> KWHzl;
    public final MutableLiveData<List<C18927fre>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<C18927fre>> OLrzqt() {
        return this.KWHzl;
    }

    @yCM
    public WalletBannerEventViewModel(@NotNull C18928frf c18928frf) {
        Intrinsics.checkNotNullParameter(c18928frf, "");
        this.AEQbTJ = c18928frf;
        MutableLiveData<List<C18927fre>> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.KWHzl = mutableLiveData;
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBannerEventViewModel$getBanners$1(this, null), 3, null);
    }
}

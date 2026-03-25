package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.eWW;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetOverviewViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<AddressTokenAsset> OLrzqt;
    public final eWW copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<AddressTokenAsset> AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public AddressProfileAssetOverviewViewModel(@NotNull eWW eww) {
        Intrinsics.checkNotNullParameter(eww, "");
        this.copydefault = eww;
        this.OLrzqt = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AddressProfileAssetOverviewViewModel$loadCoinInAssetInformation$1(this, str, str2, null), 2, null);
    }
}

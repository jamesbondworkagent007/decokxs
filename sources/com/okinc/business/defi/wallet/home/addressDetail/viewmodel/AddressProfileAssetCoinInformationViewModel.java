package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.net.bean.CoinInfoBean;
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
public final class AddressProfileAssetCoinInformationViewModel extends AbstractC33073mpa {
    public boolean KWHzl;
    public final MutableSharedFlow<CoinInfoBean> OLrzqt;
    public final eWW copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<CoinInfoBean> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    @yCM
    public AddressProfileAssetCoinInformationViewModel(@NotNull eWW eww) {
        Intrinsics.checkNotNullParameter(eww, "");
        this.copydefault = eww;
        this.OLrzqt = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public final void KWHzl(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AddressProfileAssetCoinInformationViewModel$loadCoinInformation$1(this, j, str, null), 2, null);
    }
}

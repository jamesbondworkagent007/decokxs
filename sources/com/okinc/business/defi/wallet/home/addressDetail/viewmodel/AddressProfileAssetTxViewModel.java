package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.net.bean.AddressTxHistoryDetail;
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
public final class AddressProfileAssetTxViewModel extends AbstractC33073mpa {
    public final eWW KWHzl;
    public final MutableSharedFlow<AddressTxHistoryDetail> OLrzqt;
    public String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<AddressTxHistoryDetail> EZpvd() {
        return this.OLrzqt;
    }

    @yCM
    public AddressProfileAssetTxViewModel(@NotNull eWW eww) {
        Intrinsics.checkNotNullParameter(eww, "");
        this.KWHzl = eww;
        this.OLrzqt = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = "";
    }

    public final void EZpvd(@NotNull String str, long j, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AddressProfileAssetTxViewModel$loadAddressTxInformation$1(this, str, j, i, str2, null), 2, null);
    }
}

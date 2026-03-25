package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC12782ctV;
import o.AbstractC33073mpa;
import o.C10614brl;
import o.C14738drC;
import o.C15835eXa;
import o.C35202nqq;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPnlDataViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<List<Long>> AEQbTJ;
    public final SharedFlow<Result<List<C14738drC>>> AYXKKw;
    public final SharedFlow<Result<WalletPnlAnalysisResponse>> EZpvd;
    public final MutableSharedFlow<Boolean> KWHzl;
    public final MutableSharedFlow<Result<WalletPnlAnalysisResponse>> OLrzqt;
    public final MutableSharedFlow<Result<List<C14738drC>>> copydefault;
    public final StateFlow<List<Long>> djBIcL;
    public final C15835eXa gEmmrt;
    public final SharedFlow<Boolean> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Result<List<C14738drC>>> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Result<WalletPnlAnalysisResponse>> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<Long>> copydefault() {
        return this.djBIcL;
    }

    @yCM
    public WalletPnlDataViewModel(@NotNull C15835eXa c15835eXa) {
        Intrinsics.checkNotNullParameter(c15835eXa, "");
        this.gEmmrt = c15835eXa;
        MutableStateFlow<List<Long>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow;
        this.djBIcL = MutableStateFlow;
        MutableSharedFlow<Result<WalletPnlAnalysisResponse>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Result<List<C14738drC>>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default2;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default3;
        this.valueOf = mutableSharedFlowMutableSharedFlow$default3;
    }

    public final boolean AEQbTJ(AbstractC12782ctV abstractC12782ctV, long j, long j2) {
        if (C35202nqq.OLrzqt.AEQbTJ("web3_wallet_home_pnl")) {
            return !(!(abstractC12782ctV == null || abstractC12782ctV.zLjUOn()) || j == Long.MIN_VALUE || !this.djBIcL.getValue().contains(Long.valueOf(j)) || C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).AEQbTJ(j2));
        }
        return false;
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletPnlDataViewModel$getWalletPnlSupportChainList$1(this, null), 2, null);
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletPnlDataViewModel$refreshWalletPnlSupportChainList$1(this, null), 2, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletPnlDataViewModel$getWalletAccountAnalysis$1(this, str, str2, j, str3, null), 2, null);
    }

    public final void AEQbTJ(@NotNull String str, long j, int i, boolean z, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletPnlDataViewModel$getWalletAccountPnlTokenList$1(this, str, j, i, z, i2, i3, null), 2, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletPnlDataViewModel$getWalletAddressAnalysis$1(this, str, str2, j, null), 2, null);
    }

    public static /* synthetic */ void getWalletAddressPnlTokenList$default(WalletPnlDataViewModel walletPnlDataViewModel, String str, Long l, int i, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            l = null;
        }
        Long l2 = l;
        if ((i4 & 4) != 0) {
            i = 1;
        }
        int i5 = i;
        boolean z2 = (i4 & 8) != 0 ? false : z;
        int i6 = (i4 & 16) != 0 ? 0 : i2;
        if ((i4 & 32) != 0) {
            i3 = 3;
        }
        walletPnlDataViewModel.OLrzqt(str, l2, i5, z2, i6, i3);
    }

    public final void OLrzqt(@NotNull String str, Long l, int i, boolean z, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletPnlDataViewModel$getWalletAddressPnlTokenList$1(this, str, l, i, z, i2, i3, null), 2, null);
    }

    public final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new WalletPnlDataViewModel$refreshPnlData$1(this, null), 2, null);
    }
}

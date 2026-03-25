package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.business.defi.biz.net.bean.WalletCoinLatestPnlResponse;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetCoinDetailViewModel;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C13934dbu;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import o.eWW;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetCoinDetailViewModel extends AbstractC33073mpa {
    public String AEQbTJ;
    public final MutableSharedFlow<AddressTokenAsset> AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public final SharedFlow<WalletCoinLatestPnlResponse> EZpvd;
    public final eWW KWHzl;
    public final MutableSharedFlow<List<AddressCoinHistoryDetail>> OLrzqt;
    public MutableSharedFlow<WalletCoinLatestPnlResponse> copydefault;
    public int djBIcL;
    public String gEmmrt;
    public final MutableSharedFlow<Boolean> isConnected;
    public final MutableStateFlow<Boolean> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<AddressTokenAsset> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Boolean> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<Boolean> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<WalletCoinLatestPnlResponse> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<List<AddressCoinHistoryDetail>> OLrzqt() {
        return this.OLrzqt;
    }

    @yCM
    public AddressProfileAssetCoinDetailViewModel(@NotNull eWW eww) {
        Intrinsics.checkNotNullParameter(eww, "");
        this.KWHzl = eww;
        this.OLrzqt = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.isConnected = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        MutableSharedFlow<WalletCoinLatestPnlResponse> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AhwBna = true;
        this.AEQbTJ = "";
        this.gEmmrt = "";
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.eZD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AddressProfileAssetCoinDetailViewModel.valueOf();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C13934dbu djBIcL() {
        return (C13934dbu) this.DbNXlk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13934dbu valueOf() {
        return new C13934dbu();
    }

    public static /* synthetic */ void loadHistory$default(AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModel, String str, long j, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        addressProfileAssetCoinDetailViewModel.copydefault(str, j, str2, z);
    }

    public final void copydefault(@NotNull String str, long j, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        if (z) {
            this.AhwBna = false;
        } else {
            this.gEmmrt = "";
            this.AhwBna = true;
            this.djBIcL = 0;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AddressProfileAssetCoinDetailViewModel$loadHistory$1(this, z, str, j, str2, null), 2, null);
    }

    public static /* synthetic */ void loadCoinInAssetInformation$default(AddressProfileAssetCoinDetailViewModel addressProfileAssetCoinDetailViewModel, String str, String str2, Long l, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        addressProfileAssetCoinDetailViewModel.AEQbTJ(str, str2, l, str3);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, Long l, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AddressProfileAssetCoinDetailViewModel$loadCoinInAssetInformation$1(this, str, str2, l, str3, null), 2, null);
    }

    public final void AEQbTJ(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AddressProfileAssetCoinDetailViewModel$loadCoinLatestPnl$1(this, j, str, str2, null), 3, null);
    }
}

package com.okinc.business.defi.wallet.mine.walletbind.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceResponseBody;
import com.okinc.wallet.api.bean.WalletInfo;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C19329fzI;
import o.C19337fzQ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindCeFiSelectViewModel extends ViewModel {
    public final MutableStateFlow<Boolean> AEQbTJ;
    public final StateFlow<Boolean> AYXKKw;
    public final StateFlow<ValidateNonceResponseBody> AhwBna;
    public final SharedFlow<Pair<String, String>> AkhnZx;
    public final SharedFlow<String> DbNXlk;
    public final MutableStateFlow<WalletInfo> EZpvd;
    public final MutableSharedFlow<String> KWHzl;
    public final MutableStateFlow<ValidateNonceResponseBody> OLrzqt;
    public final MutableSharedFlow<Pair<String, String>> copydefault;
    public final MutableSharedFlow<String> djBIcL;
    public final C19337fzQ fJNWhG;
    public final SharedFlow<Boolean> fetchVPNInfo;
    public final MutableStateFlow<Boolean> gEmmrt;
    public final SharedFlow<String> isConnected;
    public final C19329fzI valueOf;
    public final StateFlow<WalletInfo> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<WalletInfo> EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<String, String>> KWHzl() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ValidateNonceResponseBody> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> copydefault() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> gEmmrt() {
        return this.isConnected;
    }

    @yCM
    public WalletBindCeFiSelectViewModel(@NotNull C19337fzQ c19337fzQ, @NotNull C19329fzI c19329fzI) {
        Intrinsics.checkNotNullParameter(c19337fzQ, "");
        Intrinsics.checkNotNullParameter(c19329fzI, "");
        this.fJNWhG = c19337fzQ;
        this.valueOf = c19329fzI;
        MutableStateFlow<WalletInfo> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.values = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.AEQbTJ = MutableStateFlow2;
        this.fetchVPNInfo = FlowKt.asSharedFlow(MutableStateFlow2);
        MutableStateFlow<ValidateNonceResponseBody> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow3;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow3);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Pair<String, String>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default2;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.gEmmrt = MutableStateFlow4;
        this.AYXKKw = FlowKt.stateIn(FlowKt.combine(MutableStateFlow, MutableStateFlow4, MutableStateFlow3, new WalletBindCeFiSelectViewModel$isContinueButtonEnabled$1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), bool);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default3;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
    }

    public final Job copydefault(@NotNull WalletInfo walletInfo) {
        Intrinsics.checkNotNullParameter(walletInfo, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindCeFiSelectViewModel$onWalletSelected$1(this, walletInfo, null), 3, null);
    }

    public final Job KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindCeFiSelectViewModel$getCeFiDetailsByNonce$1(this, str, null), 3, null);
    }

    public final Job copydefault(@NotNull String str, @NotNull Intention intention) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(intention, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindCeFiSelectViewModel$onClickCancel$1(this, str, intention, null), 3, null);
    }
}

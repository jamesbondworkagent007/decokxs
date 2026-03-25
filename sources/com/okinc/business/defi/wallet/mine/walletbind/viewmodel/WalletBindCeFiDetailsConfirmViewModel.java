package com.okinc.business.defi.wallet.mine.walletbind.viewmodel;

import androidx.fragment.app.FragmentManager;
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
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C19329fzI;
import o.C19333fzM;
import o.C19337fzQ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindCeFiDetailsConfirmViewModel extends ViewModel {
    public final MutableSharedFlow<String> AEQbTJ;
    public final MutableSharedFlow<String> AYXKKw;
    public final SharedFlow<Boolean> AhwBna;
    public final SharedFlow<String> AkhnZx;
    public final SharedFlow<Pair<String, String>> DbNXlk;
    public final MutableStateFlow<ValidateNonceResponseBody> EZpvd;
    public final MutableSharedFlow<Boolean> KWHzl;
    public final MutableSharedFlow<Pair<String, String>> OLrzqt;
    public final MutableSharedFlow<String> copydefault;
    public final StateFlow<ValidateNonceResponseBody> djBIcL;
    public final C19337fzQ ejfBZ;
    public final C19333fzM fARcdN;
    public final SharedFlow<Pair<String, String>> fetchVPNInfo;
    public final C19329fzI gEmmrt;
    public final SharedFlow<String> isConnected;
    public final MutableSharedFlow<Pair<String, String>> valueOf;
    public final SharedFlow<String> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<String, String>> KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ValidateNonceResponseBody> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Pair<String, String>> djBIcL() {
        return this.DbNXlk;
    }

    @yCM
    public WalletBindCeFiDetailsConfirmViewModel(@NotNull C19333fzM c19333fzM, @NotNull C19329fzI c19329fzI, @NotNull C19337fzQ c19337fzQ) {
        Intrinsics.checkNotNullParameter(c19333fzM, "");
        Intrinsics.checkNotNullParameter(c19329fzI, "");
        Intrinsics.checkNotNullParameter(c19337fzQ, "");
        this.fARcdN = c19333fzM;
        this.gEmmrt = c19329fzI;
        this.ejfBZ = c19337fzQ;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Pair<String, String>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default2;
        this.fetchVPNInfo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default3;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default4;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Pair<String, String>> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default5;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableStateFlow<ValidateNonceResponseBody> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default6;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
    }

    public final Job EZpvd(@NotNull FragmentManager fragmentManager, @NotNull WalletInfo walletInfo, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Intention intention, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(intention, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindCeFiDetailsConfirmViewModel$onConfirmClicked$1(this, walletInfo, fragmentManager, str, str4, str5, str2, str3, intention, null), 3, null);
    }

    public final Job KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindCeFiDetailsConfirmViewModel$getCeFiDetailsByNonce$1(str, this, null), 3, null);
    }

    public final Job KWHzl(@NotNull String str, @NotNull Intention intention) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(intention, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletBindCeFiDetailsConfirmViewModel$onClickCancel$1(this, str, intention, null), 3, null);
    }
}

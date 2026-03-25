package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19866gSf;
import o.C19878gSr;
import o.C56390yDp;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingBuyInputPanelViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<DexMultiTokenInfoBean> AEQbTJ;
    public final MutableStateFlow<DexMultiTokenInfoBean> AYXKKw;
    public final StateFlow<Pair<String, String>> AhwBna;
    public Pair<Boolean, String> AkhnZx;
    public String AuCTel;
    public final C19878gSr DbNXlk;
    public final MutableStateFlow<Boolean> EZpvd;
    public final MutableStateFlow<Pair<String, String>> KWHzl;
    public final MutableStateFlow<Pair<Boolean, String>> OLrzqt;
    public final MutableSharedFlow<Unit> copydefault;
    public final SharedFlow<Unit> djBIcL;
    public final StateFlow<Boolean> ejfBZ;
    public Pair<Boolean, String> fARcdN;
    public final StateFlow<DexMultiTokenInfoBean> fIwbmz;
    public final StateFlow<Pair<Boolean, String>> fJNWhG;
    public final C19866gSf fetchVPNInfo;
    public final MutableStateFlow<Boolean> gEmmrt;
    public final StateFlow<DexMultiTokenInfoBean> getNewProxyInstance;
    public final StateFlow<Boolean> hDKMBd;
    public String isConnected;
    public MutableStateFlow<Boolean> valueOf;
    public List<DexMultiTokenInfoBean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull List<DexMultiTokenInfoBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.values = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Pair<Boolean, String>> AYXKKw() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AhwBna() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Pair<String, String>> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DexMultiTokenInfoBean> djBIcL() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DexMultiTokenInfoBean> gEmmrt() {
        return this.fIwbmz;
    }

    @yCM
    public CopyTradingBuyInputPanelViewModel(@NotNull C19866gSf c19866gSf, @NotNull C19878gSr c19878gSr) {
        Intrinsics.checkNotNullParameter(c19866gSf, "");
        Intrinsics.checkNotNullParameter(c19878gSr, "");
        this.fetchVPNInfo = c19866gSf;
        this.DbNXlk = c19878gSr;
        Boolean bool = Boolean.TRUE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.EZpvd = MutableStateFlow;
        this.ejfBZ = FlowKt.asStateFlow(MutableStateFlow);
        Boolean bool2 = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool2);
        this.gEmmrt = MutableStateFlow2;
        MutableStateFlow<Pair<Boolean, String>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(C56390yDp.OLrzqt(bool, ""));
        this.OLrzqt = MutableStateFlow3;
        this.fJNWhG = FlowKt.stateIn(FlowKt.combine(MutableStateFlow3, MutableStateFlow2, MutableStateFlow, new CopyTradingBuyInputPanelViewModel$maxBuyChangedFlow$1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getLazily(), C56390yDp.OLrzqt(bool2, ""));
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool2);
        this.valueOf = MutableStateFlow4;
        this.hDKMBd = FlowKt.asStateFlow(MutableStateFlow4);
        this.isConnected = "";
        this.AuCTel = "";
        this.fARcdN = C56390yDp.OLrzqt(bool, "");
        this.AkhnZx = C56390yDp.OLrzqt(bool, "");
        this.values = yDY.AhwBna();
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<DexMultiTokenInfoBean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow5;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<Pair<String, String>> MutableStateFlow6 = StateFlowKt.MutableStateFlow(C56390yDp.OLrzqt("", ""));
        this.KWHzl = MutableStateFlow6;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<DexMultiTokenInfoBean> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.AYXKKw = MutableStateFlow7;
        this.getNewProxyInstance = FlowKt.asStateFlow(MutableStateFlow7);
    }

    public final boolean DbNXlk() {
        return this.EZpvd.getValue().booleanValue();
    }

    public final Pair<Boolean, String> valueOf() {
        return DbNXlk() ? this.fARcdN : this.AkhnZx;
    }

    public final DexMultiTokenInfoBean copydefault() {
        return this.AYXKKw.getValue();
    }

    public final DexMultiTokenInfoBean AEQbTJ() {
        return this.fIwbmz.getValue();
    }

    public final void KWHzl(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        OLrzqt(i == 2);
        KWHzl(str3, true, str, str2);
        AEQbTJ(str4, true);
        AEQbTJ(!z);
    }

    public final List<DexMultiTokenInfoBean> OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) CollectionsKt___CollectionsKt.firstOrNull(this.values);
        return Intrinsics.EZpvd((Object) (dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null), (Object) str) ? this.values : yDY.AhwBna();
    }

    public final String OLrzqt() {
        String str = this.isConnected;
        String str2 = this.AuCTel;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return Intrinsics.EZpvd((Object) sb.toString(), (Object) this.AhwBna.getValue().getFirst()) ? this.AhwBna.getValue().getSecond() : "";
    }

    public final void copydefault(boolean z) {
        this.gEmmrt.setValue(Boolean.valueOf(z));
    }

    public final void AEQbTJ(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.setValue(C56390yDp.OLrzqt(Boolean.valueOf(z), str));
    }

    public final void AEQbTJ(boolean z) {
        this.valueOf.setValue(Boolean.valueOf(z));
    }

    public final void OLrzqt(boolean z) {
        this.EZpvd.setValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ void updateBuyInputValue$default(CopyTradingBuyInputPanelViewModel copyTradingBuyInputPanelViewModel, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            str2 = copyTradingBuyInputPanelViewModel.isConnected;
        }
        if ((i & 8) != 0) {
            str3 = copyTradingBuyInputPanelViewModel.AuCTel;
        }
        copyTradingBuyInputPanelViewModel.KWHzl(str, z, str2, str3);
    }

    public final void KWHzl(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (DbNXlk()) {
            this.fARcdN = C56390yDp.OLrzqt(Boolean.valueOf(z), str);
        } else {
            this.AkhnZx = C56390yDp.OLrzqt(Boolean.valueOf(z), str);
        }
        this.isConnected = str2;
        this.AuCTel = str3;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingBuyInputPanelViewModel$updateBuyInputValue$1(this, null), 3, null);
    }

    public final void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null) {
            return;
        }
        this.KWHzl.setValue(C56390yDp.OLrzqt("", ""));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingBuyInputPanelViewModel$getTokenInfo$1(this, dexMultiTokenInfoBean, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingBuyInputPanelViewModel$subscribeTokensBalance$1(this, dexMultiTokenInfoBean, null), 3, null);
    }

    public final void EZpvd(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault();
        if (Intrinsics.EZpvd((Object) (dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null), (Object) str)) {
            return;
        }
        this.AEQbTJ.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingBuyInputPanelViewModel$getCurrencyTokenList$1(this, str, str2, null), 3, null);
    }
}

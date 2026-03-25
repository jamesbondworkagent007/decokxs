package com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailReq;
import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C27493jwI;
import o.iZC;
import o.iZF;
import o.iZG;
import o.iZT;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiTokenModelAssetDetailViewModel extends ViewModel {
    public final iZG AEQbTJ;
    public final StateFlow<iZT> EZpvd;
    public final iZF KWHzl;
    public final iZC OLrzqt;
    public final MutableStateFlow<iZT> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<iZT> AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public DeFiTokenModelAssetDetailViewModel(@NotNull iZF izf, @NotNull iZG izg, @NotNull iZC izc) {
        Intrinsics.checkNotNullParameter(izf, "");
        Intrinsics.checkNotNullParameter(izg, "");
        Intrinsics.checkNotNullParameter(izc, "");
        this.KWHzl = izf;
        this.AEQbTJ = izg;
        this.OLrzqt = izc;
        MutableStateFlow<iZT> MutableStateFlow = StateFlowKt.MutableStateFlow(iZT.Application.OLrzqt);
        this.copydefault = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void OLrzqt(@NotNull List<DashboardTokenDetailReq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DeFiTokenModelAssetDetailViewModel$loadAssetDetail$1(this, list, null), 3, null);
    }

    public final void copydefault(@NotNull InvestedToken investedToken, @NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(investedToken, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault.setValue(new iZT.TaskDescription(this.OLrzqt.copydefault(investedToken, str, str2, j)));
    }
}

package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitsResponse;
import com.okinc.tradingbot.impl.dto.BillsArchive;
import com.okinc.tradingbot.impl.dto.FundingFeeIncomeResponse;
import com.okinc.tradingbot.impl.dto.InterestInfoResponse;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C56529yIt;
import o.vNB;
import o.wTK;
import o.wTN;
import o.wTQ;
import o.wTT;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes11.dex */
public final class ProfitsViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<vNB<InterestInfoResponse>> AEQbTJ;
    public final wTK AYXKKw;
    public final Flow<vNB<Pair<List<BillsArchive>, InterestInfoResponse>>> AhwBna;
    public final StateFlow<vNB<ArbitrageStakingProfitsResponse>> DbNXlk;
    public final MutableStateFlow<vNB<ArbitrageStakingProfitsResponse>> EZpvd;
    public final StateFlow<vNB<List<FundingFeeIncomeResponse>>> KWHzl;
    public final MutableStateFlow<vNB<List<BillsArchive>>> OLrzqt;
    public final MutableStateFlow<vNB<List<FundingFeeIncomeResponse>>> copydefault;
    public final CoroutineDispatcher djBIcL;
    public final wTQ gEmmrt;
    public final wTT isConnected;
    public final wTN valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<List<FundingFeeIncomeResponse>>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<ArbitrageStakingProfitsResponse>> OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<vNB<Pair<List<BillsArchive>, InterestInfoResponse>>> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public ProfitsViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull wTN wtn, @NotNull wTQ wtq, @NotNull wTK wtk, @NotNull wTT wtt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(wtn, "");
        Intrinsics.checkNotNullParameter(wtq, "");
        Intrinsics.checkNotNullParameter(wtk, "");
        Intrinsics.checkNotNullParameter(wtt, "");
        this.djBIcL = coroutineDispatcher;
        this.valueOf = wtn;
        this.gEmmrt = wtq;
        this.AYXKKw = wtk;
        this.isConnected = wtt;
        vNB.Activity activity = vNB.Activity.copydefault;
        MutableStateFlow<vNB<ArbitrageStakingProfitsResponse>> MutableStateFlow = StateFlowKt.MutableStateFlow(activity);
        this.EZpvd = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<vNB<List<FundingFeeIncomeResponse>>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(activity);
        this.copydefault = MutableStateFlow2;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<vNB<List<BillsArchive>>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(activity);
        this.OLrzqt = MutableStateFlow3;
        MutableStateFlow<vNB<InterestInfoResponse>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(activity);
        this.AEQbTJ = MutableStateFlow4;
        this.AhwBna = FlowKt.flowCombine(MutableStateFlow3, MutableStateFlow4, new ProfitsViewModel$borrowInterest$1(null));
    }

    public final void KWHzl(Long l, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<vNB<List<BillsArchive>>> mutableStateFlow = this.OLrzqt;
        vNB.Activity activity = vNB.Activity.copydefault;
        mutableStateFlow.setValue(activity);
        this.AEQbTJ.setValue(activity);
        copydefault(l);
        if (z) {
            this.AEQbTJ.setValue(new vNB.TaskDescription(null));
        } else {
            copydefault(str);
        }
    }

    public final void copydefault(Long l) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new ProfitsViewModel$getBillArchive$1(this, l, null), 2, null);
    }

    public final void copydefault(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new ProfitsViewModel$getInterestInfo$1(this, str, null), 2, null);
    }

    public final void copydefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new ProfitsViewModel$fetchArbRewards$1(this, str, z, null), 2, null);
    }

    public final String KWHzl() {
        int rawOffset = TimeZone.getDefault().getRawOffset();
        String str = rawOffset >= 0 ? Marker.ANY_NON_NULL_MARKER : "-";
        int iAbs = Math.abs(rawOffset);
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String str2 = String.format("UTC" + str + "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iAbs / 3600000), Integer.valueOf((iAbs / 60000) % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final void OLrzqt(@NotNull String str, Long l, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new ProfitsViewModel$fetchStakingRewards$1(this, str, l, str2, null), 2, null);
    }
}

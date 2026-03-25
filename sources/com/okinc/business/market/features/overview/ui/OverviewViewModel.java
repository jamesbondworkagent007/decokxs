package com.okinc.business.market.features.overview.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.business.invest_api.bean.EarnRecommendApyBean;
import com.okinc.business.market.features.overview.domain.BasicInfo;
import com.okinc.business.market.features.overview.domain.Overview;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C25389ivm;
import o.C28986klC;
import o.C29009klZ;
import o.C29063kma;
import o.C29116kna;
import o.C29162koT;
import o.kAN;
import o.kKG;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class OverviewViewModel extends AbstractC33073mpa {
    public List<TagWrapper> AEQbTJ;
    public final StateFlow<List<EarnRecommendApyBean>> AYXKKw;
    public FilterTimeDuration AhwBna;
    public final StateFlow<C29063kma> AkhnZx;
    public final SavedStateHandle DbNXlk;
    public final MutableStateFlow<C29063kma> EZpvd;
    public final MutableStateFlow<C29116kna> KWHzl;
    public final MutableStateFlow<C29009klZ> OLrzqt;
    public final MutableStateFlow<List<EarnRecommendApyBean>> copydefault;
    public boolean djBIcL;
    public final StateFlow<C29116kna> fIwbmz;
    public final kKG fJNWhG;
    public final StateFlow<C29009klZ> fetchVPNInfo;
    public final kAN gEmmrt;
    public final C29162koT isConnected;
    public final CoroutineDispatcher valueOf;
    public final C28986klC values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29116kna> AhwBna() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<EarnRecommendApyBean>> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29063kma> copydefault() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29009klZ> valueOf() {
        return this.fetchVPNInfo;
    }

    @yCM
    public OverviewViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C28986klC c28986klC, @NotNull kAN kan, @NotNull kKG kkg, @NotNull C29162koT c29162koT, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c28986klC, "");
        Intrinsics.checkNotNullParameter(kan, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c29162koT, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.DbNXlk = savedStateHandle;
        this.values = c28986klC;
        this.gEmmrt = kan;
        this.fJNWhG = kkg;
        this.isConnected = c29162koT;
        this.valueOf = coroutineDispatcher;
        MutableStateFlow<C29063kma> MutableStateFlow = StateFlowKt.MutableStateFlow(new C29063kma(true, false, null, 6, null));
        this.EZpvd = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C29009klZ> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C29009klZ(true, false, null, 6, null));
        this.OLrzqt = MutableStateFlow2;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<EarnRecommendApyBean>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow3;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<C29116kna> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow4;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow4);
        this.AhwBna = FilterTimeDuration.TWENTY_FOUR_HOURS_SELECTION;
        this.djBIcL = true;
        this.AEQbTJ = yDY.AhwBna();
    }

    public final TokenBase AEQbTJ() {
        TokenBase tokenBase = (TokenBase) this.DbNXlk.get("token_base");
        return tokenBase == null ? new TokenBase(null, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -1, null) : tokenBase;
    }

    public final String KWHzl() {
        String str = (String) this.DbNXlk.get("key.page_from");
        return str == null ? "unknown" : str;
    }

    public static /* synthetic */ void getOverviewData$default(OverviewViewModel overviewViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        overviewViewModel.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new OverviewViewModel$getOverviewData$1(this, z, null), 2, null);
    }

    public static /* synthetic */ void getTransactionData$default(OverviewViewModel overviewViewModel, FilterTimeDuration filterTimeDuration, int i, Object obj) {
        if ((i & 1) != 0) {
            filterTimeDuration = overviewViewModel.AhwBna;
        }
        overviewViewModel.copydefault(filterTimeDuration);
    }

    public final void copydefault(@NotNull FilterTimeDuration filterTimeDuration) {
        Intrinsics.checkNotNullParameter(filterTimeDuration, "");
        this.AhwBna = filterTimeDuration;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OverviewViewModel$getTransactionData$1(this, filterTimeDuration, null), 3, null);
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OverviewViewModel$getSearchAlert$1(this, null), 3, null);
    }

    public final void DbNXlk() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OverviewViewModel$saveSearchAlert$1(this, null), 3, null);
    }

    public static /* synthetic */ void loadEarnApyList$default(OverviewViewModel overviewViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        overviewViewModel.KWHzl(str);
    }

    public final void KWHzl(String str) {
        if (this.copydefault.getValue() != null) {
            return;
        }
        if (str == null) {
            str = AEQbTJ().getTokenContractAddress();
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new OverviewViewModel$loadEarnApyList$1(this, str, null), 3, null);
    }

    public final void gEmmrt() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new OverviewViewModel$getVibesData$1(this, null), 3, null);
    }

    public final boolean djBIcL() {
        BasicInfo basicInfoKWHzl;
        Overview overviewAEQbTJ = this.AkhnZx.getValue().AEQbTJ();
        if (overviewAEQbTJ == null || (basicInfoKWHzl = overviewAEQbTJ.KWHzl()) == null) {
            return false;
        }
        return basicInfoKWHzl.values();
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new OverviewViewModel$preloadRwaStatuses$1(this, str, null), 2, null);
    }
}

package com.okinc.dexkline.market.features.overview.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_api.bean.EarnRecommendApyBean;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o.AbstractC33073mpa;
import o.C34332naA;
import o.C34350naS;
import o.C34351naT;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class OverviewViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<C34351naT> AEQbTJ;
    public final C34332naA AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public TokenBase DbNXlk;
    public FilterTimeDuration EZpvd;
    public final MutableStateFlow<C34350naS> KWHzl;
    public final MutableStateFlow<List<EarnRecommendApyBean>> OLrzqt;
    public List<TagWrapper> copydefault;
    public boolean djBIcL;
    public final SavedStateHandle fetchVPNInfo;
    public final StateFlow<C34350naS> gEmmrt;
    public final StateFlow<List<EarnRecommendApyBean>> valueOf;
    public final StateFlow<C34351naT> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C34350naS> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        this.DbNXlk = tokenBase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<EarnRecommendApyBean>> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C34351naT> copydefault() {
        return this.values;
    }

    @yCM
    public OverviewViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C34332naA c34332naA, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c34332naA, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.fetchVPNInfo = savedStateHandle;
        this.AYXKKw = c34332naA;
        this.AhwBna = coroutineDispatcher;
        this.DbNXlk = new TokenBase((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null);
        MutableStateFlow<C34350naS> MutableStateFlow = StateFlowKt.MutableStateFlow(new C34350naS(true, false, null, 6, null));
        this.KWHzl = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C34351naT> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C34351naT(true, false, null, 6, null));
        this.AEQbTJ = MutableStateFlow2;
        this.values = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<EarnRecommendApyBean>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow3;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow3);
        this.EZpvd = FilterTimeDuration.TWENTY_FOUR_HOURS_SELECTION;
        this.djBIcL = true;
        this.copydefault = yDY.AhwBna();
    }

    public static /* synthetic */ void getOverviewData$default(OverviewViewModel overviewViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        overviewViewModel.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AhwBna, null, new OverviewViewModel$getOverviewData$1(this, z, null), 2, null);
    }

    public static /* synthetic */ void getTransactionData$default(OverviewViewModel overviewViewModel, FilterTimeDuration filterTimeDuration, int i, Object obj) {
        if ((i & 1) != 0) {
            filterTimeDuration = overviewViewModel.EZpvd;
        }
        overviewViewModel.copydefault(filterTimeDuration);
    }

    public final void copydefault(@NotNull FilterTimeDuration filterTimeDuration) {
        Intrinsics.checkNotNullParameter(filterTimeDuration, "");
        this.EZpvd = filterTimeDuration;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OverviewViewModel$getTransactionData$1(this, filterTimeDuration, null), 3, null);
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OverviewViewModel$getSearchAlert$1(this, null), 3, null);
    }

    public final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OverviewViewModel$saveSearchAlert$1(this, null), 3, null);
    }
}

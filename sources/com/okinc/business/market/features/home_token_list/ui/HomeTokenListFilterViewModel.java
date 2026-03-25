package com.okinc.business.market.features.home_token_list.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.home.domain.HomeTab;
import com.okinc.business.market.features.home_token_list.ui.HomeTokenListFilterViewModel;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C28451kay;
import o.C28544kcl;
import o.C28548kcp;
import o.C28549kcq;
import o.C31256lqb;
import o.C33129mqd;
import o.C56402yEa;
import o.kMC;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeTokenListFilterViewModel extends ViewModel {
    public final MutableStateFlow<AdvancedFilter> AEQbTJ;
    public final StateFlow<C28549kcq> EZpvd;
    public final MutableStateFlow<C28549kcq> KWHzl;
    public final StateFlow<AdvancedFilter> OLrzqt;
    public final C28548kcp copydefault;
    public final HomeTab djBIcL;
    public final C28544kcl gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AdvancedFilter> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28549kcq> copydefault() {
        return this.EZpvd;
    }

    @yCM
    public HomeTokenListFilterViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C28544kcl c28544kcl, @NotNull C28548kcp c28548kcp) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c28544kcl, "");
        Intrinsics.checkNotNullParameter(c28548kcp, "");
        this.gEmmrt = c28544kcl;
        this.copydefault = c28548kcp;
        HomeTab homeTab = (HomeTab) savedStateHandle.get("key.tab_data");
        this.djBIcL = homeTab == null ? new HomeTab(null, null, null, null, null, null, 63, null) : homeTab;
        MutableStateFlow<AdvancedFilter> MutableStateFlow = StateFlowKt.MutableStateFlow(BuildersKt__BuildersKt.runBlocking$default(null, new HomeTokenListFilterViewModel$_filter$1(this, null), 1, null));
        this.AEQbTJ = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C28549kcq> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C28549kcq(new C28451kay(null, OLrzqt().fetchVPNInfo(), false, null, 13, null), null, false, 6, null));
        this.KWHzl = MutableStateFlow2;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final AdvancedFilter OLrzqt() {
        return this.AEQbTJ.getValue();
    }

    public final C28549kcq KWHzl() {
        return this.KWHzl.getValue();
    }

    public final void EZpvd(@NotNull C28451kay c28451kay) {
        TimeIntervalType timeIntervalTypeCopydefault;
        Intrinsics.checkNotNullParameter(c28451kay, "");
        AdvancedFilter advancedFilterOLrzqt = OLrzqt();
        List listEZpvd = C56402yEa.EZpvd(c28451kay.AEQbTJ().AEQbTJ());
        if (c28451kay.KWHzl()) {
            timeIntervalTypeCopydefault = KWHzl(c28451kay.AEQbTJ().AEQbTJ());
        } else {
            timeIntervalTypeCopydefault = c28451kay.copydefault();
            if (timeIntervalTypeCopydefault == null) {
                timeIntervalTypeCopydefault = OLrzqt().fetchVPNInfo();
            }
        }
        AdvancedFilter advancedFilterEZpvd = this.gEmmrt.EZpvd(advancedFilterOLrzqt.copydefault(((-1073741825) & 1) != 0 ? advancedFilterOLrzqt.KWHzl : null, ((-1073741825) & 2) != 0 ? advancedFilterOLrzqt.copydefault : null, ((-1073741825) & 4) != 0 ? advancedFilterOLrzqt.OLrzqt : null, ((-1073741825) & 8) != 0 ? advancedFilterOLrzqt.hDKMBd : null, ((-1073741825) & 16) != 0 ? advancedFilterOLrzqt.getNewProxyInstance : null, ((-1073741825) & 32) != 0 ? advancedFilterOLrzqt.iwGUEr : null, ((-1073741825) & 64) != 0 ? advancedFilterOLrzqt.AwvSrB : null, ((-1073741825) & 128) != 0 ? advancedFilterOLrzqt.AxsJAY : null, ((-1073741825) & 256) != 0 ? advancedFilterOLrzqt.zuBGHE : null, ((-1073741825) & 512) != 0 ? advancedFilterOLrzqt.AuCTelauCTel : null, ((-1073741825) & 1024) != 0 ? advancedFilterOLrzqt.zLjUOn : null, ((-1073741825) & 2048) != 0 ? advancedFilterOLrzqt.zsXlph : null, ((-1073741825) & 4096) != 0 ? advancedFilterOLrzqt.gHZMYf : null, ((-1073741825) & 8192) != 0 ? advancedFilterOLrzqt.wlaJM : null, ((-1073741825) & 16384) != 0 ? advancedFilterOLrzqt.AubY : null, ((-1073741825) & 32768) != 0 ? advancedFilterOLrzqt.fetchVPNInfo : null, ((-1073741825) & 65536) != 0 ? advancedFilterOLrzqt.AkhnZx : null, ((-1073741825) & 131072) != 0 ? advancedFilterOLrzqt.valueOf : null, ((-1073741825) & 262144) != 0 ? advancedFilterOLrzqt.gEmmrt : null, ((-1073741825) & 524288) != 0 ? advancedFilterOLrzqt.values : null, ((-1073741825) & 1048576) != 0 ? advancedFilterOLrzqt.DbNXlk : null, ((-1073741825) & 2097152) != 0 ? advancedFilterOLrzqt.getFieldNames : null, ((-1073741825) & 4194304) != 0 ? advancedFilterOLrzqt.uzCIH : null, ((-1073741825) & 8388608) != 0 ? advancedFilterOLrzqt.AuCTel : null, ((-1073741825) & 16777216) != 0 ? advancedFilterOLrzqt.fARcdN : 0, ((-1073741825) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? advancedFilterOLrzqt.fIwbmz : false, ((-1073741825) & 67108864) != 0 ? advancedFilterOLrzqt.AhwBna : null, ((-1073741825) & 134217728) != 0 ? advancedFilterOLrzqt.djBIcL : null, ((-1073741825) & 268435456) != 0 ? advancedFilterOLrzqt.EZpvd : false, ((-1073741825) & 536870912) != 0 ? advancedFilterOLrzqt.fJNWhG : null, ((-1073741825) & 1073741824) != 0 ? advancedFilterOLrzqt.isConnected : timeIntervalTypeCopydefault, ((-1073741825) & Integer.MIN_VALUE) != 0 ? advancedFilterOLrzqt.ejfBZ : false, (0 & 1) != 0 ? advancedFilterOLrzqt.AEQbTJ : listEZpvd, (0 & 2) != 0 ? advancedFilterOLrzqt.AYXKKw : c28451kay.KWHzl()));
        KWHzl(advancedFilterEZpvd);
        KWHzl(advancedFilterEZpvd, c28451kay);
    }

    public final void copydefault(@NotNull AdvancedFilter advancedFilter) {
        Intrinsics.checkNotNullParameter(advancedFilter, "");
        AdvancedFilter advancedFilterEZpvd = this.gEmmrt.EZpvd(advancedFilter.copydefault(((-1073741825) & 1) != 0 ? advancedFilter.KWHzl : null, ((-1073741825) & 2) != 0 ? advancedFilter.copydefault : null, ((-1073741825) & 4) != 0 ? advancedFilter.OLrzqt : null, ((-1073741825) & 8) != 0 ? advancedFilter.hDKMBd : null, ((-1073741825) & 16) != 0 ? advancedFilter.getNewProxyInstance : null, ((-1073741825) & 32) != 0 ? advancedFilter.iwGUEr : null, ((-1073741825) & 64) != 0 ? advancedFilter.AwvSrB : null, ((-1073741825) & 128) != 0 ? advancedFilter.AxsJAY : null, ((-1073741825) & 256) != 0 ? advancedFilter.zuBGHE : null, ((-1073741825) & 512) != 0 ? advancedFilter.AuCTelauCTel : null, ((-1073741825) & 1024) != 0 ? advancedFilter.zLjUOn : null, ((-1073741825) & 2048) != 0 ? advancedFilter.zsXlph : null, ((-1073741825) & 4096) != 0 ? advancedFilter.gHZMYf : null, ((-1073741825) & 8192) != 0 ? advancedFilter.wlaJM : null, ((-1073741825) & 16384) != 0 ? advancedFilter.AubY : null, ((-1073741825) & 32768) != 0 ? advancedFilter.fetchVPNInfo : null, ((-1073741825) & 65536) != 0 ? advancedFilter.AkhnZx : null, ((-1073741825) & 131072) != 0 ? advancedFilter.valueOf : null, ((-1073741825) & 262144) != 0 ? advancedFilter.gEmmrt : null, ((-1073741825) & 524288) != 0 ? advancedFilter.values : null, ((-1073741825) & 1048576) != 0 ? advancedFilter.DbNXlk : null, ((-1073741825) & 2097152) != 0 ? advancedFilter.getFieldNames : null, ((-1073741825) & 4194304) != 0 ? advancedFilter.uzCIH : null, ((-1073741825) & 8388608) != 0 ? advancedFilter.AuCTel : null, ((-1073741825) & 16777216) != 0 ? advancedFilter.fARcdN : 0, ((-1073741825) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? advancedFilter.fIwbmz : false, ((-1073741825) & 67108864) != 0 ? advancedFilter.AhwBna : null, ((-1073741825) & 134217728) != 0 ? advancedFilter.djBIcL : null, ((-1073741825) & 268435456) != 0 ? advancedFilter.EZpvd : false, ((-1073741825) & 536870912) != 0 ? advancedFilter.fJNWhG : null, ((-1073741825) & 1073741824) != 0 ? advancedFilter.isConnected : OLrzqt().fetchVPNInfo(), ((-1073741825) & Integer.MIN_VALUE) != 0 ? advancedFilter.ejfBZ : false, (0 & 1) != 0 ? advancedFilter.AEQbTJ : OLrzqt().AEQbTJ(), (0 & 2) != 0 ? advancedFilter.AYXKKw : false));
        KWHzl(advancedFilterEZpvd);
        updateDisplayFilter$default(this, advancedFilterEZpvd, null, 2, null);
    }

    public final TimeIntervalType KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((CharSequence) this.djBIcL.copydefault().copydefault()) && Intrinsics.EZpvd((Object) str, (Object) this.djBIcL.copydefault().copydefault()) && this.djBIcL.copydefault().OLrzqt()) {
            return this.djBIcL.copydefault().KWHzl();
        }
        return this.djBIcL.AEQbTJ().fetchVPNInfo();
    }

    public final void gEmmrt() {
        KWHzl(this.djBIcL.AEQbTJ());
        updateDisplayFilter$default(this, this.djBIcL.AEQbTJ(), null, 2, null);
    }

    public final void copydefault(@NotNull kMC kmc) {
        Intrinsics.checkNotNullParameter(kmc, "");
        AdvancedFilter advancedFilterOLrzqt = OLrzqt();
        RankingType rankingTypeEZpvd = kmc.EZpvd();
        if (rankingTypeEZpvd == null) {
            rankingTypeEZpvd = RankingType.SEARCH;
        }
        AdvancedFilter advancedFilterCopydefault = advancedFilterOLrzqt.copydefault(((-1073741825) & 1) != 0 ? advancedFilterOLrzqt.KWHzl : null, ((-1073741825) & 2) != 0 ? advancedFilterOLrzqt.copydefault : null, ((-1073741825) & 4) != 0 ? advancedFilterOLrzqt.OLrzqt : null, ((-1073741825) & 8) != 0 ? advancedFilterOLrzqt.hDKMBd : null, ((-1073741825) & 16) != 0 ? advancedFilterOLrzqt.getNewProxyInstance : null, ((-1073741825) & 32) != 0 ? advancedFilterOLrzqt.iwGUEr : null, ((-1073741825) & 64) != 0 ? advancedFilterOLrzqt.AwvSrB : null, ((-1073741825) & 128) != 0 ? advancedFilterOLrzqt.AxsJAY : null, ((-1073741825) & 256) != 0 ? advancedFilterOLrzqt.zuBGHE : null, ((-1073741825) & 512) != 0 ? advancedFilterOLrzqt.AuCTelauCTel : null, ((-1073741825) & 1024) != 0 ? advancedFilterOLrzqt.zLjUOn : null, ((-1073741825) & 2048) != 0 ? advancedFilterOLrzqt.zsXlph : null, ((-1073741825) & 4096) != 0 ? advancedFilterOLrzqt.gHZMYf : null, ((-1073741825) & 8192) != 0 ? advancedFilterOLrzqt.wlaJM : null, ((-1073741825) & 16384) != 0 ? advancedFilterOLrzqt.AubY : null, ((-1073741825) & 32768) != 0 ? advancedFilterOLrzqt.fetchVPNInfo : null, ((-1073741825) & 65536) != 0 ? advancedFilterOLrzqt.AkhnZx : null, ((-1073741825) & 131072) != 0 ? advancedFilterOLrzqt.valueOf : null, ((-1073741825) & 262144) != 0 ? advancedFilterOLrzqt.gEmmrt : null, ((-1073741825) & 524288) != 0 ? advancedFilterOLrzqt.values : null, ((-1073741825) & 1048576) != 0 ? advancedFilterOLrzqt.DbNXlk : null, ((-1073741825) & 2097152) != 0 ? advancedFilterOLrzqt.getFieldNames : null, ((-1073741825) & 4194304) != 0 ? advancedFilterOLrzqt.uzCIH : null, ((-1073741825) & 8388608) != 0 ? advancedFilterOLrzqt.AuCTel : null, ((-1073741825) & 16777216) != 0 ? advancedFilterOLrzqt.fARcdN : 0, ((-1073741825) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? advancedFilterOLrzqt.fIwbmz : false, ((-1073741825) & 67108864) != 0 ? advancedFilterOLrzqt.AhwBna : null, ((-1073741825) & 134217728) != 0 ? advancedFilterOLrzqt.djBIcL : null, ((-1073741825) & 268435456) != 0 ? advancedFilterOLrzqt.EZpvd : kmc.AEQbTJ(), ((-1073741825) & 536870912) != 0 ? advancedFilterOLrzqt.fJNWhG : rankingTypeEZpvd, ((-1073741825) & 1073741824) != 0 ? advancedFilterOLrzqt.isConnected : null, ((-1073741825) & Integer.MIN_VALUE) != 0 ? advancedFilterOLrzqt.ejfBZ : false, (0 & 1) != 0 ? advancedFilterOLrzqt.AEQbTJ : null, (0 & 2) != 0 ? advancedFilterOLrzqt.AYXKKw : false);
        KWHzl(advancedFilterCopydefault);
        updateDisplayFilter$default(this, advancedFilterCopydefault, null, 2, null);
    }

    public final void KWHzl(@NotNull AdvancedFilter advancedFilter) {
        Intrinsics.checkNotNullParameter(advancedFilter, "");
        this.AEQbTJ.setValue(advancedFilter);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeTokenListFilterViewModel$updateFilter$1(this, advancedFilter, null), 3, null);
    }

    public static /* synthetic */ void updateDisplayFilter$default(HomeTokenListFilterViewModel homeTokenListFilterViewModel, AdvancedFilter advancedFilter, C28451kay c28451kay, int i, Object obj) {
        if ((i & 2) != 0) {
            c28451kay = null;
        }
        homeTokenListFilterViewModel.KWHzl(advancedFilter, c28451kay);
    }

    public final void KWHzl(@NotNull AdvancedFilter advancedFilter, C28451kay c28451kay) {
        TimeIntervalType timeIntervalTypeCopydefault;
        Intrinsics.checkNotNullParameter(advancedFilter, "");
        C28549kcq c28549kcqCopy$default = C28549kcq.copy$default(KWHzl(), null, new kMC(advancedFilter.isConnected(), advancedFilter.EZpvd()), KWHzl(advancedFilter, this.djBIcL.AEQbTJ()), 1, null);
        C28451kay c28451kayCopy$default = c28451kay != null ? C28451kay.copy$default(c28451kay, null, (c28451kay == null || (timeIntervalTypeCopydefault = c28451kay.copydefault()) == null) ? advancedFilter.fetchVPNInfo() : timeIntervalTypeCopydefault, false, null, 13, null) : null;
        if (c28451kayCopy$default != null) {
            c28549kcqCopy$default = C28549kcq.copy$default(c28549kcqCopy$default, c28451kayCopy$default, null, false, 6, null);
        }
        this.KWHzl.setValue(c28549kcqCopy$default);
    }

    public final boolean KWHzl(@NotNull AdvancedFilter advancedFilter, @NotNull AdvancedFilter advancedFilter2) {
        Intrinsics.checkNotNullParameter(advancedFilter, "");
        Intrinsics.checkNotNullParameter(advancedFilter2, "");
        return !Intrinsics.EZpvd(AEQbTJ(advancedFilter), AEQbTJ(advancedFilter2));
    }

    public final AdvancedFilter AEQbTJ(@NotNull AdvancedFilter advancedFilter) {
        Intrinsics.checkNotNullParameter(advancedFilter, "");
        return this.gEmmrt.EZpvd(advancedFilter.copydefault(((-1073741825) & 1) != 0 ? advancedFilter.KWHzl : null, ((-1073741825) & 2) != 0 ? advancedFilter.copydefault : null, ((-1073741825) & 4) != 0 ? advancedFilter.OLrzqt : null, ((-1073741825) & 8) != 0 ? advancedFilter.hDKMBd : null, ((-1073741825) & 16) != 0 ? advancedFilter.getNewProxyInstance : null, ((-1073741825) & 32) != 0 ? advancedFilter.iwGUEr : null, ((-1073741825) & 64) != 0 ? advancedFilter.AwvSrB : null, ((-1073741825) & 128) != 0 ? advancedFilter.AxsJAY : null, ((-1073741825) & 256) != 0 ? advancedFilter.zuBGHE : null, ((-1073741825) & 512) != 0 ? advancedFilter.AuCTelauCTel : null, ((-1073741825) & 1024) != 0 ? advancedFilter.zLjUOn : null, ((-1073741825) & 2048) != 0 ? advancedFilter.zsXlph : null, ((-1073741825) & 4096) != 0 ? advancedFilter.gHZMYf : null, ((-1073741825) & 8192) != 0 ? advancedFilter.wlaJM : null, ((-1073741825) & 16384) != 0 ? advancedFilter.AubY : null, ((-1073741825) & 32768) != 0 ? advancedFilter.fetchVPNInfo : null, ((-1073741825) & 65536) != 0 ? advancedFilter.AkhnZx : null, ((-1073741825) & 131072) != 0 ? advancedFilter.valueOf : null, ((-1073741825) & 262144) != 0 ? advancedFilter.gEmmrt : null, ((-1073741825) & 524288) != 0 ? advancedFilter.values : null, ((-1073741825) & 1048576) != 0 ? advancedFilter.DbNXlk : null, ((-1073741825) & 2097152) != 0 ? advancedFilter.getFieldNames : null, ((-1073741825) & 4194304) != 0 ? advancedFilter.uzCIH : null, ((-1073741825) & 8388608) != 0 ? advancedFilter.AuCTel : null, ((-1073741825) & 16777216) != 0 ? advancedFilter.fARcdN : 0, ((-1073741825) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? advancedFilter.fIwbmz : false, ((-1073741825) & 67108864) != 0 ? advancedFilter.AhwBna : null, ((-1073741825) & 134217728) != 0 ? advancedFilter.djBIcL : null, ((-1073741825) & 268435456) != 0 ? advancedFilter.EZpvd : false, ((-1073741825) & 536870912) != 0 ? advancedFilter.fJNWhG : null, ((-1073741825) & 1073741824) != 0 ? advancedFilter.isConnected : TimeIntervalType.ONE_HOUR, ((-1073741825) & Integer.MIN_VALUE) != 0 ? advancedFilter.ejfBZ : false, (0 & 1) != 0 ? advancedFilter.AEQbTJ : yDY.AhwBna(), (0 & 2) != 0 ? advancedFilter.AYXKKw : true));
    }

    public static final String KWHzl(HomeTokenListFilterViewModel homeTokenListFilterViewModel) {
        return homeTokenListFilterViewModel.djBIcL.KWHzl();
    }

    public final String AEQbTJ() {
        return C31256lqb.KWHzl(this.djBIcL.EZpvd(), (Function0<String>) new Function0() { // from class: o.kcr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HomeTokenListFilterViewModel.KWHzl(this.KWHzl);
            }
        });
    }
}

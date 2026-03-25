package com.okinc.business.market.features.module.ui.detail.list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.module.domain.model.MarketSortBy;
import com.okinc.business.market.features.module.domain.type.TimeType;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C25389ivm;
import o.C28896kjS;
import o.C28899kjV;
import o.InterfaceC29021kll;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ModuleDetailListViewModel extends ViewModel {
    public final MutableLiveData<InterfaceC29021kll> AEQbTJ;
    public C28899kjV AYXKKw;
    public boolean AhwBna;
    public TimeType AkhnZx;
    public boolean EZpvd;
    public OKSortTextView.SortType KWHzl;
    public String OLrzqt;
    public MarketSortBy copydefault;
    public String djBIcL;
    public String fetchVPNInfo;
    public String gEmmrt;
    public final C28896kjS isConnected;
    public final CoroutineDispatcher valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<InterfaceC29021kll> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28899kjV OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull OKSortTextView.SortType sortType, @NotNull MarketSortBy marketSortBy) {
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(marketSortBy, "");
        this.KWHzl = sortType;
        this.copydefault = marketSortBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.EZpvd = false;
    }

    @yCM
    public ModuleDetailListViewModel(@NotNull C28896kjS c28896kjS, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c28896kjS, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.isConnected = c28896kjS;
        this.valueOf = coroutineDispatcher;
        this.gEmmrt = "-100";
        this.djBIcL = "";
        this.OLrzqt = "";
        this.AkhnZx = TimeType.FIVE_MINUTES;
        this.fetchVPNInfo = "";
        this.AEQbTJ = new MutableLiveData<>();
        this.copydefault = MarketSortBy.VOLUME;
        this.KWHzl = OKSortTextView.SortType.NONE;
    }

    public static /* synthetic */ void getModuleData$default(ModuleDetailListViewModel moduleDetailListViewModel, String str, String str2, TimeType timeType, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleDetailListViewModel.djBIcL;
        }
        if ((i & 2) != 0) {
            str2 = moduleDetailListViewModel.OLrzqt;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            timeType = moduleDetailListViewModel.AkhnZx;
        }
        TimeType timeType2 = timeType;
        if ((i & 8) != 0) {
            str3 = moduleDetailListViewModel.gEmmrt;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = moduleDetailListViewModel.fetchVPNInfo;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            z = moduleDetailListViewModel.AhwBna;
        }
        moduleDetailListViewModel.OLrzqt(str, str5, timeType2, str6, str7, z);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull TimeType timeType, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(timeType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ModuleDetailListViewModel$getModuleData$1(this, str3, str, str2, timeType, str4, z, null), 3, null);
    }

    public final void djBIcL() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new ModuleDetailListViewModel$stopWebsocket$1(this, null), 2, null);
    }

    public final void AEQbTJ() {
        C28899kjV c28899kjV = this.AYXKKw;
        if (c28899kjV == null || c28899kjV.isConnected().isEmpty()) {
            return;
        }
        String strFARcdN = this.fetchVPNInfo;
        if (StringsKt__StringsKt.fARcdN((CharSequence) strFARcdN)) {
            strFARcdN = c28899kjV.fARcdN();
        }
        if (StringsKt__StringsKt.fARcdN((CharSequence) strFARcdN)) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new ModuleDetailListViewModel$startWebsocket$1$1(this, strFARcdN, null), 2, null);
    }

    public static /* synthetic */ void sortModule$default(ModuleDetailListViewModel moduleDetailListViewModel, OKSortTextView.SortType sortType, MarketSortBy marketSortBy, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            sortType = moduleDetailListViewModel.KWHzl;
        }
        if ((i & 2) != 0) {
            marketSortBy = moduleDetailListViewModel.copydefault;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        moduleDetailListViewModel.copydefault(sortType, marketSortBy, z);
    }

    public final void copydefault(@NotNull OKSortTextView.SortType sortType, @NotNull MarketSortBy marketSortBy, boolean z) {
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(marketSortBy, "");
        OLrzqt(sortType, marketSortBy);
        C28899kjV c28899kjV = this.AYXKKw;
        if (c28899kjV != null) {
            this.AEQbTJ.postValue(new InterfaceC29021kll.TaskDescription(c28899kjV.EZpvd((1046527 & 1) != 0 ? c28899kjV.values : false, (1046527 & 2) != 0 ? c28899kjV.AuCTel : null, (1046527 & 4) != 0 ? c28899kjV.AEQbTJ : null, (1046527 & 8) != 0 ? c28899kjV.copydefault : null, (1046527 & 16) != 0 ? c28899kjV.fARcdN : null, (1046527 & 32) != 0 ? c28899kjV.AhwBna : null, (1046527 & 64) != 0 ? c28899kjV.fJNWhG : null, (1046527 & 128) != 0 ? c28899kjV.gEmmrt : null, (1046527 & 256) != 0 ? c28899kjV.djBIcL : null, (1046527 & 512) != 0 ? c28899kjV.OLrzqt : null, (1046527 & 1024) != 0 ? c28899kjV.EZpvd : null, (1046527 & 2048) != 0 ? c28899kjV.fIwbmz : this.isConnected.AEQbTJ(c28899kjV.isConnected(), this.KWHzl, this.copydefault), (1046527 & 4096) != 0 ? c28899kjV.ejfBZ : null, (1046527 & 8192) != 0 ? c28899kjV.isConnected : null, (1046527 & 16384) != 0 ? c28899kjV.AkhnZx : null, (1046527 & 32768) != 0 ? c28899kjV.AYXKKw : null, (1046527 & 65536) != 0 ? c28899kjV.fetchVPNInfo : null, (1046527 & 131072) != 0 ? c28899kjV.valueOf : false, (1046527 & 262144) != 0 ? c28899kjV.DbNXlk : null, (1046527 & 524288) != 0 ? c28899kjV.KWHzl : null), z));
        }
    }

    public final boolean EZpvd() {
        C28899kjV c28899kjV = this.AYXKKw;
        if (c28899kjV != null) {
            return c28899kjV.ejfBZ();
        }
        return false;
    }
}

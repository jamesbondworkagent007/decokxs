package com.okinc.business.market.features.filter.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TimeRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.jUV;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class FilterViewModel extends ViewModel {
    public final MutableStateFlow<jUV> AEQbTJ;
    public final StateFlow<jUV> EZpvd;
    public final FilterBottomSheetParams copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jUV> AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public FilterViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        FilterBottomSheetParams filterBottomSheetParamsCopydefault = (FilterBottomSheetParams) savedStateHandle.get("key.filterBottomSheetParams");
        filterBottomSheetParamsCopydefault = filterBottomSheetParamsCopydefault == null ? FilterBottomSheetParams.Companion.copydefault() : filterBottomSheetParamsCopydefault;
        this.copydefault = filterBottomSheetParamsCopydefault;
        TokenFilter tokenFilterValueOf = filterBottomSheetParamsCopydefault.valueOf();
        MutableStateFlow<jUV> MutableStateFlow = StateFlowKt.MutableStateFlow(new jUV(tokenFilterValueOf == null ? filterBottomSheetParamsCopydefault.copydefault() : tokenFilterValueOf, false, false, 6, null));
        this.AEQbTJ = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TokenFilter tokenFilterEZpvd = this.AEQbTJ.getValue().EZpvd();
        emitNewState$default(this, tokenFilterEZpvd.OLrzqt((6143 & 1) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (6143 & 4) != 0 ? tokenFilterEZpvd.AkhnZx : str, (6143 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (6143 & 16) != 0 ? tokenFilterEZpvd.KWHzl : null, (6143 & 32) != 0 ? tokenFilterEZpvd.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterEZpvd.valueOf : false, (6143 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (6143 & 256) != 0 ? tokenFilterEZpvd.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterEZpvd.copydefault : null, (6143 & 2048) != 0 ? tokenFilterEZpvd.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null), false, 2, null);
    }

    public final void copydefault(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        TokenFilter tokenFilterOLrzqt;
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        if (this.AEQbTJ.getValue().EZpvd().AEQbTJ()) {
            TokenFilter tokenFilterEZpvd = this.AEQbTJ.getValue().EZpvd();
            tokenFilterOLrzqt = tokenFilterEZpvd.OLrzqt((6143 & 1) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (6143 & 4) != 0 ? tokenFilterEZpvd.AkhnZx : null, (6143 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (6143 & 16) != 0 ? tokenFilterEZpvd.KWHzl : null, (6143 & 32) != 0 ? tokenFilterEZpvd.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterEZpvd.valueOf : false, (6143 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (6143 & 256) != 0 ? tokenFilterEZpvd.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterEZpvd.copydefault : priceRangeFilter, (6143 & 2048) != 0 ? tokenFilterEZpvd.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null);
        } else {
            TokenFilter tokenFilterEZpvd2 = this.AEQbTJ.getValue().EZpvd();
            tokenFilterOLrzqt = tokenFilterEZpvd2.OLrzqt((6143 & 1) != 0 ? tokenFilterEZpvd2.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterEZpvd2.isConnected : null, (6143 & 4) != 0 ? tokenFilterEZpvd2.AkhnZx : null, (6143 & 8) != 0 ? tokenFilterEZpvd2.AhwBna : priceRangeFilter, (6143 & 16) != 0 ? tokenFilterEZpvd2.KWHzl : null, (6143 & 32) != 0 ? tokenFilterEZpvd2.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterEZpvd2.valueOf : false, (6143 & 128) != 0 ? tokenFilterEZpvd2.EZpvd : null, (6143 & 256) != 0 ? tokenFilterEZpvd2.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterEZpvd2.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterEZpvd2.copydefault : null, (6143 & 2048) != 0 ? tokenFilterEZpvd2.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterEZpvd2.fetchVPNInfo : null);
        }
        copydefault(tokenFilterOLrzqt, z);
    }

    public final void copydefault(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        TokenFilter tokenFilterEZpvd = this.AEQbTJ.getValue().EZpvd();
        emitNewState$default(this, tokenFilterEZpvd.OLrzqt((6143 & 1) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (6143 & 4) != 0 ? tokenFilterEZpvd.AkhnZx : null, (6143 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (6143 & 16) != 0 ? tokenFilterEZpvd.KWHzl : list, (6143 & 32) != 0 ? tokenFilterEZpvd.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterEZpvd.valueOf : false, (6143 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (6143 & 256) != 0 ? tokenFilterEZpvd.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterEZpvd.copydefault : null, (6143 & 2048) != 0 ? tokenFilterEZpvd.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null), false, 2, null);
    }

    public final void OLrzqt(@NotNull TimeRangeFilter timeRangeFilter) {
        Intrinsics.checkNotNullParameter(timeRangeFilter, "");
        TokenFilter tokenFilterEZpvd = this.AEQbTJ.getValue().EZpvd();
        emitNewState$default(this, tokenFilterEZpvd.OLrzqt((6143 & 1) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (6143 & 4) != 0 ? tokenFilterEZpvd.AkhnZx : null, (6143 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (6143 & 16) != 0 ? tokenFilterEZpvd.KWHzl : null, (6143 & 32) != 0 ? tokenFilterEZpvd.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterEZpvd.valueOf : false, (6143 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (6143 & 256) != 0 ? tokenFilterEZpvd.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterEZpvd.copydefault : null, (6143 & 2048) != 0 ? tokenFilterEZpvd.djBIcL : timeRangeFilter, (6143 & 4096) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null), false, 2, null);
    }

    public final void OLrzqt(boolean z) {
        TokenFilter tokenFilterEZpvd = this.AEQbTJ.getValue().EZpvd();
        emitNewState$default(this, tokenFilterEZpvd.OLrzqt((6143 & 1) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (6143 & 4) != 0 ? tokenFilterEZpvd.AkhnZx : null, (6143 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (6143 & 16) != 0 ? tokenFilterEZpvd.KWHzl : null, (6143 & 32) != 0 ? tokenFilterEZpvd.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterEZpvd.valueOf : false, (6143 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (6143 & 256) != 0 ? tokenFilterEZpvd.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : z, (6143 & 1024) != 0 ? tokenFilterEZpvd.copydefault : null, (6143 & 2048) != 0 ? tokenFilterEZpvd.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null), false, 2, null);
    }

    public static /* synthetic */ void emitNewState$default(FilterViewModel filterViewModel, TokenFilter tokenFilter, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        filterViewModel.copydefault(tokenFilter, z);
    }

    public final void copydefault(@NotNull TokenFilter tokenFilter, boolean z) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        if (z && Intrinsics.EZpvd(this.copydefault.valueOf(), this.copydefault.copydefault())) {
            Intrinsics.EZpvd(this.copydefault.valueOf(), tokenFilter);
        }
        this.AEQbTJ.setValue(new jUV(tokenFilter, z, (this.copydefault.valueOf() == null || Intrinsics.EZpvd(this.copydefault.valueOf(), this.copydefault.copydefault())) ? false : true));
    }
}

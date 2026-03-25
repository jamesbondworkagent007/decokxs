package com.okinc.dexkline.market.features.filter.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter;
import com.okinc.dexkline.market.features.filter.domain.TimeRangeFilter;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C32363mZf;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class FilterViewModel extends ViewModel {
    public final FilterBottomSheetParams AEQbTJ;
    public final MutableStateFlow<C32363mZf> EZpvd;
    public final StateFlow<C32363mZf> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C32363mZf> KWHzl() {
        return this.KWHzl;
    }

    @yCM
    public FilterViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        FilterBottomSheetParams filterBottomSheetParamsEZpvd = (FilterBottomSheetParams) savedStateHandle.get("key.filterBottomSheetParams");
        filterBottomSheetParamsEZpvd = filterBottomSheetParamsEZpvd == null ? FilterBottomSheetParams.Companion.EZpvd() : filterBottomSheetParamsEZpvd;
        this.AEQbTJ = filterBottomSheetParamsEZpvd;
        TokenFilter tokenFilterOLrzqt = filterBottomSheetParamsEZpvd.OLrzqt();
        MutableStateFlow<C32363mZf> MutableStateFlow = StateFlowKt.MutableStateFlow(new C32363mZf(tokenFilterOLrzqt == null ? filterBottomSheetParamsEZpvd.EZpvd() : tokenFilterOLrzqt, false, false, 6, null));
        this.EZpvd = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TokenFilter tokenFilterEZpvd = this.EZpvd.getValue().EZpvd();
        emitNewState$default(this, tokenFilterEZpvd.AEQbTJ((15359 & 1) != 0 ? tokenFilterEZpvd.copydefault : null, (15359 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (15359 & 4) != 0 ? tokenFilterEZpvd.DbNXlk : str, (15359 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (15359 & 16) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilterEZpvd.valueOf : false, (15359 & 64) != 0 ? tokenFilterEZpvd.djBIcL : false, (15359 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (15359 & 256) != 0 ? tokenFilterEZpvd.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilterEZpvd.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilterEZpvd.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterEZpvd.AkhnZx : null), false, 2, null);
    }

    public final void KWHzl(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        TokenFilter tokenFilterAEQbTJ;
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        if (this.EZpvd.getValue().EZpvd().OLrzqt()) {
            TokenFilter tokenFilterEZpvd = this.EZpvd.getValue().EZpvd();
            tokenFilterAEQbTJ = tokenFilterEZpvd.AEQbTJ((15359 & 1) != 0 ? tokenFilterEZpvd.copydefault : null, (15359 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (15359 & 4) != 0 ? tokenFilterEZpvd.DbNXlk : null, (15359 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (15359 & 16) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilterEZpvd.valueOf : false, (15359 & 64) != 0 ? tokenFilterEZpvd.djBIcL : false, (15359 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (15359 & 256) != 0 ? tokenFilterEZpvd.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilterEZpvd.gEmmrt : priceRangeFilter, (15359 & 2048) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilterEZpvd.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterEZpvd.AkhnZx : null);
        } else {
            TokenFilter tokenFilterEZpvd2 = this.EZpvd.getValue().EZpvd();
            tokenFilterAEQbTJ = tokenFilterEZpvd2.AEQbTJ((15359 & 1) != 0 ? tokenFilterEZpvd2.copydefault : null, (15359 & 2) != 0 ? tokenFilterEZpvd2.isConnected : null, (15359 & 4) != 0 ? tokenFilterEZpvd2.DbNXlk : null, (15359 & 8) != 0 ? tokenFilterEZpvd2.AhwBna : priceRangeFilter, (15359 & 16) != 0 ? tokenFilterEZpvd2.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilterEZpvd2.valueOf : false, (15359 & 64) != 0 ? tokenFilterEZpvd2.djBIcL : false, (15359 & 128) != 0 ? tokenFilterEZpvd2.EZpvd : null, (15359 & 256) != 0 ? tokenFilterEZpvd2.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterEZpvd2.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilterEZpvd2.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilterEZpvd2.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilterEZpvd2.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterEZpvd2.AkhnZx : null);
        }
        OLrzqt(tokenFilterAEQbTJ, z);
    }

    public final void copydefault(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        TokenFilter tokenFilterEZpvd = this.EZpvd.getValue().EZpvd();
        emitNewState$default(this, tokenFilterEZpvd.AEQbTJ((15359 & 1) != 0 ? tokenFilterEZpvd.copydefault : null, (15359 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (15359 & 4) != 0 ? tokenFilterEZpvd.DbNXlk : null, (15359 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (15359 & 16) != 0 ? tokenFilterEZpvd.AEQbTJ : list, (15359 & 32) != 0 ? tokenFilterEZpvd.valueOf : false, (15359 & 64) != 0 ? tokenFilterEZpvd.djBIcL : false, (15359 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (15359 & 256) != 0 ? tokenFilterEZpvd.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilterEZpvd.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilterEZpvd.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterEZpvd.AkhnZx : null), false, 2, null);
    }

    public final void copydefault(@NotNull TimeRangeFilter timeRangeFilter) {
        Intrinsics.checkNotNullParameter(timeRangeFilter, "");
        TokenFilter tokenFilterEZpvd = this.EZpvd.getValue().EZpvd();
        emitNewState$default(this, tokenFilterEZpvd.AEQbTJ((15359 & 1) != 0 ? tokenFilterEZpvd.copydefault : null, (15359 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (15359 & 4) != 0 ? tokenFilterEZpvd.DbNXlk : null, (15359 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (15359 & 16) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilterEZpvd.valueOf : false, (15359 & 64) != 0 ? tokenFilterEZpvd.djBIcL : false, (15359 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (15359 & 256) != 0 ? tokenFilterEZpvd.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilterEZpvd.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilterEZpvd.fetchVPNInfo : timeRangeFilter, (15359 & 4096) != 0 ? tokenFilterEZpvd.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterEZpvd.AkhnZx : null), false, 2, null);
    }

    public final void KWHzl(boolean z) {
        TokenFilter tokenFilterEZpvd = this.EZpvd.getValue().EZpvd();
        emitNewState$default(this, tokenFilterEZpvd.AEQbTJ((15359 & 1) != 0 ? tokenFilterEZpvd.copydefault : null, (15359 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (15359 & 4) != 0 ? tokenFilterEZpvd.DbNXlk : null, (15359 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (15359 & 16) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilterEZpvd.valueOf : false, (15359 & 64) != 0 ? tokenFilterEZpvd.djBIcL : false, (15359 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (15359 & 256) != 0 ? tokenFilterEZpvd.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : z, (15359 & 1024) != 0 ? tokenFilterEZpvd.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilterEZpvd.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterEZpvd.AkhnZx : null), false, 2, null);
    }

    public static /* synthetic */ void emitNewState$default(FilterViewModel filterViewModel, TokenFilter tokenFilter, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        filterViewModel.OLrzqt(tokenFilter, z);
    }

    public final void OLrzqt(@NotNull TokenFilter tokenFilter, boolean z) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        if (z && Intrinsics.EZpvd(this.AEQbTJ.OLrzqt(), this.AEQbTJ.EZpvd())) {
            Intrinsics.EZpvd(this.AEQbTJ.OLrzqt(), tokenFilter);
        }
        this.EZpvd.setValue(new C32363mZf(tokenFilter, z, (this.AEQbTJ.OLrzqt() == null || Intrinsics.EZpvd(this.AEQbTJ.OLrzqt(), this.AEQbTJ.EZpvd())) ? false : true));
    }
}

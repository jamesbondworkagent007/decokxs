package com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25748jEx;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AddressTrackerFilterViewModel extends ViewModel {
    public final TrackerFilterBottomSheetParams AEQbTJ;
    public final StateFlow<C25748jEx> EZpvd;
    public final MutableStateFlow<C25748jEx> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C25748jEx> KWHzl() {
        return this.EZpvd;
    }

    @yCM
    public AddressTrackerFilterViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        TrackerFilterBottomSheetParams trackerFilterBottomSheetParamsOLrzqt = (TrackerFilterBottomSheetParams) savedStateHandle.get("key.trackerFilterBottomSheetParams");
        trackerFilterBottomSheetParamsOLrzqt = trackerFilterBottomSheetParamsOLrzqt == null ? TrackerFilterBottomSheetParams.Companion.OLrzqt() : trackerFilterBottomSheetParamsOLrzqt;
        this.AEQbTJ = trackerFilterBottomSheetParamsOLrzqt;
        TrackerTxnListFilter trackerTxnListFilterAEQbTJ = trackerFilterBottomSheetParamsOLrzqt.AEQbTJ();
        MutableStateFlow<C25748jEx> MutableStateFlow = StateFlowKt.MutableStateFlow(new C25748jEx(trackerTxnListFilterAEQbTJ == null ? trackerFilterBottomSheetParamsOLrzqt.copydefault() : trackerTxnListFilterAEQbTJ, false, false, 6, null));
        this.copydefault = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackerTxnListFilter trackerTxnListFilterAEQbTJ = this.copydefault.getValue().AEQbTJ();
        emitNewState$default(this, trackerTxnListFilterAEQbTJ.copydefault((1007 & 1) != 0 ? trackerTxnListFilterAEQbTJ.KWHzl : false, (1007 & 2) != 0 ? trackerTxnListFilterAEQbTJ.AYXKKw : str, (1007 & 4) != 0 ? trackerTxnListFilterAEQbTJ.gEmmrt : null, (1007 & 8) != 0 ? trackerTxnListFilterAEQbTJ.EZpvd : null, (1007 & 16) != 0 ? trackerTxnListFilterAEQbTJ.copydefault : null, (1007 & 32) != 0 ? trackerTxnListFilterAEQbTJ.values : null, (1007 & 64) != 0 ? trackerTxnListFilterAEQbTJ.fetchVPNInfo : null, (1007 & 128) != 0 ? trackerTxnListFilterAEQbTJ.AhwBna : null, (1007 & 256) != 0 ? trackerTxnListFilterAEQbTJ.valueOf : null, (1007 & 512) != 0 ? trackerTxnListFilterAEQbTJ.djBIcL : null), false, 2, null);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackerTxnListFilter trackerTxnListFilterAEQbTJ = this.copydefault.getValue().AEQbTJ();
        emitNewState$default(this, trackerTxnListFilterAEQbTJ.copydefault((1007 & 1) != 0 ? trackerTxnListFilterAEQbTJ.KWHzl : false, (1007 & 2) != 0 ? trackerTxnListFilterAEQbTJ.AYXKKw : null, (1007 & 4) != 0 ? trackerTxnListFilterAEQbTJ.gEmmrt : str, (1007 & 8) != 0 ? trackerTxnListFilterAEQbTJ.EZpvd : null, (1007 & 16) != 0 ? trackerTxnListFilterAEQbTJ.copydefault : null, (1007 & 32) != 0 ? trackerTxnListFilterAEQbTJ.values : null, (1007 & 64) != 0 ? trackerTxnListFilterAEQbTJ.fetchVPNInfo : null, (1007 & 128) != 0 ? trackerTxnListFilterAEQbTJ.AhwBna : null, (1007 & 256) != 0 ? trackerTxnListFilterAEQbTJ.valueOf : null, (1007 & 512) != 0 ? trackerTxnListFilterAEQbTJ.djBIcL : null), false, 2, null);
    }

    public final void AhwBna(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        TrackerTxnListFilter trackerTxnListFilterAEQbTJ = this.copydefault.getValue().AEQbTJ();
        copydefault(trackerTxnListFilterAEQbTJ.copydefault((1007 & 1) != 0 ? trackerTxnListFilterAEQbTJ.KWHzl : false, (1007 & 2) != 0 ? trackerTxnListFilterAEQbTJ.AYXKKw : null, (1007 & 4) != 0 ? trackerTxnListFilterAEQbTJ.gEmmrt : null, (1007 & 8) != 0 ? trackerTxnListFilterAEQbTJ.EZpvd : null, (1007 & 16) != 0 ? trackerTxnListFilterAEQbTJ.copydefault : null, (1007 & 32) != 0 ? trackerTxnListFilterAEQbTJ.values : null, (1007 & 64) != 0 ? trackerTxnListFilterAEQbTJ.fetchVPNInfo : PriceRangeFilter.copy$default(priceRangeFilter, null, null, null, null, null, null, false, 63, null), (1007 & 128) != 0 ? trackerTxnListFilterAEQbTJ.AhwBna : null, (1007 & 256) != 0 ? trackerTxnListFilterAEQbTJ.valueOf : null, (1007 & 512) != 0 ? trackerTxnListFilterAEQbTJ.djBIcL : null), z);
    }

    public final void AEQbTJ(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        TrackerTxnListFilter trackerTxnListFilterAEQbTJ = this.copydefault.getValue().AEQbTJ();
        copydefault(trackerTxnListFilterAEQbTJ.copydefault((1007 & 1) != 0 ? trackerTxnListFilterAEQbTJ.KWHzl : false, (1007 & 2) != 0 ? trackerTxnListFilterAEQbTJ.AYXKKw : null, (1007 & 4) != 0 ? trackerTxnListFilterAEQbTJ.gEmmrt : null, (1007 & 8) != 0 ? trackerTxnListFilterAEQbTJ.EZpvd : null, (1007 & 16) != 0 ? trackerTxnListFilterAEQbTJ.copydefault : priceRangeFilter, (1007 & 32) != 0 ? trackerTxnListFilterAEQbTJ.values : null, (1007 & 64) != 0 ? trackerTxnListFilterAEQbTJ.fetchVPNInfo : null, (1007 & 128) != 0 ? trackerTxnListFilterAEQbTJ.AhwBna : null, (1007 & 256) != 0 ? trackerTxnListFilterAEQbTJ.valueOf : null, (1007 & 512) != 0 ? trackerTxnListFilterAEQbTJ.djBIcL : null), z);
    }

    public final void EZpvd(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        TrackerTxnListFilter trackerTxnListFilterAEQbTJ = this.copydefault.getValue().AEQbTJ();
        copydefault(trackerTxnListFilterAEQbTJ.copydefault((1007 & 1) != 0 ? trackerTxnListFilterAEQbTJ.KWHzl : false, (1007 & 2) != 0 ? trackerTxnListFilterAEQbTJ.AYXKKw : null, (1007 & 4) != 0 ? trackerTxnListFilterAEQbTJ.gEmmrt : null, (1007 & 8) != 0 ? trackerTxnListFilterAEQbTJ.EZpvd : priceRangeFilter, (1007 & 16) != 0 ? trackerTxnListFilterAEQbTJ.copydefault : null, (1007 & 32) != 0 ? trackerTxnListFilterAEQbTJ.values : null, (1007 & 64) != 0 ? trackerTxnListFilterAEQbTJ.fetchVPNInfo : null, (1007 & 128) != 0 ? trackerTxnListFilterAEQbTJ.AhwBna : null, (1007 & 256) != 0 ? trackerTxnListFilterAEQbTJ.valueOf : null, (1007 & 512) != 0 ? trackerTxnListFilterAEQbTJ.djBIcL : null), z);
    }

    public final void copydefault(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        TrackerTxnListFilter trackerTxnListFilterAEQbTJ = this.copydefault.getValue().AEQbTJ();
        copydefault(trackerTxnListFilterAEQbTJ.copydefault((1007 & 1) != 0 ? trackerTxnListFilterAEQbTJ.KWHzl : false, (1007 & 2) != 0 ? trackerTxnListFilterAEQbTJ.AYXKKw : null, (1007 & 4) != 0 ? trackerTxnListFilterAEQbTJ.gEmmrt : null, (1007 & 8) != 0 ? trackerTxnListFilterAEQbTJ.EZpvd : null, (1007 & 16) != 0 ? trackerTxnListFilterAEQbTJ.copydefault : null, (1007 & 32) != 0 ? trackerTxnListFilterAEQbTJ.values : null, (1007 & 64) != 0 ? trackerTxnListFilterAEQbTJ.fetchVPNInfo : null, (1007 & 128) != 0 ? trackerTxnListFilterAEQbTJ.AhwBna : null, (1007 & 256) != 0 ? trackerTxnListFilterAEQbTJ.valueOf : priceRangeFilter, (1007 & 512) != 0 ? trackerTxnListFilterAEQbTJ.djBIcL : null), z);
    }

    public final void OLrzqt(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        TrackerTxnListFilter trackerTxnListFilterAEQbTJ = this.copydefault.getValue().AEQbTJ();
        copydefault(trackerTxnListFilterAEQbTJ.copydefault((1007 & 1) != 0 ? trackerTxnListFilterAEQbTJ.KWHzl : false, (1007 & 2) != 0 ? trackerTxnListFilterAEQbTJ.AYXKKw : null, (1007 & 4) != 0 ? trackerTxnListFilterAEQbTJ.gEmmrt : null, (1007 & 8) != 0 ? trackerTxnListFilterAEQbTJ.EZpvd : null, (1007 & 16) != 0 ? trackerTxnListFilterAEQbTJ.copydefault : null, (1007 & 32) != 0 ? trackerTxnListFilterAEQbTJ.values : null, (1007 & 64) != 0 ? trackerTxnListFilterAEQbTJ.fetchVPNInfo : null, (1007 & 128) != 0 ? trackerTxnListFilterAEQbTJ.AhwBna : null, (1007 & 256) != 0 ? trackerTxnListFilterAEQbTJ.valueOf : null, (1007 & 512) != 0 ? trackerTxnListFilterAEQbTJ.djBIcL : priceRangeFilter), z);
    }

    public final void KWHzl(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        TrackerTxnListFilter trackerTxnListFilterAEQbTJ = this.copydefault.getValue().AEQbTJ();
        copydefault(trackerTxnListFilterAEQbTJ.copydefault((1007 & 1) != 0 ? trackerTxnListFilterAEQbTJ.KWHzl : false, (1007 & 2) != 0 ? trackerTxnListFilterAEQbTJ.AYXKKw : null, (1007 & 4) != 0 ? trackerTxnListFilterAEQbTJ.gEmmrt : null, (1007 & 8) != 0 ? trackerTxnListFilterAEQbTJ.EZpvd : null, (1007 & 16) != 0 ? trackerTxnListFilterAEQbTJ.copydefault : null, (1007 & 32) != 0 ? trackerTxnListFilterAEQbTJ.values : null, (1007 & 64) != 0 ? trackerTxnListFilterAEQbTJ.fetchVPNInfo : null, (1007 & 128) != 0 ? trackerTxnListFilterAEQbTJ.AhwBna : priceRangeFilter, (1007 & 256) != 0 ? trackerTxnListFilterAEQbTJ.valueOf : null, (1007 & 512) != 0 ? trackerTxnListFilterAEQbTJ.djBIcL : null), z);
    }

    public static /* synthetic */ void emitNewState$default(AddressTrackerFilterViewModel addressTrackerFilterViewModel, TrackerTxnListFilter trackerTxnListFilter, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        addressTrackerFilterViewModel.copydefault(trackerTxnListFilter, z);
    }

    public final void copydefault(@NotNull TrackerTxnListFilter trackerTxnListFilter, boolean z) {
        Intrinsics.checkNotNullParameter(trackerTxnListFilter, "");
        this.copydefault.setValue(new C25748jEx(trackerTxnListFilter, z && !(Intrinsics.EZpvd(this.AEQbTJ.AEQbTJ(), this.AEQbTJ.copydefault()) && Intrinsics.EZpvd(this.AEQbTJ.AEQbTJ(), trackerTxnListFilter)), true ^ trackerTxnListFilter.fetchVPNInfo()));
    }
}

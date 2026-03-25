package com.okinc.business.market.features.trader.ui.filter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.okinc.business.market.features.trader.ui.model.TraderPnLFilter;
import kotlin.jvm.internal.Intrinsics;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TradersFilterViewModel extends ViewModel {
    public String AEQbTJ;
    public final MutableLiveData<Boolean> EZpvd;
    public final SavedStateHandle KWHzl;
    public TraderPnLFilter copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraderPnLFilter EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> copydefault() {
        return this.EZpvd;
    }

    @yCM
    public TradersFilterViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = savedStateHandle;
        TraderPnLFilter traderPnLFilter = (TraderPnLFilter) savedStateHandle.get("PNL_SELECTED");
        this.copydefault = traderPnLFilter == null ? TraderPnLFilter.TOTAL : traderPnLFilter;
        String str = (String) savedStateHandle.get("FILTER_ADDRESS");
        this.AEQbTJ = str != null ? str : "";
        this.EZpvd = new MutableLiveData<>(Boolean.FALSE);
    }

    public static /* synthetic */ void updateFilter$default(TradersFilterViewModel tradersFilterViewModel, TraderPnLFilter traderPnLFilter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            traderPnLFilter = tradersFilterViewModel.copydefault;
        }
        if ((i & 2) != 0) {
            str = tradersFilterViewModel.AEQbTJ;
        }
        tradersFilterViewModel.AEQbTJ(traderPnLFilter, str);
    }

    public final void AEQbTJ(@NotNull TraderPnLFilter traderPnLFilter, @NotNull String str) {
        Intrinsics.checkNotNullParameter(traderPnLFilter, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = traderPnLFilter;
        this.AEQbTJ = str;
        this.EZpvd.setValue(Boolean.valueOf(traderPnLFilter != TraderPnLFilter.TOTAL || str.length() > 0));
    }

    public final void AEQbTJ() {
        this.copydefault = TraderPnLFilter.TOTAL;
        this.AEQbTJ = "";
        this.EZpvd.setValue(Boolean.FALSE);
    }
}

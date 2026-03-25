package com.okinc.business.market.features.data.ui.holder;

import androidx.lifecycle.ViewModel;
import o.yCM;

/* JADX INFO: loaded from: classes6.dex */
public final class DataHolderViewModel extends ViewModel {
    public HolderTimeframe copydefault = HolderTimeframe.WEEKLY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderTimeframe copydefault() {
        return this.copydefault;
    }

    @yCM
    public DataHolderViewModel() {
    }
}

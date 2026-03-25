package com.okinc.dexkline.market.features.data.ui.holder;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class DataHolderViewModel extends ViewModel {
    public HolderTimeframe EZpvd = HolderTimeframe.WEEKLY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderTimeframe KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull HolderTimeframe holderTimeframe) {
        Intrinsics.checkNotNullParameter(holderTimeframe, "");
        this.EZpvd = holderTimeframe;
    }

    @yCM
    public DataHolderViewModel() {
    }
}

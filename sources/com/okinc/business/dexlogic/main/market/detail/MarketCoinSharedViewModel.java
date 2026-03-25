package com.okinc.business.dexlogic.main.market.detail;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C22398hec;
import o.C25389ivm;
import o.C29447ktn;
import o.kKG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketCoinSharedViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<C22398hec> AEQbTJ;
    public final C29447ktn EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final SharedFlow<C22398hec> OLrzqt;
    public final kKG copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C22398hec> KWHzl() {
        return this.OLrzqt;
    }

    @yCM
    public MarketCoinSharedViewModel(@NotNull C29447ktn c29447ktn, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(c29447ktn, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.EZpvd = c29447ktn;
        this.KWHzl = coroutineDispatcher;
        this.copydefault = kkg;
        MutableSharedFlow<C22398hec> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.OLrzqt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void AEQbTJ(@NotNull TokenBase tokenBase, LatestMarketInfoBean latestMarketInfoBean) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.KWHzl, null, new MarketCoinSharedViewModel$share$1(this, tokenBase, latestMarketInfoBean, null), 2, null);
    }
}

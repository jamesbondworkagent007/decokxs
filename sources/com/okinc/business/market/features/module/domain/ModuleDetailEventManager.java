package com.okinc.business.market.features.module.domain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.market.features.module.domain.model.MarketSortBy;
import com.okinc.business.market.features.module.domain.type.TimeType;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.C56390yDp;
import o.InterfaceC29021kll;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ModuleDetailEventManager extends AbstractC33073mpa {
    public final MutableLiveData<TimeType> KWHzl = new MutableLiveData<>(TimeType.ONE_DAY);
    public final MutableLiveData<Pair<OKSortTextView.SortType, MarketSortBy>> EZpvd = new MutableLiveData<>(C56390yDp.OLrzqt(OKSortTextView.SortType.DOWN, MarketSortBy.VOLUME));
    public final MutableLiveData<InterfaceC29021kll> AEQbTJ = new MutableLiveData<>(InterfaceC29021kll.ActionBar.AEQbTJ);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<InterfaceC29021kll> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<TimeType> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Pair<OKSortTextView.SortType, MarketSortBy>> copydefault() {
        return this.EZpvd;
    }

    @yCM
    public ModuleDetailEventManager() {
    }

    public final void AEQbTJ(@NotNull TimeType timeType) {
        Intrinsics.checkNotNullParameter(timeType, "");
        this.KWHzl.setValue(timeType);
    }

    public final void AEQbTJ(@NotNull MarketSortBy marketSortBy, @NotNull OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(marketSortBy, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        this.EZpvd.setValue(C56390yDp.OLrzqt(sortType, marketSortBy));
    }

    public final void copydefault(@NotNull TimeType timeType, @NotNull InterfaceC29021kll interfaceC29021kll) {
        Intrinsics.checkNotNullParameter(timeType, "");
        Intrinsics.checkNotNullParameter(interfaceC29021kll, "");
        if (this.KWHzl.getValue() == timeType) {
            this.AEQbTJ.setValue(interfaceC29021kll);
        }
    }
}

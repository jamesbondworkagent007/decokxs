package com.okinc.tradingbot.impl.market_place.home.list.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.biz.TacticsType;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeStrategySortConfig;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C51527voh;
import o.C54589xNz;
import o.C55688xof;
import o.C56071xvr;
import o.C56403yEb;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xOR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class HomeBotSquarePresenter extends AbsPresenter {
    public final ArrayList<C51527voh> KWHzl;
    public final TradeLiveData<HomeStrategySortConfig> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<HomeStrategySortConfig> copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeBotSquarePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new ArrayList<>();
        this.OLrzqt = new TradeLiveData<>(HomeStrategySortConfig.SMART_SORTING);
    }

    public final void copydefault(@NotNull HomeStrategySortConfig homeStrategySortConfig) {
        Intrinsics.checkNotNullParameter(homeStrategySortConfig, "");
        this.OLrzqt.postValue(homeStrategySortConfig);
    }

    public final List<C51527voh> EZpvd() {
        if (this.KWHzl.isEmpty()) {
            KWHzl();
        }
        return this.KWHzl;
    }

    public final void KWHzl() {
        Collection<? extends C51527voh> collectionAhwBna;
        xOR xorCopydefault;
        this.KWHzl.clear();
        this.KWHzl.add(new C51527voh(null, C33070mpX.AYXKKw(C55688xof.Application.DkGEDn), "FAVORITE", 1, null));
        if (!C56071xvr.gEmmrt.ejfBZ()) {
            TacticsType tacticsType = null;
            int i = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            this.KWHzl.add(new C51527voh(tacticsType, C33070mpX.AYXKKw(C55688xof.Application.aPFruk), "ALL", i, defaultConstructorMarker));
            this.KWHzl.add(new C51527voh(tacticsType, C33070mpX.AYXKKw(C55688xof.Application.apNKau), "FOLLOW", i, defaultConstructorMarker));
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        List<TacticsType> listDjBIcL = (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null) ? null : xorCopydefault.djBIcL();
        ArrayList<C51527voh> arrayList = this.KWHzl;
        if (listDjBIcL == null) {
            collectionAhwBna = yDY.AhwBna();
        } else {
            collectionAhwBna = new ArrayList<>(C56403yEb.AYXKKw(listDjBIcL, 10));
            Iterator<T> it = listDjBIcL.iterator();
            while (it.hasNext()) {
                collectionAhwBna.add(new C51527voh((TacticsType) it.next(), null, null, 6, null));
            }
        }
        arrayList.addAll(collectionAhwBna);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}

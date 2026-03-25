package com.okinc.tradingbot.impl.nmp.home.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.tradingbot.impl.market_place.home.list.HomeSignalType;
import com.okinc.unify_trade.biz.HomeSignalCardResult;
import com.okinc.unify_trade.biz.HomeSignalItemInfo;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeSignalSortConfig;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C55276xgr;
import o.C56281xzp;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC54501xKt;
import o.InterfaceC56445yFq;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class NmpSignalSquarePresenter extends AbsPresenter {
    public final TradeLiveData<List<HomeSignalItemInfo>> AEQbTJ;
    public String AYXKKw;
    public final C56281xzp AhwBna;
    public HomeSignalSortConfig EZpvd;
    public final TradeLiveData<HomeSignalSortConfig> KWHzl;
    public HomeSignalType OLrzqt;
    public String copydefault;
    public String djBIcL;
    public final List<HomeSignalItemInfo> gEmmrt;
    public final TradeLiveData<HomeSignalType> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56281xzp AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeSignalType AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<HomeSignalItemInfo>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(HomeSignalType homeSignalType) {
        this.OLrzqt = homeSignalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<HomeSignalSortConfig> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<HomeSignalType> valueOf() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NmpSignalSquarePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        Object next;
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AhwBna = new C56281xzp();
        this.AEQbTJ = new TradeLiveData<>();
        this.gEmmrt = new ArrayList();
        Iterator<T> it = HomeSignalType.Companion.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((HomeSignalType) next) == HomeSignalType.ALL) {
                    break;
                }
            }
        }
        this.valueOf = new TradeLiveData<>(next);
        this.KWHzl = new TradeLiveData<>(HomeSignalSortConfig.SMART_SCORE);
        this.copydefault = "1";
        this.djBIcL = "20";
    }

    public final void KWHzl(@NotNull HomeSignalType homeSignalType) {
        Intrinsics.checkNotNullParameter(homeSignalType, "");
        this.valueOf.postValue(homeSignalType);
    }

    public final void AEQbTJ(@NotNull HomeSignalSortConfig homeSignalSortConfig) {
        Intrinsics.checkNotNullParameter(homeSignalSortConfig, "");
        this.KWHzl.postValue(homeSignalSortConfig);
    }

    public static /* synthetic */ void fetchSignalList$default(NmpSignalSquarePresenter nmpSignalSquarePresenter, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nmpSignalSquarePresenter.AYXKKw;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        nmpSignalSquarePresenter.OLrzqt(str, z);
    }

    public final void OLrzqt(String str, boolean z) {
        if (!z) {
            HomeSignalSortConfig value = this.KWHzl.getValue();
            String mode = value != null ? value.getMode() : null;
            HomeSignalSortConfig homeSignalSortConfig = this.EZpvd;
            if (Intrinsics.EZpvd((Object) mode, (Object) (homeSignalSortConfig != null ? homeSignalSortConfig.getMode() : null)) || str == null || str.length() == 0) {
                return;
            }
        }
        this.AYXKKw = str;
        this.EZpvd = this.KWHzl.getValue();
        this.copydefault = "1";
        this.gEmmrt.clear();
        fetchVPNInfo();
    }

    public final void gEmmrt() {
        this.copydefault = C33129mqd.addS$default(this.copydefault, 1, null, null, null, 14, null);
        fetchVPNInfo();
    }

    public final boolean djBIcL() {
        return C33129mqd.AEQbTJ(this.copydefault, 1);
    }

    public final List<HomeSignalItemInfo> AEQbTJ() {
        List<HomeSignalItemInfo> list = this.gEmmrt;
        List<HomeSignalItemInfo> value = this.AEQbTJ.getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        list.addAll(value);
        return this.gEmmrt;
    }

    private final void fetchVPNInfo() {
        C56281xzp c56281xzp = this.AhwBna;
        HomeSignalSortConfig homeSignalSortConfig = this.EZpvd;
        String mode = homeSignalSortConfig != null ? homeSignalSortConfig.getMode() : null;
        HomeSignalSortConfig homeSignalSortConfig2 = this.EZpvd;
        c56281xzp.copydefault(mode, homeSignalSortConfig2 != null ? homeSignalSortConfig2.getDirection() : null, this.copydefault, this.djBIcL, this.AYXKKw);
        c56281xzp.OLrzqt(this.AEQbTJ, new ActionBar());
        xKK.Activity.execute$default(c56281xzp, 0L, 1, null);
    }

    public static final class ActionBar implements InterfaceC54501xKt<List<? extends HomeSignalCardResult>, List<? extends HomeSignalItemInfo>> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ List<? extends HomeSignalItemInfo> KWHzl(List<? extends HomeSignalCardResult> list) {
            return KWHzl2((List<HomeSignalCardResult>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public List<HomeSignalItemInfo> KWHzl2(List<HomeSignalCardResult> list) {
            List<HomeSignalItemInfo> signals;
            Intrinsics.checkNotNullParameter(list, "");
            HomeSignalCardResult homeSignalCardResult = (HomeSignalCardResult) CollectionsKt___CollectionsKt.firstOrNull(list);
            return (homeSignalCardResult == null || (signals = homeSignalCardResult.getSignals()) == null) ? yDY.AhwBna() : signals;
        }
    }

    public final List<C55276xgr> KWHzl() {
        HomeSignalType value = this.valueOf.getValue();
        String type = value != null ? value.getType() : null;
        List<HomeSignalType> listAEQbTJ = HomeSignalType.Companion.AEQbTJ();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (HomeSignalType homeSignalType : listAEQbTJ) {
            arrayList.add(new C55276xgr(C33070mpX.AYXKKw(homeSignalType.getTitle()), homeSignalType, null, Intrinsics.EZpvd((Object) homeSignalType.getType(), (Object) type), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        return arrayList;
    }

    public final List<C55276xgr> copydefault() {
        HomeSignalSortConfig value = this.KWHzl.getValue();
        String mode = value != null ? value.getMode() : null;
        InterfaceC56445yFq<HomeSignalSortConfig> entries = HomeSignalSortConfig.getEntries();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(entries, 10));
        for (HomeSignalSortConfig homeSignalSortConfig : entries) {
            arrayList.add(new C55276xgr(C33070mpX.AYXKKw(homeSignalSortConfig.getDesc()), homeSignalSortConfig, null, Intrinsics.EZpvd((Object) homeSignalSortConfig.getMode(), (Object) mode), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        return arrayList;
    }

    public final int KWHzl(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = this.gEmmrt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((HomeSignalItemInfo) next).getSignalChanId(), (Object) str)) {
                break;
            }
        }
        HomeSignalItemInfo homeSignalItemInfo = (HomeSignalItemInfo) next;
        if (homeSignalItemInfo == null) {
            return 0;
        }
        homeSignalItemInfo.setSubscribed(true);
        return this.gEmmrt.indexOf(homeSignalItemInfo);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.AhwBna);
    }
}

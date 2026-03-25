package com.okinc.tradingbot.impl.market_place.home.list.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
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
import o.InterfaceC54501xKt;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class HomeSignalListPresenter extends AbsPresenter {
    public final List<HomeSignalItemInfo> AEQbTJ;
    public String AhwBna;
    public HomeSignalSortConfig EZpvd;
    public String KWHzl;
    public final TradeLiveData<List<HomeSignalItemInfo>> OLrzqt;
    public String copydefault;
    public final C56281xzp djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<HomeSignalItemInfo>> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56281xzp OLrzqt() {
        return this.djBIcL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeSignalListPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = new C56281xzp();
        this.OLrzqt = new TradeLiveData<>();
        this.AEQbTJ = new ArrayList();
        this.copydefault = "1";
        this.KWHzl = "20";
    }

    public static /* synthetic */ void fetchSignalList$default(HomeSignalListPresenter homeSignalListPresenter, HomeSignalSortConfig homeSignalSortConfig, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str = homeSignalListPresenter.AhwBna;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        homeSignalListPresenter.OLrzqt(homeSignalSortConfig, str, z);
    }

    public final void OLrzqt(HomeSignalSortConfig homeSignalSortConfig, String str, boolean z) {
        if (!z) {
            String mode = homeSignalSortConfig != null ? homeSignalSortConfig.getMode() : null;
            HomeSignalSortConfig homeSignalSortConfig2 = this.EZpvd;
            if (Intrinsics.EZpvd((Object) mode, (Object) (homeSignalSortConfig2 != null ? homeSignalSortConfig2.getMode() : null)) || str == null || str.length() == 0) {
                return;
            }
        }
        this.AhwBna = str;
        this.EZpvd = homeSignalSortConfig;
        this.copydefault = "1";
        this.AEQbTJ.clear();
        copydefault();
    }

    public final void AYXKKw() {
        this.copydefault = C33129mqd.addS$default(this.copydefault, 1, null, null, null, 14, null);
        copydefault();
    }

    public final boolean AEQbTJ() {
        return C33129mqd.AEQbTJ(this.copydefault, 1);
    }

    public final List<HomeSignalItemInfo> EZpvd() {
        List<HomeSignalItemInfo> list = this.AEQbTJ;
        List<HomeSignalItemInfo> value = this.OLrzqt.getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        list.addAll(value);
        return this.AEQbTJ;
    }

    public final void copydefault() {
        C56281xzp c56281xzp = this.djBIcL;
        HomeSignalSortConfig homeSignalSortConfig = this.EZpvd;
        String mode = homeSignalSortConfig != null ? homeSignalSortConfig.getMode() : null;
        HomeSignalSortConfig homeSignalSortConfig2 = this.EZpvd;
        c56281xzp.copydefault(mode, homeSignalSortConfig2 != null ? homeSignalSortConfig2.getDirection() : null, this.copydefault, this.KWHzl, this.AhwBna);
        c56281xzp.OLrzqt(this.OLrzqt, new Activity());
        xKK.Activity.execute$default(c56281xzp, 0L, 1, null);
    }

    public static final class Activity implements InterfaceC54501xKt<List<? extends HomeSignalCardResult>, List<? extends HomeSignalItemInfo>> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public List<HomeSignalItemInfo> KWHzl(List<HomeSignalCardResult> list) {
            List<HomeSignalItemInfo> signals;
            Intrinsics.checkNotNullParameter(list, "");
            HomeSignalCardResult homeSignalCardResult = (HomeSignalCardResult) CollectionsKt___CollectionsKt.firstOrNull(list);
            return (homeSignalCardResult == null || (signals = homeSignalCardResult.getSignals()) == null) ? yDY.AhwBna() : signals;
        }
    }

    public final List<C55276xgr> KWHzl(String str) {
        HomeSignalSortConfig[] homeSignalSortConfigArrValues = HomeSignalSortConfig.values();
        ArrayList arrayList = new ArrayList(homeSignalSortConfigArrValues.length);
        for (HomeSignalSortConfig homeSignalSortConfig : homeSignalSortConfigArrValues) {
            arrayList.add(new C55276xgr(C33070mpX.AYXKKw(homeSignalSortConfig.getDesc()), homeSignalSortConfig, null, Intrinsics.EZpvd((Object) homeSignalSortConfig.getMode(), (Object) str), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    public final int AEQbTJ(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = this.AEQbTJ.iterator();
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
        return this.AEQbTJ.indexOf(homeSignalItemInfo);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.djBIcL);
    }
}

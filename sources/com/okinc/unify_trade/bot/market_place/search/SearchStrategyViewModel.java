package com.okinc.unify_trade.bot.market_place.search;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.biz.TacticsType;
import com.okinc.unify_trade.biz.HomeStrategyCardInfo;
import com.okinc.unify_trade.biz.HomeStrategyCardResult;
import com.okinc.unify_trade.bot.market_place.search.SearchStrategyViewModel;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C54589xNz;
import o.C56207xyU;
import o.C56402yEa;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xOR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchStrategyViewModel extends AbsPresenter {
    public final TradeLiveData<Boolean> AEQbTJ;
    public String AYXKKw;
    public final StateListAnimator AhwBna;
    public final TradeLiveData<HomeStrategyCardResult> EZpvd;
    public final List<HomeStrategyCardInfo> KWHzl;
    public final TradeLiveData<HomeStrategyCardResult> OLrzqt;
    public final C56207xyU copydefault;
    public final TradeLiveData<Boolean> djBIcL;
    public String gEmmrt;
    public int valueOf;
    public String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<HomeStrategyCardResult> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.valueOf = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(String str) {
        this.values = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<HomeStrategyCardResult> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56207xyU copydefault() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchStrategyViewModel(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new TradeLiveData<>();
        this.EZpvd = new TradeLiveData<>();
        this.KWHzl = new ArrayList();
        this.AEQbTJ = new TradeLiveData<>();
        this.djBIcL = new TradeLiveData<>();
        this.copydefault = new C56207xyU();
        this.valueOf = 1;
        this.gEmmrt = "10";
        this.AhwBna = new StateListAnimator();
    }

    private final String djBIcL() {
        xOR xorCopydefault;
        List<TacticsType> listDjBIcL;
        String strJoinToString$default;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        return (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null || (listDjBIcL = xorCopydefault.djBIcL()) == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listDjBIcL, ",", null, null, 0, null, new Function1() { // from class: o.xtW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchStrategyViewModel.copydefault((TacticsType) obj);
            }
        }, 30, null)) == null) ? "" : strJoinToString$default;
    }

    public static final CharSequence copydefault(TacticsType tacticsType) {
        Intrinsics.checkNotNullParameter(tacticsType, "");
        return tacticsType.getConstant();
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.clear();
        copydefault(str);
    }

    private final void copydefault(String str) {
        C56207xyU c56207xyU = this.copydefault;
        String strDjBIcL = djBIcL();
        String str2 = this.values;
        String str3 = str2 == null ? "" : str2;
        String str4 = this.AYXKKw;
        String str5 = str4 == null ? "" : str4;
        c56207xyU.copydefault(strDjBIcL, str, str3, str5, String.valueOf(this.valueOf), this.gEmmrt);
        c56207xyU.djBIcL();
        c56207xyU.OLrzqt(this.OLrzqt, this.AhwBna);
        xKK.Activity.execute$default(c56207xyU, 0L, 1, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf++;
        C56207xyU c56207xyU = this.copydefault;
        String strDjBIcL = djBIcL();
        String str2 = this.values;
        String str3 = str2 == null ? "" : str2;
        String str4 = this.AYXKKw;
        c56207xyU.copydefault(strDjBIcL, str, str3, str4 == null ? "" : str4, String.valueOf(this.valueOf), this.gEmmrt);
        c56207xyU.djBIcL();
        c56207xyU.OLrzqt(this.EZpvd, this.AhwBna);
        xKK.Activity.execute$default(c56207xyU, 0L, 1, null);
    }

    public static final class StateListAnimator implements InterfaceC54501xKt<List<? extends HomeStrategyCardResult>, HomeStrategyCardResult> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public HomeStrategyCardResult KWHzl(List<HomeStrategyCardResult> list) {
            Intrinsics.checkNotNullParameter(list, "");
            HomeStrategyCardResult homeStrategyCardResult = list.isEmpty() ^ true ? list.get(0) : new HomeStrategyCardResult(null, null, null, 7, null);
            SearchStrategyViewModel.this.valueOf = C33129mqd.AhwBna(homeStrategyCardResult.getPage());
            List<HomeStrategyCardInfo> strategies = homeStrategyCardResult.getStrategies();
            Integer numValueOf = strategies != null ? Integer.valueOf(strategies.size()) : null;
            Intrinsics.copydefault(numValueOf);
            SearchStrategyViewModel.this.AhwBna().setValue(Boolean.valueOf(numValueOf.intValue() < C33129mqd.AhwBna(SearchStrategyViewModel.this.gEmmrt)));
            return homeStrategyCardResult;
        }
    }

    public final List<Object> AEQbTJ() {
        List<HomeStrategyCardInfo> listAhwBna;
        List<HomeStrategyCardInfo> list = this.KWHzl;
        HomeStrategyCardResult value = this.OLrzqt.getValue();
        if (value == null || (listAhwBna = value.getStrategies()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        list.addAll(listAhwBna);
        return this.KWHzl;
    }

    public final ArrayList<Object> copydefault(@NotNull ArrayList<Object> arrayList) {
        List<HomeStrategyCardInfo> strategies;
        Intrinsics.checkNotNullParameter(arrayList, "");
        HomeStrategyCardResult value = this.EZpvd.getValue();
        if (value != null && (strategies = value.getStrategies()) != null) {
            arrayList.addAll(strategies);
        }
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.copydefault);
    }
}

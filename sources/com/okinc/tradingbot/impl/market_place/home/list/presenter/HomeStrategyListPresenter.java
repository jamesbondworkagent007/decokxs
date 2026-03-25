package com.okinc.tradingbot.impl.market_place.home.list.presenter;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.biz.TacticsType;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.market_place.home.list.presenter.HomeStrategyListPresenter;
import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.HomeStrategyCardInfo;
import com.okinc.unify_trade.biz.HomeStrategyCardResult;
import com.okinc.unify_trade.biz.HomeStrategyDropDownInfo;
import com.okinc.unify_trade.biz.StgyFavouriteResult;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeStrategyCategoryConfig;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeStrategySortConfig;
import com.okinc.unify_trade.constants.BotUserRole;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C51505voL;
import o.C51519voZ;
import o.C54507xKz;
import o.C54589xNz;
import o.C55276xgr;
import o.C56199xyM;
import o.C56207xyU;
import o.C56231xys;
import o.C56392yDr;
import o.C56403yEb;
import o.C56406yEe;
import o.C56407yEf;
import o.InterfaceC33171mrS;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.xKK;
import o.xOR;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class HomeStrategyListPresenter extends AbsPresenter {
    public final TradeLiveData<HomeStrategyCardResult> AYXKKw;
    public final C56207xyU AhwBna;
    public HomeStrategySortConfig AkhnZx;
    public HomeStrategyDropDownInfo DbNXlk;
    public final List<HomeStrategyCardInfo> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final TradeLiveData<List<BotCategoryConfig>> OLrzqt;
    public String copydefault;
    public final InterfaceC56387yDm djBIcL;
    public String fIwbmz;
    public String fetchVPNInfo;
    public final TradeLiveData<Boolean> gEmmrt;
    public String isConnected;
    public final TradeLiveData<Boolean> valueOf;
    public final TradeLiveData<Pair<Boolean, Integer>> values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Pair<Boolean, Integer>> AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<HomeStrategyCardResult> djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> fetchVPNInfo() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56207xyU isConnected() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> values() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeStrategyListPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AYXKKw = new TradeLiveData<>();
        this.EZpvd = new ArrayList();
        this.values = new TradeLiveData<>();
        this.valueOf = new TradeLiveData<>();
        this.gEmmrt = new TradeLiveData<>();
        this.AhwBna = new C56207xyU();
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.voy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HomeStrategyListPresenter.AEQbTJ();
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vov
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HomeStrategyListPresenter.KWHzl();
            }
        });
        this.OLrzqt = new TradeLiveData<>();
        this.isConnected = "1";
        this.fetchVPNInfo = "20";
    }

    public static final C56199xyM AEQbTJ() {
        return new C56199xyM();
    }

    public final C56199xyM DbNXlk() {
        return (C56199xyM) this.djBIcL.getValue();
    }

    public static final C56231xys KWHzl() {
        return new C56231xys();
    }

    public final C56231xys AYXKKw() {
        return (C56231xys) this.KWHzl.getValue();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.home.list.presenter.HomeStrategyListPresenter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static /* synthetic */ void fetchBotList$default(HomeStrategyListPresenter homeStrategyListPresenter, HomeStrategySortConfig homeStrategySortConfig, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = null;
        }
        homeStrategyListPresenter.AEQbTJ(homeStrategySortConfig, str, str2, z2, str3);
    }

    public final void AEQbTJ(HomeStrategySortConfig homeStrategySortConfig, String str, String str2, boolean z, String str3) {
        this.copydefault = str;
        this.fIwbmz = str2;
        boolean zOLrzqt = OLrzqt(homeStrategySortConfig);
        boolean zCheckFilterCacheChange$default = str3 != null ? false : checkFilterCacheChange$default(this, null, 1, null);
        if (z || zOLrzqt || zCheckFilterCacheChange$default) {
            AhwBna(str3);
        }
    }

    public final String AEQbTJ(String str) {
        return Intrinsics.EZpvd((Object) this.fIwbmz, (Object) "FAVORITE") ? "" : str;
    }

    public static final class Application<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Boolean.valueOf(!((HomeStrategyCardInfo) t).isEnable()), Boolean.valueOf(!((HomeStrategyCardInfo) t2).isEnable()));
        }
    }

    public final String KWHzl(String str) {
        String str2 = this.fIwbmz;
        return Intrinsics.EZpvd((Object) str2, (Object) "FAVORITE") ? "" : Intrinsics.EZpvd((Object) str2, (Object) "FOLLOW") ? BotUserRole.LEAD_TRADER.getRole() : str;
    }

    public static /* synthetic */ void refreshBotList$default(HomeStrategyListPresenter homeStrategyListPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        homeStrategyListPresenter.AhwBna(str);
    }

    public final void AhwBna(String str) {
        this.isConnected = "1";
        this.EZpvd.clear();
        OLrzqt(str);
    }

    public static /* synthetic */ void loadMoreBotList$default(HomeStrategyListPresenter homeStrategyListPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        homeStrategyListPresenter.EZpvd(str);
    }

    public final void EZpvd(String str) {
        this.isConnected = C33129mqd.addS$default(this.isConnected, 1, null, null, null, 14, null);
        OLrzqt(str);
    }

    public final boolean fARcdN() {
        return C33129mqd.AEQbTJ(this.isConnected, 1);
    }

    public final void OLrzqt(HomeStrategyDropDownInfo homeStrategyDropDownInfo) {
        if (EZpvd(homeStrategyDropDownInfo)) {
            refreshBotList$default(this, null, 1, null);
        }
    }

    public final boolean OLrzqt(HomeStrategySortConfig homeStrategySortConfig) {
        String mode = homeStrategySortConfig != null ? homeStrategySortConfig.getMode() : null;
        HomeStrategySortConfig homeStrategySortConfig2 = this.AkhnZx;
        if (Intrinsics.EZpvd((Object) mode, (Object) (homeStrategySortConfig2 != null ? homeStrategySortConfig2.getMode() : null))) {
            return false;
        }
        this.AkhnZx = homeStrategySortConfig;
        return true;
    }

    public static /* synthetic */ boolean checkFilterCacheChange$default(HomeStrategyListPresenter homeStrategyListPresenter, HomeStrategyDropDownInfo homeStrategyDropDownInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            homeStrategyDropDownInfo = null;
        }
        return homeStrategyListPresenter.EZpvd(homeStrategyDropDownInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(HomeStrategyDropDownInfo homeStrategyDropDownInfo) {
        boolean z;
        List<String> leverage;
        List<String> leverage2;
        boolean z2;
        List<String> list;
        Map<String, List<String>> coinCaches;
        Map<String, List<String>> coinCaches2;
        List<String> category;
        List<String> category2;
        List<String> userRole;
        List<String> userRole2;
        List<String> pnlRatio;
        List<String> pnlRatio2;
        List<String> maxDrawdown;
        List<String> maxDrawdown2;
        List<String> runningTime;
        List<String> runningTime2;
        if (homeStrategyDropDownInfo == null) {
            homeStrategyDropDownInfo = (HomeStrategyDropDownInfo) SPUtils.getObject(C51519voZ.Companion.KWHzl(), HomeStrategyDropDownInfo.class);
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo2 = this.DbNXlk;
        List<String> list2 = null;
        if (Intrinsics.EZpvd((Object) ((homeStrategyDropDownInfo2 == null || (runningTime2 = homeStrategyDropDownInfo2.getRunningTime()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(runningTime2)), (Object) ((homeStrategyDropDownInfo == null || (runningTime = homeStrategyDropDownInfo.getRunningTime()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(runningTime)))) {
            HomeStrategyDropDownInfo homeStrategyDropDownInfo3 = this.DbNXlk;
            if (Intrinsics.EZpvd((Object) ((homeStrategyDropDownInfo3 == null || (maxDrawdown2 = homeStrategyDropDownInfo3.getMaxDrawdown()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(maxDrawdown2)), (Object) ((homeStrategyDropDownInfo == null || (maxDrawdown = homeStrategyDropDownInfo.getMaxDrawdown()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(maxDrawdown)))) {
                HomeStrategyDropDownInfo homeStrategyDropDownInfo4 = this.DbNXlk;
                if (Intrinsics.EZpvd((Object) ((homeStrategyDropDownInfo4 == null || (pnlRatio2 = homeStrategyDropDownInfo4.getPnlRatio()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(pnlRatio2)), (Object) ((homeStrategyDropDownInfo == null || (pnlRatio = homeStrategyDropDownInfo.getPnlRatio()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(pnlRatio)))) {
                    HomeStrategyDropDownInfo homeStrategyDropDownInfo5 = this.DbNXlk;
                    if (Intrinsics.EZpvd((Object) ((homeStrategyDropDownInfo5 == null || (userRole2 = homeStrategyDropDownInfo5.getUserRole()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(userRole2)), (Object) ((homeStrategyDropDownInfo == null || (userRole = homeStrategyDropDownInfo.getUserRole()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(userRole)))) {
                        HomeStrategyDropDownInfo homeStrategyDropDownInfo6 = this.DbNXlk;
                        if (Intrinsics.EZpvd((Object) ((homeStrategyDropDownInfo6 == null || (category2 = homeStrategyDropDownInfo6.getCategory()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(category2)), (Object) ((homeStrategyDropDownInfo == null || (category = homeStrategyDropDownInfo.getCategory()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(category)))) {
                            z = false;
                        }
                    }
                }
            }
        } else {
            z = true;
        }
        String str = this.copydefault;
        if (Intrinsics.EZpvd((Object) str, (Object) "contract_grid") || Intrinsics.EZpvd((Object) str, (Object) "contract_dca")) {
            HomeStrategyDropDownInfo homeStrategyDropDownInfo7 = this.DbNXlk;
            z2 = !Intrinsics.EZpvd((Object) ((homeStrategyDropDownInfo7 == null || (leverage2 = homeStrategyDropDownInfo7.getLeverage()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(leverage2)), (Object) ((homeStrategyDropDownInfo == null || (leverage = homeStrategyDropDownInfo.getLeverage()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(leverage)));
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo8 = this.DbNXlk;
        if (homeStrategyDropDownInfo8 == null || (coinCaches2 = homeStrategyDropDownInfo8.getCoinCaches()) == null) {
            list = null;
        } else {
            String str2 = this.copydefault;
            if (str2 == null) {
                str2 = "";
            }
            list = coinCaches2.get(str2);
        }
        if (homeStrategyDropDownInfo != null && (coinCaches = homeStrategyDropDownInfo.getCoinCaches()) != null) {
            String str3 = this.copydefault;
            list2 = coinCaches.get(str3 != null ? str3 : "");
        }
        boolean z3 = z || z2 || (Intrinsics.EZpvd(list, list2) ^ true);
        this.DbNXlk = homeStrategyDropDownInfo;
        return z3;
    }

    public static /* synthetic */ void innerFetchBotList$default(HomeStrategyListPresenter homeStrategyListPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        homeStrategyListPresenter.OLrzqt(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String direction;
        String mode;
        List<String> category;
        List<String> userRole;
        List<String> leverage;
        List<String> pnlRatio;
        List<String> maxDrawdown;
        List<String> runningTime;
        Map<String, List<String>> coinCaches;
        if (str == null) {
            HomeStrategyDropDownInfo homeStrategyDropDownInfo = this.DbNXlk;
            if (homeStrategyDropDownInfo == null || (coinCaches = homeStrategyDropDownInfo.getCoinCaches()) == null) {
                str2 = null;
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                String str9 = this.copydefault;
                if (str9 == null) {
                    str9 = "";
                }
                List<String> list = coinCaches.get(str9);
                if (list != null) {
                    str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(list);
                }
                if (str2 == null) {
                }
            }
        } else {
            str2 = str;
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo2 = this.DbNXlk;
        if (homeStrategyDropDownInfo2 == null || (runningTime = homeStrategyDropDownInfo2.getRunningTime()) == null || (str3 = (String) CollectionsKt___CollectionsKt.firstOrNull(runningTime)) == null) {
            str3 = "";
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo3 = this.DbNXlk;
        if (homeStrategyDropDownInfo3 == null || (maxDrawdown = homeStrategyDropDownInfo3.getMaxDrawdown()) == null || (str4 = (String) CollectionsKt___CollectionsKt.firstOrNull(maxDrawdown)) == null) {
            str4 = "";
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo4 = this.DbNXlk;
        if (homeStrategyDropDownInfo4 == null || (pnlRatio = homeStrategyDropDownInfo4.getPnlRatio()) == null || (str5 = (String) CollectionsKt___CollectionsKt.firstOrNull(pnlRatio)) == null) {
            str5 = "";
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo5 = this.DbNXlk;
        if (homeStrategyDropDownInfo5 == null || (leverage = homeStrategyDropDownInfo5.getLeverage()) == null || (str6 = (String) CollectionsKt___CollectionsKt.firstOrNull(leverage)) == null) {
            str6 = "";
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo6 = this.DbNXlk;
        if (homeStrategyDropDownInfo6 == null || (userRole = homeStrategyDropDownInfo6.getUserRole()) == null || (str7 = (String) CollectionsKt___CollectionsKt.firstOrNull(userRole)) == null) {
            str7 = "";
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo7 = this.DbNXlk;
        if (homeStrategyDropDownInfo7 == null || (category = homeStrategyDropDownInfo7.getCategory()) == null || (str8 = (String) CollectionsKt___CollectionsKt.firstOrNull(category)) == null) {
            str8 = "";
        }
        this.gEmmrt.postValue(Boolean.valueOf((!Intrinsics.EZpvd((Object) this.fIwbmz, (Object) "FAVORITE") && (str2.length() > 0 || str3.length() > 0 || str4.length() > 0 || str5.length() > 0 || str7.length() > 0)) || str8.length() > 0));
        C56207xyU c56207xyU = this.AhwBna;
        String str10 = Intrinsics.EZpvd((Object) this.fIwbmz, (Object) "FAVORITE") ? "1" : "0";
        String strCopydefault = copydefault(str8);
        String strAEQbTJ = AEQbTJ(str2);
        String strAEQbTJ2 = AEQbTJ(str3);
        String strAEQbTJ3 = AEQbTJ(str4);
        String strAEQbTJ4 = AEQbTJ(str5);
        String strAEQbTJ5 = AEQbTJ(str6);
        HomeStrategySortConfig homeStrategySortConfig = this.AkhnZx;
        String str11 = (homeStrategySortConfig == null || (mode = homeStrategySortConfig.getMode()) == null) ? "" : mode;
        HomeStrategySortConfig homeStrategySortConfig2 = this.AkhnZx;
        c56207xyU.copydefault(str10, strCopydefault, strAEQbTJ, strAEQbTJ2, strAEQbTJ3, strAEQbTJ4, strAEQbTJ5, str11, (homeStrategySortConfig2 == null || (direction = homeStrategySortConfig2.getDirection()) == null) ? "" : direction, this.isConnected, this.fetchVPNInfo, KWHzl(str7));
        c56207xyU.djBIcL();
        c56207xyU.OLrzqt(this.AYXKKw, new C54507xKz());
        xKK.Activity.execute$default(c56207xyU, 0L, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r0.equals("FAVORITE") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r0.equals("ALL") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(com.okinc.biz.TacticsType.Companion.KWHzl(), ",", null, null, 0, null, null, 62, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String copydefault(String str) {
        String str2;
        xOR xorCopydefault;
        List<TacticsType> listDjBIcL;
        String strJoinToString$default;
        String str3 = this.fIwbmz;
        if (str3 == null) {
            str2 = this.copydefault;
            if (str2 == null) {
                return str2;
            }
        } else {
            int iHashCode = str3.hashCode();
            if (iHashCode != 2159) {
                if (iHashCode != 64897) {
                    if (iHashCode != 1833417116) {
                        if (iHashCode == 2079338417 && str3.equals("FOLLOW")) {
                            String strEZpvd = HomeStrategyCategoryConfig.Companion.EZpvd(str);
                            return strEZpvd.length() == 0 ? CollectionsKt___CollectionsKt.joinToString$default(TacticsType.Companion.KWHzl(), ",", null, null, 0, null, null, 62, null) : strEZpvd;
                        }
                    }
                }
            } else if (str3.equals("CR")) {
                InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
                if (interfaceC54581xNrCopydefault != null && (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) != null && (listDjBIcL = xorCopydefault.djBIcL()) != null && (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listDjBIcL, ",", null, null, 0, null, new Function1() { // from class: o.vow
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return HomeStrategyListPresenter.OLrzqt((TacticsType) obj);
                    }
                }, 30, null)) != null) {
                    return strJoinToString$default;
                }
            }
            str2 = this.copydefault;
            if (str2 == null) {
            }
        }
        return "";
    }

    public static final CharSequence OLrzqt(TacticsType tacticsType) {
        Intrinsics.checkNotNullParameter(tacticsType, "");
        return tacticsType.getConstant();
    }

    public final void OLrzqt(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        C56199xyM c56199xyMDbNXlk = DbNXlk();
        c56199xyMDbNXlk.OLrzqt(str);
        c56199xyMDbNXlk.AEQbTJ((String) null);
        c56199xyMDbNXlk.djBIcL();
        c56199xyMDbNXlk.OLrzqt(this.values, new Activity(i));
        xKK.Activity.execute$default(c56199xyMDbNXlk, 0L, 1, null);
    }

    public static final class Activity implements InterfaceC54501xKt<List<? extends StgyFavouriteResult>, Pair<? extends Boolean, ? extends Integer>> {
        public final /* synthetic */ int copydefault;

        public Activity(int i) {
            this.copydefault = i;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Pair<Boolean, Integer> KWHzl(List<StgyFavouriteResult> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Pair<>(Boolean.valueOf(((StgyFavouriteResult) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getResult()), Integer.valueOf(this.copydefault));
        }
    }

    public final void AhwBna() {
        C56199xyM c56199xyMDbNXlk = DbNXlk();
        c56199xyMDbNXlk.OLrzqt("");
        c56199xyMDbNXlk.AEQbTJ("1");
        c56199xyMDbNXlk.djBIcL();
        c56199xyMDbNXlk.OLrzqt(this.valueOf, new TaskDescription());
        xKK.Activity.execute$default(c56199xyMDbNXlk, 0L, 1, null);
    }

    public static final class TaskDescription implements InterfaceC54501xKt<List<? extends StgyFavouriteResult>, Boolean> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Boolean KWHzl(List<StgyFavouriteResult> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return Boolean.valueOf(((StgyFavouriteResult) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getResult());
        }
    }

    public final List<Object> EZpvd() {
        List<HomeStrategyCardInfo> listAhwBna;
        List<HomeStrategyCardInfo> list = this.EZpvd;
        HomeStrategyCardResult value = this.AYXKKw.getValue();
        if (value == null || (listAhwBna = value.getStrategies()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        list.addAll(listAhwBna);
        if (Intrinsics.EZpvd((Object) this.fIwbmz, (Object) "FAVORITE")) {
            List<HomeStrategyCardInfo> list2 = this.EZpvd;
            if (list2.size() > 1) {
                C56407yEf.copydefault(list2, new Application());
            }
        }
        return fJNWhG();
    }

    public final List<Object> OLrzqt(int i) {
        this.EZpvd.remove(i - 1);
        return fJNWhG();
    }

    public static final boolean OLrzqt(HomeStrategyCardInfo homeStrategyCardInfo) {
        Intrinsics.checkNotNullParameter(homeStrategyCardInfo, "");
        return !homeStrategyCardInfo.isEnable();
    }

    public final List<Object> valueOf() {
        C56406yEe.AEQbTJ(this.EZpvd, new Function1() { // from class: o.vor
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(HomeStrategyListPresenter.OLrzqt((HomeStrategyCardInfo) obj));
            }
        });
        return fJNWhG();
    }

    public final List<Object> fJNWhG() {
        List listAhwBna;
        if (!Intrinsics.EZpvd((Object) this.fIwbmz, (Object) "FAVORITE")) {
            C56406yEe.AEQbTJ(this.EZpvd, new Function1() { // from class: o.vox
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(HomeStrategyListPresenter.KWHzl((HomeStrategyCardInfo) obj));
                }
            });
        }
        if (!Intrinsics.EZpvd((Object) this.fIwbmz, (Object) "FAVORITE")) {
            listAhwBna = yDY.AhwBna();
        } else {
            List<HomeStrategyCardInfo> list = this.EZpvd;
            listAhwBna = new ArrayList();
            for (Object obj : list) {
                if (!((HomeStrategyCardInfo) obj).isEnable()) {
                    listAhwBna.add(obj);
                }
            }
        }
        C51505voL c51505voL = listAhwBna.isEmpty() ^ true ? new C51505voL(listAhwBna.size()) : null;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.EZpvd);
        if (c51505voL != null) {
            arrayList.add(this.EZpvd.size() - listAhwBna.size(), c51505voL);
        }
        return arrayList;
    }

    public static final boolean KWHzl(HomeStrategyCardInfo homeStrategyCardInfo) {
        Intrinsics.checkNotNullParameter(homeStrategyCardInfo, "");
        return !homeStrategyCardInfo.isEnable();
    }

    public final List<C55276xgr> gEmmrt() {
        boolean fieldNames = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames();
        HomeStrategySortConfig[] homeStrategySortConfigArrValues = HomeStrategySortConfig.values();
        ArrayList<HomeStrategySortConfig> arrayList = new ArrayList();
        for (HomeStrategySortConfig homeStrategySortConfig : homeStrategySortConfigArrValues) {
            if (fieldNames || homeStrategySortConfig != HomeStrategySortConfig.Highest_PnL) {
                arrayList.add(homeStrategySortConfig);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (HomeStrategySortConfig homeStrategySortConfig2 : arrayList) {
            String strAYXKKw = C33070mpX.AYXKKw(homeStrategySortConfig2.getDesc());
            String mode = homeStrategySortConfig2.getMode();
            HomeStrategySortConfig homeStrategySortConfig3 = this.AkhnZx;
            arrayList2.add(new C55276xgr(strAYXKKw, homeStrategySortConfig2, null, Intrinsics.EZpvd((Object) mode, (Object) (homeStrategySortConfig3 != null ? homeStrategySortConfig3.getMode() : null)), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        return arrayList2;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AhwBna, DbNXlk(), AYXKKw());
    }
}

package com.okinc.tradingbot.impl.nmp.home.presenter;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.biz.TacticsType;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.nmp.home.presenter.NmpBotSquarePresenter;
import com.okinc.unify_trade.biz.HomeStrategyCardInfo;
import com.okinc.unify_trade.biz.HomeStrategyCardResult;
import com.okinc.unify_trade.biz.HomeStrategyDropDownInfo;
import com.okinc.unify_trade.biz.StgyFavouriteResult;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeStrategyCategoryConfig;
import com.okinc.unify_trade.bot.market_place.home.list.config.HomeStrategySortConfig;
import com.okinc.unify_trade.constants.BotUserRole;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C33070mpX;
import o.C33129mqd;
import o.C51505voL;
import o.C51519voZ;
import o.C51527voh;
import o.C52072vyw;
import o.C54507xKz;
import o.C54589xNz;
import o.C55276xgr;
import o.C55688xof;
import o.C56071xvr;
import o.C56199xyM;
import o.C56207xyU;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56406yEe;
import o.C56407yEf;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.wUL;
import o.xKK;
import o.xOR;
import o.yCM;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class NmpBotSquarePresenter extends AbsPresenter {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final List<HomeStrategyCardInfo> AEQbTJ;
    public final TradeLiveData<C51527voh> AYXKKw;
    public final TradeLiveData<HomeStrategySortConfig> AhwBna;
    public C51527voh AkhnZx;
    public String AuCTel;
    public final C56207xyU DbNXlk;
    public String EZpvd;
    public final TradeLiveData<HomeStrategyCardResult> KWHzl;
    public final ArrayList<C51527voh> OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public String ejfBZ;
    public HomeStrategyDropDownInfo fARcdN;
    public String fIwbmz;
    public final TradeLiveData<Pair<Boolean, Integer>> fJNWhG;
    public HomeStrategySortConfig fetchVPNInfo;
    public final TradeLiveData<Boolean> gEmmrt;
    public final TradeLiveData<Boolean> isConnected;
    public final CoroutineDispatcher valueOf;
    public final C52072vyw values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(C51527voh c51527voh) {
        this.AkhnZx = c51527voh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<HomeStrategyCardResult> AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Pair<Boolean, Integer>> AkhnZx() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<HomeStrategySortConfig> fetchVPNInfo() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C51527voh> valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56207xyU values() {
        return this.DbNXlk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public NmpBotSquarePresenter(@NotNull Context context, @NotNull SavedStateHandle savedStateHandle, @NotNull C52072vyw c52072vyw, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super((Application) context, savedStateHandle);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c52072vyw, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.values = c52072vyw;
        this.valueOf = coroutineDispatcher;
        this.KWHzl = new TradeLiveData<>();
        this.AEQbTJ = new ArrayList();
        this.fJNWhG = new TradeLiveData<>();
        this.gEmmrt = new TradeLiveData<>();
        this.isConnected = new TradeLiveData<>();
        this.DbNXlk = new C56207xyU();
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vyD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return NmpBotSquarePresenter.fARcdN();
            }
        });
        this.OLrzqt = new ArrayList<>();
        this.AYXKKw = new TradeLiveData<>();
        this.AhwBna = new TradeLiveData<>(HomeStrategySortConfig.Highest_PnL);
        this.ejfBZ = "1";
        this.fIwbmz = "20";
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.nmp.home.presenter.NmpBotSquarePresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final C56199xyM AuCTel() {
        return (C56199xyM) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C56199xyM fARcdN() {
        return new C56199xyM();
    }

    public final void copydefault(String str, String str2) {
        Object next;
        Iterator<T> it = AhwBna().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C51527voh c51527voh = (C51527voh) next;
            if (c51527voh.KWHzl() == null ? Intrinsics.EZpvd((Object) c51527voh.AEQbTJ(), (Object) str) : Intrinsics.EZpvd((Object) c51527voh.KWHzl().getConstant(), (Object) str2)) {
                break;
            }
        }
        this.AYXKKw.postValue((C51527voh) next);
    }

    public final void copydefault(@NotNull C51527voh c51527voh) {
        Intrinsics.checkNotNullParameter(c51527voh, "");
        if (c51527voh.KWHzl() == null) {
            String strAEQbTJ = c51527voh.AEQbTJ();
            C51527voh c51527voh2 = this.AkhnZx;
            if (Intrinsics.EZpvd(strAEQbTJ, c51527voh2 != null ? c51527voh2.AEQbTJ() : null)) {
                return;
            }
        } else {
            TacticsType tacticsTypeKWHzl = c51527voh.KWHzl();
            C51527voh c51527voh3 = this.AkhnZx;
            if (tacticsTypeKWHzl == (c51527voh3 != null ? c51527voh3.KWHzl() : null)) {
                return;
            }
        }
        this.AYXKKw.postValue(c51527voh);
    }

    public static final class ActionBar<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Boolean.valueOf(!((HomeStrategyCardInfo) t).isEnable()), Boolean.valueOf(!((HomeStrategyCardInfo) t2).isEnable()));
        }
    }

    public final void AEQbTJ(@NotNull HomeStrategySortConfig homeStrategySortConfig) {
        Intrinsics.checkNotNullParameter(homeStrategySortConfig, "");
        this.AhwBna.postValue(homeStrategySortConfig);
    }

    public static /* synthetic */ void fetchBotList$default(NmpBotSquarePresenter nmpBotSquarePresenter, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        nmpBotSquarePresenter.KWHzl(str, str2, z, str3);
    }

    public final void KWHzl(String str, String str2, boolean z, String str3) {
        this.EZpvd = str;
        this.AuCTel = str2;
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new NmpBotSquarePresenter$fetchBotList$1(str3, this, z, OLrzqt(this.AhwBna.getValue()), null), 2, null);
    }

    private final String EZpvd(String str) {
        return Intrinsics.EZpvd((Object) this.AuCTel, (Object) "FAVORITE") ? "" : str;
    }

    private final String OLrzqt(String str) {
        String str2 = this.AuCTel;
        return Intrinsics.EZpvd((Object) str2, (Object) "FAVORITE") ? "" : (!Intrinsics.EZpvd((Object) str2, (Object) "FOLLOW") || C33129mqd.OLrzqt((CharSequence) str)) ? str : BotUserRole.LEAD_TRADER.getRole();
    }

    public static /* synthetic */ void refreshBotList$default(NmpBotSquarePresenter nmpBotSquarePresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        nmpBotSquarePresenter.AYXKKw(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AYXKKw(String str) {
        this.ejfBZ = "1";
        this.AEQbTJ.clear();
        KWHzl(str);
    }

    public static /* synthetic */ void loadMoreBotList$default(NmpBotSquarePresenter nmpBotSquarePresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        nmpBotSquarePresenter.AEQbTJ(str);
    }

    public final void AEQbTJ(String str) {
        this.ejfBZ = C33129mqd.addS$default(this.ejfBZ, 1, null, null, null, 14, null);
        KWHzl(str);
    }

    public final boolean isConnected() {
        return C33129mqd.AEQbTJ(this.ejfBZ, 1);
    }

    public final void OLrzqt(HomeStrategyDropDownInfo homeStrategyDropDownInfo) {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new NmpBotSquarePresenter$refreshFilterParams$1(this, homeStrategyDropDownInfo, null), 2, null);
    }

    private final boolean OLrzqt(HomeStrategySortConfig homeStrategySortConfig) {
        String mode = homeStrategySortConfig != null ? homeStrategySortConfig.getMode() : null;
        HomeStrategySortConfig homeStrategySortConfig2 = this.fetchVPNInfo;
        if (Intrinsics.EZpvd((Object) mode, (Object) (homeStrategySortConfig2 != null ? homeStrategySortConfig2.getMode() : null))) {
            return false;
        }
        this.fetchVPNInfo = homeStrategySortConfig;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Continuation<? super Unit> continuation) throws Throwable {
        NmpBotSquarePresenter$fetchDropdownInfo$1 nmpBotSquarePresenter$fetchDropdownInfo$1;
        NmpBotSquarePresenter nmpBotSquarePresenter;
        if (continuation instanceof NmpBotSquarePresenter$fetchDropdownInfo$1) {
            nmpBotSquarePresenter$fetchDropdownInfo$1 = (NmpBotSquarePresenter$fetchDropdownInfo$1) continuation;
            int i = nmpBotSquarePresenter$fetchDropdownInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nmpBotSquarePresenter$fetchDropdownInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                nmpBotSquarePresenter$fetchDropdownInfo$1 = new NmpBotSquarePresenter$fetchDropdownInfo$1(this, continuation);
            }
        }
        Object objKWHzl = nmpBotSquarePresenter$fetchDropdownInfo$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = nmpBotSquarePresenter$fetchDropdownInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            String str = this.EZpvd;
            if (str == null) {
                str = "";
            }
            C52072vyw c52072vyw = this.values;
            C52072vyw.StateListAnimator stateListAnimator = new C52072vyw.StateListAnimator(str);
            nmpBotSquarePresenter$fetchDropdownInfo$1.L$0 = this;
            nmpBotSquarePresenter$fetchDropdownInfo$1.label = 1;
            objKWHzl = c52072vyw.KWHzl(stateListAnimator, nmpBotSquarePresenter$fetchDropdownInfo$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            nmpBotSquarePresenter = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nmpBotSquarePresenter = (NmpBotSquarePresenter) nmpBotSquarePresenter$fetchDropdownInfo$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        C52072vyw.Activity activity = (C52072vyw.Activity) objKWHzl;
        SPUtils.put(C51519voZ.Companion.KWHzl(), activity.copydefault());
        nmpBotSquarePresenter.fARcdN = activity.copydefault();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object checkFilterCacheChange$default(NmpBotSquarePresenter nmpBotSquarePresenter, HomeStrategyDropDownInfo homeStrategyDropDownInfo, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            homeStrategyDropDownInfo = null;
        }
        return nmpBotSquarePresenter.OLrzqt(homeStrategyDropDownInfo, (Continuation<? super Boolean>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(HomeStrategyDropDownInfo homeStrategyDropDownInfo, Continuation<? super Boolean> continuation) throws Throwable {
        NmpBotSquarePresenter$checkFilterCacheChange$1 nmpBotSquarePresenter$checkFilterCacheChange$1;
        boolean z;
        List<String> leverage;
        boolean z2;
        List<String> list;
        Map<String, List<String>> coinCaches;
        List<String> category;
        List<String> userRole;
        List<String> pnlRatio;
        List<String> maxDrawdown;
        List<String> runningTime;
        if (continuation instanceof NmpBotSquarePresenter$checkFilterCacheChange$1) {
            nmpBotSquarePresenter$checkFilterCacheChange$1 = (NmpBotSquarePresenter$checkFilterCacheChange$1) continuation;
            int i = nmpBotSquarePresenter$checkFilterCacheChange$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nmpBotSquarePresenter$checkFilterCacheChange$1.label = i - Integer.MIN_VALUE;
            } else {
                nmpBotSquarePresenter$checkFilterCacheChange$1 = new NmpBotSquarePresenter$checkFilterCacheChange$1(this, continuation);
            }
        }
        Object obj = nmpBotSquarePresenter$checkFilterCacheChange$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = nmpBotSquarePresenter$checkFilterCacheChange$1.label;
        boolean z3 = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (homeStrategyDropDownInfo == null) {
                homeStrategyDropDownInfo = (HomeStrategyDropDownInfo) SPUtils.getObject(C51519voZ.Companion.KWHzl(), HomeStrategyDropDownInfo.class);
            }
            if (homeStrategyDropDownInfo == null) {
                nmpBotSquarePresenter$checkFilterCacheChange$1.label = 1;
                if (KWHzl(nmpBotSquarePresenter$checkFilterCacheChange$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                HomeStrategyDropDownInfo homeStrategyDropDownInfo2 = this.fARcdN;
                List<String> list2 = null;
                String str = (homeStrategyDropDownInfo2 == null || (runningTime = homeStrategyDropDownInfo2.getRunningTime()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(runningTime);
                List<String> runningTime2 = homeStrategyDropDownInfo.getRunningTime();
                if (Intrinsics.EZpvd((Object) str, (Object) (runningTime2 != null ? (String) CollectionsKt___CollectionsKt.firstOrNull(runningTime2) : null))) {
                    HomeStrategyDropDownInfo homeStrategyDropDownInfo3 = this.fARcdN;
                    String str2 = (homeStrategyDropDownInfo3 == null || (maxDrawdown = homeStrategyDropDownInfo3.getMaxDrawdown()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(maxDrawdown);
                    List<String> maxDrawdown2 = homeStrategyDropDownInfo.getMaxDrawdown();
                    if (Intrinsics.EZpvd((Object) str2, (Object) (maxDrawdown2 != null ? (String) CollectionsKt___CollectionsKt.firstOrNull(maxDrawdown2) : null))) {
                        HomeStrategyDropDownInfo homeStrategyDropDownInfo4 = this.fARcdN;
                        String str3 = (homeStrategyDropDownInfo4 == null || (pnlRatio = homeStrategyDropDownInfo4.getPnlRatio()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(pnlRatio);
                        List<String> pnlRatio2 = homeStrategyDropDownInfo.getPnlRatio();
                        if (Intrinsics.EZpvd((Object) str3, (Object) (pnlRatio2 != null ? (String) CollectionsKt___CollectionsKt.firstOrNull(pnlRatio2) : null))) {
                            HomeStrategyDropDownInfo homeStrategyDropDownInfo5 = this.fARcdN;
                            String str4 = (homeStrategyDropDownInfo5 == null || (userRole = homeStrategyDropDownInfo5.getUserRole()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(userRole);
                            List<String> userRole2 = homeStrategyDropDownInfo.getUserRole();
                            if (Intrinsics.EZpvd((Object) str4, (Object) (userRole2 != null ? (String) CollectionsKt___CollectionsKt.firstOrNull(userRole2) : null))) {
                                HomeStrategyDropDownInfo homeStrategyDropDownInfo6 = this.fARcdN;
                                String str5 = (homeStrategyDropDownInfo6 == null || (category = homeStrategyDropDownInfo6.getCategory()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(category);
                                List<String> category2 = homeStrategyDropDownInfo.getCategory();
                                if (Intrinsics.EZpvd((Object) str5, (Object) (category2 != null ? (String) CollectionsKt___CollectionsKt.firstOrNull(category2) : null))) {
                                    z = false;
                                }
                            }
                        }
                    }
                } else {
                    z = true;
                }
                String str6 = this.EZpvd;
                if (Intrinsics.EZpvd((Object) str6, (Object) "contract_grid") || Intrinsics.EZpvd((Object) str6, (Object) "contract_dca")) {
                    HomeStrategyDropDownInfo homeStrategyDropDownInfo7 = this.fARcdN;
                    String str7 = (homeStrategyDropDownInfo7 == null || (leverage = homeStrategyDropDownInfo7.getLeverage()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(leverage);
                    List<String> leverage2 = homeStrategyDropDownInfo.getLeverage();
                    z2 = !Intrinsics.EZpvd((Object) str7, (Object) (leverage2 != null ? (String) CollectionsKt___CollectionsKt.firstOrNull(leverage2) : null));
                }
                HomeStrategyDropDownInfo homeStrategyDropDownInfo8 = this.fARcdN;
                if (homeStrategyDropDownInfo8 == null || (coinCaches = homeStrategyDropDownInfo8.getCoinCaches()) == null) {
                    list = null;
                } else {
                    String str8 = this.EZpvd;
                    if (str8 == null) {
                        str8 = "";
                    }
                    list = coinCaches.get(str8);
                }
                Map<String, List<String>> coinCaches2 = homeStrategyDropDownInfo.getCoinCaches();
                if (coinCaches2 != null) {
                    String str9 = this.EZpvd;
                    list2 = coinCaches2.get(str9 != null ? str9 : "");
                }
                boolean zEZpvd = Intrinsics.EZpvd(list, list2);
                if (!z && !z2 && !(!zEZpvd)) {
                    z3 = false;
                }
                this.fARcdN = homeStrategyDropDownInfo;
                return C56443yFo.KWHzl(z3);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(true);
    }

    public static /* synthetic */ void innerFetchBotList$default(NmpBotSquarePresenter nmpBotSquarePresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        nmpBotSquarePresenter.KWHzl(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void KWHzl(String str) {
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
            HomeStrategyDropDownInfo homeStrategyDropDownInfo = this.fARcdN;
            if (homeStrategyDropDownInfo == null || (coinCaches = homeStrategyDropDownInfo.getCoinCaches()) == null) {
                str2 = null;
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                String str9 = this.EZpvd;
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
        HomeStrategyDropDownInfo homeStrategyDropDownInfo2 = this.fARcdN;
        if (homeStrategyDropDownInfo2 == null || (runningTime = homeStrategyDropDownInfo2.getRunningTime()) == null || (str3 = (String) CollectionsKt___CollectionsKt.firstOrNull(runningTime)) == null) {
            str3 = "";
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo3 = this.fARcdN;
        if (homeStrategyDropDownInfo3 == null || (maxDrawdown = homeStrategyDropDownInfo3.getMaxDrawdown()) == null || (str4 = (String) CollectionsKt___CollectionsKt.firstOrNull(maxDrawdown)) == null) {
            str4 = "";
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo4 = this.fARcdN;
        if (homeStrategyDropDownInfo4 == null || (pnlRatio = homeStrategyDropDownInfo4.getPnlRatio()) == null || (str5 = (String) CollectionsKt___CollectionsKt.firstOrNull(pnlRatio)) == null) {
            str5 = "";
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo5 = this.fARcdN;
        if (homeStrategyDropDownInfo5 == null || (leverage = homeStrategyDropDownInfo5.getLeverage()) == null || (str6 = (String) CollectionsKt___CollectionsKt.firstOrNull(leverage)) == null) {
            str6 = "";
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo6 = this.fARcdN;
        if (homeStrategyDropDownInfo6 == null || (userRole = homeStrategyDropDownInfo6.getUserRole()) == null || (str7 = (String) CollectionsKt___CollectionsKt.firstOrNull(userRole)) == null) {
            str7 = "";
        }
        HomeStrategyDropDownInfo homeStrategyDropDownInfo7 = this.fARcdN;
        if (homeStrategyDropDownInfo7 == null || (category = homeStrategyDropDownInfo7.getCategory()) == null || (str8 = (String) CollectionsKt___CollectionsKt.firstOrNull(category)) == null) {
            str8 = "";
        }
        this.isConnected.postValue(Boolean.valueOf((!Intrinsics.EZpvd((Object) this.AuCTel, (Object) "FAVORITE") && (str2.length() > 0 || str3.length() > 0 || str4.length() > 0 || str5.length() > 0 || str7.length() > 0)) || str8.length() > 0));
        C56207xyU c56207xyU = this.DbNXlk;
        String str10 = Intrinsics.EZpvd((Object) this.AuCTel, (Object) "FAVORITE") ? "1" : "0";
        String strCopydefault = copydefault(str8);
        String strEZpvd = EZpvd(str2);
        String strEZpvd2 = EZpvd(str3);
        String strEZpvd3 = EZpvd(str4);
        String strEZpvd4 = EZpvd(str5);
        String strEZpvd5 = EZpvd(str6);
        HomeStrategySortConfig homeStrategySortConfig = this.fetchVPNInfo;
        String str11 = (homeStrategySortConfig == null || (mode = homeStrategySortConfig.getMode()) == null) ? "" : mode;
        HomeStrategySortConfig homeStrategySortConfig2 = this.fetchVPNInfo;
        c56207xyU.copydefault(str10, strCopydefault, strEZpvd, strEZpvd2, strEZpvd3, strEZpvd4, strEZpvd5, str11, (homeStrategySortConfig2 == null || (direction = homeStrategySortConfig2.getDirection()) == null) ? "" : direction, this.ejfBZ, this.fIwbmz, OLrzqt(str7));
        c56207xyU.djBIcL();
        c56207xyU.OLrzqt(this.KWHzl, new C54507xKz());
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
    private final String copydefault(String str) {
        String str2;
        xOR xorCopydefault;
        List<TacticsType> listDjBIcL;
        String strJoinToString$default;
        String str3 = this.AuCTel;
        if (str3 == null) {
            str2 = this.EZpvd;
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
                if (interfaceC54581xNrCopydefault != null && (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) != null && (listDjBIcL = xorCopydefault.djBIcL()) != null && (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listDjBIcL, ",", null, null, 0, null, new Function1() { // from class: o.vyE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return NmpBotSquarePresenter.OLrzqt((TacticsType) obj);
                    }
                }, 30, null)) != null) {
                    return strJoinToString$default;
                }
            }
            str2 = this.EZpvd;
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
        C56199xyM c56199xyMAuCTel = AuCTel();
        c56199xyMAuCTel.OLrzqt(str);
        c56199xyMAuCTel.AEQbTJ((String) null);
        c56199xyMAuCTel.djBIcL();
        c56199xyMAuCTel.OLrzqt(this.fJNWhG, new Activity(i));
        xKK.Activity.execute$default(c56199xyMAuCTel, 0L, 1, null);
    }

    public static final class Activity implements InterfaceC54501xKt<List<? extends StgyFavouriteResult>, Pair<? extends Boolean, ? extends Integer>> {
        public final /* synthetic */ int OLrzqt;

        public Activity(int i) {
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Pair<Boolean, Integer> KWHzl(List<StgyFavouriteResult> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Pair<>(Boolean.valueOf(((StgyFavouriteResult) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getResult()), Integer.valueOf(this.OLrzqt));
        }
    }

    public final void djBIcL() {
        C56199xyM c56199xyMAuCTel = AuCTel();
        c56199xyMAuCTel.OLrzqt("");
        c56199xyMAuCTel.AEQbTJ("1");
        c56199xyMAuCTel.djBIcL();
        c56199xyMAuCTel.OLrzqt(this.gEmmrt, new StateListAnimator());
        xKK.Activity.execute$default(c56199xyMAuCTel, 0L, 1, null);
    }

    public static final class StateListAnimator implements InterfaceC54501xKt<List<? extends StgyFavouriteResult>, Boolean> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Boolean KWHzl(List<StgyFavouriteResult> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return Boolean.valueOf(((StgyFavouriteResult) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getResult());
        }
    }

    public final List<Object> EZpvd() {
        List<HomeStrategyCardInfo> listAhwBna;
        List<HomeStrategyCardInfo> list = this.AEQbTJ;
        HomeStrategyCardResult value = this.KWHzl.getValue();
        if (value == null || (listAhwBna = value.getStrategies()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        list.addAll(listAhwBna);
        if (Intrinsics.EZpvd((Object) this.AuCTel, (Object) "FAVORITE")) {
            List<HomeStrategyCardInfo> list2 = this.AEQbTJ;
            if (list2.size() > 1) {
                C56407yEf.copydefault(list2, new ActionBar());
            }
        }
        return ejfBZ();
    }

    public final List<Object> OLrzqt(int i) {
        this.AEQbTJ.remove(i - 1);
        return ejfBZ();
    }

    public static final boolean EZpvd(HomeStrategyCardInfo homeStrategyCardInfo) {
        Intrinsics.checkNotNullParameter(homeStrategyCardInfo, "");
        return !homeStrategyCardInfo.isEnable();
    }

    public final List<Object> AEQbTJ() {
        C56406yEe.AEQbTJ(this.AEQbTJ, new Function1() { // from class: o.vyA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(NmpBotSquarePresenter.EZpvd((HomeStrategyCardInfo) obj));
            }
        });
        return ejfBZ();
    }

    private final List<Object> ejfBZ() {
        List listAhwBna;
        if (!Intrinsics.EZpvd((Object) this.AuCTel, (Object) "FAVORITE")) {
            C56406yEe.AEQbTJ(this.AEQbTJ, new Function1() { // from class: o.vyC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(NmpBotSquarePresenter.AEQbTJ((HomeStrategyCardInfo) obj));
                }
            });
        }
        if (!Intrinsics.EZpvd((Object) this.AuCTel, (Object) "FAVORITE")) {
            listAhwBna = yDY.AhwBna();
        } else {
            List<HomeStrategyCardInfo> list = this.AEQbTJ;
            listAhwBna = new ArrayList();
            for (Object obj : list) {
                if (!((HomeStrategyCardInfo) obj).isEnable()) {
                    listAhwBna.add(obj);
                }
            }
        }
        C51505voL c51505voL = listAhwBna.isEmpty() ^ true ? new C51505voL(listAhwBna.size()) : null;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.AEQbTJ);
        if (c51505voL != null) {
            arrayList.add(this.AEQbTJ.size() - listAhwBna.size(), c51505voL);
        }
        return arrayList;
    }

    public static final boolean AEQbTJ(HomeStrategyCardInfo homeStrategyCardInfo) {
        Intrinsics.checkNotNullParameter(homeStrategyCardInfo, "");
        return !homeStrategyCardInfo.isEnable();
    }

    public final List<C55276xgr> copydefault() {
        boolean zEZpvd;
        List<C51527voh> listAhwBna = AhwBna();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (C51527voh c51527voh : listAhwBna) {
            if (c51527voh.KWHzl() == null) {
                String strAEQbTJ = c51527voh.AEQbTJ();
                C51527voh c51527voh2 = this.AkhnZx;
                zEZpvd = Intrinsics.EZpvd(strAEQbTJ, c51527voh2 != null ? c51527voh2.AEQbTJ() : null);
            } else {
                TacticsType tacticsTypeKWHzl = c51527voh.KWHzl();
                C51527voh c51527voh3 = this.AkhnZx;
                zEZpvd = tacticsTypeKWHzl == (c51527voh3 != null ? c51527voh3.KWHzl() : null);
            }
            arrayList.add(new C55276xgr(c51527voh.EZpvd(), c51527voh, null, zEZpvd, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        return arrayList;
    }

    public final List<C55276xgr> OLrzqt() {
        InterfaceC56445yFq<HomeStrategySortConfig> entries = HomeStrategySortConfig.getEntries();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(entries, 10));
        for (HomeStrategySortConfig homeStrategySortConfig : entries) {
            String strAYXKKw = C33070mpX.AYXKKw(homeStrategySortConfig.getDesc());
            String mode = homeStrategySortConfig.getMode();
            HomeStrategySortConfig homeStrategySortConfig2 = this.fetchVPNInfo;
            arrayList.add(new C55276xgr(strAYXKKw, homeStrategySortConfig, null, Intrinsics.EZpvd((Object) mode, (Object) (homeStrategySortConfig2 != null ? homeStrategySortConfig2.getMode() : null)), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        return arrayList;
    }

    public final List<C51527voh> AhwBna() {
        if (this.OLrzqt.isEmpty()) {
            fIwbmz();
        }
        return this.OLrzqt;
    }

    private final void fIwbmz() {
        Collection<? extends C51527voh> collectionAhwBna;
        xOR xorCopydefault;
        this.OLrzqt.clear();
        this.OLrzqt.add(new C51527voh(null, C33070mpX.AYXKKw(C55688xof.Application.DkGEDn), "FAVORITE", 1, null));
        if (!C56071xvr.gEmmrt.ejfBZ()) {
            TacticsType tacticsType = null;
            int i = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            this.OLrzqt.add(new C51527voh(tacticsType, C33070mpX.AYXKKw(C55688xof.Application.aPFruk), "ALL", i, defaultConstructorMarker));
            this.OLrzqt.add(new C51527voh(tacticsType, C33070mpX.AYXKKw(C55688xof.Application.apNKau), "FOLLOW", i, defaultConstructorMarker));
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        List<TacticsType> listDjBIcL = (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null) ? null : xorCopydefault.djBIcL();
        ArrayList<C51527voh> arrayList = this.OLrzqt;
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
        return yDY.gEmmrt(this.DbNXlk, AuCTel());
    }
}

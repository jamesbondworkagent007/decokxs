package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.app.MarketApplicationDelegate$registerExtensions$3$1;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import com.okinc.okmarket.home.CardQuoteFragment;
import com.okinc.okmarket.home.MarketHomeV2Fragment;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43217rlC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oKK extends C43265rly {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oKK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean needRunOnProcess(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        return super.needRunOnProcess(context, str);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull final android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        pUU.KWHzl("MarketCache", "registerExtensions IPriorityAction TradingMarket");
        interfaceC43299rmf.EZpvd(InterfaceC35166nqG.class, C56392yDr.copydefault(new Function0() { // from class: o.oLq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oKK.RcXXUw();
            }
        }));
        C7381aik.Companion.AEQbTJ(this, C56392yDr.copydefault(new Function0() { // from class: o.oLp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oKK.aKErDB();
            }
        }));
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: o.oLo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oKK.AhwBna(context);
            }
        }));
        android.content.Context applicationContext = getApplication().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        if (C43308rmo.KWHzl(applicationContext)) {
            C43048rht.AEQbTJ.KWHzl("market");
        }
        interfaceC43299rmf.EZpvd(InterfaceC33220msO.class, C56392yDr.copydefault(new Function0() { // from class: o.oLs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oKK.KWHzl(this.EZpvd);
            }
        }));
    }

    public static final C44586sZi RcXXUw() {
        return C44586sZi.EZpvd;
    }

    public static final C49379unT aKErDB() {
        return new C49379unT();
    }

    public static final C38393pXc AhwBna(final android.content.Context context) {
        C38397pXg.registerDebugItem$default("Fuzzy Search", 0, 0, new MarketApplicationDelegate$registerExtensions$3$1(xRZ.OLrzqt), 6, null);
        C38397pXg.registerDebugItem$default("Fuzzy Search Switch", 0, 1, new Function1() { // from class: o.oLx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oKK.AkhnZx((android.content.Context) obj);
            }
        }, 2, null);
        C38397pXg.registerDebugItem$default("Clear Guide", 0, 1, new Function1() { // from class: o.oLu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oKK.DbNXlk((android.content.Context) obj);
            }
        }, 2, null);
        C38397pXg.registerDebugItem$default("CR MARKET FEED DEMO", 0, 0, new Function1() { // from class: o.oLB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oKK.ejfBZ((android.content.Context) obj);
            }
        }, 2, null);
        C38397pXg.registerDebugItem$default("debug Home Market", 0, 0, new Function1() { // from class: o.oLC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oKK.djBIcL(context, (android.content.Context) obj);
            }
        }, 2, null);
        C38397pXg.registerDebugItem$default("debug Explore Market", 0, 0, new Function1() { // from class: o.oKM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oKK.AYXKKw(context, (android.content.Context) obj);
            }
        }, 2, null);
        C38397pXg.registerDebugItem$default("debug MarketDiscover Lv2 Market", 0, 0, new Function1() { // from class: o.oKN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oKK.valueOf(context, (android.content.Context) obj);
            }
        }, 2, null);
        C38397pXg.registerDebugItem$default("debug MarketDiscover Lv1 Market", 0, 0, new Function1() { // from class: o.oKQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oKK.gEmmrt(context, (android.content.Context) obj);
            }
        }, 2, null);
        C38397pXg.registerDebugItem$default("debug Contract Voucher", 0, 0, new Function1() { // from class: o.oKR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oKK.gEmmrt((android.content.Context) obj);
            }
        }, 2, null);
        C38397pXg.registerDebugItem$default("clear SP Files", 0, 0, new Function1() { // from class: o.oKS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oKK.isConnected((android.content.Context) obj);
            }
        }, 2, null);
        C38397pXg.registerDebugItem$default("Cedefi Boost Fragment", 0, 0, new Function1() { // from class: o.oKP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oKK.AhwBna(context, (android.content.Context) obj);
            }
        }, 2, null);
        C38397pXg.registerDebugItem$default("switch_check_market_executor", 0, 1, new Function1() { // from class: o.oLt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oKK.fetchVPNInfo((android.content.Context) obj);
            }
        }, 2, null);
        C38397pXg.registerDebugItem$default("Test Rust Bridge", 0, 0, new Function1() { // from class: o.oLv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oKK.values((android.content.Context) obj);
            }
        }, 2, null);
        return new C38393pXc();
    }

    public static final Unit AkhnZx(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        SPUtils.put("market.group.watchlist.guiding.showed", bool);
        SPUtils.put("market.group.watchlist.long.press.showed", bool);
        SPUtils.put("market_long_press_showed", bool);
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).copydefault().AEQbTJ(context, "Test Feed Page", "");
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(android.content.Context context, android.content.Context context2) {
        Intrinsics.checkNotNullParameter(context2, "");
        ActivityC38400pXj.Companion.AEQbTJ(context, C56524yIo.AEQbTJ(MarketHomeV2Fragment.class));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(android.content.Context context, android.content.Context context2) {
        Intrinsics.checkNotNullParameter(context2, "");
        ActivityC38400pXj.Companion.AEQbTJ(context, C56524yIo.AEQbTJ(CardQuoteFragment.class));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(android.content.Context context, android.content.Context context2) {
        Intrinsics.checkNotNullParameter(context2, "");
        ActivityC38400pXj.Companion.AEQbTJ(context, C56524yIo.AEQbTJ(C41296qoD.class));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(android.content.Context context, android.content.Context context2) {
        Intrinsics.checkNotNullParameter(context2, "");
        ActivityC38400pXj.Companion.AEQbTJ(context, C56524yIo.AEQbTJ(C41341qow.class));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.util.ArrayList<java.lang.String> arrayListCopydefault = yDY.copydefault("OKB-USDT-SWAP", "BTC-USDT-SWAP", "ETH-USDT-SWAP", "ETH-USD-SWAP");
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
        if (interfaceC43033rhe != null) {
            androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            interfaceC43033rhe.OLrzqt(supportFragmentManager, arrayListCopydefault, new Function2() { // from class: o.oLw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return oKK.copydefault((java.lang.String) obj, (java.lang.String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C55326xho.toast$default("Selected Contract Voucher：" + str + ", " + str2, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(android.content.Context context, android.content.Context context2) {
        Intrinsics.checkNotNullParameter(context2, "");
        ActivityC38400pXj.Companion.AEQbTJ(context, C56524yIo.AEQbTJ(pZN.class));
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return Unit.INSTANCE;
    }

    public static final Unit values(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C41433qqi.copydefault.KWHzl();
        return Unit.INSTANCE;
    }

    public static final C46907tfy KWHzl(oKK okk) {
        return new C46907tfy(((InterfaceC47230tmC) C58113yvE.copydefault(okk.getApplication(), InterfaceC47230tmC.class)).fmB());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        android.content.Context applicationContext = getApplication().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        if (C43308rmo.KWHzl(applicationContext)) {
            C48872udq.registerFileResourceId$default(C48872udq.AEQbTJ, "file_okmarket_community_webview_android", null, 2, null);
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() throws java.lang.Throwable {
        super.onLaunchComplete();
        android.content.Context applicationContext = getApplication().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        if (C35197nql.KWHzl(applicationContext)) {
            android.content.Context applicationContext2 = getApplication().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
            C35197nql.ensureWorkStart$default(applicationContext2, 0L, 2, null);
            android.content.Context applicationContext3 = getApplication().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "");
            C35197nql.EZpvd(applicationContext3);
            android.content.Context applicationContext4 = getApplication().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext4, "");
            C35197nql.ensureP2PWorkStart$default(applicationContext4, 0L, 2, null);
            android.content.Context applicationContext5 = getApplication().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext5, "");
            C35197nql.AEQbTJ(applicationContext5);
        }
        C35117npK c35117npK = C35117npK.EZpvd;
        android.content.Context applicationContext6 = getApplication().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext6, "");
        c35117npK.OLrzqt(applicationContext6);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        try {
            Result.Application application = Result.Companion;
            DeeplinkMode deeplinkMode = DeeplinkMode.PRO;
            interfaceC43237rlW.copydefault(new sZP("main/market", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oKT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.wlaJM();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("main/market/fav", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.zsXlph();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("main/market/spot", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.zLjUOn();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("main/market/swap", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.AubY();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("main/market/future", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.AxsJAY();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("main/market/option", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.gHZMYf();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("ranking_activity", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.zuBGHE();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("main/market/leaderboard", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.sSMYrx();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("main/market/overview", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.AwvSrB();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("main/market/tradingcalendar", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.QOLQEE();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("main/market/traderadar", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oKY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.OcIXYQ();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("market/conceptPlate/list", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oKU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.DTwDnp();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("main/market/dex", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oKX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.ORxRYg();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("market/explore", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oKW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.QKVWgx();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("market/list", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.QVAiDq();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("market/discover", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.QUSxYX();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("main/market/feeds", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.RJOkX();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("market/pretrade/landingpage", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.QbewEr();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("search", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oKZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.QfsBiF();
                }
            }));
            interfaceC43237rlW.copydefault(new sZP("market/page_hub", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oLe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKK.UeEOUB();
                }
            }));
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final C44602sZy wlaJM() {
        return new C44602sZy();
    }

    public static final sZB zsXlph() {
        return new sZB();
    }

    public static final sZD zLjUOn() {
        return new sZD();
    }

    public static final sZE AubY() {
        return new sZE();
    }

    public static final sZE AxsJAY() {
        return new sZE();
    }

    public static final sZG gHZMYf() {
        return new sZG();
    }

    public static final sZO zuBGHE() {
        return new sZO();
    }

    public static final sZH sSMYrx() {
        return new sZH();
    }

    public static final sZF AwvSrB() {
        return new sZF();
    }

    public static final sZI QOLQEE() {
        return new sZI();
    }

    public static final sZM OcIXYQ() {
        return new sZM();
    }

    public static final sZK DTwDnp() {
        return new sZK();
    }

    public static final sZC ORxRYg() {
        return new sZC();
    }

    public static final C44601sZx QKVWgx() {
        return new C44601sZx();
    }

    public static final sZA QVAiDq() {
        return new sZA();
    }

    public static final C44599sZv QUSxYX() {
        return new C44599sZv();
    }

    public static final C44597sZt RJOkX() {
        return new C44597sZt();
    }

    public static final sZL QbewEr() {
        return new sZL();
    }

    public static final C44598sZu QfsBiF() {
        return new C44598sZu();
    }

    public static final sZJ UeEOUB() {
        return new sZJ();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(InterfaceC43033rhe.class, C56392yDr.copydefault(new Function0() { // from class: o.oKL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oKK.djSkpj();
            }
        }));
        interfaceC43253rlm.EZpvd(qTB.class, C56392yDr.copydefault(new Function0() { // from class: o.oKO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oKK.dNCPSb();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC43038rhj.class, C56392yDr.copydefault(new Function0() { // from class: o.oKV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oKK.fZBcTu();
            }
        }));
        interfaceC43253rlm.OLrzqt(InterfaceC49508upq.class, new TaskDescription());
        interfaceC43253rlm.EZpvd(InterfaceC43031rhc.class, C56392yDr.copydefault(new Function0() { // from class: o.oLf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oKK.fFgQHt();
            }
        }));
    }

    public static final C46867tfK djSkpj() {
        return new C46867tfK();
    }

    public static final sZR dNCPSb() {
        return new sZR();
    }

    public static final C55598xmv fZBcTu() {
        return new C55598xmv();
    }

    public static final class TaskDescription implements InterfaceC43217rlC.StateListAnimator<InterfaceC49508upq> {
        /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/rlB; */
        @Override // o.InterfaceC43217rlC.StateListAnimator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public InterfaceC49508upq OLrzqt() {
            return new C40371qTj();
        }
    }

    public static final C46905tfw fFgQHt() {
        return new C46905tfw();
    }
}

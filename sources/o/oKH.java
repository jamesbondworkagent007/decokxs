package o;

import com.google.gson.Gson;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import com.okinc.rxutils.RxBus;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC37822pBz;
import o.C33512mxp;
import o.C36246oUr;
import o.C47265tml;
import o.InterfaceC43217rlC;
import o.pBO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oKH extends C43265rly {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public C33512mxp.ActionBar OLrzqt = new LoaderManager();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return 350;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return false;
    }

    public static final class LoaderManager implements C33512mxp.ActionBar {
        @Override // o.C33512mxp.ActionBar
        public void copydefault(int i) {
        }

        @Override // o.C33512mxp.ActionBar
        public void AEQbTJ(int i) {
            pEM pem = pEM.AEQbTJ;
            pem.AEQbTJ("");
            pem.EZpvd("");
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oKH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.app.Application OLrzqt() {
            return C43246rlf.OLrzqt.valueOf();
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        pUU.KWHzl("Xiong", "registerExtensions");
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        pUU.KWHzl("Xiong", "onCreate");
        C48872udq.registerFileResourceId$default(C48872udq.AEQbTJ, "file_market_tradingview_js", null, 2, null);
        C54819xWm.KWHzl().AEQbTJ(new TaskDescription());
    }

    public static final class TaskDescription implements InterfaceC54816xWj {
        public TaskDescription() {
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ != null) {
                pBO.dxcTrN.OLrzqt(activityAEQbTJ);
            }
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            pBO.dxcTrN.OLrzqt((android.app.Activity) null);
        }

        @Override // o.InterfaceC54816xWj
        public void EZpvd() {
            oKH.this.AYXKKw();
            AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("EVENT_OKEX_HOME_MODE_CHANGE");
            final oKH okh = oKH.this;
            abstractC58185ywXAEQbTJ.subscribe(new RxBus.EventCallback<java.lang.String>(this) { // from class: com.okinc.kline.app.KLineApplicationDelegate$onCreate$1$onAppFirstRenderFinished$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this);
                }

                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(String str) {
                    okh.AYXKKw();
                }
            });
            RxBus.KWHzl(C47265tml.class, new java.lang.String[0]).subscribe(new RxBus.EventCallback<C47265tml>(this) { // from class: com.okinc.kline.app.KLineApplicationDelegate$onCreate$1$onAppFirstRenderFinished$2
                {
                    super(this);
                }

                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(C47265tml c47265tml) {
                    pBO.dxcTrN.djBIcL(5);
                    C36246oUr.copydefault().valueOf();
                }
            });
        }
    }

    public final void AYXKKw() {
        InterfaceC33171mrS interfaceC33171mrS;
        if (!pFP.OLrzqt.OLrzqt() || ((interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class)) != null && interfaceC33171mrS.fIwbmz())) {
            pBO.dxcTrN.gEmmrt();
        } else {
            djBIcL();
        }
    }

    public final void djBIcL() {
        if (SPUtils.getBoolean("sp_price_floatwindow_enable", false)) {
            AbstractC37822pBz.Activity activity = AbstractC37822pBz.Companion;
            if (mND.OLrzqt(activity.AEQbTJ()) == null || !mND.OLrzqt(activity.AEQbTJ()).values()) {
                pBO pbo = pBO.dxcTrN;
                java.lang.Integer num = SPUtils.getInt("chart_price_window_fix", 5);
                Intrinsics.checkNotNullExpressionValue(num, "");
                pbo.djBIcL(num.intValue());
            }
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.OLrzqt(oKA.class, new Application());
        interfaceC43253rlm.OLrzqt(InterfaceC49504upm.class, new ActionBar());
        interfaceC43253rlm.OLrzqt(oKB.class, new Activity());
        C33512mxp.AEQbTJ.KWHzl(this.OLrzqt);
        pUU.KWHzl("KLineApplicationDelegate", "registerService耗时：" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    public static final class Application implements InterfaceC43217rlC.StateListAnimator<oKA> {
        /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/rlB; */
        @Override // o.InterfaceC43217rlC.StateListAnimator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public oKA OLrzqt() {
            return new C36247oUs();
        }
    }

    public static final class ActionBar implements InterfaceC43217rlC.StateListAnimator<InterfaceC49504upm> {
        /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/rlB; */
        @Override // o.InterfaceC43217rlC.StateListAnimator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public InterfaceC49504upm OLrzqt() {
            return new C36245oUq();
        }
    }

    public static final class Activity implements InterfaceC43217rlC.StateListAnimator<oKB> {
        /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/rlB; */
        @Override // o.InterfaceC43217rlC.StateListAnimator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public oKB OLrzqt() {
            return new C36248oUt();
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        try {
            Result.Application application = Result.Companion;
            DeeplinkMode deeplinkMode = DeeplinkMode.PRO;
            interfaceC43237rlW.copydefault(new oLG("trade_kline", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oKG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKH.EZpvd();
                }
            }));
            interfaceC43237rlW.copydefault(new oLG("arb_trade_kline", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oKF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKH.gEmmrt();
                }
            }));
            interfaceC43237rlW.copydefault(new oLG("cedefi_kline", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oKI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKH.AhwBna();
                }
            }));
            interfaceC43237rlW.copydefault(new oLG("coin_detail", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.oKJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return oKH.valueOf();
                }
            }));
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final oLD EZpvd() {
        return new oLD();
    }

    public static final C36010oLy gEmmrt() {
        return new C36010oLy();
    }

    public static final oLA AhwBna() {
        return new oLA();
    }

    public static final C36011oLz valueOf() {
        return new C36011oLz();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        int sPTimeInterval;
        super.onLaunchComplete();
        java.lang.Integer num = SPUtils.getInt("sp_timeinterval_okx_pro", -200);
        if (num != null && num.intValue() == -200) {
            java.lang.String string = Companion.OLrzqt().getSharedPreferences(TemplateSetting.SP_FILENAME, 0).getString("ds0", "");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                TemplateSetting templateSetting = (TemplateSetting) new Gson().fromJson(string, TemplateSetting.class);
                if (templateSetting.getSPTimeInterval() == 525600 || templateSetting.getSPTimeInterval() == 267840) {
                    C37830pCg c37830pCg = C37830pCg.EZpvd;
                    sPTimeInterval = c37830pCg.AEQbTJ().size() > 0 ? c37830pCg.AEQbTJ().get(0).timeInterval : 15;
                } else {
                    sPTimeInterval = templateSetting.getSPTimeInterval();
                }
                SPUtils.put("sp_timeinterval_okx_pro", java.lang.Integer.valueOf(sPTimeInterval));
            }
        }
    }
}

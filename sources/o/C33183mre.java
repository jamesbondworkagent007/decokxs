package o;

import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33183mre;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33183mre extends C43265rly {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mrs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33183mre.getNewProxyInstance();
        }
    });

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    /* JADX INFO: renamed from: o.mre$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mre.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void EZpvd(@NotNull InterfaceC33171mrS interfaceC33171mrS) {
            java.lang.String str;
            Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
            C32935mmv c32935mmv = C32935mmv.KWHzl;
            java.lang.String str2 = "pro";
            if (interfaceC33171mrS.fIwbmz()) {
                str = "onchain";
            } else {
                str = interfaceC33171mrS.ejfBZ() ? "new_lite" : "pro";
            }
            c32935mmv.put("okex_app_mode", str);
            if (interfaceC33171mrS.fIwbmz()) {
                str2 = "web3";
            } else if (interfaceC33171mrS.ejfBZ()) {
                str2 = "lite";
            } else if (interfaceC33171mrS.fJNWhG()) {
                str2 = "pay";
            }
            c32935mmv.put("app_mode_realtime_okx", str2);
            C43292rmY.OLrzqt.KWHzl(C32924mmk.KWHzl.KWHzl(c32935mmv));
            pUU.KWHzl("OKAppModule", "configModeTrackProperties, app_mode_realtime_okx:" + c32935mmv.get("app_mode_realtime_okx"));
        }

        public final C33155mrC KWHzl() {
            return new C33155mrC();
        }
    }

    public final C33155mrC RJOkX() {
        return (C33155mrC) this.KWHzl.getValue();
    }

    public static final C33155mrC getNewProxyInstance() {
        return Companion.KWHzl();
    }

    public final void QUSxYX() {
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        c33512mxp.OLrzqt((RJOkX().fIwbmz() || RJOkX().ejfBZ()) ? 1 : null);
        pUU.KWHzl("ConfigManager", "ThemeManager.enforceColorTheme = " + c33512mxp.DbNXlk());
    }

    @Override // o.C43265rly
    public void onInit(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onInit(context);
        AbstractC33246mso.Companion.copydefault();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        Companion.EZpvd(RJOkX());
        C33216msK.KWHzl.copydefault(new Function0() { // from class: o.mrw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C33183mre.hDKMBd());
            }
        });
        QUSxYX();
        RxBus.AEQbTJ("EVENT_OKEX_HOME_MODE_CHANGE").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.core.ok_app.OKAppModule$onCreate$2
            {
                super(this.this$0);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                C33183mre.Companion.EZpvd(this.this$0.RJOkX());
                this.this$0.QUSxYX();
            }
        });
        C33427mwJ.Companion.DbNXlk();
    }

    public static final boolean hDKMBd() {
        java.lang.Boolean hidden;
        FeatureRestrictionInfo featureRestrictionInfoEZpvd = ((OKComplianceRestrictionService) C43251rlk.AEQbTJ(C56524yIo.AEQbTJ(OKComplianceRestrictionService.class))).EZpvd(OKComplianceRestrictionService.Feature.CR_FEED_PUBLISHER);
        if (featureRestrictionInfoEZpvd == null || (hidden = featureRestrictionInfoEZpvd.getHidden()) == null) {
            return false;
        }
        return hidden.booleanValue();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(InterfaceC33171mrS.class, C56392yDr.copydefault(new Function0() { // from class: o.mrl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.EZpvd(this.copydefault);
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC33172mrT.class, C56392yDr.copydefault(new Function0() { // from class: o.mrk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.gHZMYf();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC33253msv.class, C56392yDr.copydefault(new Function0() { // from class: o.mrm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.AEQbTJ(this.EZpvd);
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC33167mrO.class, C56392yDr.copydefault(new Function0() { // from class: o.mrn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.DTwDnp();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC33236mse.class, C56392yDr.copydefault(new Function0() { // from class: o.mrp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.QKVWgx();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC33232msa.class, C56392yDr.copydefault(new Function0() { // from class: o.mrq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.ORxRYg();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC33233msb.class, C56392yDr.copydefault(new Function0() { // from class: o.mrr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.OcIXYQ();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC33237msf.class, C56392yDr.copydefault(new Function0() { // from class: o.mro
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.QOLQEE();
            }
        }));
    }

    public static final C33155mrC EZpvd(C33183mre c33183mre) {
        return c33183mre.RJOkX();
    }

    public static final C33103mqD gHZMYf() {
        return new C33103mqD();
    }

    public static final C33285mta AEQbTJ(C33183mre c33183mre) {
        return ((InterfaceC33231msZ) C58113yvE.copydefault(c33183mre.getApplication(), InterfaceC33231msZ.class)).flVtFt();
    }

    public static final C33151mqz DTwDnp() {
        return new C33151mqz();
    }

    public static final C33414mvx QKVWgx() {
        return new C33414mvx();
    }

    public static final C33410mvt ORxRYg() {
        return new C33410mvt();
    }

    public static final C33413mvw OcIXYQ() {
        return new C33413mvw();
    }

    public static final C33406mvp QOLQEE() {
        return new C33406mvp();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.EZpvd(InterfaceC7377aig.class, C56392yDr.copydefault(new Function0() { // from class: o.mrg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.uzCIH();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC7377aig.class, C56392yDr.copydefault(new Function0() { // from class: o.mru
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.getFieldNames();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC33338mua.class, C56392yDr.copydefault(new Function0() { // from class: o.mrv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.wlaJM();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC33338mua.class, C56392yDr.copydefault(new Function0() { // from class: o.mrt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.AuCTelauCTel();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC33338mua.class, C56392yDr.copydefault(new Function0() { // from class: o.mry
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.zLjUOn();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC33338mua.class, C56392yDr.copydefault(new Function0() { // from class: o.mrx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.zsXlph();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC33338mua.class, C56392yDr.copydefault(new Function0() { // from class: o.mrA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.AubY();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC33338mua.class, C56392yDr.copydefault(new Function0() { // from class: o.mrz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.AxsJAY();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC33338mua.class, C56392yDr.copydefault(new Function0() { // from class: o.mrB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.AwvSrB();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC33338mua.class, C56392yDr.copydefault(new Function0() { // from class: o.mri
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.sSMYrx();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC33338mua.class, C56392yDr.copydefault(new Function0() { // from class: o.mrd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.zuBGHE();
            }
        }));
    }

    public static final C33394mvd uzCIH() {
        return new C33394mvd();
    }

    public static final C33399mvi getFieldNames() {
        return new C33399mvi();
    }

    public static final C33342mue wlaJM() {
        return new C33342mue();
    }

    public static final C33339mub AuCTelauCTel() {
        return new C33339mub();
    }

    public static final C33345muh zLjUOn() {
        return new C33345muh();
    }

    public static final C33340muc zsXlph() {
        return new C33340muc();
    }

    public static final C33344mug AubY() {
        return new C33344mug();
    }

    public static final C33341mud AxsJAY() {
        return new C33341mud();
    }

    public static final C33283mtY AwvSrB() {
        return new C33283mtY();
    }

    public static final C33343muf sSMYrx() {
        return new C33343muf();
    }

    public static final C33346mui zuBGHE() {
        return new C33346mui();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        InterfaceC56387yDm<? extends InterfaceC43234rlT> interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0() { // from class: o.mrj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33183mre.iwGUEr();
            }
        });
        interfaceC43237rlW.copydefault(new StateListAnimator(true), interfaceC56387yDmCopydefault);
        interfaceC43237rlW.copydefault(new StateListAnimator(false), interfaceC56387yDmCopydefault);
    }

    public static final C33271mtM iwGUEr() {
        return new C33271mtM();
    }

    /* JADX INFO: renamed from: o.mre$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC43233rlS {
        public final java.lang.String KWHzl;
        public final DeeplinkMode copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(false, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        @Override // o.InterfaceC43233rlS
        public boolean copydefault() {
            return false;
        }

        public StateListAnimator(boolean z) {
            this.copydefault = DeeplinkMode.APP;
            this.KWHzl = z ? "main/home" : "main";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:220) call: o.mre.StateListAnimator.<init>(boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        @Override // o.InterfaceC43233rlS
        public java.util.List<C43240rlZ> AEQbTJ() {
            return InterfaceC43233rlS.Application.copydefault(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean AYXKKw() {
            return InterfaceC43233rlS.Application.AEQbTJ(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean EZpvd() {
            return InterfaceC43233rlS.Application.OLrzqt(this);
        }
    }
}

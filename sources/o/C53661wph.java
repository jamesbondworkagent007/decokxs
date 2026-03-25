package o;

import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.planet.dto.BotCopyType;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53661wph extends vNA<ActionBar, java.lang.String> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.wph$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BotCopyType.values().length];
            try {
                iArr[BotCopyType.Leading.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BotCopyType.Copying.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[BotCopyType.CopyTrading.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public C53661wph() {
    }

    /* JADX INFO: renamed from: o.wph$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wph.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C53661wph copydefault() {
            return ((InterfaceC51009vet) C58114yvF.OLrzqt(C32979mnm.EZpvd.OLrzqt(), InterfaceC51009vet.class)).DLGVGj();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.vNA
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.String KWHzl(@NotNull ActionBar actionBar) {
        java.lang.String str;
        kotlin.Pair pairOLrzqt;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (actionBar.values()) {
            java.lang.String lowerCase = "OKX".toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            str2 = lowerCase + "://";
        }
        if (Intrinsics.EZpvd((java.lang.Object) actionBar.AhwBna(), (java.lang.Object) "signal_bot")) {
            Application applicationAYXKKw = actionBar.AYXKKw();
            if (Intrinsics.EZpvd((java.lang.Object) (applicationAYXKKw != null ? applicationAYXKKw.KWHzl() : null), (java.lang.Object) "published")) {
                pairOLrzqt = C56390yDp.OLrzqt("pro/trade_bot/signal_detail/page", C56423yEv.EZpvd(C56390yDp.OLrzqt("signalChanId", actionBar.AYXKKw().EZpvd())));
            } else {
                pairOLrzqt = C56390yDp.OLrzqt("pro/trade_bot/order/page", C56423yEv.EZpvd(C56390yDp.OLrzqt("squareType", "2")));
            }
            return str2 + ((java.lang.String) pairOLrzqt.component1()) + C56029xvB.KWHzl.copydefault((java.util.Map) pairOLrzqt.component2());
        }
        int i = Activity.OLrzqt[actionBar.copydefault().ordinal()];
        if (i == 1) {
            str = C56071xvr.gEmmrt.KWHzl(actionBar.valueOf()) + C56029xvB.KWHzl.copydefault(C56424yEw.gEmmrt(C56390yDp.OLrzqt("algoId", actionBar.KWHzl()), C56390yDp.OLrzqt("strategyType", actionBar.AhwBna()), C56390yDp.OLrzqt(OtcExtraKeys.ORDER, actionBar.gEmmrt())));
        } else if (i == 2 || i == 3) {
            str = C56071xvr.gEmmrt.KWHzl(actionBar.valueOf()) + C56029xvB.KWHzl.copydefault(C56424yEw.gEmmrt(C56390yDp.OLrzqt("algoId", actionBar.djBIcL()), C56390yDp.OLrzqt("strategyType", actionBar.AhwBna()), C56390yDp.OLrzqt(OtcExtraKeys.ORDER, actionBar.gEmmrt())));
        } else {
            int iCopydefault = C54799xVt.AEQbTJ.copydefault(actionBar.OLrzqt());
            java.lang.String strEZpvd = C56071xvr.gEmmrt.EZpvd(actionBar.valueOf());
            C56029xvB c56029xvB = C56029xvB.KWHzl;
            java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("bizType", java.lang.String.valueOf(iCopydefault)), C56390yDp.OLrzqt(OtcExtraKeys.ORDER, actionBar.gEmmrt()), C56390yDp.OLrzqt("instId", actionBar.AEQbTJ()), C56390yDp.OLrzqt("strategyType", actionBar.AhwBna()));
            if (actionBar.EZpvd()) {
                mapDjBIcL.put("algoId", actionBar.KWHzl());
            }
            Unit unit = Unit.INSTANCE;
            str = strEZpvd + c56029xvB.copydefault(mapDjBIcL);
        }
        return str2 + str;
    }

    /* JADX INFO: renamed from: o.wph$ActionBar */
    public static final class ActionBar {
        public final boolean AEQbTJ;
        public final java.lang.String AYXKKw;
        public final boolean AhwBna;
        public final java.lang.String EZpvd;
        public final BotCopyType KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final Application djBIcL;
        public final java.lang.String gEmmrt;
        public final java.lang.String valueOf;
        public final boolean values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull BotCopyType botCopyType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, boolean z, boolean z2, Application application, @NotNull java.lang.String str6, boolean z3) {
            Intrinsics.checkNotNullParameter(botCopyType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new ActionBar(botCopyType, str, str2, str3, str4, str5, z, z2, application, str6, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BotCopyType copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.KWHzl == actionBar.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) actionBar.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) actionBar.gEmmrt) && this.values == actionBar.values && this.AhwBna == actionBar.AhwBna && Intrinsics.EZpvd(this.djBIcL, actionBar.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) actionBar.valueOf) && this.AEQbTJ == actionBar.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = this.EZpvd.hashCode();
            int iHashCode4 = this.AYXKKw.hashCode();
            int iHashCode5 = this.copydefault.hashCode();
            java.lang.String str = this.gEmmrt;
            int iHashCode6 = str == null ? 0 : str.hashCode();
            int iHashCode7 = java.lang.Boolean.hashCode(this.values);
            int iHashCode8 = java.lang.Boolean.hashCode(this.AhwBna);
            Application application = this.djBIcL;
            return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (application != null ? application.hashCode() : 0)) * 31) + this.valueOf.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(copyType=" + this.KWHzl + ", instType=" + this.OLrzqt + ", instId=" + this.EZpvd + ", orderType=" + this.AYXKKw + ", algoId=" + this.copydefault + ", sourceAlgoId=" + this.gEmmrt + ", withPrefix=" + this.values + ", universal=" + this.AhwBna + ", signalParams=" + this.djBIcL + ", order=" + this.valueOf + ", canSignalClone=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.values;
        }

        public ActionBar(@NotNull BotCopyType botCopyType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, boolean z, boolean z2, Application application, @NotNull java.lang.String str6, boolean z3) {
            Intrinsics.checkNotNullParameter(botCopyType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.KWHzl = botCopyType;
            this.OLrzqt = str;
            this.EZpvd = str2;
            this.AYXKKw = str3;
            this.copydefault = str4;
            this.gEmmrt = str5;
            this.values = z;
            this.AhwBna = z2;
            this.djBIcL = application;
            this.valueOf = str6;
            this.AEQbTJ = z3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (r16v0 com.okinc.tradingbot.impl.planet.dto.BotCopyType)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:o.wph$Application:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null o.wph$Application) : (r24v0 o.wph$Application))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("1") : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
 A[MD:(com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, o.wph$Application, java.lang.String, boolean):void (m)] (LINE:93) call: o.wph.ActionBar.<init>(com.okinc.tradingbot.impl.planet.dto.BotCopyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, o.wph$Application, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ ActionBar(BotCopyType botCopyType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, boolean z2, Application application, java.lang.String str6, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(botCopyType, str, str2, str3, str4, str5, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : application, (i & 512) != 0 ? "1" : str6, (i & 1024) != 0 ? false : z3);
        }
    }

    /* JADX INFO: renamed from: o.wph$Application */
    public static final class Application {
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = application.KWHzl;
            }
            return application.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SignalParam(id=" + this.OLrzqt + ", status=" + this.KWHzl + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.KWHzl = str2;
        }
    }
}

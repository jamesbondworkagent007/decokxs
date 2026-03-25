package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xrv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55863xrv {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final C56111xwe<java.lang.String> gEmmrt = new C56111xwe<>();
    public final C54308xDp fetchVPNInfo = new C54308xDp();
    public java.lang.String OLrzqt = "";
    public java.lang.String AEQbTJ = "";
    public java.lang.String DbNXlk = "less_type";
    public java.lang.String AkhnZx = "";
    public java.lang.String AYXKKw = "";
    public java.lang.String AhwBna = "";
    public java.lang.String copydefault = "";
    public java.lang.String EZpvd = "";
    public java.lang.String values = "";
    public java.lang.String isConnected = "";
    public java.lang.String valueOf = "";
    public java.lang.String djBIcL = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.String> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54308xDp gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX INFO: renamed from: o.xrv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xrv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void values() {
        C54308xDp c54308xDp = this.fetchVPNInfo;
        c54308xDp.OLrzqt(this.gEmmrt, new ActionBar());
        c54308xDp.KWHzl(this.valueOf);
        xKK.Activity.execute$default(c54308xDp, 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.xrv$ActionBar */
    public static final class ActionBar implements InterfaceC54501xKt<C55804xqp<java.util.List<? extends TickersData>>, java.lang.String> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public java.lang.String KWHzl(C55804xqp<java.util.List<TickersData>> c55804xqp) {
            java.lang.String last;
            Intrinsics.checkNotNullParameter(c55804xqp, "");
            TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(c55804xqp.copydefault());
            return (tickersData == null || (last = tickersData.getLast()) == null) ? "" : last;
        }
    }

    public final void OLrzqt() {
        this.fetchVPNInfo.AYXKKw();
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, java.lang.String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.valueOf = str;
        this.AEQbTJ = str2;
        this.AYXKKw = str4;
        this.AkhnZx = str3;
        this.copydefault = str6;
        this.AhwBna = str5;
        this.EZpvd = str7;
        this.values = str8;
        this.isConnected = str9;
        if (str10 == null) {
            str10 = "";
        }
        this.djBIcL = str10;
        fetchVPNInfo();
    }

    public final boolean DbNXlk() {
        return (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "dip_snipping") || Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "profit_snipping") || Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "dip_snipping") || Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "profit_snipping")) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [110=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String AYXKKw() {
        java.lang.String botPrice$default = C56033xvF.getBotPrice$default("SPOT", this.valueOf, this.values, false, true, null, null, 104, null);
        java.lang.String str = this.OLrzqt;
        switch (str.hashCode()) {
            case -1519680533:
                if (str.equals("sell_fail")) {
                    return C33069mpW.copydefault(C55688xof.Application.Th, C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, botPrice$default)));
                }
                return "";
            case -984533705:
                if (str.equals("buy_fail")) {
                    return C33069mpW.copydefault(C55688xof.Application.reset, C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, botPrice$default)));
                }
                return "";
            case -692420790:
                if (str.equals("buy_success")) {
                    return C33069mpW.copydefault(C55688xof.Application.fXYAwm, C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, botPrice$default)));
                }
                return "";
            case -332970986:
                if (str.equals("sell_success")) {
                    return C33069mpW.copydefault(C55688xof.Application.ihnvzI, C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, botPrice$default)));
                }
                return "";
            default:
                return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [140=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        if (r1.equals("buy_success") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        if (r1.equals("sell_fail") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
    
        return o.C33069mpW.copydefault(o.C55688xof.Application.RZNAhV, o.C56424yEw.gEmmrt(o.C56390yDp.OLrzqt(com.okinc.p2p.api.OtcExtraKeys.AMOUNT, o.xMR.copydefault.copydefault("0", 0)), o.C56390yDp.OLrzqt("unit", r20.AYXKKw)));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AhwBna() {
        java.lang.String str = this.OLrzqt;
        switch (str.hashCode()) {
            case -1519680533:
                break;
            case -984533705:
                if (str.equals("buy_fail")) {
                    xMR xmr = xMR.copydefault;
                    java.lang.String str2 = this.AkhnZx;
                    return C33069mpW.copydefault(C55688xof.Application.RgLUBD, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr.copydefault(C33129mqd.addS$default(str2, C33129mqd.mulS$default(str2, this.EZpvd, null, null, null, 14, null), null, null, null, 14, null), 8)), C56390yDp.OLrzqt("unit", this.AYXKKw)));
                }
                return C33069mpW.copydefault(C55688xof.Application.RZNAhV, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "--"), C56390yDp.OLrzqt("unit", this.AYXKKw)));
            case -692420790:
                break;
            case -332970986:
                if (str.equals("sell_success")) {
                    xMR xmr2 = xMR.copydefault;
                    java.lang.String str3 = this.AhwBna;
                    return C33069mpW.copydefault(C55688xof.Application.RgLUBD, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr2.copydefault(C33129mqd.mulS$default(C33129mqd.addS$default(str3, C33129mqd.mulS$default(str3, this.EZpvd, null, null, null, 14, null), null, null, null, 14, null), this.values, null, null, null, 14, null), 8)), C56390yDp.OLrzqt("unit", this.AYXKKw)));
                }
                return C33069mpW.copydefault(C55688xof.Application.RZNAhV, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "--"), C56390yDp.OLrzqt("unit", this.AYXKKw)));
            default:
                return C33069mpW.copydefault(C55688xof.Application.RZNAhV, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "--"), C56390yDp.OLrzqt("unit", this.AYXKKw)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [173=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r1.equals("buy_fail") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        return o.C33069mpW.copydefault(o.C55688xof.Application.RZNAhV, o.C56424yEw.gEmmrt(o.C56390yDp.OLrzqt(com.okinc.p2p.api.OtcExtraKeys.AMOUNT, o.xMR.copydefault.copydefault("0", 0)), o.C56390yDp.OLrzqt("unit", r20.copydefault)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1.equals("sell_success") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String valueOf() {
        java.lang.String str = this.OLrzqt;
        switch (str.hashCode()) {
            case -1519680533:
                if (str.equals("sell_fail")) {
                    xMR xmr = xMR.copydefault;
                    java.lang.String str2 = this.AhwBna;
                    return C33069mpW.copydefault(C55688xof.Application.RgLUBD, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr.copydefault(C33129mqd.addS$default(str2, C33129mqd.mulS$default(str2, this.EZpvd, null, null, null, 14, null), null, null, null, 14, null), 8)), C56390yDp.OLrzqt("unit", this.copydefault)));
                }
                return C33069mpW.copydefault(C55688xof.Application.RZNAhV, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "--"), C56390yDp.OLrzqt("unit", this.AYXKKw)));
            case -984533705:
                break;
            case -692420790:
                if (str.equals("buy_success")) {
                    xMR xmr2 = xMR.copydefault;
                    java.lang.String str3 = this.AkhnZx;
                    return C33069mpW.copydefault(C55688xof.Application.RgLUBD, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr2.copydefault(C33129mqd.divS$default(C33129mqd.addS$default(str3, C33129mqd.mulS$default(str3, this.EZpvd, null, null, null, 14, null), null, null, null, 14, null), this.values, null, null, null, 14, null), 8)), C56390yDp.OLrzqt("unit", this.copydefault)));
                }
                return C33069mpW.copydefault(C55688xof.Application.RZNAhV, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "--"), C56390yDp.OLrzqt("unit", this.AYXKKw)));
            case -332970986:
                break;
            default:
                return C33069mpW.copydefault(C55688xof.Application.RZNAhV, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "--"), C56390yDp.OLrzqt("unit", this.AYXKKw)));
        }
    }

    public final java.lang.String AkhnZx() {
        return pTA.format$default(new Date(C33129mqd.valueOf(this.isConnected)), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = str;
        fetchVPNInfo();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fetchVPNInfo() {
        java.lang.String str;
        java.lang.String str2 = this.AEQbTJ;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "dip_snipping")) {
            java.lang.String str3 = this.DbNXlk;
            if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "less_type")) {
                str = "buy_success";
            } else {
                str = Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "greater_type") ? "buy_fail" : "";
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "profit_snipping")) {
            java.lang.String str4 = this.DbNXlk;
            if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "less_type")) {
                str = "sell_fail";
            } else if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "greater_type")) {
                str = "sell_success";
            }
        }
        this.OLrzqt = str;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33069mpW.copydefault(C55688xof.Application.RzdrRQ, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, C56033xvF.getBotAmountUnit$default("SPOT", this.valueOf, null, null, 12, null)), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C56033xvF.getBotPrice$default("SPOT", this.valueOf, str, false, false, null, null, 120, null)), C56390yDp.OLrzqt("unit", C56033xvF.AEQbTJ("SPOT", this.valueOf))));
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56033xvF.getBotPrice$default("SPOT", this.valueOf, str, false, true, null, null, 104, null);
    }

    public final java.lang.String AEQbTJ() {
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "dip_snipping") ? "≤" : "<";
    }

    public final java.lang.String isConnected() {
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "dip_snipping") ? ">" : "≥";
    }
}

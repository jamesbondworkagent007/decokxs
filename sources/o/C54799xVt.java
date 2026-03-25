package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xVt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54799xVt {
    public static final C54799xVt AEQbTJ = new C54799xVt();

    private C54799xVt() {
    }

    /* JADX INFO: renamed from: o.xVt$Application */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final boolean EZpvd;
        public final java.lang.String KWHzl;
        public final boolean OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final boolean gEmmrt;
        public final boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(java.lang.String str, java.lang.String str2, boolean z, boolean z2, @NotNull java.lang.String str3, boolean z3, java.lang.String str4, boolean z4) {
            Intrinsics.checkNotNullParameter(str3, "");
            return new Application(str, str2, z, z2, str3, z3, str4, z4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && this.OLrzqt == application.OLrzqt && this.EZpvd == application.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) application.djBIcL) && this.valueOf == application.valueOf && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && this.gEmmrt == application.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.KWHzl;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AEQbTJ;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            int iHashCode3 = java.lang.Boolean.hashCode(this.OLrzqt);
            int iHashCode4 = java.lang.Boolean.hashCode(this.EZpvd);
            int iHashCode5 = this.djBIcL.hashCode();
            int iHashCode6 = java.lang.Boolean.hashCode(this.valueOf);
            java.lang.String str3 = this.copydefault;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TitleConfig(instId=" + this.KWHzl + ", instType=" + this.AEQbTJ + ", isSimple=" + this.OLrzqt + ", isWatch=" + this.EZpvd + ", ruleType=" + this.djBIcL + ", swapWithSuffix=" + this.valueOf + ", displayId=" + this.copydefault + ", swapUseLongSuffix=" + this.gEmmrt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.OLrzqt;
        }

        public Application(java.lang.String str, java.lang.String str2, boolean z, boolean z2, @NotNull java.lang.String str3, boolean z3, java.lang.String str4, boolean z4) {
            Intrinsics.checkNotNullParameter(str3, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.OLrzqt = z;
            this.EZpvd = z2;
            this.djBIcL = str3;
            this.valueOf = z3;
            this.copydefault = str4;
            this.gEmmrt = z4;
        }
    }

    /* JADX INFO: renamed from: o.xVt$StateListAnimator */
    public static final class StateListAnimator {
        public final Application EZpvd;
        public final BizInstrument KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, Application application, java.lang.String str, BizInstrument bizInstrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                application = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                str = stateListAnimator.copydefault;
            }
            if ((i & 4) != 0) {
                bizInstrument = stateListAnimator.KWHzl;
            }
            return stateListAnimator.KWHzl(application, str, bizInstrument);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull Application application, @NotNull java.lang.String str, BizInstrument bizInstrument) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(application, str, bizInstrument);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            BizInstrument bizInstrument = this.KWHzl;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bizInstrument == null ? 0 : bizInstrument.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TitleContext(config=" + this.EZpvd + ", underlying=" + this.copydefault + ", instrument=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull Application application, @NotNull java.lang.String str, BizInstrument bizInstrument) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = application;
            this.copydefault = str;
            this.KWHzl = bizInstrument;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [67=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String OLrzqt(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        java.lang.String instType = bizInstrument.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                if (!instType.equals("MARGIN")) {
                    return "";
                }
                break;
            case -1956807563:
                return !instType.equals("OPTION") ? "" : KWHzl(bizInstrument.getInstId());
            case 2552066:
                if (!instType.equals("SPOT")) {
                    return "";
                }
                break;
            case 2558355:
                return !instType.equals("SWAP") ? "" : getTitleByIdAndType$default(this, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, "normal", false, null, 104, null);
            case 214415088:
                return !instType.equals("FUTURES") ? "" : getTitleByIdAndType$default(this, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, 12, null);
            default:
                return "";
        }
        return bizInstrument.getTradeSymbol() + "/" + bizInstrument.getDisplayQuoteSymbol();
    }

    public static /* synthetic */ java.lang.String setFutureTitleText$default(C54799xVt c54799xVt, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return c54799xVt.copydefault(str, str2, z, z2);
    }

    public final java.lang.String copydefault(java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str2, "");
        xVE xve = xVE.copydefault;
        if (str == null) {
            str = "";
        }
        return xve.OLrzqt(str);
    }

    public static /* synthetic */ java.lang.String getTitleByIdAndType$default(C54799xVt c54799xVt, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return c54799xVt.AEQbTJ(str, str2, z, z2);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        return getTitleByIdAndType$default(this, str, str2, z, z2, "normal", false, null, 96, null);
    }

    public static /* synthetic */ java.lang.String getTitleByIdAndType$default(C54799xVt c54799xVt, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, boolean z3, java.lang.String str4, int i, java.lang.Object obj) {
        return c54799xVt.copydefault(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "normal" : str3, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? null : str4);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, boolean z3, java.lang.String str4) {
        return EZpvd(new Application(str, str2, z, z2, str3 == null ? "normal" : str3, z3, str4, false));
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, boolean z3, java.lang.String str4, boolean z4) {
        return EZpvd(new Application(str, str2, z, z2, str3 == null ? "normal" : str3, z3, str4, z4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [161=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r3.equals("MARGIN") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return AEQbTJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r3.equals("CONVERT") == false) goto L30;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(Application application) {
        StateListAnimator stateListAnimatorCopydefault = copydefault(application);
        java.lang.String strAEQbTJ = application.AEQbTJ();
        if (strAEQbTJ != null) {
            switch (strAEQbTJ.hashCode()) {
                case -2027980370:
                    break;
                case -1956807563:
                    if (strAEQbTJ.equals("OPTION")) {
                        return copydefault(stateListAnimatorCopydefault);
                    }
                    break;
                case 2552066:
                    if (strAEQbTJ.equals("SPOT")) {
                        return EZpvd(stateListAnimatorCopydefault);
                    }
                    break;
                case 2558355:
                    if (strAEQbTJ.equals("SWAP")) {
                        return KWHzl(stateListAnimatorCopydefault);
                    }
                    break;
                case 214415088:
                    if (strAEQbTJ.equals("FUTURES")) {
                        return OLrzqt(stateListAnimatorCopydefault);
                    }
                    break;
                case 1669573011:
                    break;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StateListAnimator copydefault(Application application) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        java.lang.String strKWHzl;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        if (application.AYXKKw()) {
            java.lang.String strAEQbTJ = application.AEQbTJ();
            suggestedInstrument$default = (strAEQbTJ == null || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null) ? null : InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, strAEQbTJ, application.copydefault(), null, null, 12, null);
        } else {
            java.lang.String strAEQbTJ2 = application.AEQbTJ();
            if (strAEQbTJ2 != null && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null) {
                suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strAEQbTJ2, application.copydefault(), null, null, 12, null);
            }
        }
        if (suggestedInstrument$default == null || (strKWHzl = suggestedInstrument$default.getInstFamily()) == null) {
            xVE xve = xVE.copydefault;
            java.lang.String strCopydefault = application.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            strKWHzl = xve.KWHzl(strCopydefault);
        }
        return new StateListAnimator(application, strKWHzl, suggestedInstrument$default);
    }

    public final java.lang.String EZpvd(StateListAnimator stateListAnimator) {
        java.lang.String strReplace$default;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        BizInstrument suggestedInstrument$default;
        java.lang.String strAEQbTJ = stateListAnimator.KWHzl().AEQbTJ();
        java.lang.String displayId = (strAEQbTJ == null || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, strAEQbTJ, stateListAnimator.KWHzl().copydefault(), null, null, 12, null)) == null) ? null : suggestedInstrument$default.getDisplayId();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) stateListAnimator.KWHzl().OLrzqt())) {
            displayId = stateListAnimator.KWHzl().OLrzqt();
        } else if (!C33129mqd.OLrzqt((java.lang.CharSequence) displayId)) {
            displayId = stateListAnimator.KWHzl().copydefault();
        }
        java.lang.String str = displayId;
        if (str == null || (strReplace$default = C59449zhJ.replace$default(str, "-", "/", false, 4, (java.lang.Object) null)) == null) {
            return "";
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strReplace$default.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase == null ? "" : upperCase;
    }

    public final java.lang.String AEQbTJ(StateListAnimator stateListAnimator) {
        java.lang.String strReplace$default;
        java.lang.String strCopydefault = stateListAnimator.KWHzl().copydefault();
        if (strCopydefault == null || (strReplace$default = C59449zhJ.replace$default(strCopydefault, "-", "/", false, 4, (java.lang.Object) null)) == null) {
            return "";
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strReplace$default.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase == null ? "" : upperCase;
    }

    public final java.lang.String KWHzl(StateListAnimator stateListAnimator) {
        java.lang.String strReplace$default;
        java.lang.String str = "";
        if (stateListAnimator.KWHzl().valueOf()) {
            java.lang.String strCopydefault = TaskDescription.AEQbTJ(stateListAnimator.EZpvd()).copydefault();
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            strReplace$default = strCopydefault.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(strReplace$default, "");
        } else {
            strReplace$default = C59449zhJ.replace$default(stateListAnimator.EZpvd(), "-", "", false, 4, (java.lang.Object) null);
        }
        java.lang.String strCopydefault2 = copydefault(strReplace$default, stateListAnimator.KWHzl().copydefault());
        if (stateListAnimator.KWHzl().AhwBna()) {
            str = " " + (stateListAnimator.KWHzl().EZpvd() ? C33070mpX.AYXKKw(C55688xof.Application.MenuRes) : C33070mpX.AYXKKw(C55688xof.Application.pXZxY));
        }
        return strCopydefault2 + str;
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        xVE xve = xVE.copydefault;
        if (str2 == null) {
            str2 = "";
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) xve.copydefault(str2), (java.lang.Object) "inverse");
        java.lang.String strCopydefault = C59449zhJ.copydefault(str, "_UM", " UM", true);
        return zEZpvd ? C59449zhJ.copydefault(strCopydefault, "USD", "USD CM", true) : strCopydefault;
    }

    public final java.lang.String OLrzqt(StateListAnimator stateListAnimator) {
        java.lang.String strOLrzqt;
        java.lang.String strKWHzl = stateListAnimator.KWHzl().KWHzl();
        if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "pre_market")) {
            strOLrzqt = xVE.copydefault.AEQbTJ(stateListAnimator.EZpvd());
        } else if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "group_filter")) {
            strOLrzqt = C59449zhJ.replace$default(stateListAnimator.EZpvd(), "-", "", false, 4, (java.lang.Object) null);
        } else {
            xVE xve = xVE.copydefault;
            java.lang.String strCopydefault = stateListAnimator.KWHzl().copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            strOLrzqt = xve.OLrzqt(strCopydefault);
        }
        return copydefault(strOLrzqt, stateListAnimator.KWHzl().copydefault());
    }

    public final java.lang.String copydefault(StateListAnimator stateListAnimator) {
        java.lang.String strReplaceFirst$default;
        java.lang.String strAEQbTJ = AEQbTJ(stateListAnimator.KWHzl().copydefault(), stateListAnimator.KWHzl().AEQbTJ());
        if (stateListAnimator.KWHzl().valueOf()) {
            return C59449zhJ.replace$default(stateListAnimator.EZpvd(), "-", "", false, 4, (java.lang.Object) null) + strAEQbTJ;
        }
        java.lang.String strCopydefault = stateListAnimator.KWHzl().copydefault();
        java.util.List listSplit$default = strCopydefault != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strCopydefault, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
        if (listSplit$default != null && listSplit$default.size() == 5) {
            return listSplit$default.get(0) + listSplit$default.get(1) + "-" + strAEQbTJ + "-" + listSplit$default.get(3) + "-" + listSplit$default.get(4);
        }
        java.lang.String strCopydefault2 = stateListAnimator.KWHzl().copydefault();
        return (strCopydefault2 == null || (strReplaceFirst$default = C59449zhJ.replaceFirst$default(strCopydefault2, "-", "", false, 4, (java.lang.Object) null)) == null) ? "" : strReplaceFirst$default;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() <= 3) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        for (java.lang.Object obj : listSplit$default) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str2 = (java.lang.String) obj;
            if (i == 0 || i == 1) {
                sb.append(str2);
            } else if (i == 2) {
                sb.append("-20" + str2);
            } else {
                sb.append("-" + str2);
            }
            i++;
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final TradeCoinInfo OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return interfaceC54581xNrOLrzqt.AhwBna(str);
        }
        return null;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pTA.formatDate$default(java.util.Date, com.okinc.localization.util.format.OKDateEnum, java.util.Locale, java.util.TimeZone, int, java.lang.Object):java.lang.String */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        long jLongValue;
        java.lang.String expTime;
        if (str2 == null) {
            jLongValue = 0;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
            OptionInstrument optionInstrument = suggestedInstrument$default instanceof OptionInstrument ? (OptionInstrument) suggestedInstrument$default : null;
            java.lang.Long lValueOf = (optionInstrument == null || (expTime = optionInstrument.getExpTime()) == null) ? null : java.lang.Long.valueOf(java.lang.Long.parseLong(expTime));
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            }
        }
        if (jLongValue == 0) {
            java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
            if (listSplit$default == null || listSplit$default.size() != 5) {
                return "";
            }
            return "20" + listSplit$default.get(2);
        }
        return pTA.formatDate$default(new Date(jLongValue), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int copydefault(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2027980370:
                    if (str.equals("MARGIN")) {
                        return 1;
                    }
                    break;
                case -1956807563:
                    if (str.equals("OPTION")) {
                        return 4;
                    }
                    break;
                case 2552066:
                    str.equals("SPOT");
                    break;
                case 2558355:
                    if (str.equals("SWAP")) {
                        return 2;
                    }
                    break;
                case 214415088:
                    if (str.equals("FUTURES")) {
                        return 3;
                    }
                    break;
                case 1983970406:
                    if (str.equals("CEDEFI")) {
                        return 5;
                    }
                    break;
            }
        }
        return 0;
    }
}

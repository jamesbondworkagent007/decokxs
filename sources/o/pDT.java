package o;

import android.graphics.Color;
import com.amplifyframework.core.model.ModelIdentifier;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pDT {
    public java.lang.String EZpvd = "#FFA726";
    public java.lang.String djBIcL = "D2";
    public java.lang.String gEmmrt = "E0";
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public static final java.util.ArrayList<oLO> AEQbTJ = new java.util.ArrayList<>();
    public static final java.util.ArrayList<oLO> OLrzqt = new java.util.ArrayList<>();
    public static final InterfaceC56387yDm<pDT> KWHzl = C56392yDr.EZpvd(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: o.pDR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return pDT.copydefault();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<oLO> djBIcL() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pDT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final pDT KWHzl() {
            return (pDT) pDT.KWHzl.getValue();
        }

        public final void EZpvd() {
            pDT.AEQbTJ.addAll(yDY.gEmmrt(new oLO("#000000", false, "#FFFFFF", "A0", 0, 18, null), new oLO("#F23645", false, "#F23645", "A1", 0, 18, null), new oLO("#FF9800", false, "#FF9800", "A2", 0, 18, null), new oLO("#FFEB3B", false, "#FFEB3B", "A3", 0, 18, null), new oLO("#4CAF50", false, "#4CAF50", "A4", 0, 18, null), new oLO("#00BCD4", false, "#00BCD4", "A5", 0, 18, null), new oLO("#2862FF", false, "#2862FF", "A6", 0, 18, null), new oLO("#9C27B0", false, "#9C27B0", "A7", 0, 18, null), new oLO("#E91E63", false, "#E91E63", "A8", 0, 18, null), new oLO("#2A2E39", false, "#D2D4DC", "B0", 0, 18, null), new oLO("#FCCBCD", false, "#FCCBCD", "B1", 0, 18, null), new oLO("#FFE0B1", false, "#FFE0B1", "B2", 0, 18, null), new oLO("#FFF9C4", false, "#FFF9C4", "B3", 0, 18, null), new oLO("#C8E6C9", false, "#C8E6C9", "B4", 0, 18, null), new oLO("#B2EBF2", false, "#B2EBF2", "B5", 0, 18, null), new oLO("#BBD9FB", false, "#BBD9FB", "B6", 0, 18, null), new oLO("#E1BEE7", false, "#E1BEE7", "B7", 0, 18, null), new oLO("#F8BBD0", false, "#F8BBD0", "B8", 0, 18, null), new oLO("#3B3E47", false, "#A9ACB5", "C0", 0, 18, null), new oLO("#FAA1A4", false, "#FAA1A4", "C1", 0, 18, null), new oLO("#FFCC80", false, "#FFCC80", "C2", 0, 18, null), new oLO("#FFF59D", false, "#FFF59D", "C3", 0, 18, null), new oLO("#A5D6A7", false, "#A5D6A7", "C4", 0, 18, null), new oLO("#81DEEA", false, "#81DEEA", "C5", 0, 18, null), new oLO("#90BFF9", false, "#90BFF9", "C6", 0, 18, null), new oLO("#CE93D8", false, "#CE93D8", "C7", 0, 18, null), new oLO("#F48FB1", false, "#F48FB1", "C8", 0, 18, null), new oLO("#A9ACB5", false, "#3B3E47", "D0", 0, 18, null), new oLO("#F85260", false, "#F85260", "D1", 0, 18, null), new oLO("#FFA726", false, "#FFA726", "D2", 0, 18, null), new oLO("#FFEE58", false, "#FFEE58", "D3", 0, 18, null), new oLO("#66BB6A", false, "#66BB6A", "D4", 0, 18, null), new oLO("#27C6DA", false, "#27C6DA", "D5", 0, 18, null), new oLO("#3279F5", false, "#3279F5", "D6", 0, 18, null), new oLO("#AB47BC", false, "#AB47BC", "D7", 0, 18, null), new oLO("#EC407A", false, "#EC407A", "D8", 0, 18, null), new oLO("#FFFFFF", false, "#000000", "E0", 0, 18, null), new oLO("#801A23", false, "#801A23", "E1", 0, 18, null), new oLO("#E65000", false, "#E65000", "E2", 0, 18, null), new oLO("#F57F16", false, "#F57F16", "E3", 0, 18, null), new oLO("#1A5E20", false, "#1A5E20", "E4", 0, 18, null), new oLO("#036064", false, "#036064", "E5", 0, 18, null), new oLO("#0C3299", false, "#0C3299", "E6", 0, 18, null), new oLO("#4A148C", false, "#4A148C", "E7", 0, 18, null), new oLO("#870E4F", false, "#870E4F", "E8", 0, 18, null)));
        }

        public final void OLrzqt() {
            pDT.OLrzqt.addAll(yDY.gEmmrt(new oLO("#FFA726", false, "#FFA726", "D2", 0, 18, null), new oLO("#EC407A", false, "#EC407A", "D8", 0, 18, null), new oLO("#27C6DA", false, "#27C6DA", "D5", 0, 18, null), new oLO("#E65000", false, "#E65000", "E2", 0, 18, null), new oLO("#AB47BC", false, "#AB47BC", "D7", 0, 18, null), new oLO("#66BB6A", false, "#66BB6A", "D4", 0, 18, null), new oLO("#90BFF9", false, "#90BFF9", "C6", 0, 18, null), new oLO("#F85260", false, "#F85260", "D1", 0, 18, null), new oLO("#3279F5", false, "#3279F5", "D6", 0, 18, null), new oLO("#801A24", false, "#801A24", "E1", 0, 18, null), new oLO("#FFD959", false, "#FFD959", "D3", 0, 18, null), new oLO("#CE94D8", false, "#CE94D8", "C7", 0, 18, null), new oLO("#016164", false, "#016164", "E5", 0, 18, null), new oLO("#0C3299", false, "#0C3299", "E6", 0, 18, null), new oLO("#F23645", false, "#F23645", "A1", 0, 18, null), new oLO("#4CAF50", false, "#4CAF50", "A4", 0, 18, null)));
        }
    }

    public static final pDT copydefault() {
        StateListAnimator stateListAnimator = Companion;
        stateListAnimator.EZpvd();
        stateListAnimator.OLrzqt();
        return new pDT();
    }

    public final oLO KWHzl(int i) {
        java.util.ArrayList<oLO> arrayList = OLrzqt;
        if (i < arrayList.size()) {
            oLO olo = arrayList.get(i);
            Intrinsics.copydefault(olo);
            return olo;
        }
        java.lang.String str = this.EZpvd;
        return new oLO(str, false, str, this.djBIcL, 0, 18, null);
    }

    public final int AYXKKw() {
        if (Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.AEQbTJ(), (java.lang.Object) "kline_dark")) {
            return C36246oUr.copydefault().AubY().getApplicationContext().getResources().getColor(C52761wXj.Activity.djSkpj);
        }
        return C36246oUr.copydefault().AubY().getApplicationContext().getResources().getColor(C52761wXj.Activity.UeEOUB);
    }

    public final int fetchVPNInfo() {
        if (Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.AEQbTJ(), (java.lang.Object) "kline_dark")) {
            return C36246oUr.copydefault().AubY().getApplicationContext().getResources().getColor(C52761wXj.Activity.aUsmxb);
        }
        return C36246oUr.copydefault().AubY().getApplicationContext().getResources().getColor(C52761wXj.Activity.QSBOWP);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        java.lang.Object next;
        if (str != null) {
            java.util.Iterator<T> it = AEQbTJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C59449zhJ.gEmmrt(((oLO) next).copydefault(), str, true)) {
                    break;
                }
            }
            oLO olo = (oLO) next;
            if (olo != null) {
                return Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_dark") ? olo.EZpvd() : olo.OLrzqt();
            }
        }
        return null;
    }

    public final java.lang.String copydefault(java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str2, "");
        if (str == null) {
            return null;
        }
        java.util.Iterator<T> it = AEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C59449zhJ.gEmmrt(((oLO) next).copydefault(), str, true)) {
                break;
            }
        }
        oLO olo = (oLO) next;
        if (olo != null) {
            return Intrinsics.EZpvd((java.lang.Object) "dark", (java.lang.Object) str2) ? olo.EZpvd() : olo.OLrzqt();
        }
        return null;
    }

    public final java.lang.String KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str2, "");
        if (str == null) {
            return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "rgb", false, 2, (java.lang.Object) null) ? AEQbTJ(str2) : str2;
        }
        java.util.Iterator<T> it = AEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C59449zhJ.gEmmrt(((oLO) next).copydefault(), str, true)) {
                break;
            }
        }
        oLO olo = (oLO) next;
        if (olo != null) {
            return OLrzqt(str2) < 255 ? str2 : Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_dark") ? olo.EZpvd() : olo.OLrzqt();
        }
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "rgb", false, 2, (java.lang.Object) null) ? AEQbTJ(str2) : str2;
    }

    public final int OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return Color.alpha(Color.parseColor(str));
        } catch (java.lang.Exception unused) {
            return 255;
        }
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int color = Color.parseColor(str);
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(color & 16777215), java.lang.Integer.valueOf(Color.alpha(color)));
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Regex regex = new Regex("rgba\\(\\s*(\\d+)\\s*,\\s*(\\d+)\\s*,\\s*(\\d+)\\s*,\\s*([\\d.]+)\\s*\\)");
            Regex regex2 = new Regex("rgb\\(\\s*(\\d+)\\s*,\\s*(\\d+)\\s*,\\s*(\\d+)\\s*\\)");
            if (regex.matches(str)) {
                MatchResult matchResultFind$default = Regex.find$default(regex, str, 0, 2, null);
                Intrinsics.copydefault(matchResultFind$default);
                MatchResult.ActionBar actionBarAEQbTJ = matchResultFind$default.AEQbTJ();
                java.lang.String str2 = actionBarAEQbTJ.KWHzl().OLrzqt().get(1);
                java.lang.String str3 = actionBarAEQbTJ.KWHzl().OLrzqt().get(2);
                java.lang.String str4 = actionBarAEQbTJ.KWHzl().OLrzqt().get(3);
                java.lang.String str5 = actionBarAEQbTJ.KWHzl().OLrzqt().get(4);
                int i = java.lang.Integer.parseInt(str2);
                int i2 = java.lang.Integer.parseInt(str3);
                int i3 = java.lang.Integer.parseInt(str4);
                java.lang.String string = java.lang.Integer.toString((int) (java.lang.Float.parseFloat(str5) * 255), CharsKt__CharJVMKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String strCopydefault = StringsKt__StringsKt.copydefault(string, 2, '0');
                java.lang.String string2 = java.lang.Integer.toString(i, CharsKt__CharJVMKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "");
                java.lang.String strCopydefault2 = StringsKt__StringsKt.copydefault(string2, 2, '0');
                java.lang.String string3 = java.lang.Integer.toString(i2, CharsKt__CharJVMKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string3, "");
                java.lang.String strCopydefault3 = StringsKt__StringsKt.copydefault(string3, 2, '0');
                java.lang.String string4 = java.lang.Integer.toString(i3, CharsKt__CharJVMKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string4, "");
                return ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + strCopydefault + strCopydefault2 + strCopydefault3 + StringsKt__StringsKt.copydefault(string4, 2, '0');
            }
            if (!regex2.matches(str)) {
                return "#2862FF";
            }
            MatchResult matchResultFind$default2 = Regex.find$default(regex2, str, 0, 2, null);
            Intrinsics.copydefault(matchResultFind$default2);
            MatchResult.ActionBar actionBarAEQbTJ2 = matchResultFind$default2.AEQbTJ();
            java.lang.String str6 = actionBarAEQbTJ2.KWHzl().OLrzqt().get(1);
            java.lang.String str7 = actionBarAEQbTJ2.KWHzl().OLrzqt().get(2);
            java.lang.String str8 = actionBarAEQbTJ2.KWHzl().OLrzqt().get(3);
            int i4 = java.lang.Integer.parseInt(str6);
            int i5 = java.lang.Integer.parseInt(str7);
            int i6 = java.lang.Integer.parseInt(str8);
            java.lang.String string5 = java.lang.Integer.toString(i4, CharsKt__CharJVMKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string5, "");
            java.lang.String strCopydefault4 = StringsKt__StringsKt.copydefault(string5, 2, '0');
            java.lang.String string6 = java.lang.Integer.toString(i5, CharsKt__CharJVMKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string6, "");
            java.lang.String strCopydefault5 = StringsKt__StringsKt.copydefault(string6, 2, '0');
            java.lang.String string7 = java.lang.Integer.toString(i6, CharsKt__CharJVMKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string7, "");
            return ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + strCopydefault4 + strCopydefault5 + StringsKt__StringsKt.copydefault(string7, 2, '0');
        } catch (java.lang.Exception e) {
            pUU.copydefault("rgba color transfer error " + e.getMessage());
            return "#2862FF";
        }
    }

    public final oLO gEmmrt() {
        return new oLO("#000000", false, "#FFFFFF", "", 0, 18, null);
    }
}

package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.unify_trade.biz.BizInstrument;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56040xvM {
    public static /* synthetic */ java.lang.String initContractGridViewData$getBotPrice$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return copydefault(str, str2, str3, z);
    }

    public static final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        return C56033xvF.getBotPrice$default(str, str2, str3, z, false, RoundingMode.HALF_UP, null, 80, null);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (C33129mqd.valueOf(str3, 0) || C33129mqd.valueOf(str4, 0)) {
            return "--";
        }
        return initContractGridViewData$getBotPrice$default(str, str2, str3, false, 8, null) + " - " + copydefault(str, str2, str4, true);
    }

    public static final boolean OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return (C33129mqd.valueOf(str, 0) && C33129mqd.valueOf(str2, 0) && C33129mqd.valueOf(str3, 0) && C33129mqd.valueOf(str4, 0)) || C33129mqd.AEQbTJ(str, 0) || C33129mqd.AEQbTJ(str2, 0);
    }

    public static final boolean KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return (C33129mqd.valueOf(str, 0) && C33129mqd.valueOf(str2, 0) && C33129mqd.valueOf(str3, 0) && C33129mqd.valueOf(str4, 0)) || C33129mqd.AEQbTJ(str3, 0) || C33129mqd.AEQbTJ(str4, 0);
    }

    public static /* synthetic */ C55851xrj getContractTpConfig$default(java.lang.String str, int i, java.lang.String str2, C55853xrl c55853xrl, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            c55853xrl = new C55853xrl(null, null, null, null, 15, null);
        }
        return KWHzl(str, i, str2, c55853xrl);
    }

    public static final C55851xrj KWHzl(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, C55853xrl c55853xrl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "tp_sl_price")) {
            return new C55851xrj(C33070mpX.AYXKKw(C55688xof.Application.QKVWgx), i, str2, null, 8, null);
        }
        return new C55851xrj(C33070mpX.AYXKKw(C55688xof.Application.pause), 2, null, copydefault(str, c55853xrl), 4, null);
    }

    public static /* synthetic */ C55851xrj getContractSlConfig$default(java.lang.String str, int i, java.lang.String str2, C55853xrl c55853xrl, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            c55853xrl = new C55853xrl(null, null, null, null, 15, null);
        }
        return OLrzqt(str, i, str2, c55853xrl);
    }

    public static final C55851xrj OLrzqt(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, C55853xrl c55853xrl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "tp_sl_price")) {
            return new C55851xrj(C33070mpX.AYXKKw(C55688xof.Application.gHZMYf), i, str2, null, 8, null);
        }
        return new C55851xrj(C33070mpX.AYXKKw(C55688xof.Application.resume), 2, null, EZpvd(str, c55853xrl), 4, null);
    }

    public static /* synthetic */ java.lang.String getTpHint$default(java.lang.String str, C55853xrl c55853xrl, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c55853xrl = new C55853xrl(null, null, null, null, 15, null);
        }
        return copydefault(str, c55853xrl);
    }

    public static final java.lang.String copydefault(java.lang.String str, C55853xrl c55853xrl) {
        java.lang.String strAEQbTJ;
        java.lang.String strKWHzl;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "tp_sl_price")) {
            return "";
        }
        xMR xmr = xMR.copydefault;
        if (c55853xrl == null || (strAEQbTJ = c55853xrl.AEQbTJ()) == null) {
            strAEQbTJ = "0.004";
        }
        java.lang.String percent$default = xMR.formatPercent$default(xmr, strAEQbTJ, 2, 2, null, 8, null);
        if (c55853xrl == null || (strKWHzl = c55853xrl.KWHzl()) == null) {
            strKWHzl = "100";
        }
        return percent$default + " -" + xMR.formatPercent$default(xmr, strKWHzl, 2, 2, null, 8, null);
    }

    public static /* synthetic */ java.lang.String getSlHint$default(java.lang.String str, C55853xrl c55853xrl, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c55853xrl = new C55853xrl(null, null, null, null, 15, null);
        }
        return EZpvd(str, c55853xrl);
    }

    public static final java.lang.String EZpvd(java.lang.String str, C55853xrl c55853xrl) {
        java.lang.String strEZpvd;
        java.lang.String strCopydefault;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "tp_sl_price")) {
            return "";
        }
        xMR xmr = xMR.copydefault;
        if (c55853xrl == null || (strEZpvd = c55853xrl.EZpvd()) == null) {
            strEZpvd = "0.005";
        }
        java.lang.String percent$default = xMR.formatPercent$default(xmr, strEZpvd, 2, 2, null, 8, null);
        if (c55853xrl == null || (strCopydefault = c55853xrl.copydefault()) == null) {
            strCopydefault = "0.9999";
        }
        return percent$default + " -" + xMR.formatPercent$default(xmr, strCopydefault, 2, 2, null, 8, null);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) ? "tp_sl_price" : "tp_sl_ratio";
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) ? "tp_sl_price" : "tp_sl_ratio";
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if ((z && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "tp_sl_ratio")) || (z2 && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "tp_sl_ratio"))) {
            return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.GiPPlLgiPPlL), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
        }
        return new kotlin.Pair<>("", 0);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        java.lang.String strMulS$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "tp_sl_price")) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str3, null, null, 12, null) : null;
            if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) != null) {
                instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
                if (instFamily == null) {
                    instFamily = "";
                }
                instFamily = abstractC54531xLwOLrzqt.fIwbmz(instFamily);
            }
            strMulS$default = C33129mqd.formatS$default(C56033xvF.OLrzqt(str4, suggestedInstrument$default), java.lang.Integer.valueOf(C33129mqd.AhwBna(instFamily)), null, RoundingMode.HALF_UP, 2, null);
            if (C33129mqd.OLrzqt((java.lang.Object) strMulS$default, (java.lang.Object) 0)) {
                return "";
            }
        } else {
            strMulS$default = C33129mqd.mulS$default(str5, 100, null, null, null, 14, null);
            if (C33129mqd.OLrzqt((java.lang.Object) strMulS$default, (java.lang.Object) 0)) {
                return "";
            }
        }
        return strMulS$default;
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        java.lang.String strMulS$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "tp_sl_price")) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str3, null, null, 12, null) : null;
            if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) != null) {
                instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
                if (instFamily == null) {
                    instFamily = "";
                }
                instFamily = abstractC54531xLwOLrzqt.fIwbmz(instFamily);
            }
            strMulS$default = C33129mqd.formatS$default(C56033xvF.OLrzqt(str4, suggestedInstrument$default), java.lang.Integer.valueOf(C33129mqd.AhwBna(instFamily)), null, RoundingMode.HALF_UP, 2, null);
            if (C33129mqd.OLrzqt((java.lang.Object) strMulS$default, (java.lang.Object) 0)) {
                return "";
            }
        } else {
            strMulS$default = C33129mqd.mulS$default(str5, 100, null, null, null, 14, null);
            if (C33129mqd.OLrzqt((java.lang.Object) strMulS$default, (java.lang.Object) 0)) {
                return "";
            }
        }
        return strMulS$default;
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C56033xvF.getBotPrice$default(str, str2, str3, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
    }
}

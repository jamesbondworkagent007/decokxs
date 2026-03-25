package o;

import android.os.Build;
import com.okinc.core.ok_app.mlnservices.UDOKApp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.roK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43384roK {
    public static Function0<java.lang.Integer> AhwBna;
    public static Function0<java.lang.Boolean> EZpvd;
    public static final C43384roK KWHzl = new C43384roK();
    public static java.lang.String OLrzqt = "";
    public static java.lang.String copydefault = "";
    public static java.lang.String djBIcL = "";
    public static java.lang.String AYXKKw = "";
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<java.lang.Integer> function0) {
        AhwBna = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<java.lang.Boolean> function0) {
        EZpvd = function0;
    }

    private C43384roK() {
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) copydefault)) {
            return;
        }
        if (str.length() == 0) {
            str = KWHzl.EZpvd();
        }
        copydefault = str;
        djBIcL();
    }

    public final java.lang.String KWHzl() {
        if (copydefault.length() == 0) {
            copydefault = EZpvd();
        }
        return C59449zhJ.replace$default(copydefault, "_", "-", false, 4, (java.lang.Object) null);
    }

    public final void djBIcL() {
        AYXKKw();
        gEmmrt();
    }

    public final void AYXKKw() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(OLrzqt);
        sb.append("-");
        java.lang.String strCopydefault = xVY.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        int length = strCopydefault.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.copydefault((int) strCopydefault.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        sb.append(strCopydefault.subSequence(i, length + 1).toString());
        sb.append("/");
        sb.append(C34703nhO.valueOf(C43292rmY.OLrzqt.DbNXlk()));
        sb.append(" (");
        sb.append(OLrzqt());
        sb.append("; ");
        sb.append("U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(KWHzl());
        sb.append(";)");
        sb.append(" locale=");
        sb.append(KWHzl());
        djBIcL = sb.toString();
    }

    public final void gEmmrt() {
        Function0<java.lang.Integer> function0;
        Function0<java.lang.Boolean> function02 = EZpvd;
        java.lang.String str = (function02 == null || !function02.invoke().booleanValue()) ? "light" : "dark";
        try {
            function0 = AhwBna;
        } catch (java.lang.Exception unused) {
        }
        int iIntValue = function0 != null ? function0.invoke().intValue() : 0;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(OLrzqt);
        sb.append("-");
        sb.append(xVY.copydefault());
        sb.append("/");
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        sb.append(C34703nhO.valueOf(c43292rmY.DbNXlk()));
        sb.append(" (");
        sb.append(OLrzqt());
        sb.append("; ");
        sb.append("U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(KWHzl());
        sb.append(";)");
        sb.append(" locale=");
        sb.append(KWHzl());
        sb.append(" ");
        sb.append("statusBarHeight/" + iIntValue);
        sb.append(" ");
        sb.append(UDOKApp.LUA_CLASS_NAME);
        sb.append("/");
        sb.append("(");
        sb.append(OLrzqt);
        sb.append("/");
        sb.append(C34703nhO.valueOf(c43292rmY.DbNXlk()));
        sb.append(")");
        sb.append(" ");
        sb.append("brokerDomain/www.okx.com");
        sb.append(" ");
        sb.append("brokerId/0");
        sb.append(" ");
        sb.append("jsbridge");
        sb.append("/");
        sb.append("1.1.0");
        sb.append(" ");
        sb.append("theme");
        sb.append("/");
        sb.append(str);
        AYXKKw = sb.toString();
    }

    public final java.lang.String copydefault() {
        if (djBIcL.length() == 0) {
            AYXKKw();
        }
        return djBIcL;
    }

    public final java.lang.String valueOf() {
        gEmmrt();
        return AYXKKw;
    }

    public final java.lang.String OLrzqt() {
        java.lang.String str = android.os.Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str, "");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((Intrinsics.copydefault((int) cCharAt, 31) <= 0 && cCharAt != '\t') || Intrinsics.copydefault((int) cCharAt, 127) >= 0) {
                return "Unknown";
            }
        }
        return str;
    }

    public final java.lang.String EZpvd() {
        return java.util.Locale.getDefault().getLanguage() + "-" + java.util.Locale.getDefault().getCountry();
    }
}

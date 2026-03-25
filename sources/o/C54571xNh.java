package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xNh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C54571xNh {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String KWHzl;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt = "";
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54571xNh AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54571xNh AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        java.lang.String str = this.valueOf;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.valueOf = str;
        this.gEmmrt = str2;
        this.AhwBna = str3;
        this.AYXKKw = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54571xNh valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        return this;
    }

    public final java.lang.String gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54536xML.toSafeString$default(djBIcL(str).copydefault().fetchVPNInfo().djBIcL(), false, 1, null);
    }

    public final C54536xML djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strCopydefault = copydefault(str);
        return AYXKKw(strCopydefault != null ? strCopydefault : "");
    }

    public final java.lang.String values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strCopydefault = copydefault(str);
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        C54536xML c54536xML = new C54536xML();
        java.lang.String strKWHzl = KWHzl();
        java.lang.String str2 = this.valueOf;
        if (str2 == null) {
            str2 = "";
        }
        c54536xML.OLrzqt(strCopydefault, strKWHzl, str2, "");
        return C54536xML.toSafeString$default(c54536xML, false, 1, null);
    }

    public final C54536xML AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54536xML c54536xML = new C54536xML();
        java.lang.String strKWHzl = KWHzl();
        java.lang.String str2 = this.valueOf;
        if (str2 == null) {
            str2 = "";
        }
        c54536xML.OLrzqt(str, strKWHzl, str2, "");
        return c54536xML;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        return (str.length() == 0 || (strEZpvd = EZpvd(str)) == null || strEZpvd.length() == 0) ? "" : C33129mqd.AEQbTJ(strEZpvd, java.lang.Integer.valueOf(C33129mqd.AhwBna(this.AYXKKw)), java.lang.Boolean.TRUE, RoundingMode.DOWN);
    }

    public static /* synthetic */ java.lang.String fromTargetOnOrder$default(C54571xNh c54571xNh, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromTargetOnOrder");
        }
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        if ((i & 4) != 0) {
            bool2 = java.lang.Boolean.FALSE;
        }
        return c54571xNh.AEQbTJ(str, bool, bool2);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        java.lang.String strEZpvd;
        RoundingMode roundingMode;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0 || (strEZpvd = EZpvd(str)) == null || strEZpvd.length() == 0) {
            return "";
        }
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(bool, bool3) || Intrinsics.EZpvd(bool2, bool3)) {
            roundingMode = RoundingMode.HALF_UP;
        } else {
            roundingMode = RoundingMode.DOWN;
        }
        return C33129mqd.AEQbTJ(strEZpvd, java.lang.Integer.valueOf(C33129mqd.AhwBna(this.AYXKKw)), bool3, roundingMode);
    }

    public final C54536xML OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = EZpvd(str);
        return isConnected(strEZpvd != null ? strEZpvd : "");
    }

    public final C54536xML isConnected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54536xML c54536xML = new C54536xML();
        java.lang.String str2 = this.AYXKKw;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.AhwBna;
        if (str3 == null) {
            str3 = "";
        }
        c54536xML.OLrzqt(str, str2, str3, "");
        return c54536xML;
    }
}

package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xMS {
    public static final int AEQbTJ = 8;
    public boolean AYXKKw;
    public final boolean AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public xMS() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        if (this.AYXKKw) {
            java.lang.String str = this.gEmmrt;
            if (str != null) {
                return str;
            }
        } else {
            java.lang.String str2 = this.valueOf;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public xMS KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.valueOf = str;
        this.gEmmrt = str2;
        this.djBIcL = str3;
        this.copydefault = str4;
        this.OLrzqt = str5;
        this.KWHzl = str6;
        this.AYXKKw = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.EZpvd;
    }

    public xMS(boolean z) {
        this.AhwBna = z;
        this.EZpvd = "1";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:17) call: o.xMS.<init>(boolean):void type: THIS */
    public /* synthetic */ xMS(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final java.lang.String values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54536xML.toSafeString$default(AYXKKw(str).AkhnZx().isConnected().djBIcL(), false, 1, null);
    }

    public final java.lang.String AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54536xML.toSafeString$default(AYXKKw(str).fetchVPNInfo().isConnected().djBIcL(), false, 1, null);
    }

    public final java.lang.String gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54536xML.toSafeString$default(AYXKKw(str).copydefault().fetchVPNInfo().djBIcL(), false, 1, null);
    }

    public final C54536xML AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(AhwBna(str));
    }

    public final java.lang.String AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(str);
    }

    public final C54536xML KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54536xML c54536xML = new C54536xML();
        java.lang.String str2 = this.djBIcL;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.valueOf;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = this.gEmmrt;
        return c54536xML.OLrzqt(str, str2, str3, str4 != null ? str4 : "");
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.AEQbTJ(OLrzqt(str), java.lang.Integer.valueOf(C33129mqd.AhwBna(this.KWHzl)), java.lang.Boolean.TRUE, RoundingMode.DOWN);
    }

    public final java.lang.String djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(str);
    }

    public final java.lang.String valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.AEQbTJ(OLrzqt(str), 20, java.lang.Boolean.TRUE, RoundingMode.DOWN);
    }

    public final C54536xML AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54536xML c54536xML = new C54536xML();
        java.lang.String str2 = this.KWHzl;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.copydefault;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = this.OLrzqt;
        return c54536xML.OLrzqt(str, str2, str3, str4 != null ? str4 : "");
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return copydefault().length() == 0 ? "" : C33129mqd.mulS$default(str, copydefault(), null, null, null, 14, null);
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return copydefault().length() == 0 ? "" : C33129mqd.divS$default(str, copydefault(), null, null, null, 14, null);
    }
}

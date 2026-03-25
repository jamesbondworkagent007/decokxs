package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wrJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53743wrJ {
    public final java.lang.String AEQbTJ;
    public final float AYXKKw;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C53743wrJ() {
        this(null, 0, null, null, null, 0.0f, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C53743wrJ copy$default(C53743wrJ c53743wrJ, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, float f, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c53743wrJ.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            i = c53743wrJ.copydefault;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = c53743wrJ.OLrzqt;
        }
        java.lang.String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = c53743wrJ.KWHzl;
        }
        java.lang.String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = c53743wrJ.EZpvd;
        }
        java.lang.String str7 = str4;
        if ((i2 & 32) != 0) {
            f = c53743wrJ.AYXKKw;
        }
        return c53743wrJ.KWHzl(str, i3, str5, str6, str7, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53743wrJ KWHzl(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C53743wrJ(str, i, str2, str3, str4, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53743wrJ)) {
            return false;
        }
        C53743wrJ c53743wrJ = (C53743wrJ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c53743wrJ.AEQbTJ) && this.copydefault == c53743wrJ.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c53743wrJ.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c53743wrJ.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c53743wrJ.EZpvd) && java.lang.Float.compare(this.AYXKKw, c53743wrJ.AYXKKw) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = java.lang.Integer.hashCode(this.copydefault);
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = this.KWHzl.hashCode();
        java.lang.String str = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Float.hashCode(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignalCloneInputSettings(investCurrency=" + this.AEQbTJ + ", maxDecimal=" + this.copydefault + ", amount=" + this.OLrzqt + ", hint=" + this.KWHzl + ", errorMessage=" + this.EZpvd + ", seekBarPercent=" + this.AYXKKw + ")";
    }

    public C53743wrJ(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = str;
        this.copydefault = i;
        this.OLrzqt = str2;
        this.KWHzl = str3;
        this.EZpvd = str4;
        this.AYXKKw = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:int:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (8 int) : (r6v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:java.lang.String:0x0022: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r10v0 float))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, float):void (m)] (LINE:13) call: o.wrJ.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, float):void type: THIS */
    public /* synthetic */ C53743wrJ(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 8 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? 0.0f : f);
    }
}

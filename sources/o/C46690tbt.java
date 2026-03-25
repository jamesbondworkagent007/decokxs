package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46690tbt {
    public java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public int copydefault;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46690tbt() {
        this(null, 0, null, null, null, 0, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46690tbt copy$default(C46690tbt c46690tbt, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = c46690tbt.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i = c46690tbt.valueOf;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = c46690tbt.KWHzl;
        }
        java.lang.String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = c46690tbt.AEQbTJ;
        }
        java.lang.String str6 = str3;
        if ((i3 & 16) != 0) {
            str4 = c46690tbt.OLrzqt;
        }
        java.lang.String str7 = str4;
        if ((i3 & 32) != 0) {
            i2 = c46690tbt.copydefault;
        }
        return c46690tbt.KWHzl(str, i4, str5, str6, str7, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46690tbt KWHzl(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C46690tbt(str, i, str2, str3, str4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46690tbt)) {
            return false;
        }
        C46690tbt c46690tbt = (C46690tbt) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c46690tbt.EZpvd) && this.valueOf == c46690tbt.valueOf && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c46690tbt.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46690tbt.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c46690tbt.OLrzqt) && this.copydefault == c46690tbt.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = java.lang.Integer.hashCode(this.valueOf);
        int iHashCode3 = this.KWHzl.hashCode();
        java.lang.String str = this.AEQbTJ;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "IndicatorSettingInfo(indicatorType=" + this.EZpvd + ", timePeriod=" + this.valueOf + ", signalType=" + this.KWHzl + ", condition1=" + this.AEQbTJ + ", condition2=" + this.OLrzqt + ", presetCondition=" + this.copydefault + ")";
    }

    public C46690tbt(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.valueOf = i;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
        this.OLrzqt = str4;
        this.copydefault = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r6v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r7v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r12v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0026: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r11v0 int))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:394) call: o.tbt.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ C46690tbt(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "0" : str, (i3 & 2) != 0 ? 1 : i, (i3 & 4) == 0 ? str2 : "0", (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? 1 : i2);
    }
}

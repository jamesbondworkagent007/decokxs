package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25406iwC {
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Integer copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25406iwC copy$default(C25406iwC c25406iwC, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c25406iwC.KWHzl;
        }
        if ((i & 2) != 0) {
            num = c25406iwC.AEQbTJ;
        }
        if ((i & 4) != 0) {
            num2 = c25406iwC.copydefault;
        }
        if ((i & 8) != 0) {
            str2 = c25406iwC.EZpvd;
        }
        return c25406iwC.copydefault(str, num, num2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25406iwC copydefault(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new C25406iwC(str, num, num2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25406iwC)) {
            return false;
        }
        C25406iwC c25406iwC = (C25406iwC) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c25406iwC.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c25406iwC.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c25406iwC.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c25406iwC.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.AEQbTJ;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FilterChipItem(iconUrl=" + this.KWHzl + ", drawable=" + this.AEQbTJ + ", fallbackDrawable=" + this.copydefault + ", title=" + this.EZpvd + ")";
    }

    public C25406iwC(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.AEQbTJ = num;
        this.copydefault = num2;
        this.EZpvd = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (r5v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String):void (m)] (LINE:184) call: o.iwC.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ C25406iwC(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, str2);
    }
}

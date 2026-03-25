package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hxf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23408hxf {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.Integer djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23408hxf copy$default(C23408hxf c23408hxf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, boolean z, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c23408hxf.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c23408hxf.AYXKKw;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c23408hxf.KWHzl;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            num = c23408hxf.djBIcL;
        }
        java.lang.Integer num2 = num;
        if ((i & 16) != 0) {
            z = c23408hxf.EZpvd;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str4 = c23408hxf.OLrzqt;
        }
        java.lang.String str8 = str4;
        if ((i & 64) != 0) {
            str5 = c23408hxf.copydefault;
        }
        return c23408hxf.KWHzl(str, str6, str7, num2, z2, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23408hxf KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @androidx.annotation.DrawableRes java.lang.Integer num, boolean z, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C23408hxf(str, str2, str3, num, z, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23408hxf)) {
            return false;
        }
        C23408hxf c23408hxf = (C23408hxf) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c23408hxf.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c23408hxf.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c23408hxf.KWHzl) && Intrinsics.EZpvd(this.djBIcL, c23408hxf.djBIcL) && this.EZpvd == c23408hxf.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c23408hxf.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c23408hxf.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.AYXKKw.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        java.lang.Integer num = this.djBIcL;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChainItem(chainId=" + this.AEQbTJ + ", title=" + this.AYXKKw + ", logoUrl=" + this.KWHzl + ", staticIcon=" + this.djBIcL + ", isSelected=" + this.EZpvd + ", searchTerm=" + this.OLrzqt + ", accessibilityId=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.EZpvd;
    }

    public C23408hxf(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @androidx.annotation.DrawableRes java.lang.Integer num, boolean z, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AEQbTJ = str;
        this.AYXKKw = str2;
        this.KWHzl = str3;
        this.djBIcL = num;
        this.EZpvd = z;
        this.OLrzqt = str4;
        this.copydefault = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, java.lang.String, java.lang.String):void (m)] (LINE:313) call: o.hxf.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C23408hxf(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, boolean z, java.lang.String str4, java.lang.String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5);
    }
}

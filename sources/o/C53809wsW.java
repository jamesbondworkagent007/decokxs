package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53809wsW {
    public final android.os.Parcelable AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C53809wsW() {
        this(null, false, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C53809wsW copy$default(C53809wsW c53809wsW, java.lang.String str, boolean z, java.lang.String str2, android.os.Parcelable parcelable, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c53809wsW.copydefault;
        }
        if ((i & 2) != 0) {
            z = c53809wsW.OLrzqt;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = c53809wsW.KWHzl;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            parcelable = c53809wsW.AEQbTJ;
        }
        android.os.Parcelable parcelable2 = parcelable;
        if ((i & 16) != 0) {
            str3 = c53809wsW.AhwBna;
        }
        java.lang.String str6 = str3;
        if ((i & 32) != 0) {
            str4 = c53809wsW.EZpvd;
        }
        return c53809wsW.AEQbTJ(str, z2, str5, parcelable2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53809wsW AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, android.os.Parcelable parcelable, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C53809wsW(str, z, str2, parcelable, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
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
        if (!(obj instanceof C53809wsW)) {
            return false;
        }
        C53809wsW c53809wsW = (C53809wsW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c53809wsW.copydefault) && this.OLrzqt == c53809wsW.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c53809wsW.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c53809wsW.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c53809wsW.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c53809wsW.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
        int iHashCode3 = this.KWHzl.hashCode();
        android.os.Parcelable parcelable = this.AEQbTJ;
        int iHashCode4 = parcelable == null ? 0 : parcelable.hashCode();
        java.lang.String str = this.AhwBna;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MoreOperatorItemBean(buttonType=" + this.copydefault + ", isEnable=" + this.OLrzqt + ", desc=" + this.KWHzl + ", extras=" + this.AEQbTJ + ", state=" + this.AhwBna + ", buttonText=" + this.EZpvd + ")";
    }

    public C53809wsW(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, android.os.Parcelable parcelable, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.OLrzqt = z;
        this.KWHzl = str2;
        this.AEQbTJ = parcelable;
        this.AhwBna = str3;
        this.EZpvd = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:boolean:0x000e: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r6v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:android.os.Parcelable:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.os.Parcelable) : (r8v0 android.os.Parcelable))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
 A[MD:(java.lang.String, boolean, java.lang.String, android.os.Parcelable, java.lang.String, java.lang.String):void (m)] (LINE:6) call: o.wsW.<init>(java.lang.String, boolean, java.lang.String, android.os.Parcelable, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C53809wsW(java.lang.String str, boolean z, java.lang.String str2, android.os.Parcelable parcelable, java.lang.String str3, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : parcelable, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }

    public final boolean AEQbTJ() {
        return !this.OLrzqt && C33129mqd.OLrzqt((java.lang.CharSequence) this.KWHzl);
    }
}

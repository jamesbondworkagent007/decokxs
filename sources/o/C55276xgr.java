package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55276xgr {
    public boolean AEQbTJ;
    public boolean AYXKKw;
    public final java.lang.CharSequence EZpvd;
    public java.lang.Object KWHzl;
    public final java.lang.Object OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.CharSequence gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C55276xgr copy$default(C55276xgr c55276xgr, java.lang.CharSequence charSequence, java.lang.Object obj, java.lang.CharSequence charSequence2, boolean z, boolean z2, java.lang.Object obj2, java.lang.String str, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            charSequence = c55276xgr.gEmmrt;
        }
        if ((i & 2) != 0) {
            obj = c55276xgr.OLrzqt;
        }
        java.lang.Object obj4 = obj;
        if ((i & 4) != 0) {
            charSequence2 = c55276xgr.EZpvd;
        }
        java.lang.CharSequence charSequence3 = charSequence2;
        if ((i & 8) != 0) {
            z = c55276xgr.AYXKKw;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = c55276xgr.AEQbTJ;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            obj2 = c55276xgr.KWHzl;
        }
        java.lang.Object obj5 = obj2;
        if ((i & 64) != 0) {
            str = c55276xgr.copydefault;
        }
        return c55276xgr.AEQbTJ(charSequence, obj4, charSequence3, z3, z4, obj5, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55276xgr AEQbTJ(@NotNull java.lang.CharSequence charSequence, java.lang.Object obj, @NotNull java.lang.CharSequence charSequence2, boolean z, boolean z2, java.lang.Object obj2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        return new C55276xgr(charSequence, obj, charSequence2, z, z2, obj2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55276xgr)) {
            return false;
        }
        C55276xgr c55276xgr = (C55276xgr) obj;
        return Intrinsics.EZpvd(this.gEmmrt, c55276xgr.gEmmrt) && Intrinsics.EZpvd(this.OLrzqt, c55276xgr.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c55276xgr.EZpvd) && this.AYXKKw == c55276xgr.AYXKKw && this.AEQbTJ == c55276xgr.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, c55276xgr.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c55276xgr.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        java.lang.Object obj = this.OLrzqt;
        int iHashCode2 = obj == null ? 0 : obj.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.AYXKKw);
        int iHashCode5 = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.lang.Object obj2 = this.KWHzl;
        int iHashCode6 = obj2 == null ? 0 : obj2.hashCode();
        java.lang.String str = this.copydefault;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.CharSequence charSequence = this.gEmmrt;
        java.lang.Object obj = this.OLrzqt;
        java.lang.CharSequence charSequence2 = this.EZpvd;
        return "SelectionData(title=" + ((java.lang.Object) charSequence) + ", data=" + obj + ", description=" + ((java.lang.Object) charSequence2) + ", selected=" + this.AYXKKw + ", isSelectable=" + this.AEQbTJ + ", imageInfo=" + this.KWHzl + ", contentDescription=" + this.copydefault + ")";
    }

    public C55276xgr(@NotNull java.lang.CharSequence charSequence, java.lang.Object obj, @NotNull java.lang.CharSequence charSequence2, boolean z, boolean z2, java.lang.Object obj2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.gEmmrt = charSequence;
        this.OLrzqt = obj;
        this.EZpvd = charSequence2;
        this.AYXKKw = z;
        this.AEQbTJ = z2;
        this.KWHzl = obj2;
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r8v0 java.lang.CharSequence)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r9v0 java.lang.Object))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0008: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.CharSequence))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r15v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x001e: ARITH (r15v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r13v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r15v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.CharSequence, java.lang.Object, java.lang.CharSequence, boolean, boolean, java.lang.Object, java.lang.String):void (m)] (LINE:11) call: o.xgr.<init>(java.lang.CharSequence, java.lang.Object, java.lang.CharSequence, boolean, boolean, java.lang.Object, java.lang.String):void type: THIS */
    public /* synthetic */ C55276xgr(java.lang.CharSequence charSequence, java.lang.Object obj, java.lang.CharSequence charSequence2, boolean z, boolean z2, java.lang.Object obj2, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? "" : charSequence2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : obj2, (i & 64) == 0 ? str : null);
    }
}

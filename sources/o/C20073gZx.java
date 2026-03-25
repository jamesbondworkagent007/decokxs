package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20073gZx<T> {
    public final boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final T copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.gZx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C20073gZx copy$default(C20073gZx c20073gZx, java.lang.String str, boolean z, java.lang.Object obj, boolean z2, boolean z3, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = c20073gZx.EZpvd;
        }
        if ((i & 2) != 0) {
            z = c20073gZx.OLrzqt;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            obj = c20073gZx.copydefault;
        }
        java.lang.Object obj3 = obj;
        if ((i & 8) != 0) {
            z2 = c20073gZx.AEQbTJ;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = c20073gZx.KWHzl;
        }
        return c20073gZx.OLrzqt(str, z4, obj3, z5, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C20073gZx<T> OLrzqt(@NotNull java.lang.String str, boolean z, T t, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C20073gZx<>(str, z, t, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20073gZx)) {
            return false;
        }
        C20073gZx c20073gZx = (C20073gZx) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c20073gZx.EZpvd) && this.OLrzqt == c20073gZx.OLrzqt && Intrinsics.EZpvd(this.copydefault, c20073gZx.copydefault) && this.AEQbTJ == c20073gZx.AEQbTJ && this.KWHzl == c20073gZx.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
        T t = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (t == null ? 0 : t.hashCode())) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SingleSelectionFilterItemData(text=" + this.EZpvd + ", selected=" + this.OLrzqt + ", originData=" + this.copydefault + ", enabled=" + this.AEQbTJ + ", isAllItem=" + this.KWHzl + ")";
    }

    public C20073gZx(@NotNull java.lang.String str, boolean z, T t, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.OLrzqt = z;
        this.copydefault = t;
        this.AEQbTJ = z2;
        this.KWHzl = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 boolean)
  (r9v0 java.lang.Object)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(java.lang.String, boolean, T, boolean, boolean):void (m)] (LINE:8) call: o.gZx.<init>(java.lang.String, boolean, java.lang.Object, boolean, boolean):void type: THIS */
    public /* synthetic */ C20073gZx(java.lang.String str, boolean z, java.lang.Object obj, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, obj, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3);
    }
}

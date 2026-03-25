package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25482ixZ {
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25482ixZ copy$default(C25482ixZ c25482ixZ, boolean z, java.lang.String str, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c25482ixZ.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c25482ixZ.copydefault;
        }
        if ((i & 4) != 0) {
            z2 = c25482ixZ.KWHzl;
        }
        return c25482ixZ.OLrzqt(z, str, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25482ixZ OLrzqt(boolean z, @NotNull java.lang.String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C25482ixZ(z, str, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25482ixZ)) {
            return false;
        }
        C25482ixZ c25482ixZ = (C25482ixZ) obj;
        return this.OLrzqt == c25482ixZ.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c25482ixZ.copydefault) && this.KWHzl == c25482ixZ.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestInputCurrencyUIBean(isInit=" + this.OLrzqt + ", coinCurrency=" + this.copydefault + ", isDataErro=" + this.KWHzl + ")";
    }

    public C25482ixZ(boolean z, @NotNull java.lang.String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = z;
        this.copydefault = str;
        this.KWHzl = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(boolean, java.lang.String, boolean):void (m)] (LINE:277) call: o.ixZ.<init>(boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C25482ixZ(boolean z, java.lang.String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? false : z2);
    }
}

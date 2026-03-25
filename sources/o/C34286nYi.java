package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nYi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34286nYi {
    public final int EZpvd;
    public final int KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34286nYi copy$default(C34286nYi c34286nYi, int i, java.lang.String str, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c34286nYi.EZpvd;
        }
        if ((i3 & 2) != 0) {
            str = c34286nYi.OLrzqt;
        }
        if ((i3 & 4) != 0) {
            i2 = c34286nYi.KWHzl;
        }
        if ((i3 & 8) != 0) {
            z = c34286nYi.copydefault;
        }
        return c34286nYi.OLrzqt(i, str, i2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34286nYi OLrzqt(int i, @NotNull java.lang.String str, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C34286nYi(i, str, i2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34286nYi)) {
            return false;
        }
        C34286nYi c34286nYi = (C34286nYi) obj;
        return this.EZpvd == c34286nYi.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c34286nYi.OLrzqt) && this.KWHzl == c34286nYi.KWHzl && this.copydefault == c34286nYi.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.EZpvd) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PaidListCategoryDisplayModel(categoryId=" + this.EZpvd + ", displayName=" + this.OLrzqt + ", memberCount=" + this.KWHzl + ", isDefault=" + this.copydefault + ")";
    }

    public C34286nYi(int i, @NotNull java.lang.String str, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = i;
        this.OLrzqt = str;
        this.KWHzl = i2;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (r3v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(int, java.lang.String, int, boolean):void (m)] (LINE:3) call: o.nYi.<init>(int, java.lang.String, int, boolean):void type: THIS */
    public /* synthetic */ C34286nYi(int i, java.lang.String str, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, (i3 & 8) != 0 ? false : z);
    }
}

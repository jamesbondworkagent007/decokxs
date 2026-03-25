package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uIm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48195uIm {
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48195uIm copy$default(C48195uIm c48195uIm, int i, java.lang.String str, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c48195uIm.EZpvd;
        }
        if ((i2 & 2) != 0) {
            str = c48195uIm.KWHzl;
        }
        if ((i2 & 4) != 0) {
            z = c48195uIm.copydefault;
        }
        return c48195uIm.copydefault(i, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48195uIm copydefault(@androidx.annotation.StringRes int i, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C48195uIm(i, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48195uIm)) {
            return false;
        }
        C48195uIm c48195uIm = (C48195uIm) obj;
        return this.EZpvd == c48195uIm.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c48195uIm.KWHzl) && this.copydefault == c48195uIm.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.EZpvd) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GridItemData(titleResId=" + this.EZpvd + ", value=" + this.KWHzl + ", isAlignEnd=" + this.copydefault + ")";
    }

    public C48195uIm(@androidx.annotation.StringRes int i, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = i;
        this.KWHzl = str;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(int, java.lang.String, boolean):void (m)] (LINE:300) call: o.uIm.<init>(int, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C48195uIm(int i, java.lang.String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? false : z);
    }
}

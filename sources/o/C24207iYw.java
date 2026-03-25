package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iYw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24207iYw {
    public final int AEQbTJ;
    public final boolean EZpvd;
    public final C27369jtr copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C24207iYw copy$default(C24207iYw c24207iYw, int i, C27369jtr c27369jtr, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c24207iYw.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            c27369jtr = c24207iYw.copydefault;
        }
        if ((i2 & 4) != 0) {
            z = c24207iYw.EZpvd;
        }
        return c24207iYw.KWHzl(i, c27369jtr, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27369jtr EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24207iYw KWHzl(int i, @NotNull C27369jtr c27369jtr, boolean z) {
        Intrinsics.checkNotNullParameter(c27369jtr, "");
        return new C24207iYw(i, c27369jtr, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24207iYw)) {
            return false;
        }
        C24207iYw c24207iYw = (C24207iYw) obj;
        return this.AEQbTJ == c24207iYw.AEQbTJ && Intrinsics.EZpvd(this.copydefault, c24207iYw.copydefault) && this.EZpvd == c24207iYw.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ExpandedProtocol(position=" + this.AEQbTJ + ", details=" + this.copydefault + ", fromCache=" + this.EZpvd + ")";
    }

    public C24207iYw(int i, @NotNull C27369jtr c27369jtr, boolean z) {
        Intrinsics.checkNotNullParameter(c27369jtr, "");
        this.AEQbTJ = i;
        this.copydefault = c27369jtr;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 o.jtr)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(int, o.jtr, boolean):void (m)] (LINE:36) call: o.iYw.<init>(int, o.jtr, boolean):void type: THIS */
    public /* synthetic */ C24207iYw(int i, C27369jtr c27369jtr, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, c27369jtr, (i2 & 4) != 0 ? false : z);
    }
}

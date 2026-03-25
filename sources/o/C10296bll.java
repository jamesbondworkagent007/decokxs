package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10296bll {
    public final int AEQbTJ;
    public final java.util.List<C10303bls> EZpvd;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bll */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C10296bll copy$default(C10296bll c10296bll, java.util.List list, long j, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = c10296bll.EZpvd;
        }
        if ((i2 & 2) != 0) {
            j = c10296bll.copydefault;
        }
        if ((i2 & 4) != 0) {
            i = c10296bll.AEQbTJ;
        }
        return c10296bll.EZpvd(list, j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10303bls> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10296bll EZpvd(@NotNull java.util.List<C10303bls> list, long j, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C10296bll(list, j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10296bll)) {
            return false;
        }
        C10296bll c10296bll = (C10296bll) obj;
        return Intrinsics.EZpvd(this.EZpvd, c10296bll.EZpvd) && this.copydefault == c10296bll.copydefault && this.AEQbTJ == c10296bll.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUtxoListState(items=" + this.EZpvd + ", tokenAmount=" + this.copydefault + ", totalUtxoCount=" + this.AEQbTJ + ")";
    }

    public C10296bll(@NotNull java.util.List<C10303bls> list, long j, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        this.copydefault = j;
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.util.List<o.bls>, long, int):void (m)] (LINE:6) call: o.bll.<init>(java.util.List, long, int):void type: THIS */
    public /* synthetic */ C10296bll(java.util.List list, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i);
    }
}

package o;

import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27315jsq {
    public BigDecimal KWHzl;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27315jsq() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27315jsq copy$default(C27315jsq c27315jsq, BigDecimal bigDecimal, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            bigDecimal = c27315jsq.KWHzl;
        }
        if ((i2 & 2) != 0) {
            i = c27315jsq.OLrzqt;
        }
        return c27315jsq.AEQbTJ(bigDecimal, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27315jsq AEQbTJ(@NotNull BigDecimal bigDecimal, int i) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return new C27315jsq(bigDecimal, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27315jsq)) {
            return false;
        }
        C27315jsq c27315jsq = (C27315jsq) obj;
        return Intrinsics.EZpvd(this.KWHzl, c27315jsq.KWHzl) && this.OLrzqt == c27315jsq.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PriceTick(price=" + this.KWHzl + ", tick=" + this.OLrzqt + ")";
    }

    public C27315jsq(@NotNull BigDecimal bigDecimal, int i) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.KWHzl = bigDecimal;
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.math.BigDecimal:0x0004: SGET  A[WRAPPED] (LINE:34) java.math.BigDecimal.ZERO java.math.BigDecimal) : (r1v0 java.math.BigDecimal))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.math.BigDecimal, int):void (m)] (LINE:33) call: o.jsq.<init>(java.math.BigDecimal, int):void type: THIS */
    public /* synthetic */ C27315jsq(BigDecimal bigDecimal, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? BigDecimal.ZERO : bigDecimal, (i2 & 2) != 0 ? 0 : i);
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.thi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46997thi {
    public final int AEQbTJ;
    public final byte[] KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46997thi() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46997thi copy$default(C46997thi c46997thi, int i, byte[] bArr, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c46997thi.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            bArr = c46997thi.KWHzl;
        }
        return c46997thi.OLrzqt(i, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46997thi OLrzqt(int i, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new C46997thi(i, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46997thi)) {
            return false;
        }
        C46997thi c46997thi = (C46997thi) obj;
        return this.AEQbTJ == c46997thi.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, c46997thi.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + java.util.Arrays.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CvRelatedParams(cv=" + this.AEQbTJ + ", cgBytes=" + java.util.Arrays.toString(this.KWHzl) + ")";
    }

    public C46997thi(int i, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AEQbTJ = i;
        this.KWHzl = bArr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:byte[]:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:byte[]:0x000a: NEW_ARRAY (0 int) A[WRAPPED] type: byte[]) : (r3v0 byte[]))
 A[MD:(int, byte[]):void (m)] (LINE:79) call: o.thi.<init>(int, byte[]):void type: THIS */
    public /* synthetic */ C46997thi(int i, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new byte[0] : bArr);
    }
}

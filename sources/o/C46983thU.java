package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.thU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46983thU {
    public final byte[] AEQbTJ;
    public final java.lang.String EZpvd;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46983thU() {
        this(0, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46983thU copy$default(C46983thU c46983thU, int i, java.lang.String str, byte[] bArr, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c46983thU.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            str = c46983thU.EZpvd;
        }
        if ((i2 & 4) != 0) {
            bArr = c46983thU.AEQbTJ;
        }
        return c46983thU.EZpvd(i, str, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46983thU EZpvd(int i, @NotNull java.lang.String str, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        return new C46983thU(i, str, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46983thU)) {
            return false;
        }
        C46983thU c46983thU = (C46983thU) obj;
        return this.OLrzqt == c46983thU.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c46983thU.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c46983thU.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.EZpvd.hashCode()) * 31) + java.util.Arrays.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PvRelatedParams(pv=" + this.OLrzqt + ", rid=" + this.EZpvd + ", tsBytes=" + java.util.Arrays.toString(this.AEQbTJ) + ")";
    }

    public C46983thU(int i, @NotNull java.lang.String str, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.OLrzqt = i;
        this.EZpvd = str;
        this.AEQbTJ = bArr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:byte[]:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:byte[]:0x0010: NEW_ARRAY (0 int) A[WRAPPED] type: byte[]) : (r4v0 byte[]))
 A[MD:(int, java.lang.String, byte[]):void (m)] (LINE:67) call: o.thU.<init>(int, java.lang.String, byte[]):void type: THIS */
    public /* synthetic */ C46983thU(int i, java.lang.String str, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? new byte[0] : bArr);
    }
}

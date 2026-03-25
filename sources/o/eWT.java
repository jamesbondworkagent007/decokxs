package o;

import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eWT {
    public final BigDecimal AEQbTJ;
    public final BigDecimal KWHzl;
    public final BigDecimal OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ eWT copy$default(eWT ewt, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = ewt.AEQbTJ;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = ewt.OLrzqt;
        }
        if ((i & 4) != 0) {
            bigDecimal3 = ewt.KWHzl;
        }
        if ((i & 8) != 0) {
            str = ewt.copydefault;
        }
        return ewt.copydefault(bigDecimal, bigDecimal2, bigDecimal3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final eWT copydefault(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new eWT(bigDecimal, bigDecimal2, bigDecimal3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eWT)) {
            return false;
        }
        eWT ewt = (eWT) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, ewt.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, ewt.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, ewt.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ewt.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BigDecimal bigDecimal = this.AEQbTJ;
        int iHashCode = bigDecimal == null ? 0 : bigDecimal.hashCode();
        BigDecimal bigDecimal2 = this.OLrzqt;
        int iHashCode2 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
        BigDecimal bigDecimal3 = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProfileAllocationDetails(cryptoTotal=" + this.AEQbTJ + ", defiTotal=" + this.OLrzqt + ", nftTotal=" + this.KWHzl + ", total=" + this.copydefault + ")";
    }

    public eWT(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = bigDecimal;
        this.OLrzqt = bigDecimal2;
        this.KWHzl = bigDecimal3;
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r2v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r3v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigDecimal) : (r4v0 java.math.BigDecimal))
  (r5v0 java.lang.String)
 A[MD:(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String):void (m)] (LINE:5) call: o.eWT.<init>(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String):void type: THIS */
    public /* synthetic */ eWT(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? null : bigDecimal2, (i & 4) != 0 ? null : bigDecimal3, str);
    }
}

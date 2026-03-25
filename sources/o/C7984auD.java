package o;

import com.ionspin.kotlin.bignum.decimal.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.auD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7984auD {
    public final RoundingMode AEQbTJ;
    public final boolean OLrzqt;
    public final long copydefault;
    public final boolean djBIcL;
    public final long gEmmrt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final C7984auD KWHzl = new C7984auD(0, null, 0, 7, null);
    public static final C7984auD EZpvd = new C7984auD(30, RoundingMode.ROUND_HALF_AWAY_FROM_ZERO, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7984auD() {
        this(0L, null, 0L, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C7984auD copy$default(C7984auD c7984auD, long j, RoundingMode roundingMode, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c7984auD.copydefault;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            roundingMode = c7984auD.AEQbTJ;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            j2 = c7984auD.gEmmrt;
        }
        return c7984auD.copydefault(j3, roundingMode2, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RoundingMode EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7984auD copydefault(long j, @NotNull RoundingMode roundingMode, long j2) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return new C7984auD(j, roundingMode, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7984auD)) {
            return false;
        }
        C7984auD c7984auD = (C7984auD) obj;
        return this.copydefault == c7984auD.copydefault && this.AEQbTJ == c7984auD.AEQbTJ && this.gEmmrt == c7984auD.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Long.hashCode(this.copydefault) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Long.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DecimalMode(decimalPrecision=" + this.copydefault + ", roundingMode=" + this.AEQbTJ + ", scale=" + this.gEmmrt + ')';
    }

    public C7984auD(long j, @NotNull RoundingMode roundingMode, long j2) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        this.copydefault = j;
        this.AEQbTJ = roundingMode;
        this.gEmmrt = j2;
        this.OLrzqt = j == 0;
        boolean z = j2 >= 0;
        this.djBIcL = z;
        if (!z && j == 0 && roundingMode != RoundingMode.NONE) {
            throw new java.lang.ArithmeticException("Rounding mode with 0 digits precision.");
        }
        if (j2 < -1) {
            throw new java.lang.ArithmeticException("Negative Scale is unsupported.");
        }
        if (z && roundingMode == RoundingMode.NONE) {
            throw new java.lang.ArithmeticException("Scale of " + j2 + " digits to the right of the decimal requires a RoundingMode that is not NONE.");
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r7v0 long))
  (wrap:com.ionspin.kotlin.bignum.decimal.RoundingMode:0x000d: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.ionspin.kotlin.bignum.decimal.RoundingMode:0x000b: SGET  A[WRAPPED] (LINE:88) com.ionspin.kotlin.bignum.decimal.RoundingMode.NONE com.ionspin.kotlin.bignum.decimal.RoundingMode) : (r9v0 com.ionspin.kotlin.bignum.decimal.RoundingMode))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r10v0 long))
 A[MD:(long, com.ionspin.kotlin.bignum.decimal.RoundingMode, long):void (m)] (LINE:86) call: o.auD.<init>(long, com.ionspin.kotlin.bignum.decimal.RoundingMode, long):void type: THIS */
    public /* synthetic */ C7984auD(long j, RoundingMode roundingMode, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? RoundingMode.NONE : roundingMode, (i & 4) != 0 ? -1L : j2);
    }

    /* JADX INFO: renamed from: o.auD$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.auD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C7984auD OLrzqt() {
            return C7984auD.KWHzl;
        }
    }
}

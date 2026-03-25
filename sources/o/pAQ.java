package o;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pAQ {
    public double AEQbTJ;
    public double EZpvd;
    public float KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public pAQ() {
        this(null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 0.0f, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(double d) {
        this.AEQbTJ = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pAQ KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, double d, @NotNull java.lang.String str3, double d2, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new pAQ(str, str2, d, str3, d2, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(double d) {
        this.EZpvd = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(float f) {
        this.KWHzl = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pAQ)) {
            return false;
        }
        pAQ paq = (pAQ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) paq.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) paq.djBIcL) && java.lang.Double.compare(this.EZpvd, paq.EZpvd) == 0 && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) paq.copydefault) && java.lang.Double.compare(this.AEQbTJ, paq.AEQbTJ) == 0 && java.lang.Float.compare(this.KWHzl, paq.KWHzl) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.OLrzqt.hashCode() * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Double.hashCode(this.EZpvd)) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Double.hashCode(this.AEQbTJ)) * 31) + java.lang.Float.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradeDepthItem(price=" + this.OLrzqt + ", unFormatPrice=" + this.djBIcL + ", originPrice=" + this.EZpvd + ", amount=" + this.copydefault + ", originAmount=" + this.AEQbTJ + ", totalAmount=" + this.KWHzl + ")";
    }

    public pAQ(@NotNull java.lang.String str, @NotNull java.lang.String str2, double d, @NotNull java.lang.String str3, double d2, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.djBIcL = str2;
        this.EZpvd = d;
        this.copydefault = str3;
        this.AEQbTJ = d2;
        this.KWHzl = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0010: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r11v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r17v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (""))
  (wrap:double:?: TERNARY null = ((wrap:int:0x001f: ARITH (r17v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 double) : (wrap:double:0x0012: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0025: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r16v0 float))
 A[MD:(java.lang.String, java.lang.String, double, java.lang.String, double, float):void (m)] (LINE:15) call: o.pAQ.<init>(java.lang.String, java.lang.String, double, java.lang.String, double, float):void type: THIS */
    public /* synthetic */ pAQ(java.lang.String str, java.lang.String str2, double d, java.lang.String str3, double d2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) == 0 ? str3 : "", (i & 16) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE, (i & 32) != 0 ? 0.0f : f);
    }
}

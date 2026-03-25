package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.compliance.BlurDecision;
import uniffi.compliance.BlurType;

/* JADX INFO: renamed from: o.AwJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3982AwJ {
    public static final int $stable = 8;
    public BlurDecision AEQbTJ;
    public C3978AwF AhwBna;
    public double EZpvd;
    public double KWHzl;
    public BlurType OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlurDecision EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3982AwJ OLrzqt(double d, @NotNull BlurDecision blurDecision, @NotNull BlurType blurType, double d2, @NotNull C3978AwF c3978AwF, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(blurDecision, "");
        Intrinsics.checkNotNullParameter(blurType, "");
        Intrinsics.checkNotNullParameter(c3978AwF, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C3982AwJ(d, blurDecision, blurType, d2, c3978AwF, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlurType copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3982AwJ)) {
            return false;
        }
        C3982AwJ c3982AwJ = (C3982AwJ) obj;
        return java.lang.Double.compare(this.KWHzl, c3982AwJ.KWHzl) == 0 && this.AEQbTJ == c3982AwJ.AEQbTJ && this.OLrzqt == c3982AwJ.OLrzqt && java.lang.Double.compare(this.EZpvd, c3982AwJ.EZpvd) == 0 && Intrinsics.EZpvd(this.AhwBna, c3982AwJ.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3982AwJ.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3978AwF gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((java.lang.Double.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Double.hashCode(this.EZpvd)) * 31) + this.AhwBna.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FusionBlurResult(fusionScore=" + this.KWHzl + ", decision=" + this.AEQbTJ + ", blurType=" + this.OLrzqt + ", confidence=" + this.EZpvd + ", methodScores=" + this.AhwBna + ", message=" + this.copydefault + ")";
    }

    public C3982AwJ(double d, @NotNull BlurDecision blurDecision, @NotNull BlurType blurType, double d2, @NotNull C3978AwF c3978AwF, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(blurDecision, "");
        Intrinsics.checkNotNullParameter(blurType, "");
        Intrinsics.checkNotNullParameter(c3978AwF, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = d;
        this.AEQbTJ = blurDecision;
        this.OLrzqt = blurType;
        this.EZpvd = d2;
        this.AhwBna = c3978AwF;
        this.copydefault = str;
    }
}

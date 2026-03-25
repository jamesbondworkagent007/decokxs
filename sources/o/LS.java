package o;

import com.amplitude.experiment.VariantSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LS {
    public final boolean AEQbTJ;
    public final VariantSource EZpvd;
    public final LP OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LS() {
        this(null, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LS copy$default(LS ls, LP lp, VariantSource variantSource, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            lp = ls.OLrzqt;
        }
        if ((i & 2) != 0) {
            variantSource = ls.EZpvd;
        }
        if ((i & 4) != 0) {
            z = ls.AEQbTJ;
        }
        return ls.AEQbTJ(lp, variantSource, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LS AEQbTJ(@NotNull LP lp, @NotNull VariantSource variantSource, boolean z) {
        Intrinsics.checkNotNullParameter(lp, "");
        Intrinsics.checkNotNullParameter(variantSource, "");
        return new LS(lp, variantSource, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LP OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VariantSource copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LS)) {
            return false;
        }
        LS ls = (LS) obj;
        return Intrinsics.EZpvd(this.OLrzqt, ls.OLrzqt) && this.EZpvd == ls.EZpvd && this.AEQbTJ == ls.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        boolean z = this.AEQbTJ;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + r2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "VariantAndSource(variant=" + this.OLrzqt + ", source=" + this.EZpvd + ", hasDefaultVariant=" + this.AEQbTJ + ')';
    }

    public LS(@NotNull LP lp, @NotNull VariantSource variantSource, boolean z) {
        Intrinsics.checkNotNullParameter(lp, "");
        Intrinsics.checkNotNullParameter(variantSource, "");
        this.OLrzqt = lp;
        this.EZpvd = variantSource;
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:o.LP:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.LP:0x000f: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.Object)
  (null java.lang.String)
  (null java.lang.String)
  (null java.util.Map)
  (31 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:752) call: o.LP.<init>(java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 o.LP))
  (wrap:com.amplitude.experiment.VariantSource:?: TERNARY null = ((wrap:int:0x0012: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.amplitude.experiment.VariantSource:0x0016: SGET  A[WRAPPED] (LINE:753) com.amplitude.experiment.VariantSource.FALLBACK_CONFIG com.amplitude.experiment.VariantSource) : (r10v0 com.amplitude.experiment.VariantSource))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(o.LP, com.amplitude.experiment.VariantSource, boolean):void (m)] (LINE:751) call: o.LS.<init>(o.LP, com.amplitude.experiment.VariantSource, boolean):void type: THIS */
    public /* synthetic */ LS(LP lp, VariantSource variantSource, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LP(null, null, null, null, null, 31, null) : lp, (i & 2) != 0 ? VariantSource.FALLBACK_CONFIG : variantSource, (i & 4) != 0 ? false : z);
    }
}

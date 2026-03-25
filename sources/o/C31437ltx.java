package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ltx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C31437ltx {
    public final C31392ltE AEQbTJ;
    public final C31392ltE EZpvd;
    public final C31439ltz KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31437ltx copy$default(C31437ltx c31437ltx, C31392ltE c31392ltE, C31392ltE c31392ltE2, C31439ltz c31439ltz, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c31392ltE = c31437ltx.EZpvd;
        }
        if ((i & 2) != 0) {
            c31392ltE2 = c31437ltx.AEQbTJ;
        }
        if ((i & 4) != 0) {
            c31439ltz = c31437ltx.KWHzl;
        }
        return c31437ltx.OLrzqt(c31392ltE, c31392ltE2, c31439ltz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31439ltz AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31392ltE OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31437ltx OLrzqt(@NotNull C31392ltE c31392ltE, @NotNull C31392ltE c31392ltE2, C31439ltz c31439ltz) {
        Intrinsics.checkNotNullParameter(c31392ltE, "");
        Intrinsics.checkNotNullParameter(c31392ltE2, "");
        return new C31437ltx(c31392ltE, c31392ltE2, c31439ltz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31392ltE copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31437ltx)) {
            return false;
        }
        C31437ltx c31437ltx = (C31437ltx) obj;
        return Intrinsics.EZpvd(this.EZpvd, c31437ltx.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c31437ltx.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c31437ltx.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        C31439ltz c31439ltz = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c31439ltz == null ? 0 : c31439ltz.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CryptoFiatSelectionConfig(topRow=" + this.EZpvd + ", bottomRow=" + this.AEQbTJ + ", middleImageConfig=" + this.KWHzl + ")";
    }

    public C31437ltx(@NotNull C31392ltE c31392ltE, @NotNull C31392ltE c31392ltE2, C31439ltz c31439ltz) {
        Intrinsics.checkNotNullParameter(c31392ltE, "");
        Intrinsics.checkNotNullParameter(c31392ltE2, "");
        this.EZpvd = c31392ltE;
        this.AEQbTJ = c31392ltE2;
        this.KWHzl = c31439ltz;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.ltE)
  (r2v0 o.ltE)
  (wrap:o.ltz:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.ltz) : (r3v0 o.ltz))
 A[MD:(o.ltE, o.ltE, o.ltz):void (m)] (LINE:3) call: o.ltx.<init>(o.ltE, o.ltE, o.ltz):void type: THIS */
    public /* synthetic */ C31437ltx(C31392ltE c31392ltE, C31392ltE c31392ltE2, C31439ltz c31439ltz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c31392ltE, c31392ltE2, (i & 4) != 0 ? null : c31439ltz);
    }
}

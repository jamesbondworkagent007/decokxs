package o;

import com.okinc.business.market.features.filter.domain.TokenFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jUV {
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final TokenFilter OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jUV copy$default(jUV juv, TokenFilter tokenFilter, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tokenFilter = juv.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = juv.EZpvd;
        }
        if ((i & 4) != 0) {
            z2 = juv.KWHzl;
        }
        return juv.KWHzl(tokenFilter, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jUV KWHzl(@NotNull TokenFilter tokenFilter, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        return new jUV(tokenFilter, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jUV)) {
            return false;
        }
        jUV juv = (jUV) obj;
        return Intrinsics.EZpvd(this.OLrzqt, juv.OLrzqt) && this.EZpvd == juv.EZpvd && this.KWHzl == juv.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FilterUiState(filter=" + this.OLrzqt + ", canApply=" + this.EZpvd + ", canReset=" + this.KWHzl + ")";
    }

    public jUV(@NotNull TokenFilter tokenFilter, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        this.OLrzqt = tokenFilter;
        this.EZpvd = z;
        this.KWHzl = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.business.market.features.filter.domain.TokenFilter)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(com.okinc.business.market.features.filter.domain.TokenFilter, boolean, boolean):void (m)] (LINE:5) call: o.jUV.<init>(com.okinc.business.market.features.filter.domain.TokenFilter, boolean, boolean):void type: THIS */
    public /* synthetic */ jUV(TokenFilter tokenFilter, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenFilter, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}

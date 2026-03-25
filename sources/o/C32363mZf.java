package o;

import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mZf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32363mZf {
    public final boolean AEQbTJ;
    public final boolean KWHzl;
    public final TokenFilter OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C32363mZf copy$default(C32363mZf c32363mZf, TokenFilter tokenFilter, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tokenFilter = c32363mZf.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c32363mZf.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z2 = c32363mZf.KWHzl;
        }
        return c32363mZf.KWHzl(tokenFilter, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32363mZf KWHzl(@NotNull TokenFilter tokenFilter, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        return new C32363mZf(tokenFilter, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32363mZf)) {
            return false;
        }
        C32363mZf c32363mZf = (C32363mZf) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c32363mZf.OLrzqt) && this.AEQbTJ == c32363mZf.AEQbTJ && this.KWHzl == c32363mZf.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FilterUiState(filter=" + this.OLrzqt + ", canApply=" + this.AEQbTJ + ", canReset=" + this.KWHzl + ")";
    }

    public C32363mZf(@NotNull TokenFilter tokenFilter, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        this.OLrzqt = tokenFilter;
        this.AEQbTJ = z;
        this.KWHzl = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.dexkline.market.features.filter.domain.TokenFilter)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(com.okinc.dexkline.market.features.filter.domain.TokenFilter, boolean, boolean):void (m)] (LINE:5) call: o.mZf.<init>(com.okinc.dexkline.market.features.filter.domain.TokenFilter, boolean, boolean):void type: THIS */
    public /* synthetic */ C32363mZf(TokenFilter tokenFilter, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenFilter, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}

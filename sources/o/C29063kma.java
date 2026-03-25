package o;

import com.okinc.business.market.features.overview.domain.Overview;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.kma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29063kma {
    public final Overview KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29063kma() {
        this(false, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C29063kma copy$default(C29063kma c29063kma, boolean z, boolean z2, Overview overview, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c29063kma.OLrzqt;
        }
        if ((i & 2) != 0) {
            z2 = c29063kma.copydefault;
        }
        if ((i & 4) != 0) {
            overview = c29063kma.KWHzl;
        }
        return c29063kma.AEQbTJ(z, z2, overview);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Overview AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29063kma AEQbTJ(boolean z, boolean z2, Overview overview) {
        return new C29063kma(z, z2, overview);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29063kma)) {
            return false;
        }
        C29063kma c29063kma = (C29063kma) obj;
        return this.OLrzqt == c29063kma.OLrzqt && this.copydefault == c29063kma.copydefault && Intrinsics.EZpvd(this.KWHzl, c29063kma.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.OLrzqt);
        int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
        Overview overview = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (overview == null ? 0 : overview.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OverviewUiState(loading=" + this.OLrzqt + ", error=" + this.copydefault + ", successData=" + this.KWHzl + ")";
    }

    public C29063kma(boolean z, boolean z2, Overview overview) {
        this.OLrzqt = z;
        this.copydefault = z2;
        this.KWHzl = overview;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:com.okinc.business.market.features.overview.domain.Overview:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.overview.domain.Overview) : (r4v0 com.okinc.business.market.features.overview.domain.Overview))
 A[MD:(boolean, boolean, com.okinc.business.market.features.overview.domain.Overview):void (m)] (LINE:34) call: o.kma.<init>(boolean, boolean, com.okinc.business.market.features.overview.domain.Overview):void type: THIS */
    public /* synthetic */ C29063kma(boolean z, boolean z2, Overview overview, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : overview);
    }
}

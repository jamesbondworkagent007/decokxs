package o;

import com.okinc.dexkline.market.features.overview.domain.Overview;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.naS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34350naS {
    public final boolean AEQbTJ;
    public final boolean KWHzl;
    public final Overview copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34350naS() {
        this(false, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34350naS copy$default(C34350naS c34350naS, boolean z, boolean z2, Overview overview, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c34350naS.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z2 = c34350naS.KWHzl;
        }
        if ((i & 4) != 0) {
            overview = c34350naS.copydefault;
        }
        return c34350naS.EZpvd(z, z2, overview);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Overview EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34350naS EZpvd(boolean z, boolean z2, Overview overview) {
        return new C34350naS(z, z2, overview);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34350naS)) {
            return false;
        }
        C34350naS c34350naS = (C34350naS) obj;
        return this.AEQbTJ == c34350naS.AEQbTJ && this.KWHzl == c34350naS.KWHzl && Intrinsics.EZpvd(this.copydefault, c34350naS.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode2 = java.lang.Boolean.hashCode(this.KWHzl);
        Overview overview = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (overview == null ? 0 : overview.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OverviewUiState(loading=" + this.AEQbTJ + ", error=" + this.KWHzl + ", successData=" + this.copydefault + ")";
    }

    public C34350naS(boolean z, boolean z2, Overview overview) {
        this.AEQbTJ = z;
        this.KWHzl = z2;
        this.copydefault = overview;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:com.okinc.dexkline.market.features.overview.domain.Overview:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.features.overview.domain.Overview) : (r4v0 com.okinc.dexkline.market.features.overview.domain.Overview))
 A[MD:(boolean, boolean, com.okinc.dexkline.market.features.overview.domain.Overview):void (m)] (LINE:23) call: o.naS.<init>(boolean, boolean, com.okinc.dexkline.market.features.overview.domain.Overview):void type: THIS */
    public /* synthetic */ C34350naS(boolean z, boolean z2, Overview overview, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : overview);
    }
}

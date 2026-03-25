package o;

import com.okinc.planet.domain.remote.dto.PublisherTokenInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.tww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47802tww {
    public final java.util.List<PublisherTokenInfo> AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47802tww() {
        this(null, false, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tww */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47802tww copy$default(C47802tww c47802tww, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c47802tww.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c47802tww.KWHzl;
        }
        if ((i & 4) != 0) {
            z2 = c47802tww.EZpvd;
        }
        return c47802tww.KWHzl(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47802tww KWHzl(java.util.List<PublisherTokenInfo> list, boolean z, boolean z2) {
        return new C47802tww(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PublisherTokenInfo> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47802tww)) {
            return false;
        }
        C47802tww c47802tww = (C47802tww) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c47802tww.AEQbTJ) && this.KWHzl == c47802tww.KWHzl && this.EZpvd == c47802tww.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<PublisherTokenInfo> list = this.AEQbTJ;
        return ((((list == null ? 0 : list.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenUiState(data=" + this.AEQbTJ + ", isLoading=" + this.KWHzl + ", networkError=" + this.EZpvd + ")";
    }

    public C47802tww(java.util.List<PublisherTokenInfo> list, boolean z, boolean z2) {
        this.AEQbTJ = list;
        this.KWHzl = z;
        this.EZpvd = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.util.List<com.okinc.planet.domain.remote.dto.PublisherTokenInfo>, boolean, boolean):void (m)] (LINE:1321) call: o.tww.<init>(java.util.List, boolean, boolean):void type: THIS */
    public /* synthetic */ C47802tww(java.util.List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}

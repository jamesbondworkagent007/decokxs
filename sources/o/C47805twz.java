package o;

import com.okinc.planet.domain.remote.dto.PublisherTopicInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.twz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47805twz {
    public final boolean AEQbTJ;
    public final java.util.List<PublisherTopicInfo> EZpvd;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47805twz() {
        this(null, false, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.twz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47805twz copy$default(C47805twz c47805twz, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c47805twz.EZpvd;
        }
        if ((i & 2) != 0) {
            z = c47805twz.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z2 = c47805twz.OLrzqt;
        }
        return c47805twz.copydefault(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PublisherTopicInfo> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47805twz copydefault(java.util.List<PublisherTopicInfo> list, boolean z, boolean z2) {
        return new C47805twz(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47805twz)) {
            return false;
        }
        C47805twz c47805twz = (C47805twz) obj;
        return Intrinsics.EZpvd(this.EZpvd, c47805twz.EZpvd) && this.AEQbTJ == c47805twz.AEQbTJ && this.OLrzqt == c47805twz.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<PublisherTopicInfo> list = this.EZpvd;
        return ((((list == null ? 0 : list.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TopicUiState(data=" + this.EZpvd + ", isLoading=" + this.AEQbTJ + ", networkError=" + this.OLrzqt + ")";
    }

    public C47805twz(java.util.List<PublisherTopicInfo> list, boolean z, boolean z2) {
        this.EZpvd = list;
        this.AEQbTJ = z;
        this.OLrzqt = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.util.List<com.okinc.planet.domain.remote.dto.PublisherTopicInfo>, boolean, boolean):void (m)] (LINE:1327) call: o.twz.<init>(java.util.List, boolean, boolean):void type: THIS */
    public /* synthetic */ C47805twz(java.util.List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}

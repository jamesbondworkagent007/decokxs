package o;

import com.okinc.planet.domain.remote.dto.PublisherTokenInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tsY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47566tsY {
    public final java.util.List<PublisherTokenInfo> KWHzl;
    public final java.util.List<PublisherTokenInfo> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47566tsY() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tsY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47566tsY copy$default(C47566tsY c47566tsY, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c47566tsY.OLrzqt;
        }
        if ((i & 2) != 0) {
            list2 = c47566tsY.KWHzl;
        }
        return c47566tsY.copydefault(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PublisherTokenInfo> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PublisherTokenInfo> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47566tsY copydefault(@NotNull java.util.List<PublisherTokenInfo> list, @NotNull java.util.List<PublisherTokenInfo> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C47566tsY(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47566tsY)) {
            return false;
        }
        C47566tsY c47566tsY = (C47566tsY) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c47566tsY.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c47566tsY.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenUiState(allTokens=" + this.OLrzqt + ", filtered=" + this.KWHzl + ")";
    }

    public C47566tsY(@NotNull java.util.List<PublisherTokenInfo> list, @NotNull java.util.List<PublisherTokenInfo> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.OLrzqt = list;
        this.KWHzl = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:50)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:51)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.planet.domain.remote.dto.PublisherTokenInfo>, java.util.List<com.okinc.planet.domain.remote.dto.PublisherTokenInfo>):void (m)] (LINE:49) call: o.tsY.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ C47566tsY(java.util.List list, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }
}

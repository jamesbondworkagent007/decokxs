package o;

import com.okinc.planet.biz_home.feed_tab.FeedPage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47908tyw {
    public final java.util.List<FeedPage> AEQbTJ;
    public final boolean KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47908tyw() {
        this(null, 0, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tyw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47908tyw copy$default(C47908tyw c47908tyw, java.util.List list, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = c47908tyw.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            i = c47908tyw.OLrzqt;
        }
        if ((i2 & 4) != 0) {
            z = c47908tyw.KWHzl;
        }
        return c47908tyw.OLrzqt(list, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47908tyw OLrzqt(@NotNull java.util.List<? extends FeedPage> list, int i, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C47908tyw(list, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47908tyw)) {
            return false;
        }
        C47908tyw c47908tyw = (C47908tyw) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c47908tyw.AEQbTJ) && this.OLrzqt == c47908tyw.OLrzqt && this.KWHzl == c47908tyw.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PlanetFeedContainerUiState(availablePages=" + this.AEQbTJ + ", currentPageIndex=" + this.OLrzqt + ", isLoading=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.planet.biz_home.feed_tab.FeedPage> */
    /* JADX WARN: Multi-variable type inference failed */
    public C47908tyw(@NotNull java.util.List<? extends FeedPage> list, int i, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.OLrzqt = i;
        this.KWHzl = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:114)) : (r2v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.util.List<? extends com.okinc.planet.biz_home.feed_tab.FeedPage>, int, boolean):void (m)] (LINE:113) call: o.tyw.<init>(java.util.List, int, boolean):void type: THIS */
    public /* synthetic */ C47908tyw(java.util.List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? yDY.AhwBna() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
    }
}

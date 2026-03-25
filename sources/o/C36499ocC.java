package o;

import com.okinc.im.imui.livestream.model.UXBehavior;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ocC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36499ocC {
    public final java.util.List<C36498ocB> AEQbTJ;
    public final UXBehavior EZpvd;
    public final java.lang.Long KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C36499ocC() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ocC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C36499ocC copy$default(C36499ocC c36499ocC, java.util.List list, UXBehavior uXBehavior, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c36499ocC.AEQbTJ;
        }
        if ((i & 2) != 0) {
            uXBehavior = c36499ocC.EZpvd;
        }
        if ((i & 4) != 0) {
            l = c36499ocC.KWHzl;
        }
        return c36499ocC.KWHzl(list, uXBehavior, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UXBehavior AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36498ocB> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36499ocC KWHzl(@NotNull java.util.List<C36498ocB> list, @NotNull UXBehavior uXBehavior, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(uXBehavior, "");
        return new C36499ocC(list, uXBehavior, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36499ocC)) {
            return false;
        }
        C36499ocC c36499ocC = (C36499ocC) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c36499ocC.AEQbTJ) && this.EZpvd == c36499ocC.EZpvd && Intrinsics.EZpvd(this.KWHzl, c36499ocC.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        java.lang.Long l = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LivestreamListUIStatus(messageList=" + this.AEQbTJ + ", uxBehavior=" + this.EZpvd + ", lastPullMessageSeq=" + this.KWHzl + ")";
    }

    public C36499ocC(@NotNull java.util.List<C36498ocB> list, @NotNull UXBehavior uXBehavior, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(uXBehavior, "");
        this.AEQbTJ = list;
        this.EZpvd = uXBehavior;
        this.KWHzl = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:4)) : (r1v0 java.util.List))
  (wrap:com.okinc.im.imui.livestream.model.UXBehavior:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.im.imui.livestream.model.UXBehavior:0x000c: SGET  A[WRAPPED] (LINE:5) com.okinc.im.imui.livestream.model.UXBehavior.Init com.okinc.im.imui.livestream.model.UXBehavior) : (r2v0 com.okinc.im.imui.livestream.model.UXBehavior))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
 A[MD:(java.util.List<o.ocB>, com.okinc.im.imui.livestream.model.UXBehavior, java.lang.Long):void (m)] (LINE:3) call: o.ocC.<init>(java.util.List, com.okinc.im.imui.livestream.model.UXBehavior, java.lang.Long):void type: THIS */
    public /* synthetic */ C36499ocC(java.util.List list, UXBehavior uXBehavior, java.lang.Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? UXBehavior.Init : uXBehavior, (i & 4) != 0 ? null : l);
    }
}

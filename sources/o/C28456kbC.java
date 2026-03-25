package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kbC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28456kbC {
    public final java.util.List<kMU> EZpvd;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28456kbC() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kbC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C28456kbC copy$default(C28456kbC c28456kbC, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c28456kbC.EZpvd;
        }
        if ((i & 2) != 0) {
            z = c28456kbC.copydefault;
        }
        return c28456kbC.EZpvd(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28456kbC EZpvd(@NotNull java.util.List<? extends kMU> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C28456kbC(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<kMU> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28456kbC)) {
            return false;
        }
        C28456kbC c28456kbC = (C28456kbC) obj;
        return Intrinsics.EZpvd(this.EZpvd, c28456kbC.EZpvd) && this.copydefault == c28456kbC.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HomeFavoriteListUiModel(items=" + this.EZpvd + ", resetPosition=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.kMU> */
    /* JADX WARN: Multi-variable type inference failed */
    public C28456kbC(@NotNull java.util.List<? extends kMU> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:6)) : (r1v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.util.List<? extends o.kMU>, boolean):void (m)] (LINE:5) call: o.kbC.<init>(java.util.List, boolean):void type: THIS */
    public /* synthetic */ C28456kbC(java.util.List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? false : z);
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28443kaq {
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final java.util.List<C28442kap> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28443kaq() {
        this(false, null, false, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kaq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C28443kaq copy$default(C28443kaq c28443kaq, boolean z, java.lang.String str, boolean z2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c28443kaq.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c28443kaq.copydefault;
        }
        if ((i & 4) != 0) {
            z2 = c28443kaq.EZpvd;
        }
        if ((i & 8) != 0) {
            list = c28443kaq.OLrzqt;
        }
        return c28443kaq.copydefault(z, str, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C28442kap> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28443kaq copydefault(boolean z, @NotNull java.lang.String str, boolean z2, @NotNull java.util.List<C28442kap> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C28443kaq(z, str, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28443kaq)) {
            return false;
        }
        C28443kaq c28443kaq = (C28443kaq) obj;
        return this.KWHzl == c28443kaq.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c28443kaq.copydefault) && this.EZpvd == c28443kaq.EZpvd && Intrinsics.EZpvd(this.OLrzqt, c28443kaq.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.KWHzl) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ActivePositionFilter(hideSmallBalance=" + this.KWHzl + ", smallBalanceValue=" + this.copydefault + ", hideNativeToken=" + this.EZpvd + ", blacklistToken=" + this.OLrzqt + ")";
    }

    public C28443kaq(boolean z, @NotNull java.lang.String str, boolean z2, @NotNull java.util.List<C28442kap> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = z;
        this.copydefault = str;
        this.EZpvd = z2;
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("1") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:7)) : (r5v0 java.util.List))
 A[MD:(boolean, java.lang.String, boolean, java.util.List<o.kap>):void (m)] (LINE:3) call: o.kaq.<init>(boolean, java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ C28443kaq(boolean z, java.lang.String str, boolean z2, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "1" : str, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? yDY.AhwBna() : list);
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ezw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17289ezw {
    public final AbstractC17259ezS AEQbTJ;
    public final java.util.List<java.lang.String> OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ezw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C17289ezw copy$default(C17289ezw c17289ezw, AbstractC17259ezS abstractC17259ezS, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC17259ezS = c17289ezw.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c17289ezw.copydefault;
        }
        if ((i & 4) != 0) {
            list = c17289ezw.OLrzqt;
        }
        return c17289ezw.OLrzqt(abstractC17259ezS, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC17259ezS EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C17289ezw OLrzqt(@NotNull AbstractC17259ezS abstractC17259ezS, boolean z, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(abstractC17259ezS, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C17289ezw(abstractC17259ezS, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17289ezw)) {
            return false;
        }
        C17289ezw c17289ezw = (C17289ezw) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c17289ezw.AEQbTJ) && this.copydefault == c17289ezw.copydefault && Intrinsics.EZpvd(this.OLrzqt, c17289ezw.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletDeleteResult(walletDeleteData=" + this.AEQbTJ + ", rootDeleted=" + this.copydefault + ", deletedWallet=" + this.OLrzqt + ")";
    }

    public C17289ezw(@NotNull AbstractC17259ezS abstractC17259ezS, boolean z, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(abstractC17259ezS, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = abstractC17259ezS;
        this.copydefault = z;
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 o.ezS)
  (r2v0 boolean)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:32)) : (r3v0 java.util.List))
 A[MD:(o.ezS, boolean, java.util.List<java.lang.String>):void (m)] (LINE:29) call: o.ezw.<init>(o.ezS, boolean, java.util.List):void type: THIS */
    public /* synthetic */ C17289ezw(AbstractC17259ezS abstractC17259ezS, boolean z, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC17259ezS, z, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}

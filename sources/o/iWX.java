package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iWX {
    public final int AEQbTJ;
    public final java.util.List<C24148iWr> EZpvd;
    public final java.lang.Integer KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iWX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ iWX copy$default(iWX iwx, java.lang.Integer num, java.lang.String str, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            num = iwx.KWHzl;
        }
        if ((i2 & 2) != 0) {
            str = iwx.copydefault;
        }
        if ((i2 & 4) != 0) {
            list = iwx.EZpvd;
        }
        if ((i2 & 8) != 0) {
            i = iwx.AEQbTJ;
        }
        return iwx.KWHzl(num, str, list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C24148iWr> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iWX KWHzl(java.lang.Integer num, @NotNull java.lang.String str, @NotNull java.util.List<C24148iWr> list, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new iWX(num, str, list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iWX)) {
            return false;
        }
        iWX iwx = (iWX) obj;
        return Intrinsics.EZpvd(this.KWHzl, iwx.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) iwx.copydefault) && Intrinsics.EZpvd(this.EZpvd, iwx.EZpvd) && this.AEQbTJ == iwx.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Integer num = this.KWHzl;
        return ((((((num == null ? 0 : num.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SubTabUIData(id=" + this.KWHzl + ", name=" + this.copydefault + ", filters=" + this.EZpvd + ", size=" + this.AEQbTJ + ")";
    }

    public iWX(java.lang.Integer num, @NotNull java.lang.String str, @NotNull java.util.List<C24148iWr> list, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = num;
        this.copydefault = str;
        this.EZpvd = list;
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Integer)
  (r2v0 java.lang.String)
  (r3v0 java.util.List)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
 A[MD:(java.lang.Integer, java.lang.String, java.util.List<o.iWr>, int):void (m)] (LINE:131) call: o.iWX.<init>(java.lang.Integer, java.lang.String, java.util.List, int):void type: THIS */
    public /* synthetic */ iWX(java.lang.Integer num, java.lang.String str, java.util.List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, list, (i2 & 8) != 0 ? -1 : i);
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEC {
    public final java.util.List<C23669iEy> EZpvd;
    public final iEL KWHzl;
    public final iEK OLrzqt;
    public final java.util.List<iEB> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iEC() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iEC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ iEC copy$default(iEC iec, iEK iek, iEL iel, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iek = iec.OLrzqt;
        }
        if ((i & 2) != 0) {
            iel = iec.KWHzl;
        }
        if ((i & 4) != 0) {
            list = iec.EZpvd;
        }
        if ((i & 8) != 0) {
            list2 = iec.copydefault;
        }
        return iec.copydefault(iek, iel, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEK EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C23669iEy> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<iEB> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEC copydefault(@NotNull iEK iek, @NotNull iEL iel, @NotNull java.util.List<C23669iEy> list, @NotNull java.util.List<iEB> list2) {
        Intrinsics.checkNotNullParameter(iek, "");
        Intrinsics.checkNotNullParameter(iel, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new iEC(iek, iel, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iEC)) {
            return false;
        }
        iEC iec = (iEC) obj;
        return Intrinsics.EZpvd(this.OLrzqt, iec.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, iec.KWHzl) && Intrinsics.EZpvd(this.EZpvd, iec.EZpvd) && Intrinsics.EZpvd(this.copydefault, iec.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProtocolDetails(info=" + this.OLrzqt + ", performance=" + this.KWHzl + ", investments=" + this.EZpvd + ", marketInvestments=" + this.copydefault + ")";
    }

    public iEC(@NotNull iEK iek, @NotNull iEL iel, @NotNull java.util.List<C23669iEy> list, @NotNull java.util.List<iEB> list2) {
        Intrinsics.checkNotNullParameter(iek, "");
        Intrinsics.checkNotNullParameter(iel, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.OLrzqt = iek;
        this.KWHzl = iel;
        this.EZpvd = list;
        this.copydefault = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (wrap:o.iEK:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.iEK:0x0006: INVOKE (wrap:o.iEK$Application:0x0004: SGET  A[WRAPPED] (LINE:8) o.iEK.Companion o.iEK$Application) VIRTUAL call: o.iEK.Application.OLrzqt():o.iEK A[MD:():o.iEK (m), WRAPPED] (LINE:8)) : (r1v0 o.iEK))
  (wrap:o.iEL:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.iEL:0x0010: INVOKE (wrap:o.iEL$TaskDescription:0x000e: SGET  A[WRAPPED] (LINE:9) o.iEL.Companion o.iEL$TaskDescription) VIRTUAL call: o.iEL.TaskDescription.copydefault():o.iEL A[MD:():o.iEL (m), WRAPPED] (LINE:9)) : (r2v0 o.iEL))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0018: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001c: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0020: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r4v0 java.util.List))
 A[MD:(o.iEK, o.iEL, java.util.List<o.iEy>, java.util.List<o.iEB>):void (m)] (LINE:7) call: o.iEC.<init>(o.iEK, o.iEL, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ iEC(iEK iek, iEL iel, java.util.List list, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? iEK.Companion.OLrzqt() : iek, (i & 2) != 0 ? iEL.Companion.copydefault() : iel, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? yDY.AhwBna() : list2);
    }
}

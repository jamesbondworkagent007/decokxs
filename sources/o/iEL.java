package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEL {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final iEL copydefault = new iEL(null, null, null, null, 15, null);
    public final iEF AEQbTJ;
    public final iEJ EZpvd;
    public final iEH OLrzqt;
    public final java.util.List<iED> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iEL() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iEL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ iEL copy$default(iEL iel, iEJ iej, iEH ieh, iEF ief, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iej = iel.EZpvd;
        }
        if ((i & 2) != 0) {
            ieh = iel.OLrzqt;
        }
        if ((i & 4) != 0) {
            ief = iel.AEQbTJ;
        }
        if ((i & 8) != 0) {
            list = iel.djBIcL;
        }
        return iel.OLrzqt(iej, ieh, ief, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEL OLrzqt(iEJ iej, iEH ieh, iEF ief, @NotNull java.util.List<iED> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new iEL(iej, ieh, ief, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iEL)) {
            return false;
        }
        iEL iel = (iEL) obj;
        return Intrinsics.EZpvd(this.EZpvd, iel.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, iel.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, iel.AEQbTJ) && Intrinsics.EZpvd(this.djBIcL, iel.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        iEJ iej = this.EZpvd;
        int iHashCode = iej == null ? 0 : iej.hashCode();
        iEH ieh = this.OLrzqt;
        int iHashCode2 = ieh == null ? 0 : ieh.hashCode();
        iEF ief = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (ief != null ? ief.hashCode() : 0)) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProtocolPerformance(healthRate=" + this.EZpvd + ", availablePoints=" + this.OLrzqt + ", availableRewards=" + this.AEQbTJ + ", infos=" + this.djBIcL + ")";
    }

    public iEL(iEJ iej, iEH ieh, iEF ief, @NotNull java.util.List<iED> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = iej;
        this.OLrzqt = ieh;
        this.AEQbTJ = ief;
        this.djBIcL = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:o.iEJ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.iEJ) : (r2v0 o.iEJ))
  (wrap:o.iEH:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.iEH) : (r3v0 o.iEH))
  (wrap:o.iEF:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.iEF) : (r4v0 o.iEF))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:35)) : (r5v0 java.util.List))
 A[MD:(o.iEJ, o.iEH, o.iEF, java.util.List<o.iED>):void (m)] (LINE:31) call: o.iEL.<init>(o.iEJ, o.iEH, o.iEF, java.util.List):void type: THIS */
    public /* synthetic */ iEL(iEJ iej, iEH ieh, iEF ief, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iej, (i & 2) != 0 ? null : ieh, (i & 4) != 0 ? null : ief, (i & 8) != 0 ? yDY.AhwBna() : list);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final iEL copydefault() {
            return iEL.copydefault;
        }
    }
}

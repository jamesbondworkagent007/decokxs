package o;

import com.okinc.business.market.data.model.common.ProtocolInfoData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.krr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29345krr {
    public final java.util.List<ProtocolInfoData> AEQbTJ;
    public final java.util.List<java.lang.String> KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29345krr() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.krr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29345krr copy$default(C29345krr c29345krr, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c29345krr.KWHzl;
        }
        if ((i & 2) != 0) {
            list2 = c29345krr.OLrzqt;
        }
        if ((i & 4) != 0) {
            list3 = c29345krr.AEQbTJ;
        }
        return c29345krr.AEQbTJ(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ProtocolInfoData> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29345krr AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2, @NotNull java.util.List<ProtocolInfoData> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new C29345krr(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29345krr)) {
            return false;
        }
        C29345krr c29345krr = (C29345krr) obj;
        return Intrinsics.EZpvd(this.KWHzl, c29345krr.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c29345krr.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c29345krr.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SurgeProtocolFilterUiData(selectedProtocols=" + this.KWHzl + ", defaultProtocolIdList=" + this.OLrzqt + ", protocolList=" + this.AEQbTJ + ")";
    }

    public C29345krr(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2, @NotNull java.util.List<ProtocolInfoData> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.KWHzl = list;
        this.OLrzqt = list2;
        this.AEQbTJ = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:433)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:434)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:435)) : (r3v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<com.okinc.business.market.data.model.common.ProtocolInfoData>):void (m)] (LINE:432) call: o.krr.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ C29345krr(java.util.List list, java.util.List list2, java.util.List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3);
    }
}

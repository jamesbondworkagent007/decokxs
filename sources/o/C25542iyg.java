package o;

import com.okinc.business.invest_biz.data.bean.InvestDetail;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.iyg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25542iyg {
    public java.util.List<InvestDetail> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25542iyg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iyg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25542iyg copy$default(C25542iyg c25542iyg, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c25542iyg.AEQbTJ;
        }
        return c25542iyg.KWHzl(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InvestDetail> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25542iyg KWHzl(java.util.List<InvestDetail> list) {
        return new C25542iyg(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25542iyg) && Intrinsics.EZpvd(this.AEQbTJ, ((C25542iyg) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<InvestDetail> list = this.AEQbTJ;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestmentHomeData(recommendInvestments=" + this.AEQbTJ + ")";
    }

    public C25542iyg(java.util.List<InvestDetail> list) {
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:20)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestDetail>):void (m)] (LINE:19) call: o.iyg.<init>(java.util.List):void type: THIS */
    public /* synthetic */ C25542iyg(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}

package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.pDv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37872pDv extends AbstractC49408unw<C37872pDv> {
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C37872pDv() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37872pDv copy$default(C37872pDv c37872pDv, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c37872pDv.copydefault;
        }
        return c37872pDv.KWHzl(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37872pDv KWHzl(boolean z) {
        return new C37872pDv(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37872pDv) && this.copydefault == ((C37872pDv) obj).copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradingRulesContainerUiState(isLoading=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:27) call: o.pDv.<init>(boolean):void type: THIS */
    public /* synthetic */ C37872pDv(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public C37872pDv(boolean z) {
        super(new Function1() { // from class: o.pDs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37872pDv.AEQbTJ((C37872pDv) obj);
            }
        });
        this.copydefault = z;
    }

    public static final C37872pDv AEQbTJ(C37872pDv c37872pDv) {
        Intrinsics.checkNotNullParameter(c37872pDv, "");
        return copy$default(c37872pDv, false, 1, null);
    }
}

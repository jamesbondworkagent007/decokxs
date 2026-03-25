package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.xwQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56097xwQ extends xKD {
    public final InterfaceC56387yDm AEQbTJ;
    public boolean EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56097xwQ() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:9) call: o.xwQ.<init>(boolean):void type: THIS */
    public /* synthetic */ C56097xwQ(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public C56097xwQ(boolean z) {
        this.EZpvd = z;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xwU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C56097xwQ.valueOf();
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xwV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C56097xwQ.OLrzqt();
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.xwW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C56097xwQ.AEQbTJ();
            }
        });
    }

    public final xBB AkhnZx() {
        return (xBB) this.KWHzl.getValue();
    }

    public static final xBB valueOf() {
        xBB xbb = new xBB();
        xbb.fIwbmz();
        return xbb;
    }

    public final C56208xyV AYXKKw() {
        return (C56208xyV) this.OLrzqt.getValue();
    }

    public static final C56208xyV OLrzqt() {
        C56208xyV c56208xyV = new C56208xyV();
        c56208xyV.fIwbmz();
        return c56208xyV;
    }

    public final C56291xzz AhwBna() {
        return (C56291xzz) this.AEQbTJ.getValue();
    }

    public static final C56291xzz AEQbTJ() {
        C56291xzz c56291xzz = new C56291xzz();
        c56291xzz.fIwbmz();
        return c56291xzz;
    }

    public final java.lang.String DbNXlk() {
        return AkhnZx().bB_();
    }

    public final java.lang.String djBIcL() {
        return AYXKKw().bB_();
    }

    public final java.lang.String gEmmrt() {
        return AhwBna().bB_();
    }

    @Override // o.xKD
    public java.util.List<xKK> values() {
        java.util.List listAhwBna = yDY.AhwBna(AkhnZx());
        if (this.EZpvd) {
            listAhwBna.add(AYXKKw());
            listAhwBna.add(AhwBna());
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(listAhwBna);
    }
}

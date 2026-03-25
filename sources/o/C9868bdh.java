package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.bdh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9868bdh extends C9785bcD {
    public final C9796bcO AEQbTJ;
    public final java.lang.Boolean OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9796bcO copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 java.lang.String)
  (wrap:o.bcO:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.bcO) : (r3v0 o.bcO))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0009: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r4v0 java.lang.Boolean))
 A[MD:(boolean, java.lang.String, o.bcO, java.lang.Boolean):void (m)] (LINE:174) call: o.bdh.<init>(boolean, java.lang.String, o.bcO, java.lang.Boolean):void type: THIS */
    public /* synthetic */ C9868bdh(boolean z, java.lang.String str, C9796bcO c9796bcO, java.lang.Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? null : c9796bcO, (i & 8) != 0 ? java.lang.Boolean.FALSE : bool);
    }

    public C9868bdh(boolean z, java.lang.String str, C9796bcO c9796bcO, java.lang.Boolean bool) {
        super(z, true);
        this.copydefault = str;
        this.AEQbTJ = c9796bcO;
        this.OLrzqt = bool;
    }
}

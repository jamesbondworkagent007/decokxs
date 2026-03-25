package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.bdl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9872bdl extends C9785bcD {
    public final java.lang.String KWHzl;
    public final C9796bcO OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9796bcO KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:o.bcO:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.bcO) : (r4v0 o.bcO))
 A[MD:(boolean, java.lang.String, o.bcO):void (m)] (LINE:459) call: o.bdl.<init>(boolean, java.lang.String, o.bcO):void type: THIS */
    public /* synthetic */ C9872bdl(boolean z, java.lang.String str, C9796bcO c9796bcO, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : c9796bcO);
    }

    public C9872bdl(boolean z, java.lang.String str, C9796bcO c9796bcO) {
        super(z, false);
        this.KWHzl = str;
        this.OLrzqt = c9796bcO;
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.bcC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9784bcC extends C9785bcD {
    public final java.lang.String KWHzl;
    public final InterfaceC9731bbC OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 o.bbC)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(boolean, o.bbC, java.lang.String):void (m)] (LINE:199) call: o.bcC.<init>(boolean, o.bbC, java.lang.String):void type: THIS */
    public /* synthetic */ C9784bcC(boolean z, InterfaceC9731bbC interfaceC9731bbC, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, interfaceC9731bbC, (i & 4) != 0 ? "" : str);
    }

    public C9784bcC(boolean z, InterfaceC9731bbC interfaceC9731bbC, java.lang.String str) {
        super(z, true);
        this.OLrzqt = interfaceC9731bbC;
        this.KWHzl = str;
    }

    public boolean equals(java.lang.Object obj) {
        InterfaceC9731bbC interfaceC9731bbC;
        C9784bcC c9784bcC = obj instanceof C9784bcC ? (C9784bcC) obj : null;
        java.lang.Long lValueOf = (c9784bcC == null || (interfaceC9731bbC = c9784bcC.OLrzqt) == null) ? null : java.lang.Long.valueOf(interfaceC9731bbC.AhwBna());
        InterfaceC9731bbC interfaceC9731bbC2 = this.OLrzqt;
        return Intrinsics.EZpvd(lValueOf, interfaceC9731bbC2 != null ? java.lang.Long.valueOf(interfaceC9731bbC2.AhwBna()) : null);
    }

    public int hashCode() {
        InterfaceC9731bbC interfaceC9731bbC = this.OLrzqt;
        if (interfaceC9731bbC != null) {
            return interfaceC9731bbC.hashCode();
        }
        return 0;
    }
}

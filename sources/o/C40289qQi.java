package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.qQi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40289qQi extends C40512qYp {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C40289qQi() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.qrN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.qrN) : (r2v0 o.qrN))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(o.qrN, java.lang.Integer):void (m)] (LINE:38) call: o.qQi.<init>(o.qrN, java.lang.Integer):void type: THIS */
    public /* synthetic */ C40289qQi(C41465qrN c41465qrN, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c41465qrN, (i & 2) != 0 ? null : num);
    }

    public C40289qQi(C41465qrN c41465qrN, @androidx.annotation.DrawableRes java.lang.Integer num) {
        register(InterfaceC41643qug.class, new C40286qQf(c41465qrN, num != null ? num.intValue() : 0));
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.qSe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40339qSe extends C40512qYp {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C40339qSe() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.qrN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.qrN) : (r1v0 o.qrN))
 A[MD:(o.qrN):void (m)] (LINE:25) call: o.qSe.<init>(o.qrN):void type: THIS */
    public /* synthetic */ C40339qSe(C41465qrN c41465qrN, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c41465qrN);
    }

    public C40339qSe(C41465qrN c41465qrN) {
        register(InterfaceC41643qug.class, new C40338qSd(c41465qrN));
    }
}

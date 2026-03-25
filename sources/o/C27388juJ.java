package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.juJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27388juJ extends AbstractC27470jvm {
    public final InterfaceC27395juQ KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27388juJ() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.juQ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.juQ) : (r1v0 o.juQ))
 A[MD:(o.juQ):void (m)] (LINE:12) call: o.juJ.<init>(o.juQ):void type: THIS */
    public /* synthetic */ C27388juJ(InterfaceC27395juQ interfaceC27395juQ, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC27395juQ);
    }

    public C27388juJ(InterfaceC27395juQ interfaceC27395juQ) {
        this.KWHzl = interfaceC27395juQ;
        register(C27467jvj.class, new C27464jvg());
        register(C27460jvc.class, new C27462jve(interfaceC27395juQ));
        register(C27466jvi.class, new C27458jva(interfaceC27395juQ));
        register(C27468jvk.class, new C27397juS(interfaceC27395juQ));
        register(C27469jvl.class, new C27404juZ());
        register(C27463jvf.class, new C27459jvb());
    }
}

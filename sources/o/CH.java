package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CH extends AbstractC5069Dn {
    public final InterfaceC59908zr EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CH(@NotNull InterfaceC59908zr interfaceC59908zr, @NotNull InterfaceC5058Dc interfaceC5058Dc) {
        super(interfaceC5058Dc);
        Intrinsics.checkNotNullParameter(interfaceC59908zr, "");
        Intrinsics.checkNotNullParameter(interfaceC5058Dc, "");
        this.EZpvd = interfaceC59908zr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 o.zr)
  (wrap:o.Dc:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.Dc:0x0006: INVOKE (wrap:o.Dc$StateListAnimator:0x0004: SGET  A[WRAPPED] o.Dc.OLrzqt o.Dc$StateListAnimator) VIRTUAL call: o.Dc.StateListAnimator.OLrzqt():o.Dc A[MD:():o.Dc (m), WRAPPED] (LINE:18)) : (r2v0 o.Dc))
 A[MD:(o.zr, o.Dc):void (m)] (LINE:18) call: o.CH.<init>(o.zr, o.Dc):void type: THIS */
    public /* synthetic */ CH(InterfaceC59908zr interfaceC59908zr, InterfaceC5058Dc interfaceC5058Dc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC59908zr, (i & 2) != 0 ? InterfaceC5058Dc.OLrzqt.OLrzqt() : interfaceC5058Dc);
    }

    @Override // o.AbstractC5069Dn
    public void copydefault(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.EZpvd.copydefault(bArr, i, i2);
    }
}

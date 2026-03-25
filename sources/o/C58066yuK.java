package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC58028ytZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58066yuK implements InterfaceC58028ytZ {
    public final C58071yuP copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C58066yuK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60096zvd
    public void subscribe(InterfaceC60097zve<? super InterfaceC58028ytZ.StateListAnimator> interfaceC60097zve) {
        this.copydefault.subscribe(interfaceC60097zve);
    }

    public C58066yuK(@NotNull C58071yuP c58071yuP) {
        Intrinsics.checkNotNullParameter(c58071yuP, "");
        this.copydefault = c58071yuP;
        c58071yuP.onNext(InterfaceC58028ytZ.StateListAnimator.Activity.EZpvd);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:o.yuP:?: TERNARY null = ((wrap:int:0x0001: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yuP:0x0009: CONSTRUCTOR (0 long), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(long, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:10) call: o.yuP.<init>(long, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r3v0 o.yuP))
 A[MD:(o.yuP):void (m)] (LINE:9) call: o.yuK.<init>(o.yuP):void type: THIS */
    public /* synthetic */ C58066yuK(C58071yuP c58071yuP, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C58071yuP(0L, 1, null) : c58071yuP);
    }
}

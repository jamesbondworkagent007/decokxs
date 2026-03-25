package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CZ {
    public final java.util.List<InterfaceC5056Da> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CZ() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CZ(@NotNull java.util.List<InterfaceC5056Da> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:14) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
 A[MD:(java.util.List<o.Da>):void (m)] (LINE:13) call: o.CZ.<init>(java.util.List):void type: THIS */
    public /* synthetic */ CZ(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.ArrayList() : list);
    }

    public final void AEQbTJ(@NotNull InterfaceC5056Da interfaceC5056Da) {
        Intrinsics.checkNotNullParameter(interfaceC5056Da, "");
        interfaceC5056Da.KWHzl();
        this.OLrzqt.add(interfaceC5056Da);
    }

    public final void EZpvd() {
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            ((InterfaceC5056Da) it.next()).AEQbTJ();
        }
    }
}

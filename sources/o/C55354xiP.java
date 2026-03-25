package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55354xiP implements InterfaceC55357xiS {
    public final java.util.List<AbstractC55339xiA> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55354xiP() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.xiA> */
    /* JADX WARN: Multi-variable type inference failed */
    public C55354xiP(@NotNull java.util.List<? extends AbstractC55339xiA> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.xiC.OLrzqt():java.util.List A[MD:():java.util.List<o.xiA> (m), WRAPPED] (LINE:12)) : (r1v0 java.util.List))
 A[MD:(java.util.List<? extends o.xiA>):void (m)] (LINE:11) call: o.xiP.<init>(java.util.List):void type: THIS */
    public /* synthetic */ C55354xiP(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C55341xiC.OLrzqt() : list);
    }

    @Override // o.InterfaceC55357xiS
    public void AEQbTJ(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR, boolean z) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            ((AbstractC55339xiA) it.next()).EZpvd(c55425xjh, c55356xiR, z);
        }
    }
}

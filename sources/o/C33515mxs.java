package o;

import io.reactivex.BackpressureStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33515mxs {
    public static final C33515mxs AEQbTJ = new C33515mxs();

    private C33515mxs() {
    }

    public final void KWHzl(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC58185ywX abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.mxx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C33515mxs.copydefault(function0, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.mxw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33515mxs.copydefault((java.lang.Boolean) obj);
            }
        };
        abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mxy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C33515mxs.OLrzqt(function1, obj);
            }
        });
    }

    public static final void copydefault(Function0 function0, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        function0.invoke();
        interfaceC58184ywW.onNext(java.lang.Boolean.TRUE);
        interfaceC58184ywW.onComplete();
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Boolean bool) {
        return Unit.INSTANCE;
    }
}

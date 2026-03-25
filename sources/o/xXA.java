package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class xXA {
    public static final void OLrzqt() {
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtAJ_ = ((xWO) C43251rlk.copydefault(xWO.class)).aJ_();
        final Function1 function1 = new Function1() { // from class: o.xXy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xXA.KWHzl((java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xXC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xXA.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.xXF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xXA.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtAJ_.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xXD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xXA.OLrzqt(function12, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        AEQbTJ(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("wallet", z ? "true" : "false");
        C46945tgj.AEQbTJ.AhwBna().KWHzl(map);
    }
}

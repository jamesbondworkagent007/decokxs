package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC22502hga;

/* JADX INFO: renamed from: o.hgz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22527hgz extends gOM {
    public java.lang.String AEQbTJ = "";

    @Override // o.gOM
    public void copydefault() {
        AbstractC58185ywX expireTimeConfig$default = InterfaceC22502hga.ActionBar.getExpireTimeConfig$default(C22380heK.OLrzqt.copydefault(this.AEQbTJ).AhwBna(), null, 1, null);
        final Function1 function1 = new Function1() { // from class: o.hgA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22527hgz.EZpvd(this.OLrzqt, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hgB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22527hgz.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hgC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22527hgz.KWHzl(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = expireTimeConfig$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hgE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22527hgz.OLrzqt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C22527hgz c22527hgz, java.util.List list) {
        c22527hgz.KWHzl().setValue(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, list));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C22527hgz c22527hgz, java.lang.Throwable th) {
        c22527hgz.KWHzl().setValue(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, new java.util.ArrayList()));
        return Unit.INSTANCE;
    }
}

package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10763bub<T> {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.btZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC10763bub.AEQbTJ();
        }
    });

    public static final java.util.ArrayList AEQbTJ() {
        return new java.util.ArrayList();
    }

    public final java.util.ArrayList<AbstractC10707btY<T>> OLrzqt() {
        return (java.util.ArrayList) this.OLrzqt.getValue();
    }

    public final void EZpvd(@NotNull AbstractC10707btY<T> abstractC10707btY) {
        Intrinsics.checkNotNullParameter(abstractC10707btY, "");
        OLrzqt().add(abstractC10707btY);
    }

    public final void AEQbTJ(@NotNull AbstractC10707btY<T> abstractC10707btY) {
        Intrinsics.checkNotNullParameter(abstractC10707btY, "");
        OLrzqt().remove(abstractC10707btY);
    }

    public final void copydefault() {
        OLrzqt().clear();
    }
}

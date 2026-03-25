package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uAo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC47981uAo {
    void AEQbTJ(Function0<Unit> function0);

    void OLrzqt(boolean z);

    void OLrzqt(boolean z, @NotNull Function0<Unit> function0);

    /* JADX INFO: renamed from: o.uAo$Application */
    public static final class Application {
        public static /* synthetic */ void finishRefresh$default(InterfaceC47981uAo interfaceC47981uAo, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishRefresh");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            interfaceC47981uAo.OLrzqt(z);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uAo */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openKline$default(InterfaceC47981uAo interfaceC47981uAo, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openKline");
            }
            if ((i & 1) != 0) {
                function0 = null;
            }
            interfaceC47981uAo.AEQbTJ(function0);
        }

        public static /* synthetic */ void closeKline$default(InterfaceC47981uAo interfaceC47981uAo, boolean z, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeKline");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            interfaceC47981uAo.OLrzqt(z, function0);
        }
    }
}

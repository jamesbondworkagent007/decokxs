package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC22278hcO {
    void AEQbTJ(boolean z);

    boolean AEQbTJ();

    void EZpvd();

    void EZpvd(Function0<Unit> function0);

    void OLrzqt(boolean z);

    void OLrzqt(boolean z, @NotNull Function0<Unit> function0);

    void copydefault();

    void setRefreshListener(@NotNull Function0<Unit> function0);

    void setStickScrollChangeListener(@NotNull InterfaceC22283hcT interfaceC22283hcT);

    /* JADX INFO: renamed from: o.hcO$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ void finishRefresh$default(InterfaceC22278hcO interfaceC22278hcO, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishRefresh");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            interfaceC22278hcO.AEQbTJ(z);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hcO */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openPullDownPanel$default(InterfaceC22278hcO interfaceC22278hcO, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPullDownPanel");
            }
            if ((i & 1) != 0) {
                function0 = null;
            }
            interfaceC22278hcO.EZpvd(function0);
        }

        public static /* synthetic */ void closePullDownPanel$default(InterfaceC22278hcO interfaceC22278hcO, boolean z, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closePullDownPanel");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            interfaceC22278hcO.OLrzqt(z, function0);
        }
    }
}

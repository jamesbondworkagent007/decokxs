package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59309zec {
    C59308zeb OLrzqt(@NotNull yOL yol, InterfaceC59315zei interfaceC59315zei, InterfaceC56665yNu interfaceC56665yNu);

    /* JADX INFO: renamed from: o.zec$Application */
    public static final class Application {
        public static /* synthetic */ C59308zeb toAttributes$default(InterfaceC59309zec interfaceC59309zec, yOL yol, InterfaceC59315zei interfaceC59315zei, InterfaceC56665yNu interfaceC56665yNu, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i & 2) != 0) {
                interfaceC59315zei = null;
            }
            if ((i & 4) != 0) {
                interfaceC56665yNu = null;
            }
            return interfaceC59309zec.OLrzqt(yol, interfaceC59315zei, interfaceC56665yNu);
        }
    }
}

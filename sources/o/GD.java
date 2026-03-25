package o;

import java.lang.Number;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface GD<T extends java.lang.Number> {
    void OLrzqt(@NotNull T t, @NotNull InterfaceC57843yq interfaceC57843yq, FW fw);

    public static final class Activity {
        public static /* synthetic */ void record$default(GD gd, java.lang.Number number, InterfaceC57843yq interfaceC57843yq, FW fw, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record");
            }
            if ((i & 2) != 0) {
                interfaceC57843yq = C58108yv.copydefault();
            }
            if ((i & 4) != 0) {
                fw = null;
            }
            gd.OLrzqt(number, interfaceC57843yq, fw);
        }
    }
}

package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface GI {
    void AEQbTJ(long j, @NotNull InterfaceC57843yq interfaceC57843yq, FW fw);

    public static final class TaskDescription {
        public static /* synthetic */ void add$default(GI gi, long j, InterfaceC57843yq interfaceC57843yq, FW fw, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
            }
            if ((i & 2) != 0) {
                interfaceC57843yq = C58108yv.copydefault();
            }
            if ((i & 4) != 0) {
                fw = null;
            }
            gi.AEQbTJ(j, interfaceC57843yq, fw);
        }
    }
}

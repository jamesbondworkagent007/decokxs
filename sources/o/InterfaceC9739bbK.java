package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9739bbK {
    AbstractC58185ywX<java.lang.Boolean> AEQbTJ(boolean z);

    boolean AEQbTJ(@NotNull java.lang.String str, long j);

    java.lang.String OLrzqt(@NotNull java.lang.String str);

    java.lang.String OLrzqt(@NotNull java.lang.String str, long j);

    /* JADX INFO: renamed from: o.bbK$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ AbstractC58185ywX ensureInitialized$default(InterfaceC9739bbK interfaceC9739bbK, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureInitialized");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC9739bbK.AEQbTJ(z);
        }
    }
}

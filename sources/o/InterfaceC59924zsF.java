package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC59924zsF {
    InterfaceC59924zsF AEQbTJ(@NotNull java.math.BigInteger bigInteger);

    boolean AEQbTJ();

    InterfaceC59924zsF EZpvd();

    java.math.BigInteger KWHzl();

    java.math.BigInteger copydefault();

    InterfaceC59924zsF copydefault(@NotNull InterfaceC59924zsF interfaceC59924zsF);

    byte[] copydefault(boolean z);

    /* JADX INFO: renamed from: o.zsF$Application */
    public static final class Application {
        public static /* synthetic */ byte[] encoded$default(InterfaceC59924zsF interfaceC59924zsF, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encoded");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC59924zsF.copydefault(z);
        }
    }
}

package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23182htR {
    void AEQbTJ(long j);

    void copydefault();

    void copydefault(@NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.htR$Application */
    public static final class Application {
        public static /* synthetic */ void startCheckCacheValid$default(InterfaceC23182htR interfaceC23182htR, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCheckCacheValid");
            }
            if ((i & 1) != 0) {
                j = 200;
            }
            interfaceC23182htR.AEQbTJ(j);
        }
    }
}

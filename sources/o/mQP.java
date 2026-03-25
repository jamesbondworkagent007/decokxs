package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface mQP {
    void AEQbTJ(long j);

    void AEQbTJ(@NotNull java.lang.String str);

    void copydefault();

    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        public static /* synthetic */ void startCheckCacheValid$default(mQP mqp, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCheckCacheValid");
            }
            if ((i & 1) != 0) {
                j = 200;
            }
            mqp.AEQbTJ(j);
        }
    }
}
